package aula07.Ex1;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo c1 = new Circulo(0, 0, 0, "");
        Circulo c2 = new Circulo(0, 0, 0, "");
        Retangulo r1 = new Retangulo(0,0, 0, 0, "");
        Retangulo r2 = new Retangulo(0,0, 0, 0, "");
        Triangulo t1 = new Triangulo(0,0,0,0,0,"");
        Triangulo t2 = new Triangulo(0,0,0,0,0,"");

        int a = 0;
        do {
            System.out.println("0 - Criar círculo");
            System.out.println("1 - Criar retângulo");
            System.out.println("2 - Criar triângulo");
            System.out.println("3 - Listar Figuras");
            System.out.println("4 - Comparar Figuras");
            System.out.println("5 - Sair");
            System.out.print(": ");
            a = sc.nextInt();
            sc.nextLine();
            switch(a){
                case(0): criarCircs(c1, c2, sc);
                case(1): criarRetangulos(r1, r2, sc);
                case(2): criarTriangulos(t1, t2, sc);
                case(3): list(c1, c2, r1, r2, t1, t2);
                case(4): comparar(c1, c2, r1, r2, t1, t2);
                default: break;
            } 
        }while(a != 5);
    }

    private static void criarCircs(Circulo c1, Circulo c2, Scanner sc) {
        System.out.println("Círculo 1:");
        criarCir(c1, sc);
        System.out.println("Círculo 2:");
        criarCir(c2, sc);
    }

    private static void criarRetangulos(Retangulo r1, Retangulo r2, Scanner sc) {
        System.out.println("Retângulo 1:");
        criarRetangulo(r1, sc);
        System.out.println("Retângulo 2:");
        criarRetangulo(r2, sc);
    }

    private static void criarTriangulos(Triangulo t1, Triangulo t2, Scanner sc) {
        System.out.println("Triângulo 1:");
        criarTriangulo(t1, sc);
        System.out.println("Triângulo 2:");
        criarTriangulo(t2, sc);
    }

    private static void list(Circulo c1, Circulo c2, Retangulo r1, Retangulo r2, Triangulo t1, Triangulo t2) {
        System.out.println("Círculo 1: " + c1.toString());
        System.out.println("Círculo 2: " + c2.toString());
        System.out.println("Retangulo 1: " + r1.toString());
        System.out.println("Retangulo 2: " + r2.toString());
        System.out.println("Triangulo 1: " + t1.toString());
        System.out.println("Triangulo 2: " + t2.toString());
    }

    private static void comparar(Circulo c1, Circulo c2, Retangulo r1, Retangulo r2, Triangulo t1, Triangulo t2) {
        System.out.println("Círculo 1 = Círculo 2 : " + c1.equals(c2));
        System.out.println("Retangulo 1 = Retangulo 2 : " + r1.equals(r2));
        System.out.println("Triangulo 1 = Triangulo 2 : " + t1.equals(t2));
    }

    private static void criarCir(Circulo c, Scanner sc) {
        do {
                System.out.print("Insira o raio do círculo: ");
                do{
                    c.setRaio(sc.nextFloat());
                    if(!c.Valid()) System.out.println("Não inseriu um raio válido.");
                }while(!c.Valid());

                System.out.println("Insira a cor do círculo: ");
                c.setCor(sc.nextLine().toLowerCase());
        }while(true);
    }

    private static void criarRetangulo(Retangulo r, Scanner sc) {
        do {
            System.out.print("Insira a altura do Retângulo: ");
            do{
            r.setAltura(sc.nextFloat());
            if(!r.Valid()) System.out.println("Não inseriu uma altura válida.");
            }while(!r.Valid());
            System.out.print("Insira o comprimento do Retângulo: ");
            do{
            r.setComprimento(sc.nextFloat());
            if(!r.Valid()) System.out.println("Não inseriu um comprimento válido.");
            }while(!r.Valid());
            System.out.println("Insira a cor do Retângulo: ");
            r.setCor(sc.nextLine().toLowerCase());
        }while(true);
    }

    private static void criarTriangulo(Triangulo t, Scanner sc) {
        do {
            float l1, l2, l3;
            do{
            System.out.print("Insira o lado 1: ");
            l1 = sc.nextFloat();
            System.out.print("Insira o lado 2: ");
            l2 = sc.nextFloat();
            System.out.print("Insira o lado 3: ");
            l3 = sc.nextFloat();
            t.setLados(l1, l2, l3);
            if (!t.Valid()) System.out.println("Só são aceites valores positivos e que respeitem a Desigualdade Triangular.");
            }while(!t.Valid());
            System.out.println("Insira a cor do Triângulo: ");
            t.setCor(sc.nextLine().toLowerCase());                       
        }while(true);
    }
}
