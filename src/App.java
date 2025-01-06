import java.io.IOException;
 
import java.util.Scanner;

public class App {
    
    	public static void main(String[] args) {
    
    
    Scanner teclado = new Scanner (System.in);
    double raio;
    double area;
    raio = teclado.nextDouble();
    
    area = 3.14159 * (raio*raio);
    
      System.out.printf("A=%.4f\n", area);
    
    teclado.close();
 
    
    
}
}