/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_04;

import Servicios.ServicioCiudad;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class EjercicioExtra_04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioCiudad sc = new ServicioCiudad();

        for (int i = 0; i < 5; i++) {
            sc.crearCiudad();
        }
        System.out.println(sc.toString());
        System.out.println("********** Buscar una Ciudad **********");
        System.out.println("Ingrese un codigo postal Ciudad a Buscar");
        sc.buscarCiudad(leer.nextInt());
        System.out.println("********** Crear nueva Ciudad **********");
        sc.crearCiudad();
        System.out.println("********** Eliminar 3 Ciudades  **********");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un codigo postal Ciudad a Eliminar");
            sc.eliminarCiudad(leer.nextInt());
        }

        sc.crearCiudad();

    }

}
