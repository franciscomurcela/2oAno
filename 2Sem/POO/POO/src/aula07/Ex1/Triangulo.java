package aula07.Ex1;

public class Triangulo extends Forma {
    private float l1, l2, l3, area, per;
    private String cor;

    Triangulo(float l1, float l2, float l3, float area, float per, String cor){
        super(area, per);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.cor = cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }
    
    public void setLados(float l1, float l2, float l3){
        this.l1=l1;
        this.l2=l2;
        this.l3=l3;
        this.Area();
        this.Per();
    }

    public String getLados(){
        return "lado 1 = "+l1+"; lado 2 = "+l2+"; lado 3 = "+l3;
    } 

    public float getArea(){
        return this.area;
    }

    public float getPer(){
        return this.per;
    }

    public boolean Valid(){
        if (l1<=0 || l2<=0 || l3<=0 || l1>l2+l3 || l2 > l1+l3 || l3 > l2+l3){
            return false;
        }else return true;
    }

    public String toString(){
        return "Triângulo: "+this.getLados()+"; Área : "+this.area+"; Perímetro : "+this.per+"; Cor : "+this.cor+".";
    }

    public Boolean equals(Triangulo t){
        return (this.getLados().equals(t.getLados()) && this.cor==t.cor);
    }

    public void Area(){
        float heron = (l1+l2+l3)/2;
        this.area = (float)Math.sqrt(heron*(heron-this.l1)*(heron-this.l2)*(heron-this.l3));
    }

    public void Per(){
        this.per = (float)l1+l2+l3; 
    }
}

