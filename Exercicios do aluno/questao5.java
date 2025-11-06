//Ler 10 valores, calcular e escrever a média aritmética desses valores lidos.


import java.util.Scanner;
public class questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma =0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o" + i + "º valor:");
            double valor = scan.nextDouble();
            soma += valor;
        }   
        double media = soma / 10;
        System.out.println("A média aritmética dos valores digitados é: " + media);
    }
}
