/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_01;

import Servicios.ServicioRazaPerro;

/**
 *
 * @author Martin
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList. 
    
    public static void main(String[] args) {
        ServicioRazaPerro srp = new ServicioRazaPerro();
        
        srp.agregarRaza();
        
    }
    
}
