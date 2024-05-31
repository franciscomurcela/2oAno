package aula05;
import java.util.Scanner;


public class Ex2 {
    int dia, ano;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendario calendData = new Calendario(0, 0);
        int x = 0;
        do {
            System.out.println("Calendar operations:");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("0 - exit");
            System.out.print("=> ");
            x = sc.nextInt();
            switch(x){
                case (1): definirCalendario(calendData, sc);
                break;
                case (2): printMonth(calendData, sc);
                break;
                case (3): printCalendario(calendData);
                break;
                default: break;
            }
        } while(x!=0);
        sc.close();
    }


    public static void definirCalendario(Calendario calendData, Scanner sc) {
        int dia,ano;
        do{
            try{
                System.out.println("Introduza o ano: ");
                ano = sc.nextInt();
                if (ano>0){
                    break;
                } else{
                    System.out.println("O ano tem de ser um valor positivo.");
                }
            } catch(Exception str){
                sc.nextLine();
                System.out.println("O valor tem de ser um número inteiro.");
            }
        }while(true);

        do{
            try{
                System.out.println("Insira o primeiro dia do ano (1:Domingo, 2:Segunda, 3:Terça, 4:Quarta, 5:Quinta, 6:Sexta, 7:Sábado");
                dia = sc.nextInt();
                if (dia>=1 && dia<=7){
                    break;
                }else{
                    System.out.println("O dia do início do ano só aceita valores entre 1 e 7");
                }
            } catch(Exception str){
                System.out.println("Tem de inserir um número inteiro.");
            }
        }while(true);   
    }
    
    public static void printMonth(Calendario calendData, Scanner sc){
        int mes = 0;
        do{
            try{
                System.out.println("Insira um mês (1:Janeiro, 2:Fevereiro, 3:Março, 4:Abril, 5:Maio, 6:Junho, 7:Julho, 8:Agosto, 9:Setembro, 10:Outubro, 11:Novembro, 12:Dezembro): ");
                mes=sc.nextInt();
                if (mes>=1 && mes<=12){
                    break;
                } else{
                    System.out.println("O mês só aceita valores entre 1 e 12");
                }
            }catch(Exception str){
                System.out.println("Tem de inserir um número inteiro");
            }
        }while(true);
        System.out.println(calendData.desenharCalendario(mes));
    }

    public static void printCalendario(Calendario calendData){
        System.out.println(calendData.toString());
    }
}