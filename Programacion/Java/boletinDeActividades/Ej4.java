/**
 * USANDO ORDINOGRAMAS (Ejercicio 8. Práctica 1. UD 2). Realiza un
 * programa que lee dos números y los visualiza en orden ascendente.
 */
import java.util.Scanner;
 public class Ej4{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        System.out.println("Introduce el primer número: ");
        n1 = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        n2 = scanner.nextInt();
        if (n1 >= n2){
            if (n1 > n2) System.out.println(n1 + " > " + n2);
            else System.out.println(n1 + " = " + n2);
        }
        else System.out.println(n2 + " > " + n1);
        scanner.close();
    }
}