package aula06.Ex1;
import aula05.*;
public class Aluno extends Pessoa {
    private int nmec; 
    private static int nextNmec=100;
    private DateYMD iDataInsc;    

    Aluno(String iNome, int iBI, DateYMD iDataNasc, DateYMD iDataInsc){
        super(iNome, iBI, iDataNasc);
        this.iDataInsc = iDataInsc;
        nmec=nextNmec;
        nextNmec++;
    }    

   
    public DateYMD getDataInsc(){
        return this.iDataInsc;
    }

    public int getNMec(){
        return this.nmec;
    }

    public void setDataInsc(DateYMD iDataInsc){
        if (iDataInsc.validDate(day, month, year)) this.iDataInsc = iDataInsc; else System.out.println("A data de inscrição não é válida");
    }

    public String toString(){
        return "Nome: " + this.getNome() + ", BI: " + this.getBI() +", Nº Mec: "+ nmec + ", Data de Nascimento: " + this.getDataNasc() + ", Data de Inscrição: " + this.getDataInsc();
    }

    
    

}
