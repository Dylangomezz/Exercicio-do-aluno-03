//Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.

import java.util.Scanner;   

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Digite um valor inteiro maior que zero: ");
        int N = scanner.nextInt();
            
        System.out.println("Valores inteiros entre 1 e " + N + ":");
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
        }
            
        scanner.close();
    }
}