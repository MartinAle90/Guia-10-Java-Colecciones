/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiocolecciones;

import Servicios.ServicioPersona;
import Servicios.ServicioReserva;

/**
 *
 * @author Martin
 */
public class DesafioColecciones {

//Un hotel está alquilando habitaciones, y en esta temporada decidió realizar las reservas desde internet. el
//hotel cuenta con 10 Habitaciones, de las cuales:
//Habitacion 1 - 5: Entran 2 personas
//Habitacion 6 - 8: Entran hasta 3 personas
//Habitacion 9 - 10: Entra 1 sola persona
    
    //    Importante:
//Se debe realizar un CRUD que sea necesario. (Crear, Leer, Modificar o Eliminar)
//El programa debe tener un menú para las diferentes opciones.
//Podrás crear los métodos que sean necesarios para que el programa sea más completo.
//Se deberá subir a GitHub y compartir entre integrantes del mismo equipo.
//Se deberán realizar las pruebas unitarias en JUnit para los métodos creados. (Solo si sobra tiempo)


    public static void main(String[] args) {
        
        ServicioPersona sp = new ServicioPersona();
        ServicioReserva sr = new ServicioReserva();
        
//        sp.crearPersona();
//        sp.mostrarPersona();
//        sp.modificarPersona();
//          sp.mostrarPersona();
//        sp.eliminarPersona();

sr.crearReserva();
sr.mostrarReserva();
        
    }
    
}
