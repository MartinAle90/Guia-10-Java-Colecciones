/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;



import java.util.Date;

//Habitacion (Numero de habitacion, fecha de ocupacion si tuviera)
//Reserva (ID, Numero de habitación, cantidad de personas, fechas)
//Alojamiento (una vez que la reserva es ocupada por las personas, pasa a ser un alojamiento, en donde
//será necesario guardar el id de la reserva)
public class Habitacion {
    
    private int numeroHabitacion;
    private Date fechaOcupacion;

    public Habitacion() {
    }

    public Habitacion(int numeroHabitacion, Date fechaOcupacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.fechaOcupacion = fechaOcupacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public Date getFechaOcupacion() {
        return fechaOcupacion;
    }

    public void setFechaOcupacion(Date fechaOcupacion) {
        this.fechaOcupacion = fechaOcupacion;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numeroHabitacion=" + numeroHabitacion + ", fechaOcupacion=" + fechaOcupacion + '}';
    }
    
    
    
    
}
