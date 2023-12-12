/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_04;

import Servicios.ServicioPelicula;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ServicioPelicula sp = new ServicioPelicula();
        
        sp.agregarPelicula();
        sp.mostrarPelicula();
        sp.peliculasMasDeUnaHora();
        sp.ordenarMayorMenor();
        sp.ordenarMenosMayor();
        sp.ordenarTitulor();
        sp.ordenarDirector();
    }
    
}
