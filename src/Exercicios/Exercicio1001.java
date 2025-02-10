package Exercicios;
import java.util.Scanner;

public class Exercicio1001
{
	public static void main(String[] args) {
	    
	  Scanner teclado = new Scanner (System.in); 
	    int A = teclado.nextInt(); 
	    int B = teclado.nextInt();
	    int X = A + B;
	    
	    System.out.println( "X = " + X );
	    
	    teclado.close();

	}
}