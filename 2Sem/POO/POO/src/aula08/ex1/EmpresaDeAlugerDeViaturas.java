package aula08.ex1;

import java.util.ArrayList;

public class EmpresaDeAlugerDeViaturas {
    private String nome, cpostal, email;
    private ArrayList<Veiculo> veiculos;

    EmpresaDeAlugerDeViaturas(String nome, String cpostal, String email){
        this.nome=nome;
        this.cpostal=cpostal;
        this.email=email;
        veiculos=new ArrayList<>();
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpostal(String cpostal){
        this.cpostal=cpostal;
    }

    public String getCpostal(){
        return this.cpostal;
    }

    public void setEmail(String email){
        if(!validEmail(email)){
            System.out.print("Os valores inseridos não são válidos!\n");
        }
        this.email=email;
    }

    public String getEmail(){
        return this.email;
    }

    public boolean validEmail(String email){
        if(email.contains("@") && (email.endsWith(".com") || email.endsWith("pt") )){
            return true;
        }else{
            return false;
        }
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos){
        this.veiculos=veiculos;
    }

    public ArrayList<Veiculo> getVeiculos(){
        return this.veiculos;
    }

    public void addVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void addVeiculos(Veiculo... veiculos) {
        for (Veiculo veiculo : veiculos) {
            this.addVeiculo(veiculo);
        }
    }

    public boolean equals(Object obj){
        final EmpresaDeAlugerDeViaturas other = (EmpresaDeAlugerDeViaturas) obj;
        return this.getNome().equals(other.getNome()) && this.getCpostal().equals(other.getCpostal()) && this.getEmail().equals(other.getEmail()) && this.getVeiculos().equals(other.getVeiculos());
    }

    public String toString(){
        return "Nome: "+ this.getNome()+ "; Código Postal: "+ this.getCpostal()+ "; Email: "+ this.getEmail()+ "; Veículos: "+ this.getVeiculos()+ ".\n";
    }
}
