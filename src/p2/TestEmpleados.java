package p2;

import java.time.LocalDate;

public class TestEmpleados {

    public static void main(String[] args) {
        
        // EmpleadoAsalariado empAsalariado1 = new EmpleadoAsalariado(1, "Juan", 20_000, LocalDate.of(1990, 1, 1), 45);

        EmpleadoAsalariado[] empleadosAsalariados = new EmpleadoAsalariado[3];
        empleadosAsalariados[0] =  new EmpleadoAsalariado(1, "Jesus", 20_000, LocalDate.of(1990, 1, 1), 35);
        empleadosAsalariados[1] =  new EmpleadoAsalariado(1, "Naria", 20_000, LocalDate.of(1990, 1, 1), 40);
        empleadosAsalariados[2] =  new EmpleadoAsalariado(1, "Jose", 20_000, LocalDate.of(1990, 1, 1), 45);

        for (int i = 0; i < empleadosAsalariados.length; i++) {
            System.out.println(empleadosAsalariados[i].nombre + " Pago: " + 
                               empleadosAsalariados[i].calcularSalario());
        }

    }

}
