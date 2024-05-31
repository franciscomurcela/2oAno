package aula04;

public class Triangulo {
    private float l1, l2, l3, area, per;

    Triangulo(float l1, float l2, float l3){
        this.setLados(l1, l2, l3);
        this.Area();
        this.Per();
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
        return "Triângulo: "+this.getLados()+"; Área : "+this.area+"; Perímetro : "+this.per;
    }

    public Boolean equals(Triangulo t){
        return (this.getLados().equals(t.getLados()));
    }

    private void Area(){
        float heron = (l1+l2+l3)/2;
        this.area = (float)Math.sqrt(heron*(heron-this.l1)*(heron-this.l2)*(heron-this.l3));
    }

    private void Per(){
        this.per = (float)l1+l2+l3; 
    }
}

