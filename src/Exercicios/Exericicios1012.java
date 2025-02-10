package Exercicios;

 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
import java.util.Scanner;

public class Exericicios1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
       
        double volume = (4 / 3.0) * 3.14159 * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", volume);
   
   scanner.close(); }
}