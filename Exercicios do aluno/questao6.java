//Ler o número de alunos existentes em uma turma e, após isto, ler as notas destes alunos, calcular e escrever a média aritmética dessas notas lidas. 

import java.util.Scanner;
public class questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de alunos na turma: ");
        int numeroDeAlunos = scanner.nextInt();
        
        double somaDasNotas = 0.0;
        
        for (int i = 1; i <= numeroDeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            somaDasNotas += nota;
        }
        
        double mediaAritmetica = somaDasNotas / numeroDeAlunos;
        System.out.printf("A média aritmética das notas é: %.2f%n", mediaAritmetica);
        
        scanner.close();
    }
}
