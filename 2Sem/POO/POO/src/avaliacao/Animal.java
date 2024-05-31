public class Animal {
    private int id;
    private static int nextId=1;
    private double peso;
    private int idade;
    private String nomePadrinho;
    

    Animal(double peso, int idade, String nomePadrinho) {
        this.peso = peso;
        this.idade = idade;
        this.nomePadrinho = "";
        id=nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(long peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomePadrinho() {
        return nomePadrinho;
    }

    public void setNomePadrinho(String nomePadrinho) {
        this.nomePadrinho = nomePadrinho;
    }


    
}
