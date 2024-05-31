public class Bird extends Animal{
    private Habitat habitat;

    Bird(long peso, int idade, String nomePadrinho, Habitat habitat) {
        super(peso, idade, nomePadrinho);
        this.habitat = habitat;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Pássaro { Id = "+ getId() + "; Habitat = " + getHabitat() + "; Idade = " + getIdade() + "; Peso = " + getPeso() + "; Nome = "
                + getNomePadrinho()+ " }" ;
    }
    
}
