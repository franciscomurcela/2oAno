package aula04;
import java.util.Scanner;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        kms += distance;
    }

}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        // registo de carros termina quando o utilizador inserir uma linha vazia 
        // devolve número de carros registados
        // Os dados de entrada (marca, modelo, ano, quilometragem atual) devem ser verificados de acordo com as seguintes regras: marca é composta por uma única palavra, modelo é composto por uma ou mais palavras, ano é um número inteiro positivo composto por 4 algarismos, quilometragem é um número inteiro positivo.
        System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
        int i = 0;
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String[] parts = line.split(" ");
            if (parts.length != 4) {
                System.out.println("Número de argumentos inválido!");
                System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
                continue;
            }

            String make = parts[0];
            String model = parts[1];
            int year = Integer.parseInt(parts[2]);
            int kms = Integer.parseInt(parts[3]);
            if (year < 1000 || year > 9999) {
                System.out.println("Ano inválido!");
                System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
                continue;
            }
            if (kms < 0) {
                System.out.println("Quilometragem inválida!");
                System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
                continue;
            }
            if (make.length() == 0) {
                System.out.println("Marca inválida!");
                System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
                continue;
            }
            if(model.length() == 0) {
                System.out.println("Modelo inválido!");
                System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
                continue;
            }
            cars[i] = new Car(make, model, year, kms);
            i++;
            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
        }
        
        return (int)cars.length;
        
        
   }
    
    
    static void registerTrips(Car[] cars, int numCars) {
        // registo de viagens termina quando o utilizador inserir uma linha vazia
        // verifica se o carro existe na lista de carros registados e adiciona a quilometragem à viagem
        System.out.print("Insira dados da viagem (matrícula quilómetros): ");
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String[] parts = line.split(" ");
            if (parts.length != 2) {
                System.out.println("Número de argumentos inválido!");
                System.out.print("Insira dados da viagem (matrícula:quilómetros): ");
                continue;
            }
            String make = parts[0];
            int kms = Integer.parseInt(parts[1]);
            if (kms < 0) {
                System.out.println("Quilometragem inválida!");
                System.out.print("Insira dados da viagem (matrícula:quilómetros): ");
                continue;
            }
            boolean found = false;
            for (int i = 0; i < numCars; i++) {
                if (cars[i].make.equals(make)) {
                    cars[i].drive(kms);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Carro não registado!");
            }
            System.out.print("Insira dados da viagem (matrícula quilómetros): ");
        }
    }


    static void listCars(Car[] cars) {
        System.out.println("Carros registados: ");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.println(cars[i].make + " " + cars[i].model + " " + cars[i].year + " " + cars[i].kms);
            }
        }
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

        sc.close();

    }
}