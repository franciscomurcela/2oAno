package aula06.Ex1;
import aula05.*;

public class Pessoa {
    private String nome;
    protected int iBI;
    public int day, month, year;
    private DateYMD dataNasc;
    
    public Pessoa(String name, int iBI, DateYMD dataNasc){
        this.nome = name;
        this.iBI = iBI;
        this.dataNasc = dataNasc;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getBI(){
        return this.iBI;
    }

    public DateYMD getDataNasc(){
        return this.dataNasc;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setiBI(int iBI){
        if (iBI > 0) this.iBI = iBI; else System.out.println("O número de iBI não pode ser negativo");
    }

    public void setDataNasc(DateYMD dataNasc){
        if (dataNasc.validDate(day, month, year)) this.dataNasc = dataNasc; else System.out.println("A data de nascimento não é válida");
    }

    public String toString(){
        return "Nome: " + this.getNome() + ", BI: " + this.getBI() + ", Data de Nascimento: " + this.getDataNasc();
    }

    
}
