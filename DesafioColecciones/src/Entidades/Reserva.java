/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//Habitacion (Numero de habitacion, fecha de ocupacion si tuviera)
import java.util.Date;

//Reserva (ID, Numero de habitación, cantidad de personas, fechas)
//Alojamiento (una vez que la reserva es ocupada por las personas, pasa a ser un alojamiento, en donde
//será necesario guardar el id de la reserva)
public class Reserva {

    private int id;
    private int numeroHabitacion;
    private int cantidadPersonas;
    private Date fechaInicio;
    private Date fechaFin;

    public Reserva() {
    }

    public Reserva(int id, int numeroHabitacion, int cantidadPersonas, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.numeroHabitacion = numeroHabitacion;
        this.cantidadPersonas = cantidadPersonas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", numeroHabitacion=" + numeroHabitacion + ", cantidadPersonas=" + cantidadPersonas + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

}
