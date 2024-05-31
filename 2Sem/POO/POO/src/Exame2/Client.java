package Exame2;

public class Client {

    int contribuinte;
    String nome;
    ClientType tipo;

    Client(int contribuinte, String nome, ClientType tipo) {
        this.contribuinte = contribuinte;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getContribuinte() {
        return contribuinte;
    }

    public String getNome() {
        return nome;
    }

    public ClientType getType() {
        return tipo;
    }

    public void setContribuinte(int contribuinte) {
        this.contribuinte = contribuinte;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setType(ClientType tipo) {
        this.tipo = tipo;
    }


    public String toString(){
        return "Nome: " + nome + " Contribuinte: " + contribuinte + " Tipo: " + tipo.toString();
    }



    
}
