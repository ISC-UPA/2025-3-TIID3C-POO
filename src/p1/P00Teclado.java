package p1;
   

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class P00Teclado {

    public static void usoScanner() {
        Scanner sc = new Scanner(System.in);
        int a = 5, b = 10;
        System.out.print("Nombre: ");

        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Hola " + nombre + " Tienes " + edad + " años");
        sc.close();
    }

    public static void usoShow() {
        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog(null, "Nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad: "));
        JOptionPane.showMessageDialog(null, "Hola " + nombre + "Tienes " + edad + " años");

    }

    public static void usoBufferedReader() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombre = "";
        int edad = 0;
        try {
            System.out.print("nombre: ");
            nombre = br.readLine();
            System.out.print("Edad: ");
            edad = Integer.parseInt(br.readLine());
            br.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println("Hola " + nombre + " Tienes " + edad + " años");


    }

    public static void main(String[] args) {
   		System.out.println("\033[H\033[2J"); // limpiar pantalla        
        usoScanner();
        // usoShow();
        //usoBufferedReader();
    }

}
