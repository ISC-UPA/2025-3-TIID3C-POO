package p3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

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

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println("Name is -> " + iterator.next());
        }

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

   }
}