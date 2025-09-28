package p1;

public class P8FactorialPC {

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
                                                             // 5   3    
    public static int permutacion(int n, int r) {  //     n! / (n - r)!
        return factorial(n) / factorial(n - r);
    }

    public static int combinacion(int n, int r) { //      n! / r! (n - r)!
        int resultado = 0;
        //resultado =  factorial(n) / ( factorial(r) * factorial(n - r) );
        resultado = permutacion(n, r) / factorial(r);
        return resultado;
   
    }

    public static void main(String[] args) {
        System.out.println(factorial(4)); 
        int r = permutacion(5,4);
        System.out.println(r);
        System.out.println("Combinacion: " + combinacion(5, 3)); // 10
        System.out.println("Combinacion: " + combinacion(6, 3)); // 20
        System.out.println("Combinacion: " + combinacion(7, 3)); // 35

        
    }
    
}
