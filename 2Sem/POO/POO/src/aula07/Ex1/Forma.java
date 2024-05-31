package aula07.Ex1;

public abstract class Forma {
    private float area, perimetro;

    public Forma(float area, float perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Forma [area=" + area + ", perimetro=" + perimetro + "]";
    }

    public abstract void Area();

    public abstract void Per();
    
}
