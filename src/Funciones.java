public class Funciones {
        public static int sumatoria(int n) {
        // r = 1 + 2 + 3 + 4 + ... +  + 10
        // r = 10 + 9 + 8 + . . + 2 + 1
        int resultado = 0;
        for (int i= 0; i <= n; i++) {
            //r = r + 1 ;                1+1+1+1+1+  contador
            resultado  = resultado + i;  // 0 1 2 3  acumulador
        }
        return resultado;
    }

}
