public class Prueba {
    double tax = 0.05;
    double tip = 0.15;

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J"); // limpiar pantalla
        String nombre = "Pepito";
        System.out.println("longitud: " + nombre.length());
        System.out.println("upperCase: " + nombre.toUpperCase());

        String totalPrice = "Total: $ " + 3 + 2 + 1;
        System.out.println(totalPrice);
        totalPrice = 3 + 2 + 1 + " Total: $ ";
        System.out.println(totalPrice);
        totalPrice = "Total: $ " + (3 + 2 + 1);
        System.out.println(totalPrice);

        System.out.println("The cat said \"Meow!\" to me.");
        System.out.print("1\t2\t3\t\"Hola\" mundo\n");
        System.out.println("\nHola\nAdios");

    }
}
