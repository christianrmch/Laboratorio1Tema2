/**
 * Realiza un programa que pida tres números y los muestres ordenados de
 * mayor a menor.
 */
import java.util.Scanner;
public class Ej5{
    public static void main(String[] args) {
        int n1 = 0, n2 = 0, n3 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el primer número: ");
        n1 = scanner.nextInt();
        System.out.println("introduce el segundo número: ");
        n2 = scanner.nextInt();
        System.out.println("introduce el tercer número: ");
        n3 = scanner.nextInt();
        if(n1 >= n2 && n2 >= n3){
            if(n1 > n2){
                System.out.println(n1 + " > " + n2 + " > " + n3);
            }
            else System.out.println(n1 + " = " + n2 + " > " + n3);
        }
        if( n1 >= n3 && n3 > n2){
            if(n1 > n3){
                System.out.println(n1 + " > " + n3 + " > " + n2);
            }
            else System.out.println(n1 + " = " + n3 + " > " + n2);
        }
        if(n2 >= n1 && n1 >= n3){
            if(n2 > n1) {
                System.out.println(n2 + " > " + n1 + " > " + n3);
            }
            else System.out.println(n2 + " = " + n1 + " > " + n3);
        }
        if( n2 >= n3 && n3 > n1){
            if(n2 > n3){
                System.out.println(n2 + " > " + n3 + " > " + n1);
            }
            else System.out.println(n2 + " = " + n3 + " > " + n1);
        }
        if( n3 >= n2 && n2 >= n1){
            if(n3 > n2){
                System.out.println(n3 + " > " + n2 + " > " + n1);
            }
            else System.out.println(n3 + " = " + n2 + " > " + n1);
        }
        if( n3 >= n1 && n1 > n2){
            if(n3 > n1){
                System.out.println(n3 + " > " + n1 + " > " + n2);
            }
            else System.out.println(n3 + " = " + n1 + " > " + n2);
        }
        else if (n1 == n2 && n2 == n3){
            System.out.println( n1 + " = " + n2 + " = " + n3);
        }
        scanner.close();
    }
}

/**                 ¡¡SOLUCIÓN!!
        if (n1 >= n2 && n1 >= n3){
             if(n2 > n3){
                System.out.println(n1 + " > " + n2 + " > " + n3);
            }
            else System.out.println(n1 + " > " + n2 + " > " + n3);
        }
        else if(n2 >= n3 && n3 > n1){
            if(n2 > n3){
                System.out.println(n2 + " > " + n3 + " > " + n1);
            }
            else System.out.println(n2 + " = " + n3 + " > " + n1);
        }
        else if(n3 >= n1 && n1 > n2){
            if(n3 > n1){
                System.out.println(n3 + " > " + n1 + " > " + n2);
            }
            else System.out.println(n3 + " = " + n1 + " > " + n2);
        }
        else System.out.println(n1 + " = " + n2 + " = " + n3);
    scanner.close();
    */