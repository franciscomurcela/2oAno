package aula04;

public class Circulo{
    private float raio, area, per;

    Circulo(float raio){
        this.setRaio(raio);
        this.Area();
        this.Per();    
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
        return "Círculo: Raio = "+this.raio+"; Área = "+this.area+"; Perímetro = "+this.per+".";
    }

    public boolean equals(Circulo c){
        return this.raio == c.getRaio();
    }

    private void Area() {
        this.area = (float) (Math.PI * Math.pow(this.raio, 2));
    }
    
    private void Per() {
        this.per = (float) (2 * Math.PI * this.raio);
    }

    
}
