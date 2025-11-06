//Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS.

import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeCount = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int value = scanner.nextInt();
            if (value < 0) {
                negativeCount++;
            }
        }
        
        System.out.println("Quantidade de valores negativos: " + negativeCount);
        scanner.close();
    }    

}
