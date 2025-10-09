package p1;
import java.util.Scanner;

public class P04OTernario {

    public static int mayor(int a, int b) {
        /*/
        if (a > b) {
            return a;
        } else {
            return b;
        }
        */    
        int r;
        r = a > b ? a : b; // operador ternario
        return r;
    }

    public static int menor(int a, int b) {
        return 0;
    }

    public static int signo(int x) {
        int r=0;
        /*
        if (x > 0) {
            r = 1;
        } else if (x < 0) {
            r = -1;
        } else {
            r = 0;
        }
        */
        r = (x > 0) ? 1 : (x < 0) ? -1 : 0;
        return r;

    }

    public static boolean esPar(int x) {
        return (x % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 6;
        int r = mayor(x, y);
        System.out.println("El mayor entre " + x + " y " + y + " es: " + r);
        System.out.println("El signo de " + x + " es: " + signo(x));
        System.out.println("es " + x + " par? " + esPar(x));

    }
/*
        int players = 0;

    // pre y post incremento y decremento
    System.out.println("players online: " + players++);
    System.out.println("The value of players is " + players);
    System.out.println("The value of players is now " + ++players);
    System.out.println("The value of players is " + players);        
    }
*/
}
