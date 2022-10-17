import java.util.Scanner;
import java.lang.Math;

/*
    Diseña un programa Java para leer las longitudes de los lados de un triángulo (L1,
    L2, L3) y calcular el área del mismo de acuerdo con la siguiente fórmula:
    area = (sp(sp-L1)*(sp-L2)*(sp-L3))^(1/2)
    sp = (L1 + L2 + L3) / 2
    sp = semiperimetro
 */
public class Ej7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        double primerLado = 0.0, segundoLado = 0.0, tercerLado = 0.0, semiperimetro = 0.0, area = 0.0;
        System.out.println("introduce el primer lado: ");
        primerLado = scanner.nextDouble();
        System.out.println("introduce el segundo lado: ");
        segundoLado = scanner.nextDouble();
        System.out.println("introduce el tercer lado: ");
        tercerLado = scanner.nextDouble();
        semiperimetro = (primerLado + segundoLado + tercerLado) / 2;
        area = Math.sqrt(semiperimetro*(semiperimetro - primerLado)*(semiperimetro-segundoLado)*(semiperimetro-tercerLado));
        System.out.printf("el area del triángulo es de: %.2f%s\n", area, " u^2");
        scanner.close();
    }
}
