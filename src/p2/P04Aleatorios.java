package p2;
import java.util.Random;

public class P04Aleatorios {
    public static void main(String[] args) {
        Random rand = new Random();
        rand.setSeed(5);
        System.out.println(rand.nextInt(10));
        System.out.println(Math.asin(0.5));
    }
}