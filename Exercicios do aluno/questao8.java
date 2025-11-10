//Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma total dos 10 números lidos. 

import java.util.Scanner;
public class questao8 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaTotal = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            somaTotal += numero;
        }
        
        System.out.printf("A soma total dos 10 números lidos é: %d%n", somaTotal);
        
        scanner.close();
    }
}