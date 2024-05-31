package aula02;
import java.util.Scanner;
public class Ex5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a velocidade 1: ");
        double v1 = sc.nextDouble();
        System.out.println("Insira a distância percorrida: ");
        double d1 = sc.nextDouble();
        System.out.println("Insira a velocidade 2: ");
        double v2 = sc.nextDouble();
        System.out.println("Insira a distância percorrida: ");
        double d2 = sc.nextDouble();
        sc.close();
        if (v1>0 && v2>0 ){
        double dtotal = d1+d2;
        double t1 = d1/v1;
        double t2 = d2/v2;
        double Ttotal = t1+t2;
        double Vfinal = dtotal/Ttotal;
        System.out.println("A velocidade média final do percurso é: "+Vfinal);
        }else System.out.println("Insira velocidades positivas!");

    }
}
