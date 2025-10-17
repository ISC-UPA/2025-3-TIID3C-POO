package p2.P01EsUn_TieneUn;

public class Cuenta {
    int numeroID;
    String titular;
    double saldo;

    // Constructor: Inicializa los atributos de la cuenta

    public Cuenta() {
    }

    public Cuenta(int numeroID, String nombre, double saldo) {
        this.numeroID = numeroID;
        titular = nombre;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo = saldo - monto;
        } else {
            System.out.println("Sin suficiente saldo");
        }
    }

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.numeroID = 1;
        cuenta1.titular = "Jesus";
        cuenta1.saldo = 1000;
        Cuenta cuenta2 = new Cuenta(2, "Maria", 2000);
        Cuenta cuenta3 = new Cuenta(3, "Jose", 3000);

        System.out.println(cuenta1.getSaldo());

        cuenta1.saldo = cuenta2.saldo + 500;
        cuenta2.depositar(300.0);
        cuenta2.retirar(1100);

        // arreglo de cuentas
        int[] datos = new int[2];
        datos[0] = 1;

        Cuenta[] cuentas = new Cuenta[3];
        cuentas[0] = cuenta1;
        cuentas[1] = new Cuenta(2, "MaryGomez", 500.0);  // efectivo
        cuentas[2] = new Cuenta(3, "Pedro Ruiz", 700.0);

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Titular: " + cuentas[i].titular + "  saldo: " + cuentas[i].getSaldo());
        }
    }
}
