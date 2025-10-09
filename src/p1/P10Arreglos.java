package p1;
import java.util.Scanner;

public class P10Arreglos {
    

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J"); // limpiar pantalla
        String nombre = "Juan Perez";
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de Datos: ");
        int n = sc.nextInt();
        double[] datos= new double[n];

        // datos[2]= 7;
        // captura de datos
        for (int i = 0; i < datos.length; i++) {
           System.out.print("Dato["+ i + "] =");
           datos[i] = sc.nextDouble();
        }
        // impresion de datos
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + "\t");
        }

        System.out.println();
        System.out.println(". . . Hecho");


 

    }
}
