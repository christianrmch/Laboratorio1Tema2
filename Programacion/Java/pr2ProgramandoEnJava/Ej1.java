package pr2ProgramandoEnJava;
/**
    Escribe un programa que toma como dato de entrada un número que corresponde
    a la longitud de un radio y nos escribe la longitud de la circunferencia, el área del
    círculo y el volumen de la esfera que corresponden con dicho radio.
 */
import java.util.Scanner;
import java.lang.Math;

 public class Ej1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double longitudRadio = 0.0, longitudCircunferencia = 0.0, areaCirunferencia = 0.0, volumenEsfera = 0.0;

        // longitud de la circunferencia:
        System.out.println("Introduce la longitud del radio de la circunferencia: \n");
        longitudRadio = scanner.nextDouble();
        longitudCircunferencia = 2 * Math.PI * longitudRadio;

        // area de la circunferencia:
        areaCirunferencia = Math.PI * Math.pow(longitudRadio, 2);

        // volumen esfera 
        volumenEsfera = (4/3) * Math.PI * Math.pow(areaCirunferencia, 3);

        System.out.println("La longitud de la circunferencia es de: " + longitudCircunferencia + " u");
        System.out.println("El area de la circunferencia es de: " + areaCirunferencia + " u^2");
        System.out.println("El volume de la esfera es de: " + volumenEsfera + " u^3");
        scanner.close();
    }
 }