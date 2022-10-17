package PracticaIntroduccionAJava;
import java.lang.Math;

//3. Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
public class Ejercicio3 {
    public static void main(String[] args) {
        final double lado = 5.0;
        double area = 0.0;
        area = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es: " + area + " u^2");
    }
}
