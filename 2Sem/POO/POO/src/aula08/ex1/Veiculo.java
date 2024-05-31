package aula08.ex1;

public class Veiculo implements KmPercorridosInterface {

    private String matricula, marca, modelo;
    private double potencia;
    private int ultimoTrajeto=0;
    private int distanciaTotal=0;

    Veiculo(String matricula, String marca, String modelo, double potencia){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.potencia=potencia;
    }

    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setPotencia(double potencia){
        this.potencia=potencia;
    }

    public double getPotencia(){
        return this.potencia;
    }

    public void trajeto(int quilometros) {
        this.ultimoTrajeto = quilometros;
        this.distanciaTotal += quilometros;
        System.out.println("O veículo " + this.getMatricula() + " percorreu " + this.distanciaTotal + " quilometros.");
    }

    public void setUltimoTrajeto(int ultimoTrajeto){
        this.ultimoTrajeto=ultimoTrajeto;
    }

    public void setDistanciaTotal(int distanciaTotal){
        this.distanciaTotal=distanciaTotal;
    }

    public int ultimoTrajeto() {
        return this.ultimoTrajeto;
    }

    public int distanciaTotal() {
        return this.distanciaTotal;
    }

    public boolean equals(Object obj){
        final Veiculo other= (Veiculo) obj;
        return this.getMatricula().equals(other.getMatricula()) && this.getMarca().equals(other.getMarca()) && this.getModelo().equals(other.getModelo()) && this.getPotencia()==other.getPotencia();
    }

    public String toString(){
        return "Matricula: "+ this.getMatricula()+ "; Marca: "+ this.getMarca()+ "; Modelo: "+ this.getModelo()+ "; Potência: "+ this.getPotencia()+ ".\n";
    }
    
}
