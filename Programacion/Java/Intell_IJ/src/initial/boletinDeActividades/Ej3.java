/* Realiza un programa que calcule el área de un círculo a partir de su radio,
introducido por teclado. */ 
import java.util.Scanner;
import java.lang.Math;
public class Ej3{
    public static void main (String[] Args){
        Double radio = 0.00, area = 0.00;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio del circulo: \n");
        radio = scanner.nextDouble();
        area = Math.pow(radio, 2) * Math.PI;
        System.out.println("el area del circulo es: " + area + " u^2");
        scanner.close();
    }
}