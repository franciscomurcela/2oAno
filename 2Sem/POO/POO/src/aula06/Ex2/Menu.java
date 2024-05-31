package aula06.Ex2;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner(System.in);
        Contacto[] contactos = new Contacto[100];
    do {
        System.out.println("-----MENU-----");
        System.out.println("1 - Inserir contacto");
        System.out.println("2 - Alterar contacto");
        System.out.println("3 - Apagar contacto");
        System.out.println("4 - Procurar contacto");
        System.out.println("5 - Listar contactos");
        System.out.println("0 - Sair");
        System.out.print("--> ");
        op = sc.nextInt();
        switch(op){
        case 1:
            System.out.println("Insira o nome: ");
            String nome = sc.next();
            for (int i = 0; i < contactos.length; i++) {
                if(contactos[i] != null){
                    if(contactos[i].getNome().equals(nome)){
                        System.out.println("Pessoa já existe, pretende continuar a inserir um novo contacto? (s/n)");
                        String opcao = sc.next();
                        if(opcao.equals("n") || opcao.toLowerCase().equals("n"))break; else continue;                      
                    }
                }
            }
            System.out.println("Insira o número: ");
            int numero = sc.nextInt();
            if (Contacto.validTelefone(numero) == false) {
                do{
                System.out.println("Número inválido");
                System.out.println("Insira o número:");
                numero = sc.nextInt();
                }while(Contacto.validTelefone(numero) == false);
            }

            System.out.println("Insira o email: ");
            String email = sc.next();
            if (Contacto.validEmail(email) == false) {
                do{
                System.out.println("Email inválido");
                System.out.println("Insira o email:");
                email = sc.next();
                }while(Contacto.validEmail(email) == false);
            }
            
            Contacto c = new Contacto(nome, email, numero);
            for(int i = 0; i < contactos.length; i++){
                if(contactos[i] == null){
                    contactos[i] = c;
                    break;
                }
            }             
            break;
        case 2:
            System.out.println("Insira o nome do contacto que pretende alterar: ");
            String nome2 = sc.next();
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) {
                    if(contactos[i].getNome().equals(nome2)){
                        System.out.println("Insira o novo nome: ");
                        String nome3 = sc.next();
                        System.out.println("Insira o novo número: ");
                        int numero2 = sc.nextInt();
                        if (Contacto.validTelefone(numero2) == false) {
                            do{
                            System.out.println("Número inválido");
                            System.out.println("Insira o número:");
                            numero2 = sc.nextInt();
                            }while(Contacto.validTelefone(numero2) == false);
                        }
                        System.out.println("Insira o novo email: ");
                        String email2 = sc.next();
                        if (Contacto.validEmail(email2) == false) {
                            do{
                            System.out.println("Email inválido");
                            System.out.println("Insira o email:");
                            email2 = sc.next();
                            }while(Contacto.validEmail(email2) == false);
                        }
                        contactos[i].setNome(nome3);
                        contactos[i].setTelefone(numero2);
                        contactos[i].setEmail(email2);
                        break;
                    } else{
                        System.out.println("Contacto não existe"); break;
                    }
                }
            }
            break;
        case 3:
            System.out.println("Insira o nome do contacto que pretende apagar: ");
            String nome3 = sc.next();
            for (int i = 0; i < contactos.length;) {
                if (contactos[i] != null) {
                    if(contactos[i].getNome().equals(nome3)){
                        contactos[i] = null;
                        break;
                    } else{
                        System.out.println("Contacto não existe"); break;
                    }
                }
            }
            break;
        case 4:
            System.out.println("Insira o nome do contacto que pretende procurar: ");
            String nome4 = sc.next();
            for (int i=0; i< contactos.length;){
                if (contactos[i] != null) {
                    if(contactos[i].getNome().equals(nome4)){
                        System.out.println(contactos[i].toString());
                } else {
                    System.out.println("Contacto não existe"); break;
                }
                break;
            }

            }
        case 5:
            for (int i = 0; i<contactos.length; i++){
                System.out.println(contactos[i].toString());
            }
            break;
            
        case 0:
            break;
        
        default:
            System.out.println("Opção inválida");
            break;
        }
    }while(op!=0);
    sc.close();
    }
}
