package aula02;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Valid();
      }
    
        static void Valid() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o número inteiro no intervalo [0-100]: ");
            int n = sc.nextInt();
            while (n < 0 || n > 100) {
                System.out.println("Número inválido, insira um número inteiro no intervalo [0-100]: ");
                n = sc.nextInt();
            }
            System.out.println("Número "+n+" válido! ");
            sc.close();
    
        }
}
        

