package p2;

import java.time.LocalDate;

public class TestEmpleados {

    public static void main(String[] args) {

        // EmpleadoAsalariado empAsalariado1 = new EmpleadoAsalariado(1, "Juan", 20_000,
        // LocalDate.of(1990, 1, 1), 45);

        EmpleadoAsalariado[] empleadosAsalariados = new EmpleadoAsalariado[3];
        empleadosAsalariados[0] = new EmpleadoAsalariado(1, "Jesus", 20_000, LocalDate.of(1990, 1, 1), 35);
        empleadosAsalariados[1] = new EmpleadoAsalariado(1, "Maria", 20_000, LocalDate.of(2000, 1, 1), 40);
        empleadosAsalariados[2] = new EmpleadoAsalariado(1, "Jose", 20_000, LocalDate.of(1995, 1, 1), 45);

        for (int i = 0; i < empleadosAsalariados.length; i++) {
            System.out.println(empleadosAsalariados[i].nombre +
                    " Edad: " + empleadosAsalariados[i].getEdad() +
                    " Pago: " + empleadosAsalariados[i].calcularSalario());
        }

        EmpleadoComision empComision1 = new EmpleadoComision(2, "Carlos", 15_000, LocalDate.of(1995, 5, 15), 0.1, 1000);
        System.out.println(empComision1.nombre +
                " Edad: " + empComision1.getEdad() +
                " Pago: " + empComision1.calcularSalario());

    }

}
