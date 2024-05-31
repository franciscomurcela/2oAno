public class PetShelter implements IPetShelter{
    private String nome;
    private Animal[] animais;
    private int numAnimais;

    public PetShelter(String nome) {
        this.nome = nome;
        this.animais = new Animal[100];
        this.numAnimais = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal[] getAnimais() {
        return animais;
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }

    public int getNumAnimais() {
        return numAnimais;
    }

    public void setNumAnimais(int numAnimais) {
        this.numAnimais = numAnimais;
    }

    public void addAnimal(Animal animal) {
        this.animais[numAnimais] = animal;
        this.numAnimais++;
    }

    public void removeAnimal(Animal animal){
        for (int i = 0; i < this.numAnimais; i++) {
            if (this.animais[i].getId() == animal.getId()) {
                this.animais[i] = this.animais[this.numAnimais - 1];
                this.animais[this.numAnimais - 1] = null;
                this.numAnimais--;
                break;
            }
        }
    }

    public Animal searchForAnimal(String name) {
        for (int i = 0; i < this.numAnimais; i++) {
            if (this.animais[i].getNomePadrinho().equals(name)) {
                return this.animais[i];
            }
        }
        return null;
    }

    public boolean sponsorAnimal(int animalId) {
        for (int i = 0; i < this.numAnimais; i++) {
            if (this.animais[i].getId() == animalId) {
                this.animais[i].setNomePadrinho("nome");
                return true;
            }
        }return false;
    }

    public void listAllAnimals() {
        for (int i = 0; i < this.numAnimais; i++) {
            System.out.println(this.animais[i].getId() + " " + this.animais[i].getNomePadrinho());
        }
    }

}
