package aula02;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int soma = 0, nr = 1;
        System.out.print("Insira um número: ");
        int n = sc.nextInt();
        int primeiro = n, min = n, max = n;
        do {
            soma += n;
            if (n > max) max = n;
            if (n < min) min = n;
            nr++;
            System.out.print("Insira um número: ");
            n = sc.nextInt();
        } while (n != primeiro);
        soma += n;
        double media = (double)soma/(double)nr;
        sc.close();
        System.out.println("A soma dos números é: " + soma+" a média é: "+media+", foram inseridos "+nr+" números, o maior número é: "+max+" e o menor número é: "+min);   
    }

}

