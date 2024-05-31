package aula06.Ex1;

import aula05.DateYMD;

public class Bolseiro extends Aluno{
    private Professor prof;
    private int bolsa;

    Bolseiro(String iNome, int iBI, DateYMD iDataNasc, Professor prof, int bolsa) {
        super(iNome, iBI, iDataNasc, new DateYMD(1, 9, 2018));
        this.prof = prof;
        this.bolsa = bolsa;       
    }    
    
    public Professor getProf(){
        return this.prof;
    }

    public void setProf(Professor prof){
        this.prof = prof;
    }

    public int getBolsa(){
        return this.bolsa;
    }

    public void setBolsa(int bolsa){
        this.bolsa = bolsa;
    }

    public String toString(){
        return "Nome: " + this.getNome() + ", BI: " + this.getBI() + ", Data de Nascimento: " + this.getDataNasc() + ", Data de Inscrição: " + this.getDataInsc() + ", Bolsa: " + this.getBolsa() +", Professor orientador: " + this.getProf();
    }

}
