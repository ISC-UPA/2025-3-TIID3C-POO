package p2;
import java.util.Scanner;

public class P02Cadenas {
    public static void main(String[] args) {
        String producto = "coca cola haz ejercicio";
        boolean bandera = producto.contains("co");
        System.out.println(bandera);
        int posicion = producto.indexOf("co");
            posicion = producto.lastIndexOf('a');

        String cadena = producto.substring(4);
        System.out.println(cadena); 
        System.out.println(producto.replace("co", "ko"));  

    }


}
