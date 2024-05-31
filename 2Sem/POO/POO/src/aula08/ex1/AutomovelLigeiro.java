package aula08.ex1;

public class AutomovelLigeiro extends Veiculo {
    private int nquadro, capbag;

    AutomovelLigeiro(String matricula, String marca, String modelo, double potencia, int nquadro, int capbag) {
        super(matricula, marca, modelo, potencia);
        this.nquadro=nquadro;
        this.capbag=capbag;
    }

    public void setNquadro(int nquadro){
        this.nquadro=nquadro;
    }

    public int getNquadro(){
        return this.nquadro;
    }

    public void setCapbag(int capbag){
        this.capbag=capbag;
    }

    public int getCapBag(){
        return this.capbag;
    }

    public boolean equals(Object obj){
        final AutomovelLigeiro other= (AutomovelLigeiro) obj;
        return this.getNquadro()== other.getNquadro() && this.getCapBag()== other.getCapBag() && this.getMarca().equals(other.getMarca()) && this.getModelo().equals(other.getModelo()) && this.getPotencia()==other.getPotencia();
    }

    public String toString(){
        return "Matricula: "+ this.getMatricula()+ "; Marca: "+ this.getMarca()+ "; Modelo: "+ this.getModelo()+ "; Potencia: "+ this.getPotencia()+ "; Numero do quadro: "+ this.getNquadro()+ "; Capacidade de bagagem: "+ this.getCapBag()+ ".\n";
    }
    
}
