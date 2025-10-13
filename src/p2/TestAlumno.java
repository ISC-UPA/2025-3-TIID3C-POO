package p2;

import java.time.LocalDate;

public class TestAlumno {

    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];

        alumnos[0] = new Alumno(1, "Pepito", LocalDate.of(2025,10,10), null);
        alumnos[1] = new Alumno(10, "Mafalda", LocalDate.parse("2000-01-01"), new Cuenta(55, "Mafalda", 500));

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Nombre: " + alumnos[i].nombre +
                    "  Fecha Nac: " + alumnos[i].getFechaNacimiento() +
                    "  Dia: " + alumnos[i].diaSemana());
        }
    }
    
}
