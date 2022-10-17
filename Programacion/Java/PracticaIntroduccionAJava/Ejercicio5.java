package PracticaIntroduccionAJava;
import java.util.Scanner;
import java.lang.Math;
/**
 * Escribe un programa que calcule el área de un cuadrado
 *  cuyo lado se introduce por teclado.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado = 0.0, area = 0.0;
        System.out.println("introduce el valor de un lado del cuadrado con numeros decimales: ");
        lado = scanner.nextDouble();
        area = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es: " + area + " u^2");
        scanner.close();
    }
}
