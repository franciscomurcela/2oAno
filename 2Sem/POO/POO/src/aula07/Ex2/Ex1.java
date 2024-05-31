package aula07.Ex2;
import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
        
        int op = 0;
        Scanner sc = new Scanner(System.in);
        DateYMD date = new DateYMD(0,0,0);
        do {
            System.out.println("-----MENU-----");
            System.out.println("Date Operations: ");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");
            System.out.println("Insert the option: ");
            op = sc.nextInt();
            switch(op){
            case 1:
                System.out.println("Insira o dia:");
                int day = sc.nextInt();
                if (DateYMD.validDay(day) == false) {
                    do{
                    System.out.println("Dia inválido");
                    System.out.println("Insira o dia:");
                    day = sc.nextInt();
                    }while(DateYMD.validDay(day) == false);
                }
                System.out.println("Insira o mês:");
                int month = sc.nextInt();
                if(DateYMD.validMonth(month) == false){
                    do{
                    System.out.println("Mês inválido");
                    System.out.println("Insira o mês:");
                    month = sc.nextInt();
                    }while(DateYMD.validMonth(month) == false);
                }
                System.out.println("Insira o ano:");
                int year = sc.nextInt();
                if(DateYMD.validYear(year) == false){
                    do{
                    System.out.println("Ano inválido");
                    System.out.println("Insira o ano:");
                    year = sc.nextInt();
                    }while(DateYMD.validYear(year) == false);
                }
                
                date = new DateYMD(day,month,year); 
                break;
            case 2:
                System.out.println("Current Date: "+ date.toString());
                break;
            case 3:
                System.out.println("Choose the increment option: ");
                System.out.println("1 - increment day");
                System.out.println("2 - increment month");
                System.out.println("3 - increment year");
                int op2 = sc.nextInt();
                switch(op2){
                case 1:
                    System.out.println("Increment Day: "+ date.incrementDay());
                    break;
                case 2:
                    System.out.println("Increment Month: "+ date.incrementMonth());
                    break;
                case 3:
                    System.out.println("Increment Year: "+ date.incrementYear());
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
                }
                break;
            case 4:
                System.out.println("Choose the decrement option: ");
                System.out.println("1 - decrement day");
                System.out.println("2 - decrement month");
                System.out.println("3 - decrement year");
                int op3 = sc.nextInt();
                switch(op3){
                case 1:
                    System.out.println("Decrement Day: "+ date.decrementDay());
                    break;
                case 2:
                    System.out.println("Decrement Month: "+ date.decrementMonth());
                    break;
                case 3:
                    System.out.println("Decrement Year: "+ date.decrementYear());
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
                }
                break;
            default:
                System.out.println("Invalid option");
                break;
            }
        }while(op!=0);
        sc.close();
    }
    
}
