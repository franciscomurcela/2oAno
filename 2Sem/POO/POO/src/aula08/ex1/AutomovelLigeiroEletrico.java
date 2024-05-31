package aula08.ex1;

public class AutomovelLigeiroEletrico extends AutomovelLigeiro implements VeiculoEletrico {
    private int autonomia, percentagem;
    AutomovelLigeiroEletrico(String matricula, String marca, String modelo, double potencia, int nquadro, int capbag,int autonomia,int percentagem) {
        super(matricula, marca, modelo, potencia, nquadro, capbag);
        this.autonomia=autonomia;
        this.percentagem=percentagem;
    }

    public void setAutonomia(int autonomia){
        this.autonomia=autonomia;
    }

    public int autonomia() {
        return this.autonomia;
    }

    public void carregar(int percentagem) {
        int carregamento;
        carregamento=percentagem-autonomia/100;
        this.percentagem=percentagem;
        System.out.println("O carregamento vai ate à percentagem de "+ percentagem+ "% e carrega "+ carregamento+ "%.\n");
    }

    public int getCarregar(){
        return this.percentagem;
    }

    public boolean equals(Object obj){
        final AutomovelLigeiroEletrico other= (AutomovelLigeiroEletrico) obj;
        return this.autonomia()== other.autonomia() && this.getCarregar()== other.getCarregar() && this.getMarca().equals(other.getMarca()) && this.getModelo().equals(other.getModelo()) && this.getPotencia()==other.getPotencia();
    }

    public String toString(){
        return "Matricula: "+ this.getMatricula()+ "; Marca: "+ this.getMarca()+ "; Modelo: "+ this.getModelo()+ "; Potencia: "+ this.getPotencia()+ "; Numero do quadro: "+ this.getNquadro()+ "; Capacidade de bagagem: "+ this.getCapBag()+ ";Autonomia: "+ this.autonomia()+ "; Carregamento até a percentagem de: "+ this.getCarregar()+ ".\n";
    }
    
}
