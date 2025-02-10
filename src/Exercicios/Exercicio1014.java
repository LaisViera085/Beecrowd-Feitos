package Exercicios;

import java.util.Scanner;

public class Exercicio1014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int X = teclado.nextInt();
        double Y = teclado.nextDouble();
        double consumoMedio = X / Y;
        System.out.printf("%.3f km/l\n", consumoMedio);
        teclado.close();
    }
}