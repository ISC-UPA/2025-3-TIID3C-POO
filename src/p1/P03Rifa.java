package p1;
public class P03Rifa {
    public static int suma(int n) {
        // r = 1 + 2 + 3 + 4 + ... +  + 10
        // r = 10 + 9 + 8 + . . + 2 + 1
        int resultado = 0;
        for (int i= 0; i <= n; i++) {
            //r = r + 1 ;                1+1+1+1+1+  contador
            resultado  = resultado + i;  // 0 1 2 3  acumulador
        }
        return resultado;
    }

    public static void main(String[] args) {
        // entrada
        int n = 10;
        int r = 0;

        // proceso
        // r = suma(n);
        r = Funciones.sumatoria(n);
        // salida
        System.out.println(r); 

    }
}