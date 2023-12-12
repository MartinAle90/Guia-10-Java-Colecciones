/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_03;

import Entidades.Libro;
import Servicios.ServicioLibro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class EjercicioExtra_03 {

    /**
     * @param args the command line arguments
     */
//En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
//datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
//pregunta al usuario si quiere crear otro Libro o no.
//    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        HashSet<Libro> listaLibros = new HashSet<>();

        ServicioLibro sl = new ServicioLibro();
        String resp;
        do {
            sl.crearLibro(listaLibros);
            System.out.println("desea crear otro libro");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("s"));

        System.out.println(listaLibros);
        
        System.out.println("ingrese el titulo que desea ");
        String tituloABuscar = leer.next();
        System.out.println(sl.prestamo(listaLibros, tituloABuscar));
        
        System.out.println(listaLibros);
        
        System.out.println("ingrese el titulo que desea devolver");
        String tituloADevolver = leer.next();
        System.out.println(sl.devolucion(listaLibros, tituloADevolver));

         System.out.println(listaLibros);

    }

}
