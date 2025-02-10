package Exercicios;
import java.util.Scanner;

public class Exercicio1004 {
    public static void main(String[] args) {
        int x, y;
        int PROD;
        
        // Criando um único Scanner para ler as entradas
        Scanner scanner = new Scanner(System.in);
        
        // Lendo os dois valores inteiros
        x = scanner.nextInt();
        y = scanner.nextInt();
        
        // Calculando o produto
        PROD = x * y;
        
        // Imprimindo a mensagem e o valor de PROD
        System.out.println("PROD = " + PROD);
        
        // Fechando o scanner
        scanner.close();
    }
}