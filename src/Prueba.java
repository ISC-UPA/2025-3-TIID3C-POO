import java.util.Scanner;

import javax.swing.JOptionPane;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J"); // limpiar pantalla
        Scanner sc = new Scanner(System.in);
        int  x = sc.nextInt();
        double y = sc.nextDouble();
        String z = sc.next();
        String linea = sc.nextLine();
        int numero = Integer.parseInt(z);

        sc.close();
    }
}
