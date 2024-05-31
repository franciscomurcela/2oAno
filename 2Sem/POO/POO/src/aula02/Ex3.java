package aula02;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da massa: ");
        double m = sc.nextDouble();
        System.out.println("Digite a temperatura inicial da água : ");
        double Ti = sc.nextDouble();
        System.out.println("Digite a temperatura final da água: ");
        double Tf = sc.nextDouble();
        sc.close();
        double Q = m * (Tf - Ti) * 4184;
        System.out.print("É necessário fornecer " +Q+ " joules de energia para aquecer a água");      
    }    
}
