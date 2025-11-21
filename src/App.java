import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   		System.out.println("\033[H\033[2J"); // limpiar pantalla
        System.out.println("Hello, World!");

        int a = 5;
        final int b = 10;
        a = a + 1;
        // b = b + 1; // esto da error porque b es final o una constante

         int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your size: ");
        int size = scanner.nextInt();
        array = new int[size];
        int[] array2 = new int[] {1,4,5,6,7,8};
        int[] array3 = {1,4,5,6,7,8};








    }
}
