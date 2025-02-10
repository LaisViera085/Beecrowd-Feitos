package Exercicios;


import java.util.Scanner;

    public class Exercicio1019{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        
        int horas = N / 3600;
        N = N % 3600;
        
        int minutos = N / 60;
        int segundos = N % 60;
        
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        
        teclado.close();
    }
}