package aula03;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        String s, a="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma frase: ");
        s = sc.nextLine();
        sc.close();
        String[]s2 = s.split(" ");
        

        for (int i = 0; i < s2.length; i++) { 
            if (s2.length>=3){
                continue;
            }else{
                a += s2[i].charAt(0);
                a=a.toUpperCase();
            }
        }

    System.out.println("Acrónimo: "+a);
    }
}
