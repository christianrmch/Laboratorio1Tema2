package PracticaIntroduccionAJava;
import java.util.*;
/*
1.
Dados los siguientes identificadores, indicar si son válidos o no. Justificar las
respuestas.
a) mi variable --> No es válido ya que está separado por un espacio. En este caso el identificador sería 'mi'.
b) num_de_cte --> Podría ser valido porque no deja ningún espacio entre los carácteres aunque no ser entiende muy bien.
c) ____programa --> Para ser válido debería comenzar por una letra minúscula. 
e) 3tema --> No es válido porque comienza por un número. 
f) cierto? --> No es válido porque utiliza un operador lógico.
g) númerodeCliente --> No es válido porque utiliza el formato lowerCamelCase de forma incorrecta (correctamente sería 'numeroDeCliente') y usa tildes.
h) jose~ --> No es válido porque utiliza un caracter no admitido '~'.
i) año --> Es válido porque la primera letra es minúscula y describe correctamente el elemento que identifica. 
j) PI --> No es válido porque la primera letra es mayúscula. 
k) int --> Es válido aunque debería especificar algo más que el tipo de número. 
*/
public class Ejercicio1y2 {
    public static void main(String [] args){

    //2. Escribe un programa que dé los “buenos días"//

    String buenosDias =" ";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escribe 'Buenos dias': \n");
    buenosDias = scanner.nextLine();
    System.out.println(buenosDias);
    if(buenosDias.equals("Buenos dias")){
        System.out.println("¡¡Buenos dias!! \n");
        }
    else System.out.println("No has introducido 'Buenos dias' :( ");
    scanner.close();
    }
}
