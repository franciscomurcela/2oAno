public class Dog extends Animal{
    private String breed;

    Dog(long peso, int idade, String nomePadrinho, String breed) {
        super(peso, idade, nomePadrinho);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cão { Id = "+ getId() + "; Raça = " + getBreed() + "; Idade = " + getIdade() + "; Peso = " + getPeso() + "; Nome = "
                + getNomePadrinho()+ " }" ;
    }

}
