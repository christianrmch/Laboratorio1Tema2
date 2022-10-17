import java.util.Scanner;
/*
 * . Escribe un programa que lea un valor correspondiente a una distancia en millas
marinas y escriba la distancia en metros. Sabiendo que una milla marina equivale a
1.852 metros
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double distanciaEnMillasMarinas = 0.0, distanciaEnMetros = 0.0;
        final double equivalenciaMillasMarinasAMetros = 1852.0;
        System.out.println("introduce la distancia en millas marinas: ");
        distanciaEnMillasMarinas = scanner.nextDouble();

        //distancia en metros:
        distanciaEnMetros = distanciaEnMillasMarinas * equivalenciaMillasMarinasAMetros;
        
        System.out.println("las millas nauticas introducidas equivalen a: " + distanciaEnMetros + " metros");
        scanner.close();        
    }
}
