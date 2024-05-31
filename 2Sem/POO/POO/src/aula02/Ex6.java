package aula02;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número de segundos: ");
        int seg = sc.nextInt();
        sc.close();
        int h = seg/3600;
        int min = (seg%3600)/60;
        int seg2 = seg%60;
        String tempo = String.format("%02d:%02d:%02d", h, min, seg2);
        System.out.println(seg+" segundos equivale a "+tempo);


    }
}
