package PracticaIntroduccionAJava;
import java.util.Scanner;
/**
 * Muestra un mensaje de bienvenida por consola según el nombre que se haya
 * introducido. Por ejemplo: si introduzco “Carles”, me aparezca “Bienvenido Carles”
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String nombreDeUsuario = "";
        System.out.println("introduce tu numbre: ");
        nombreDeUsuario = scanner.next();
        System.out.println("Bienvenido " + nombreDeUsuario);
        scanner.close();
    }
}
