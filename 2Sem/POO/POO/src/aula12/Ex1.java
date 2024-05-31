package aula12;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1 {

    public static void main(String[] args) {
        String path = "aula12\\A_cidade_e_as_serras.txt";

        try {
            Scanner scanner = new Scanner(new FileReader(path));

            int contadorPalavras = 0;
            Set<String> palavrasDiferentes = new HashSet<>();

            while (scanner.hasNext()) {
                String palavra = scanner.next();
                contadorPalavras++;
                palavrasDiferentes.add(palavra);
            }
            

            scanner.close();

            System.out.println("Número de palavras: " + contadorPalavras);
            System.out.println("Número de palavras diferentes: " + palavrasDiferentes.size());

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + path);
        }
    }
}


