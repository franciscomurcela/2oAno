import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IPetShelter shelter = new PetShelter("Patudos");

        int choice = 0;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicione um animal");
            System.out.println("2. Remova um animal");
            System.out.println("3. Procure um animal");
            System.out.println("4. Apadrinhe um animal");
            System.out.println("5. Ver todos os animais");
            System.out.println("6. Sair");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int op;
                    System.out.println("Insira o tipo de animal que pretende adicionar:");
                    System.out.println("1. Cão");
                    System.out.println("2. Pássaro");
                    System.out.println("3. Coelho");
                    op=scanner.nextInt();
                    if (op==1) {
                        System.out.println("Insira a raça do cão:");
                        String raca = scanner.next();
                        System.out.println("Insira o peso do cão:");
                        long peso = scanner.nextLong();
                        System.out.println("Insira a idade do cão:");
                        int idade = scanner.nextInt();
                        System.out.println("Insira o nome do padrinho do cão:");
                        String padrinho=scanner.next();
                        Animal Animal=new Dog(peso, idade, padrinho, raca);
                        shelter.addAnimal(Animal);
                    } else if (op==2) {
                        System.out.println("Insira o habitat do pássaro:");
                        System.out.println("1. Diurno");
                        System.out.println("2. Nocturno");
                        int op2=scanner.nextInt();
                        Habitat habitat = null;
                        if(op2==1){
                            habitat = Habitat.Diurno;
                        } else habitat = Habitat.Noturno;
                        System.out.println("Insira o peso do pássaro:");
                        long peso2=scanner.nextLong();
                        System.out.println("Insira a idade do pássaro:");
                        int idade2=scanner.nextInt();
                        System.out.println("Insira o nome do padrinho do pássaro:");
                        String padrinho2=scanner.next();
                        Animal Animal2=new Bird(peso2, idade2, padrinho2, habitat);
                        shelter.addAnimal(Animal2);
                    } else if (op==3) {
                        System.out.println("Insira o tipo de pelo do coelho:");
                        System.out.println("1. Curto");
                        System.out.println("2. Longo");
                        int op3=scanner.nextInt();
                        Pelo pelo = null;
                        if(op3==1){
                            pelo = Pelo.Comprido;
                        } else pelo = Pelo.Longo;

                        System.out.println("Insira o peso do coelho:");
                        long peso3=scanner.nextLong();
                        System.out.println("Insira a idade do coelho:");
                        int idade3=scanner.nextInt();
                        System.out.println("Insira o nome do padrinho do coelho:");
                        String padrinho3=scanner.next();
                        Animal Animal3=new Rabbit(peso3, idade3, padrinho3, pelo);
                        shelter.addAnimal(Animal3);
                    }
                break;
                case 2:
                    System.out.println("Insira o nome do animal que pretende remover:");
                    String nome=scanner.next();
                    Animal animal=shelter.searchForAnimal(nome);
                    shelter.removeAnimal(animal);    
                break;
                case 3:
                    System.out.println("Insira o nome do animal que pretende procurar:");
                    String nome2=scanner.next();
                    Animal animal2=shelter.searchForAnimal(nome2);
                    System.out.println(animal2.toString());
                break;
                case 4:
                break;
                case 5:
                    shelter.listAllAnimals();
                break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        } while (choice != 6);
        scanner.close();
    }
}
