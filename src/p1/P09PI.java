package p1;

public class P09PI {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J"); // limpiar pantalla

        // imprimir numeros impares
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + "\t");
        }
        System.out.println();

        // imprimir 1 -1 1 -1 ...
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print("-1\t");
            } else {
                System.out.print("1\t");
            }
        }
        System.out.println();

        int signo = -1;
        for (int i = 0; i < 10; i++) {
            signo =  signo *(-1);
            System.out.print(signo + "\t");
        }
        System.out.println();

        signo = -1;
        int numero = 0 ;
        int n = 10_000;
        double pi = 0.0;
        for (int i = 1; i <= n*2; i=i+2) {
            signo = signo * (-1);
            numero = i*signo;
            System.out.print( 1.0/numero + "\t");
            pi = pi  + 1.0 /numero;

        }
        pi = pi * 4;
        System.out.println("\npi = " + pi);

        System.out.println(". . . Hecho");
    }
    
}
