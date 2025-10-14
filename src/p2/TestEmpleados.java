package p2;

import java.time.LocalDate;

public class TestEmpleados {

    public static void main(String[] args) {
        Empleado emp = new Empleado(1, "Ana", 800, LocalDate.of(1985, 5, 15));
        
        EmpleadoAsalariado empAsalariado1 = new EmpleadoAsalariado(1, "Juan", 1000, LocalDate.of(1990, 1, 1));
    }

}
