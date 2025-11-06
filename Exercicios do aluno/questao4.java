//Escreva um algoritmo em Java que faça uma contagem regressiva a partir de um número inteiro positivo fornecido pelo usuário até zero

import java.util.Scanner;
public class questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo para iniciar a contagem regressiva:");
        int numero = scan.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            System.out.println("Contagem regressiva:");
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
