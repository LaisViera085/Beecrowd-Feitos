package Exercicios;

import java.util.Scanner;

public class Exercicio1016 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int distancia = teclado.nextInt();
        int tempo = distancia * 2;
        System.out.println(tempo + " minutos");
        teclado.close();
    }
}