package pr2ProgramandoEnJava;
import java.util.Scanner;
import java.lang.Math;
/*
Diseña un programa Java que calcule la suma, resta, multiplicación y división de dos
números introducidos por teclado. Incorpora también las funciones que permitan
realizar la potencia de un número y la raíz cuadrada del otro.
Ejemplo de salida del programa para x=9, y=3:
Introducir primer número: 9
Introducir segundo número: 3
x = 9.0 y = 3.0
x + y = 12.0
x - y = 6.0
x * y = 27.0
x / y = 3.0
x ^ 2 = 81.0
√ x = 3.0
 */
 class Ej6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x = 0.0, y = 0.0, suma = 0.0, resta = 0.0, multiplicación = 0.0, division = 0.0, potencia = 0.0, raizCuadrada = 0.0; 
        System.out.println("introduce el primer número: ");
        x = scanner.nextDouble();
        System.out.println("introduce el segundo número: ");
        y = scanner.nextDouble();
        
        //suma 
        suma = x + y;
        System.out.println("el resultado de la suma es: " + suma);

        //resta
        resta = x - y;
        System.out.println("el resultado de la resta x - y  es: " + resta);

        //multiplicacion
        multiplicación = x * y;
        System.out.println("el resultado de la multiplicación es: " + multiplicación);

        //division
        division = x/y;
        System.out.println("el resultado de la division de x/y es: " + division);

        //potencia 
        potencia = Math.pow(x, 2);
        System.out.println("el resultado de la potencia de x al cuadrado es: " + potencia);

        //raiz cuadrada
        System.out.println(y);
        raizCuadrada = Math.sqrt(y);
        System.out.println("el resultado de la raiz cuadrada de y es: " + raizCuadrada);
        scanner.close();
    }
}
