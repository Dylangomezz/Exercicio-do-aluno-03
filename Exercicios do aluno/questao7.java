//Desenvolva um algoritmo em Java que solicite ao usuário um número inteiro positivo e calcule a soma de todos os números pares até esse número.

import java.util.Scanner;
public class questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        int somaDosPares = 0;
        
        for (int i = 2; i <= numero; i += 2) {
            somaDosPares += i;
        }
        
        System.out.printf("A soma de todos os números pares até %d é: %d%n", numero, somaDosPares);
        
        scanner.close();
    }
}
