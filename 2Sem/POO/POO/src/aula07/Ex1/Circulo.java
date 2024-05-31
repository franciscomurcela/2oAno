package aula07.Ex1;

public class Circulo extends Forma{
    private float raio, area, per;
    private String cor;

    Circulo(float raio, float area, float per, String cor){
        super(area, per);
        this.raio = raio;
        this.cor = cor;   
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    public void setRaio(float raio){
        this.raio=raio;
        this.Area();
        this.Per();    
    }

    public float getRaio(){
        return this.raio;
    }

    public float getArea(){
        return this.area;
    }

    public float getPer(){
        return this.per;
    }

    public boolean Valid(){
        if(this.raio<=0){
            return false;
        }else return true;

    }

    public String toString(){
        return "Círculo: Raio = "+this.raio+"; Área = "+this.area+"; Perímetro = "+this.per+"; Cor = "+this.cor+".";
    }

    public boolean equals(Circulo c){
        return this.toString().equals(c.toString());
    }

    public void Area() {
        this.area = (float) (Math.PI * Math.pow(this.raio, 2));
    }
    
    public void Per() {
        this.per = (float) (2 * Math.PI * this.raio);
    }

    
}
