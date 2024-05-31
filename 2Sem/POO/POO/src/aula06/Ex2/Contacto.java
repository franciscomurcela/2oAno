package aula06.Ex2;
import aula06.Ex1.Pessoa;
import aula05.DateYMD;
public class Contacto extends Pessoa {  

    private int ID, telefone;
    private String email;
    private static int NextID = 1;

    Contacto(String iNome, String email, int telefone){
        super(iNome, 0, new DateYMD(0, 0, 0));
        this.email = email;
        this.telefone = telefone;
        ID = NextID;
        NextID++;
    }

    public String getEmail(){
        return this.email;
    }

    public int getTelefone(){
        return this.telefone;
    }

    public int getID(){
        return this.ID;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public String toString(){
        return "Nome: " + this.getNome() + ", ID: " + this.getID() + ", Email: " + this.getEmail() + ", Telefone: " + this.getTelefone();
    }
    
    public static boolean validEmail(String email){
        if (email.contains("@") && (email.endsWith(".com") || email.endsWith(".pt"))){
            return true;
        } else return false;
    }

    public static boolean validTelefone(int telefone){
        String tel = Integer.toString(telefone);
        int tam = tel.length();
        if (tam == 9 && tel.charAt(0) == '9') {
            return true;
        } else return false;
    }
}
