package aula08.ex1;

public class PesadoDeMercadorias extends Veiculo {
    private int nquadro, peso, cargamax; 

    PesadoDeMercadorias(String matricula, String marca, String modelo, double potencia, int nquadro, int peso, int cargamax){
        super(matricula, marca, modelo, potencia);
        this.nquadro=nquadro;
        this.peso=peso;
        this.cargamax=cargamax;
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

    public void setCargamax(int cargamax){
        this.cargamax=cargamax;
    }

    public int getCargamax(){
        return this.cargamax;
    }

    public boolean equals(Object obj){
        final PesadoDeMercadorias other= (PesadoDeMercadorias) obj;
        return this.getNquadro()== other.getNquadro() && this.getPeso()== other.getPeso() && this.getCargamax()== other.getCargamax() && this.getMarca().equals(other.getMarca()) && this.getModelo().equals(other.getModelo()) && this.getPotencia()==other.getPotencia();
    }

    public String toString(){
        return "Matricula: "+ this.getMatricula()+ "; Marca: "+ this.getMarca()+ "; Modelo: "+ this.getModelo()+ "; Potencia: "+ this.getPotencia()+ "; Numero do quadro: "+ this.getNquadro()+ "; Peso: "+ this.getPeso()+ "; Carga máxima: "+ this.getCargamax()+ ".\n";
    }
    
}
