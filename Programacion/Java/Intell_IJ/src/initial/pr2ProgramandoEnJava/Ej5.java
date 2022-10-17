import java.util.Scanner;
/*
 * . Diseña un programa Java para resolver una ecuación de primer grado con una
     incógnita (x), suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen
     desde teclado.
•    C1x + C2 = 0
 */
public class Ej5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c1 = 0.0, c2 = 0.0, incognita = 0.0 ;

        System.out.println("introduce el primer coeficiente: ");
        c1 = scanner.nextDouble();
        System.out.println("introduce el segundo coeficiente: ");
        c2 = scanner.nextDouble();

        //ecuacion resuelta -> x = -c2 / c1
        incognita = -c2 / c1;

        System.out.println("el resultado de la ecuacion es x = " + incognita);
        scanner.close();
    }
}
