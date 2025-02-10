package Exercicios;
import java.util.Scanner;

public class Exercicio1038{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int codigo = teclado.nextInt();
        int quantidade = teclado.nextInt();
        double total = 0;
        
        if (codigo == 1) {
            total = 4.00 * quantidade;
        } else if (codigo == 2) {
            total = 4.50 * quantidade;
        } else if (codigo == 3) {
            total = 5.00 * quantidade;
        } else if (codigo == 4) {
            total = 2.00 * quantidade;
        } else if (codigo == 5) {
            total = 1.50 * quantidade;
        }
        
        System.out.printf("Total: R$ %.2f\n", total);
        
        teclado.close();
    }
}