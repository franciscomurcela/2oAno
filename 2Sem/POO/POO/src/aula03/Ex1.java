package aula03;
import java.util.Scanner;

public class Ex1{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira um número positivo: ");
            int n = sc.nextInt(), soma = 0;
            while (n < 0){
                    System.out.println("Número inválido (Não é positivo) ");
                    System.out.println("Insira um número positivo: ");
                    n = sc.nextInt();
            }
            sc.close();
            
            for (int i = 2; i < n; i++) {
                if (Primo(i)) soma=soma+i;
        }
        System.out.println("Soma dos números primos até "+n+": "+ soma);
    }
        private static boolean Primo(int i) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    return false;   
            }
            return true;
    }
}
