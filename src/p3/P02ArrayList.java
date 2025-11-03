package p3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class P02ArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Persona> personas = new ArrayList<>();
        names.add("Jesus");
        names.add("Maria");
        names.add("Jose");
        names.add("Melchor");
        String nombre = names.get(3);
        System.out.println("El nombre en la posicion 3 es: " + nombre);
        names.remove(3);

        System.out.println("Contenido de la lista:");
        for (String elemento : names) {
            System.out.println(elemento);
        }
        personas.add(new Persona("Chuy", 30));
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            nums.add(i);
        } // end for
        for (Integer i : nums) {
            int nos = i;
            System.out.println(i);
        } // end for

        int divisor = 0;
        if (divisor == 0) {
            System.out.println("Can't be zero!");
        } else {
            System.out.println(5 / divisor);
        } // endif

        try {
            System.out.println(5 / divisor);
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