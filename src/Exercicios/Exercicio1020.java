package Exercicios;


import java.util.Scanner;

public class Exercicio1020 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idadeEmDias = teclado.nextInt();
        
        int anos = idadeEmDias / 365;
        idadeEmDias = idadeEmDias % 365;
        
        int meses = idadeEmDias / 30;
        int dias = idadeEmDias % 30;
        
        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", dias);
        
        teclado.close();
    }
}