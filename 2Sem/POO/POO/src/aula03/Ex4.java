package aula03;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de alunos na turma: ");
        int turma = sc.nextInt();
        
        double notaT[] = new double[turma];
        double notaP[] = new double[turma];
        int NF[] = new int[turma];
        
        for (int i = 0; i < turma; i++) {
            System.out.println("Insira a nota teórica do aluno " + (i+1) + ": ");
            notaT[i] = sc.nextDouble();

            if (notaT[i] > 20 || notaT[i] < 0){
                System.out.println("Nota não está dentro dos limites!");
                notaT[i] = sc.nextDouble();
                i--;
                continue;
            }

            System.out.println("Insira a nota prática do aluno " + (i+1) + ": ");
            notaP[i] = sc.nextDouble();

            if (notaP[i] > 20 || notaP[i] < 0){
                System.out.println("Nota não está dentro dos limites!");
                notaT[i] = sc.nextDouble();
                i--;
                continue;
            }

            if (notaP[i] < 7 || notaT[i] < 7) {
                NF[i] = 66;
            } else {
                NF[i] = (int)Math.round(0.4 * notaT[i] + 0.6 * notaP[i]);
            }
        }
        sc.close();
        
        System.out.println("NotaT \t NotaP \t Pauta"); 
        for (int i = 0; i < turma; i++) {
            System.out.println(notaT[i] + "\t" + notaP[i] + "\t" + NF[i]);
        }
    }  
}
