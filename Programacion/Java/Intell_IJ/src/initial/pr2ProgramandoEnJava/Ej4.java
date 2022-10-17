/*
 * Diseña un programa Java que cree un tipo enumerado para los meses del año. El
   programa debe realizar las siguientes operaciones:

    • Crear una variable m del tipo enumerado y asignarle el mes de marzo.
    Mostrar por pantalla su valor
 */
enum MesesDelAño{Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre;}

public class Ej4 {
    public static void main(String[] args) {
        MesesDelAño m = MesesDelAño.Marzo;
        System.out.println("Estas en el mes de: " + m);
    }
}
