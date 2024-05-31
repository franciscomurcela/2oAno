package aula03;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String resposta;
        int i=0;
        do{
            System.out.println("Insira um número inteiro");
            int n = sc.nextInt(), random=(int)(Math.random() * (100 - 0 + 1) + 0);
            do{
                while (n != (int)n){
                    System.out.println("Número não é inteiro");
                    System.out.println("Insira um número inteiro");
                    n = sc.nextInt();
                }
                i=0;
                if (n<random) System.out.println("Número menor do que o pretendido!");
                else System.out.println("Número maior do que o pretendido");
                System.out.println("Insira um número: ");
                n = sc.nextInt();
                i++;
            }while(n!=random);
            System.out.println("Acertou!");
            System.out.println("Conseguiu adivinhar o número em "+i+" tentativas!");
            System.out.println("Pretende continuar? Prima (S)im.");
            resposta = sc.next().toLowerCase();
        } while(resposta.equals("s")|| resposta.equals("sim"));
        sc.close();

    }    
}
