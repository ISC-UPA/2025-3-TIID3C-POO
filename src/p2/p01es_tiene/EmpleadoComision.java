package p2.p01es_tiene;

import java.time.LocalDate;

public class EmpleadoComision extends Empleado {
    double comision;
    double ventas;

    public EmpleadoComision(int ID, String nombre, double salarioBase, LocalDate fechaNacimiento, double comision, double ventas) {
        super(ID, nombre, salarioBase, fechaNacimiento);
        this.comision = comision;
        this.ventas = ventas;
    }

    public double calcularSalario() {
        return salarioBaseSemanal + (comision * ventas);
    }

}
