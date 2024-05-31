package aula08.ex1;

public class Motociclo extends Veiculo {
    TipoDeMotociclo tipo;

    Motociclo(String matricula, String marca, String modelo, double potencia, TipoDeMotociclo tipo) {
        super(matricula, marca, modelo, potencia);
        this.tipo=tipo;
    }

    public void setTipo(TipoDeMotociclo tipo){
        this.tipo=tipo;
    }

    public TipoDeMotociclo getTipo(){
        return this.tipo;
    }

    public boolean equals(Object obj){
        final Motociclo other= (Motociclo) obj;
        return this.getTipo().equals(other.getTipo()) && this.getMarca().equals(other.getMarca()) && this.getModelo().equals(other.getModelo()) && this.getPotencia()==other.getPotencia();
    }

    public String toString(){
        return "Matricula: "+ this.getMatricula()+ "; Marca: "+ this.getMarca()+ "; Modelo: "+ this.getModelo()+ "; Potencia: "+ this.getPotencia()+ "; Tipo: "+ this.getTipo()+ ".\n";
    }
    
}
