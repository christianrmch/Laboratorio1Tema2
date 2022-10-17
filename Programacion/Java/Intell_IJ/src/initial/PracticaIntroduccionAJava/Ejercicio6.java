package PracticaIntroduccionAJava;
import java.util.Scanner;
import java.lang.Math;

/**
 *  6: Pedir el radio de un círculo y calcular su área. A = PI * r2
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio = 0.0;
        final double pi = Math.PI;
        double area = 0.0;
        System.out.println("introduce el valor del radio de la circunferencia con decimales: ");
        radio = scanner.nextDouble();
        area = pi * Math.pow(radio, 2);
        System.out.println("el area del circulo es: " + area + " u^2");
        scanner.close();
    }
}
