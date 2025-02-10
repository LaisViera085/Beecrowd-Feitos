package Exercicios;
import java.util.Scanner;

public class Exercicio1013 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        int maior = (a > b) ? a : b; 
        maior = (maior > c) ? maior : c;

        System.out.println(maior + " eh o maior");

        teclado.close();
    }
}
