package Exercicios;
import java.util.Scanner;

public class Exercicio1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        int numDePeca1 = scanner.nextInt();
        float valorDaPeca1 = scanner.nextFloat();
        scanner.nextInt();
        int numDePeca2 = scanner.nextInt();
        float valorDaPeca2 = scanner.nextFloat();
        float valorTotal = numDePeca1 * valorDaPeca1 + numDePeca2 * valorDaPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
        scanner.close();
    }
}