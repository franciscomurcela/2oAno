package aula08.ex1;

public class PesadoDePassageiros extends Veiculo {
    private int nquadro, peso, nmaxpassg;


    PesadoDePassageiros(String matricula, String marca, String modelo, double potencia, int nquadro, int peso, int nmaxpassg){
        super(matricula, marca, modelo, potencia);
        this.nquadro=nquadro;
        this.peso=peso;
        this.nmaxpassg=nmaxpassg;
    }

    public void setNquadro(int nquadro){
        this.nquadro=nquadro;
    }

    public int getNquadro(){
        return this.nquadro;
    }

    public void setPeso(int peso){
        this.peso=peso;
    }

    public int getPeso(){
        return this.peso;
    }

    public void setNmaxPassg(int nmaxpassg){
        this.nmaxpassg=nmaxpassg;
    }

    public int getNmaxPassg(){
        return this.nmaxpassg;
    }

    public boolean equals(Object obj){
        final PesadoDePassageiros other= (PesadoDePassageiros) obj;
        return this.getNquadro()== other.getNquadro() && this.getPeso()== other.getPeso() && this.getNmaxPassg()== other.getNmaxPassg() && this.getMarca().equals(other.getMarca()) && this.getModelo().equals(other.getModelo()) && this.getPotencia()==other.getPotencia();
    }

    public String toString(){
        return "Matricula: "+ this.getMatricula()+ "; Marca: "+ this.getMarca()+ "; Modelo: "+ this.getModelo()+ "; Potencia: "+ this.getPotencia()+ "; Numero do quadro: "+ this.getNquadro()+ "; Peso: "+ this.getPeso()+ "; Número máximo de passageiros: "+ this.getNmaxPassg()+ ".\n";
    }
    
}
