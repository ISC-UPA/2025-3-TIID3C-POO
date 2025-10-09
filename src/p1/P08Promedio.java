package p1;
public class P08Promedio {

    public static void main(String[] args) {
        double[] calificaciones = {10, 7, 8, 8, 5};
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print(calificaciones[i] + "\t");
            suma +=calificaciones[i];  // suma = suma + datos[i]
        }
        System.out.println("La suma es: " + suma);
        // double promedio = 1.0 * suma / datos.length;
        // double promedio = (double) suma / datos.length;  // casting
        double promedio = suma / calificaciones.length;
        System.out.println("promedio es: " + promedio);

        double resultado = Funciones.average(calificaciones);
        System.out.println("average is: " + resultado);

        System.out.println("\n. . . Hecho");
    }
    
}
