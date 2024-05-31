package aula06.Ex1;
import aula05.*;

public class Professor extends Pessoa {
    private Categoria categoria;
    private String dep;

    Professor(String iNome, int iBI, DateYMD iDataNasc, Categoria categoria, String dep){
        super(iNome, iBI, iDataNasc);
        this.categoria = categoria;
        this.dep = dep;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }

    public String getDep(){
        return this.dep;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public void setDep(String dep){
        this.dep = dep;
    }

    public String toString(){
        return "Nome: " + this.getNome() + ", BI: " + this.getBI() + ", Data de Nascimento: " + this.getDataNasc() + ", Categoria: " + this.getCategoria() + ", Departamento: " + this.getDep();
    }


}
