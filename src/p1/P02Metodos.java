package p1;
import java.util.Scanner;

public class P02Metodos {
    static double a, b, r;

    static void capturar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el valor de a: ");
        a = sc.nextInt();
        System.out.print("Dame el valor de b: ");
        b = sc.nextInt();
        sc.close();
    }

    static void sumar() {
        r = a + b; // suma
        System.out.println("El resultado de " + a + " + " + b + " = " + r);
    }
    static void restar() {
        r = a - b; // resta
        System.out.println("El resultado de " + a + " - " + b + " = " + r);
    }
    static void multiplicar() {
        r = a * b; // multiplicacion
        System.out.println("El resultado de " + a + " * " + b + " = " + r);
    }
    static double dividir(double x, double b) {
        r = x / b; // division
        return r;
    }    
    
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J"); // limpiar pantalla
        capturar();
        sumar();
        restar();
        multiplicar();
        r = dividir(a, b);
        System.out.println("El resultado de " + a + " / " + b + " = " + r);
        System.out.println(". . . Hecho");
    }


}
