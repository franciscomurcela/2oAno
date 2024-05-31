package aula08.ex1;

public class Taxi extends AutomovelLigeiro {
    private int nlicenca;

    Taxi(String matricula, String marca, String modelo, double potencia, int nquadro, int capbag, int nlicenca) {
        super(matricula, marca, modelo, potencia, nquadro, capbag);
        this.nlicenca=nlicenca;
    }

    public void setNlicenca(int nlicenca){
        this.nlicenca=nlicenca;
    }

    public int getNlicenca(){
        return this.nlicenca;
    }

    public boolean equals(Object obj){
        final Taxi other= (Taxi) obj;
        return this.getNlicenca()== other.getNlicenca() && this.getMarca().equals(other.getMarca()) && this.getModelo().equals(other.getModelo()) && this.getPotencia()==other.getPotencia() && this.getNquadro()== other.getNquadro() && this.getCapBag()== other.getCapBag();
    }

    public String toString(){
        return "Matricula: "+ this.getMatricula()+ "; Marca: "+ this.getMarca()+ "; Modelo: "+ this.getModelo()+ "; Potencia: "+ this.getPotencia()+ "; Numero do quadro: "+ this.getNquadro()+ "; Capacidade de bagagem: "+ this.getCapBag()+ "; Numero de licença: "+ this.getNlicenca()+ ".\n";
    }
    
}
