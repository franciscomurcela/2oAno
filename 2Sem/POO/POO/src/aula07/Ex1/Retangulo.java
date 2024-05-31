package aula07.Ex1;

public class Retangulo extends Forma{
    private float altura, comprimento, area, per;
    private String cor;

    Retangulo(float altura, float comprimento, float area, float per, String cor){
        super(area, per);
        this.altura = altura;
        this.comprimento = comprimento;
        this.cor = cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    public void setAltura(float altura){
        this.altura=altura;
        this.Area();
        this.Per();
    }

    public void setComprimento(float comprimento){
        this.comprimento=comprimento;
        this.Area();
        this.Per();
    }

    public String getAltura(){
        return "altura : "+altura; 
    }

    public String getComprimento(){
        return "comprimento : "+comprimento;
    }

    public float getArea(){
        return this.area;
        
    }

    public float getPer(){
        return this.per;
    }

    public boolean Valid(){
        if(altura<=0 || comprimento <=0){
            return false;
        }else return true;
    }

    public String toString(){
        return "Retângulo: Altura = "+this.altura+"; Comprimento = "+this.comprimento+"; Área = "+this.area+"; Perímetro = "+this.per +"; Cor: "+this.cor+".";
    }

    public boolean equals(Retangulo r){
        return (this.toString().equals(r.toString()));
    }

    public void Area(){
        this.area = (float)(this.altura*this.comprimento);    
    }

    public void Per(){
        this.per = (float)(this.altura*2+this.comprimento*2);
    }

    
}
