package aula08.ex1;

public class PesadoDePassageirosEletrico extends PesadoDePassageiros implements VeiculoEletrico{
    private int autonomia, percentagem;
    PesadoDePassageirosEletrico(String matricula, String marca, String modelo, double potencia, int nquadro, int peso, int nmaxpassg, int autonomia, int percentagem) {
        super(matricula, marca, modelo, potencia, nquadro, peso, nmaxpassg);
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
        final PesadoDePassageirosEletrico other= (PesadoDePassageirosEletrico) obj;
        return this.autonomia()== other.autonomia() && this.getCarregar()== other.getCarregar() && this.getMarca().equals(other.getMarca()) && this.getModelo().equals(other.getModelo()) && this.getPotencia()==other.getPotencia() && this.getPeso()== other.getPeso() && this.getNmaxPassg()== other.getNmaxPassg();
    }

    public String toString(){
        return "Matricula: "+ this.getMatricula()+ "; Marca: "+ this.getMarca()+ "; Modelo: "+ this.getModelo()+ "; Potencia: "+ this.getPotencia()+ "; Numero do quadro: "+ this.getNquadro()+ "; Peso: "+ this.getPeso()+ "; Número máximo de passageiros: "+ this.getNmaxPassg()+ ", Autonomia: "+ this.autonomia()+ "; Carregamento até à percentagem de: "+ this.getCarregar()+ ".\n";
    }
    
}
