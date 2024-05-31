package aula02;
import java.util.Scanner;
public class Ex7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira as coordenada x do p1: ");
        double Xp1 = sc.nextDouble();
        System.out.println("Insira as coordenada y do p1: ");
        double Yp1 = sc.nextDouble();
        System.out.println("Insira as coordenadas x do p2: ");
        double Xp2 = sc.nextDouble();
        System.out.println("Insira as coordenadas y do p2: ");
        double Yp2 = sc.nextDouble();
        sc.close();
        double dist = Math.sqrt(Math.pow((Xp2 - Xp1),2)+Math.pow((Yp2 - Yp1),2));
        System.out.println("A distância entre o p1 e o p2 é "+dist);
    }
    
}
