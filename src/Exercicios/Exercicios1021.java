package Exercicios;
import java.util.Scanner;

public class Exercicios1021{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double N = teclado.nextDouble();
        
        // Convertendo o valor para centavos (multiplicando por 100)
        int valor = (int) (N * 100);
        
        // Notas disponíveis
        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        String[] notasLabels = {"100.00", "50.00", "20.00", "10.00", "5.00", "2.00"};
        
        System.out.println("NOTAS:");
        
        // Calculando as notas
        for (int i = 0; i < notas.length; i++) {
            int quantidadeNotas = valor / notas[i];
            valor = valor % notas[i];
            System.out.println(quantidadeNotas + " nota(s) de R$ " + notasLabels[i]);
        }
        
        // Moedas disponíveis
        double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        String[] moedasLabels = {"1.00", "0.50", "0.25", "0.10", "0.05", "0.01"};
        
        System.out.println("MOEDAS:");
        
        // Calculando as moedas
        for (int i = 0; i < moedas.length; i++) {
            int quantidadeMoedas = (int) (valor / (moedas[i] * 100));
            valor = valor % (int)(moedas[i] * 100);
            System.out.println(quantidadeMoedas + " moeda(s) de R$ " + moedasLabels[i]);
        }
        
        teclado.close();
    }
}