package p3;

import java.io.File;
import java.io.IOException;

public class P03Excepciones {
    public static void main(String[] args) {

        int divisor = 0;
        if (divisor == 0) {
            System.out.println("Can't be zero!");
        } else {
            System.out.println(5 / divisor);
        } // endif

        try {
            System.out.println(5 / divisor);
            System.out.println("Ya hice la division");
        } catch (ArithmeticException e) {
            System.out.println("Can't be zero!");
        }
        try {
            File testFile = new File("//testFile.txt");
            testFile.createNewFile();
            System.out.println("testFile exists: " + testFile.exists());
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(". . .Hecho!");

    }
}
