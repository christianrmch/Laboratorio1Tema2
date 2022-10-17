package PracticaIntroduccionAJava;
/*
Dado el siguiente programa, modifícalo para utilizar las variables que se indican. El
tipo de dato elegido debe ser el de menos bits posibles que puedan representar el
valor. Justifica tu elección.
 */
public class EjercicioVariables {
    public static void main(String[] args) {
        // a) Si un empleado está casado o no
            boolean casado = false; // el tipo boolean tiene un coste de 1 bit. Por defecto lo dejamos en false.

        // b) Valor máximo no modificable: 999999.
            final int noModificable = 999999; // el tipo int tiene un coste de 4 bytes, lo que son 32 bits,
        // y es el único en cuyo rango se encuentra el valor 999999. Rango de Int: -2147483648 … 2147483647

        // C) Día de la semana
            byte diaDeLaSemana[] = {1,2,3,4,5,6,7}; // creamos una lista de bytes, donde cada uno ocupa un espacio de 1 byte, lo que son 8 bits. 
        
        // d) Día del año.
            short diaDelAño = 342; // usamos el tipo short que tiene un coste de 2 bytes que son 16 bits. 

        // e) Sexo: con dos valores posibles 'V' o 'M'
            char sexo[] = {'V', 'M'}; // char tiene un coste de 2 bytes que osn 16 bits en este caso. 
        
        // f) Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
        // Los años transcurridos desde el 01/01/1970 son 43 años
		// 43 años * 365 dias * 24 horas * 60 min. * 60 seg. * 1000 milisegundos
		// = 1,356048e+12 lo que entra en el rango del tipo de variable long que tiene un rango de:
		// -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
            long miliseg = 1298332800000L;

        // g) Almacenar el total de una factura. 
            float totalfactura = 999.99f;

        // h) Población mundial del planeta tierra.

        // la población mundial está cerca de los 8.000.000.000
		// por lo que no es suficiente con el rango de int que como máximo llega a 
		// 2147483647 pero sí con el de "long" cuyo rango es:
		// -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        long poblacion = 7979536349L;
    }
}
