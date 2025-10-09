package p1;

public class Funciones {

    public static int sumatoria(int n) {
        // r = 1 + 2 + 3 + 4 + ... + + 10
        // r = 10 + 9 + 8 + . . + 2 + 1
        int resultado = 0;
        for (int i = 0; i <= n; i++) {
            // r = r + 1 ; 1+1+1+1+1+ contador
            resultado = resultado + i; // 0 1 2 3 acumulador
        }
        return resultado;
    }

    public int mayor(int a, int b) {
        return 0;
    }

    public static double average(double[] datos) {
        double suma = 0;
        double promedio = 0;

        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i]; // acumulador
        }
        promedio = suma / datos.length;
        return promedio;
    }

    public static void main(String[] args) {
        int n = 10;
        int r = sumatoria(n);
        System.out.println("La sumatoria de 1 a " + n + " es: " + r);
    }

}
