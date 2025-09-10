package example;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class captura {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J"); // limpiar pantalla
        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog(null, "Nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad: "));
        JOptionPane.showMessageDialog(null, "Hola " + nombre + "Tienes " + edad + " años");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Edad: ");
        edad = sc.nextInt();
        
        System.out.println("Hola " + nombre + " Tienes " + edad + " años");
        sc.close();

        System.out.println(". . . Hecho");
    }
}
