/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Habitacion;
import java.util.ArrayList;

public class ServicioHabitacion {
    
    ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();
    
    //Habitacion (Numero de habitacion, fecha de ocupacion si tuviera)
    public void crearHabitacion (int i){
        Habitacion h1 = new Habitacion();
        h1.setNumeroHabitacion(i);
    }
    
    public void creacionMultiple(){
        for (int i = 1; i < 11; i++) {
            crearHabitacion(i);
        }
    }
    
    
}
