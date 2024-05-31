package aula03;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        desenharCalendario(mes(sc), ano(sc), dia(sc));
        sc.close();
    }
    
    public static int dia (Scanner sc){
        int dia;
        do{
            try{
                System.out.println("Insira o dia da semana cujo mês começa(1 = Domingo, 2 = Segunda, 3 = Terça, 4 = Quarta, 5 = Quinta, 6 = Sexta, 7 = Sábado)");
                dia = sc.nextInt();
                if (dia>0 & dia<8){
                    break;
                } else{
                    System.out.println("O dia só aceita valores de 1 a 7");
                } 
            } catch (Exception str){
                sc.nextLine();
                System.out.println("Tem de inserir um número inteiro");
            }   
        }while(true);
        return dia;
    }

    public static int mes (Scanner sc){
        int mes;
        do{
            try{
            
            System.out.println("Insira o mês");
            mes = sc.nextInt();
            if (mes>=1 & mes<=12){
                break;
            } else{
                System.out.println("O mês so aceita valores de 1 até 12.");
            }
            } catch(Exception str){
                sc.nextLine();
                System.out.println("Tem de inserir um número inteiro.");
            }
        }while(true);
        return mes;
    }
    
    public static int ano (Scanner sc){
        int ano;
        do{
            try{
                System.out.println("Insira o ano");
                ano = sc.nextInt();
                if (ano>0){
                    break;
                } else{
                    System.out.println("O ano não toma valores negativos.");
                }
            } catch(Exception str){
                sc.nextLine();
                System.out.println("Tem de inserir um número inteiro");

                
            }
        }while(true);
        return ano;
    }


    public static int dias(int mes, int ano) {
        if (mes == 2) {
            if (bissexto(ano)){
                return 29;
            } else{
            return 28;
            }
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return 30;
        } else{
        return 31;
        }
    }

    
    public static boolean bissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }

     public static String NomeMes(int mes){
        switch(mes){
            case 1: return "Janeiro";
			case 2: return "Fevereiro";
			case 3: return "Março";
			case 4: return "Abril";
			case 5: return "Maio";
			case 6: return "Junho";
			case 7: return "Julho";
			case 8: return "Agosto";
			case 9: return "Setembro";
			case 10: return "Outubro";
			case 11: return "Novembro";
			case 12: return "Dezembro";
			default: return ""; 
        }
    }


    public static void desenharCalendario(int mes, int ano, int inicio) {
        System.out.println("    "+NomeMes(mes) + "  " + ano);
        System.out.println("Su Mo Tu We Th Fr Sa");
        System.out.println(construtorDeString(mes, ano, inicio));
    }

   
    public static String construtorDeString(int mes, int ano, int inicio) {
        int dias = dias(mes, ano);
        int dia_semana = inicio;
        // Iniciamos a string com os espaços relativamente ao inicio do mês
        String espacos = new String("   ".repeat(inicio - 1));
        for (int i = 1; i <= dias; i++) {
            if (dia_semana == 1) {
                espacos += String.format("%2d ", i);
                dia_semana++;
            } else if (dia_semana == 7) {
                espacos += String.format("%2d\n", i);
                dia_semana = 1;
            } else {
                espacos += String.format("%2d ", i);
                dia_semana++;
            }
        }
        return espacos;
    }
}




