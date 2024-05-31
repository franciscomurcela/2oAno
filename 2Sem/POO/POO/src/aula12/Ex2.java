package aula12;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Ex2 {
    public static void main(String[] args) {
        String filename = "aula12\\A_cidade_e_as_serras.txt"; 
        try {
            Map<Character, Map<String, Integer>> wordMap = processFile(filename);
            System.out.println(wordMap);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao processar o arquivo: " + e.getMessage());
        }
    }

    public static Map<Character, Map<String, Integer>> processFile(String filename) throws IOException {
        Map<Character, Map<String, Integer>> wordMap = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("[\t\n.,:'‘’;?!-*\\{\\}=+&/\\(\\)\\[\\]”“\"\' ]"); 

                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z0-9]", "");

                    if (word.length() >= 3) {
                        char initial = word.charAt(0);

                        if (!wordMap.containsKey(initial)) {
                            wordMap.put(initial, new TreeMap<>());
                        }

                        Map<String, Integer> countMap = wordMap.get(initial);
                        countMap.put(word, countMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }

        return wordMap;
    }

    
}
