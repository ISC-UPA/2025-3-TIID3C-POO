package p2;

import java.time.LocalDate;

public class Alumno {
    int numeroID;
    String nombre;
    LocalDate fechaNacimiento;
    Cuenta cuentaBancaria;

       public Alumno(int numeroID, String nombre, LocalDate fechaNacimiento, Cuenta cuentaBancaria) {
        this.numeroID = numeroID;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.cuentaBancaria = cuentaBancaria;
    }

       public LocalDate getFechaNacimiento() {
           return fechaNacimiento;
       }

       public void setFechaNacimiento(LocalDate fechaNacimiento) {
           this.fechaNacimiento = fechaNacimiento;
       }

       public int getEdad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
       }
    
       public String diaSemana() {
            String nombreDia = fechaNacimiento.getDayOfWeek().toString();
            return nombreDia;
       }

       

}   
