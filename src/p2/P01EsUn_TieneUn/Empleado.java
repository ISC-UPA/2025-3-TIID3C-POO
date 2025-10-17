package p2.P01EsUn_TieneUn;
import java.time.LocalDate;
// La empresa trabaja 40 horas semanales
// El salario base es semanal

public class Empleado {
    int ID;
    String nombre;
    double salarioBaseSemanal;
    LocalDate fechaNacimiento;


    public Empleado(int ID, String nombre, double salarioBase, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.ID = ID;
        this.salarioBaseSemanal = salarioBase;
        this.fechaNacimiento = fechaNacimiento;
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }

}
