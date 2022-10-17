import java.util.Scanner;
public class SolucionTroy{
    public static void main (String[] args){
        /**DATOS*/
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;

        /**ALGORITMO */
        System.out.println("Introduce el primer número");
        num1= sc.nextInt();
        System.out.println("Introduce el segundo número");
        num2= sc.nextInt();
        System.out.println("Introduce el tercer número");
        num3= sc.nextInt();

        /** El primer número es el mayor */
        if (num1 >= num2 && num1 >= num3) {
            if (num2 > num3) {
                System.out.println(num1 + " > " + num2 + " > " + num3);
            } else {
                System.out.println(num1 + " > " + num3 + " > " + num2);
            } 
        }
        /** El segundo número es el mayor */
        else if (num2 >= num1 && num2 >= num3) {
            if (num1 > num3) {
                System.out.println(num2 + " > " + num1 + " > " + num3);
            } else {
                System.out.println(num2 + " > " + num3 + " > " + num1);
            } 
        }
        /** El tercer número es el mayor */
        else if (num3 >= num2 && num3 >= num1) {
            if (num2 > num1) {
                System.out.println(num3 + " > " + num2 + " > " + num1);
            } else {
                System.out.println(num3 + " > " + num1 + " > " + num2);
            } 
        }
 

        sc.close();
    }
}