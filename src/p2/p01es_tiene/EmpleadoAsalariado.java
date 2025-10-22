package p2.p01es_tiene;

import java.time.LocalDate;

// horas extras se pagan al doble
public class EmpleadoAsalariado extends Empleado {
    static final int HORAS_SEMANALES = 40;  // politica de la empresa

    int horasTrabajadas;

    public EmpleadoAsalariado(int ID, String nombre, double salarioBase, LocalDate fechaNacimiento, int horasSemanales) {
        super(ID, nombre, salarioBase, fechaNacimiento);
        this.horasTrabajadas = horasSemanales;
    }
    
    public double calcularSalario() {
        double pagoExtras = 0;
        double horasExtras = 0;
        double total = 0; 
        double precioHora = salarioBaseSemanal / HORAS_SEMANALES;

        if (horasTrabajadas <= HORAS_SEMANALES) { // normal o menos horas
            total = precioHora * horasTrabajadas ;
        } else {   // horas extras
            horasExtras = (horasTrabajadas - HORAS_SEMANALES) * 2;
            pagoExtras = horasExtras * precioHora;
            total = salarioBaseSemanal + pagoExtras;
        }
        return total;
    }

}
