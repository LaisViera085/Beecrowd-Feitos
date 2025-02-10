package Exercicios;
import java.util.Scanner;

public class Exercicio1005 {
    public static void main(String[] args) {
        // Vamos criar o scanner para pegar as entradas
        Scanner scanner = new Scanner(System.in);
        
        // Lemos as duas notas com ponto flutuante
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        
        // Calculamos a média ponderada conforme a fórmula dada
        double MEDIA = (A * 3.5 + B * 7.5) / 11;
        
        // Imprimimos a mensagem com a média, formatada com 5 casas decimais
        System.out.printf("MEDIA = %.5f\n", MEDIA);
        
        // Fechamos o scanner para evitar vazamento de recursos
        scanner.close();
    }
}