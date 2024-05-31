package aula03;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma frase: ");
        s = sc.nextLine();
        sc.close();
    
    
        System.out.println("Número de carateres númericos: "+ countDigits(s));
        System.out.println("Número de espaços em branco: "+ espacobranco(s));
        System.out.println("Só contém minúsculas? "+ min(s));
        System.out.println("Replace de espaços: "+ espacos(s));
        System.out.println("É palíndromo? "+ pal(s));
    
        }
    
        public static int countDigits(String s){
        int c=0;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                c++;  
            }
        }
        return c;        
        }
    
        public static int espacobranco(String s){
        int c=0;
        for(int i=0; i<s.length(); i++){
            if(Character.isWhitespace(s.charAt(i))){
                c++;  
            }
        }
        return c;
        }
        
        public static boolean min(String s){
            if (s.toLowerCase()==s){
                return true;
            } else{
                return false;
            }
        }
    
    
        public static String espacos(String s){
            s=s.replaceAll(" +", "");
            return s;
        }
    
        public static boolean pal(String s){
        for (int i=1; i < s.length()/2; i++) {
            if (s.charAt(i-1) != s.charAt(s.length()-i)){
                return false;
            }
        }
            return true;
        }
    
}
