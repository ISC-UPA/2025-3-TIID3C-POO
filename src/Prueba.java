import javax.swing.JOptionPane;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J"); // limpiar pantalla
        String input = JOptionPane.showInputDialog("Type a number:");
        int number = Integer.parseInt(input);
        number *= 2;
        System.out.println("El doble es: " + number);
    }
}
