package PracticaIntroduccionAJava;
import java.util.Scanner;

/**
7: Escribe un programa que lea dos números, calcule y muestre el valor de sus suma,
resta, producto y división.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = 0, n2 = 0, suma = 0, resta = 0, producto = 0, division = 0;
        
        System.out.println("introduce el primer número: ");
        n1 = scanner.nextDouble();
        System.out.println("introduce el segundo número: ");
        n2 = scanner.nextDouble();

        suma = n1 + n2;
        System.out.println("la suma del primer numero más el segundo es: " + suma);
        resta = n1 - n2;
        System.out.println("la resta del primer numero menos el segundo es: " + resta);
        producto = n1 * n2;
        System.out.println("el producto del primer numero y el segundo es: " + producto);
        division = n1 / n2;
        if(n2 == 0){
            System.out.println("la división no se puede realizar ya que no se puede dividir un número entre cero :( ");
        } else System.out.println( "la division del primer numero entre el segundo es: " + division);
        scanner.close();
    }
}
