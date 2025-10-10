package jf.s4;

import java.util.Random;

public class Aleatorios {

    public static void main(String[] args) {
        Random rand = new Random();
        double chance = rand.nextDouble();
        System.out.println(chance);
        Math.random(); // entre 0 y 1
        // numero aleatorio entre 0 y 9
        int numero2 = (int) (Math.random() * 10);

        // numero aleatorio entre 11 y 20
        int numero4 = 11 + (int) (Math.random() * (20 - 11 + 1));

        // Numero aleatorio entre 0 y 99
        int numero = rand.nextInt(100);
        System.out.println(numero);

        // formula para numero entre min y max
        int min = 20;
        int max = 30;
        int numero3 = min + rand.nextInt(max - min + 1);
        System.out.println(numero3);

    }
}
