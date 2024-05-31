package aula12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();
        try {
            movies = getMoviesList("./src/aula12/ex2/movies.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro movies.txt não encontrado.");
            System.exit(1);
        }
        System.out.println(movies);

        movies.sort(Comparator.comparing(Movie::getScore).reversed());
        System.out.println(movies);

        movies.sort(Comparator.comparing(Movie::getRunningTime));
        System.out.println(movies);

        Set<String> genresSet = new HashSet<>();
        for (Movie movie : movies) {
            genresSet.add(movie.getGenre());
        }
        System.out.println(genresSet);

        String comedyMovies = "";
        for (Movie movie : movies) {
            if (movie.getGenre().equals("comedy") && movie.getScore() > 60) {
                comedyMovies += movie.getName() + "\n";
            }
        }
        try {
            generateFile(comedyMovies, "./src/aula12/ex2/myselection.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public static ArrayList<Movie> getMoviesList(String Path) throws FileNotFoundException {
        ArrayList<Movie> movies = new ArrayList<>();
        Scanner sc = new Scanner(new FileInputStream(Path));
        sc.nextLine();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] spaces = line.split("\t");
            Movie add = new Movie(spaces[0], Double.valueOf(spaces[1]), spaces[2], spaces[3], Integer.valueOf(spaces[4]));
            movies.add(add);
        }
        sc.close();
        return movies;
    }

    public static void generateFile(String data, String path) throws IOException {
		PrintWriter out = new PrintWriter(new File(path));
		out.print(data);
		out.close();
	}   
}