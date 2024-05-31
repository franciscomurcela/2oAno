package aula02;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do cateto A: ");
        double A = sc.nextDouble();
        System.out.println("Insira o valor do cateto B: ");
        double B = sc.nextDouble();
        sc.close();
        if (A>0 && B>0){
        double hip = Math.pow(A, 2) + Math.pow(B, 2);
        double ang = Math.asin(A/hip);
        System.out.println("A hipotenusa do triângulo é "+hip+" e o ângulo entre a hipotenusa e o cateto A é "+ang);
        } else System.out.println("Insira valores positivos!");
    }
    
}
