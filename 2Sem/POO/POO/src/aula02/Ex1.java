package aula02;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os quilómetros a converter: ");
        double km = sc.nextDouble();
        sc.close();
        double milhas = km / 1.609;
        System.out.print(km + " quilómeltros é igual a: " +milhas+ " milhas");
    }   
}
