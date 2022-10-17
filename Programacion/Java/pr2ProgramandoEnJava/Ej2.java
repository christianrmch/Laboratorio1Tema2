package pr2ProgramandoEnJava;
import java.util.Scanner;
/**
 * Escribe un programa que dado el precio de un artículo y el precio de venta real nos
muestre el porcentaje de descuento realizado
 */
public class Ej2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double precioArticulo = 0.0, precioVentaReal = 0.0, porcentajeDescuento = 0.0;

        System.out.println("introduce el precio del articulo: ");
        precioArticulo = scanner.nextDouble();

        System.out.println("introduce el precio de venta real: ");
        precioVentaReal = scanner.nextDouble();

        //porecentaje descuento:
        porcentajeDescuento = 100 - ((precioArticulo * 100) / precioVentaReal);
        System.out.printf("el porcentaje de descuento realizado sobre el producto es de %.2f%s\n ", porcentajeDescuento, "%");
        scanner.close();
    }
}