package Exercicios;

import java.util.Scanner;

public class Exercicio1017{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tempo = teclado.nextInt();
        int velocidade = teclado.nextInt();
        
        int distancia = tempo * velocidade;
        double litros = distancia / 12.0;
        
        System.out.printf("%.3f\n", litros);
        teclado.close();
    }
}