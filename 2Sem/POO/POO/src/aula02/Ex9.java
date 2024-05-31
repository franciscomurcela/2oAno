package aula02;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int n = sc.nextInt();
        sc.close();
        for (int i=n; i>0; i--){
            if (i%10==0){
                System.out.println();
            }
            System.out.print(i+", ");

        }
    }
    
}
