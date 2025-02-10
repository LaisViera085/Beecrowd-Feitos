package Exercicios;

import java.util.Scanner;

    public class Exercicio1018{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        
        System.out.println(N);
        
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        
        for (int i = 0; i < notas.length; i++) {
            int quantidadeNotas = N / notas[i];
            N = N % notas[i];
            System.out.println(quantidadeNotas + " nota(s) de R$ " + notas[i] + ",00");
        }
        
        teclado.close();
    }
}