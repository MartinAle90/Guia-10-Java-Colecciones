/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

//Reserva (ID, Numero de habitación, cantidad de personas, fechas)
import Entidades.Reserva;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

//Alojamiento (una vez que la reserva es ocupada por las personas, pasa a ser un alojamiento, en donde
//será necesario guardar el id de la reserva)
public class ServicioReserva {
    
    HashMap<Integer, Reserva> listaReserva = new HashMap<>();
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearReserva() {
        Reserva r1 = new Reserva();
        
        
        int auxId = (int) (Math.random() * 100);
        r1.setId(auxId);
        System.out.println(" su id es "+auxId);
        System.out.println("ingrese el numero de la habitacion");
        r1.setNumeroHabitacion(leer.nextInt());
        System.out.println("Cuantas personas son?");
        r1.setCantidadPersonas(leer.nextInt());
        System.out.println("ingrese dia de inicio");
        int dia = leer.nextInt();
        System.out.println("ingrese mes de inicio");
        int mes = leer.nextInt();
        System.out.println("ingrese anio de inicio");
        int anio = leer.nextInt();
        Date f0 = new Date(anio - 1900, mes - 1, dia);
        r1.setFechaInicio(f0);
        System.out.println("Cuanto dias se quiere quedar?");
        
        int diasASumar = leer.nextInt();
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(f0);
        calendar.add(calendar.DAY_OF_YEAR, diasASumar);
        
        Date nuevaFecha = calendar.getTime();

        r1.setFechaFin(nuevaFecha);
       
        listaReserva.put(auxId, r1);
    }
    
    public void mostrarReserva(){
        System.out.println(listaReserva);
    }
    
}
