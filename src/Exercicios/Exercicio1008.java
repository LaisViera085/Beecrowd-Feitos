package Exercicios;

 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
import java.util.Scanner;
public class Exercicio1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float calculoSalario, valorPorHora ;
        int numeroDoFuncionario, horasTrabalhadas;
         numeroDoFuncionario = teclado.nextInt();
         horasTrabalhadas = teclado.nextInt();
         valorPorHora =  teclado.nextFloat();
         calculoSalario = horasTrabalhadas * valorPorHora;
        System.out.println("NUMBER = " + numeroDoFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", calculoSalario);
   teclado.close();
    }
}