//Escreva um algoritmo para ler 10 números. Todos os números lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada. 

import java.util.Scanner;
public class questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaInferiorA40 = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero < 40) {
                somaInferiorA40 += numero;
            }
        }
        
        System.out.printf("A soma dos números lidos com valor inferior a 40 é: %d%n", somaInferiorA40);
        
        scanner.close();
    }
}
