/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_03;

import Servicios.ServicioAlumno;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    
        static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        // TODO code application logic here
        

        ServicioAlumno sa = new ServicioAlumno();
        sa.crearAlumno();
        sa.mostrarAlumnos();
        sa.buscarAlumno();
        
        
        
        

    }
    
}
