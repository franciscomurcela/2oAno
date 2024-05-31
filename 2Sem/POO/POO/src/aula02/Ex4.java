package aula02;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor investido: ");
        Double inv = sc.nextDouble();
        System.out.println("Insira o valor da taxa de juro mensal (em %): ");
        Double taxa = sc.nextDouble();
        sc.close();
        taxa = (taxa/100);
        inv=inv+(inv*taxa)*3;
        System.out.println("O valor do montante investido ao fim de 3 meses com uma taxa de juro de "+(taxa*100)+"% é: "+inv);
    }
    
}
