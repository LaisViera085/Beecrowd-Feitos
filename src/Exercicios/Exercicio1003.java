package Exercicios;
import java.util.Scanner;
public class Exercicio1003
{
	public static void main(String[] args) {
	       Scanner teclado = new Scanner(System.in);
       int A = teclado.nextInt() ;
       int B = teclado.nextInt();
       int SOMA = A + B;
       
       System.out.println("SOMA = " + SOMA);
       
       teclado.close();
	}
}

