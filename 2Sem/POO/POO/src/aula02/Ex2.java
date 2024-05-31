package aula02;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os graus celsius a converter: ");
        double Cels = sc.nextDouble();
        sc.close();
        double Faren = (Cels * 1.8) + 32;
        System.out.print(Cels + " graus celsius é igual a: " +Faren+ " graus farenheit");      
    }
    
}
