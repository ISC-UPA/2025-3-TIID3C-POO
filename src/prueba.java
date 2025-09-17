import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea;
        int b;

        System.out.print("Introduce un número: ");
        linea = sc.nextLine();

        try {
            b = Integer.parseInt(linea);
            System.out.println("Número ingresado: " + b);
        } catch (NumberFormatException e) {
            System.out.println("Error: la entrada no es un número válido.");
        }

    }
}
