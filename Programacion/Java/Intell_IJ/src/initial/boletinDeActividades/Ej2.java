//.  Realiza un programa que haga la suma de dos números pedidos por
//   pantalla


import java.util.Scanner;
public class Ej2{
    public static void main (String[] args){
        int firstInt = 0, scndInt = 0, suma = 0; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce dos numeros por pantalla: \n");
        firstInt = scanner.nextInt();
        scndInt = scanner.nextInt();
		suma = firstInt + scndInt;
		System.out.println("La suma del primer número y el segundo es: " + suma);
    }
}