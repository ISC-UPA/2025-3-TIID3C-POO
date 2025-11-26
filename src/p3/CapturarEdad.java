package p3;

public class CapturarEdad {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int edad = 0;
        // valida que la edad sea un número entero dentro de un try catch
        boolean edadValida = false;
        while (!edadValida) {
            try {
                System.out.print("Edad: ");
                edad = scanner.nextInt();
                edadValida = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número entero válido.");
                scanner.next(); // Clear the invalid input $$
            }
        }
        System.out.println("Usted ha ingresado una edad de: " + edad + " años.");
        scanner.close();
        System.out.println("Programa finalizado.");
    }
}