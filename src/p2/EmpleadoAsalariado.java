package p2;

import java.time.LocalDate;

// horas extras se pagan al doble
public class EmpleadoAsalariado extends Empleado {
    int horasTrabajadas;
    String puesto;

    public EmpleadoAsalariado(int ID, String nombre, double salarioBase, LocalDate fechaNacimiento) {
        super(ID, nombre, salarioBase, fechaNacimiento);
        this.horasTrabajadas = 40; // Asumiendo 40 horas semanales por defecto
        this.puesto = "Empleado Asalariado"; // Puesto por defecto
    }
    public double calcularSalario() {
        return salarioBase * horasTrabajadas;
    }

}
