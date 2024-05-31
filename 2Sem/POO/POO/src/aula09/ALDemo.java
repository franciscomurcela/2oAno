package aula09;
import aula06.Ex1.Pessoa;
import aula05.DateYMD;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10) 
        c1.add(i);
        System.out.println("Size: " + c1.size());


        for (int i = 0; i < c1.size(); i++) 
        System.out.println("Elemento: " + c1.get(i));
        ArrayList<String> c2 = new ArrayList<>();

        Set<Pessoa> c3 = new HashSet<>();
        Pessoa p1 = new Pessoa("Francisco", 282383828, new DateYMD(4,7,1980));
        Pessoa p2 = new Pessoa("Manuel", 929391120, new DateYMD(20,10,2003));
        Pessoa p3 = new Pessoa("Jose", 922333111, new DateYMD(8,9,2010));
        Pessoa p4 = new Pessoa("Guilherme", 865774232, new DateYMD(3,12,2000));
        Pessoa p5 = new Pessoa("Sofia", 1828392912, new DateYMD(30,7,1950));
        c3.add(p1);
        c3.add(p2);
        c3.add(p3);
        c3.add(p4);
        c3.add(p5);

        Iterator<Pessoa> it = c3.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        Set<DateYMD> c4 = new  TreeSet<>();
        c4.add(new DateYMD(4,7,1980));
        c4.add(new DateYMD(20,10,2003));
        c4.add(new DateYMD(8, 9, 2010));
        c4.add(new DateYMD(3,12, 2000));
        c4.add(new DateYMD(30,7,1950));
        Iterator<DateYMD> it2 = c4.iterator();

        while(it.hasNext()) {
            System.out.println(it2.next());
        }

        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println("Contem Trovoada? "+c2.contains("Trovoada"));
        String str = String.join(", ", c2);
        System.out.println(str);
        System.out.println("Index de Calor = "+c2.indexOf("Calor"));
        System.out.println("Ultimo Index de Frio = "+c2.lastIndexOf("Frio"));
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio"); 
        c2.remove(0);
        System.out.println(c2);
    }
}
