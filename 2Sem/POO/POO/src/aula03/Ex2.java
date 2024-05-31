package aula03;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor investido (Positivo e múltiplo de 1000): ");
        Double inv = sc.nextDouble();
        while (inv%1000 != 0 || inv <0){
            System.out.println("Montante investido não é múltiplo de 1000 ou é negativo!");
            System.out.println("Insira o valor investido (Positivo e múltiplo de 1000): ");
            inv = sc.nextDouble();
        }

        System.out.println("Insira o valor da taxa de juro mensal (entre 0% e 5%): ");
        Double taxa = sc.nextDouble();
        while (taxa<0 || taxa>5 ){
            System.out.println("Valor da taxa não está entre 0% e 5%! ");
            System.out.println("Insira o valor da taxa de juro mensal (entre 0% e 5%): ");
            taxa = sc.nextDouble();
        }
        taxa = (taxa/100);
        sc.close();
        for (int i = 0; i<13; i++){
            inv=inv+(inv*taxa)*i;
            System.out.println("Investimento ao fim de "+i+" meses: "+Math.round(inv));
        }
        System.out.println("O valor do montante investido ao fim de 12 meses com uma taxa de juro de "+(taxa*100)+"% é: "+Math.round(inv));
    }
}
