package Exercicios;
import java.util.Scanner;


public class Exercicio1043{

    public static void main(String[] args)  {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        leitor.close(); // Boa prática: fechar o Scanner quando não for mais necessário.

        // Verifica se os valores podem formar um triângulo
        if (A + B > C && A + C > B && B + C > A) {
            double perimetro = A + B + C;
            System.out.println(String.format("Perimetro = %.1f", perimetro));
        } else {
            double areaTrapezio = ((A + B) * C) / 2;
            System.out.println(String.format("Area = %.1f", areaTrapezio));
        }
    }
}