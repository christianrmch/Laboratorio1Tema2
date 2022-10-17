import java.util.Scanner;
/*
Realiza un programa que pida un número entre 0 y 9999 y lo muestre con las cifras
al revés.
 */
public class Ej8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = 0, primeraPosiciónNumero = 0, segundaPosiciónNumero = 0, terceraPosiciónNumero = 0, 
        cuartaPosiciónNumero = 0, restoUnidad = 0, restoDecena = 0, restoCentena = 0; String solucion ="";
        System.out.println("Introduzca un número entero por pantalla que se encuentre entre el 0 y el 9999\n");
        numero = scanner.nextInt();
        if(numero >= 0 && numero < 10){
            System.out.println(numero);
        }else if(numero >= 10 && numero < 100){
            restoUnidad = numero % 10;
            primeraPosiciónNumero = restoUnidad;
            segundaPosiciónNumero = numero / 10;
            solucion = "" + primeraPosiciónNumero + segundaPosiciónNumero;
            System.out.println(solucion);
        }else if(numero>=100 && numero < 1000){
            restoUnidad = numero % 10;
            numero /= 10;
            restoDecena = numero % 10;
            primeraPosiciónNumero = restoUnidad; 
            segundaPosiciónNumero = restoDecena;
            terceraPosiciónNumero = numero / 10; 
            solucion = "" + primeraPosiciónNumero + segundaPosiciónNumero + terceraPosiciónNumero;
            System.out.println(solucion);
        }else if(numero >= 1000 && numero < 10000){
            restoUnidad = numero % 10; 
            numero /= 10; 
            restoDecena = numero % 10; 
            numero /= 10; 
            restoCentena = numero % 10;
            primeraPosiciónNumero = restoUnidad;
            segundaPosiciónNumero = restoDecena;
            terceraPosiciónNumero = restoCentena;
            cuartaPosiciónNumero = numero / 10;
            solucion = "" + primeraPosiciónNumero + segundaPosiciónNumero + terceraPosiciónNumero + cuartaPosiciónNumero;
            System.out.println(solucion);
        }else {
            System.out.println("ERROR");
        }
        scanner.close();
    }
}