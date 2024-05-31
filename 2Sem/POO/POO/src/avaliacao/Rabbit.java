public class Rabbit extends Animal {
    private Pelo pelo;

    Rabbit(long peso, int idade, String nomePadrinho, Pelo pelo) {
        super(peso, idade, nomePadrinho);
        this.pelo = pelo;
    }

    public Pelo getPelo() {
        return pelo;
    }

    public void setPelo(Pelo pelo) {
        this.pelo = pelo;
    }

    @Override
    public String toString() {
        return "Coelho { Id = "+ getId() + "; Pelo = " + getPelo() + "; Idade = " + getIdade() + "; Peso = " + getPeso() + "; Nome = "
                + getNomePadrinho()+ " }" ;
    }
}
