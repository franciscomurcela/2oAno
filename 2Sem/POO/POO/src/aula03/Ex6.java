package aula03;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        String str, strl, stru, tres;
        char uc;
        int lng;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma string: ");
        str = sc.nextLine();
        sc.close();
        strl=str.toLowerCase();
        uc=str.charAt(str.length()-1);
        tres= str.substring(0,3);
        lng= str.length();
        stru = str.toUpperCase();
        
        if (str.endsWith("a")==true || str.endsWith("e")==true || str.endsWith("i")==true || str.endsWith("o")==true || str.endsWith("u")==true){
            System.out.println("A frase acaba numa vogal");   
        }else{
            System.out.println("A frase não acaba numa vogal");   
        }

        System.out.println("Frase convertida em minúsculas: "+ strl);
        System.out.println("Frase convertida em maiúsculas: "+ stru);
        System.out.println("Último caractere: "+ uc);
        System.out.println("Primeiros três caracteres: "+ tres);
        System.out.println("A frase tem "+lng+" caracteres");
    }
    
}
