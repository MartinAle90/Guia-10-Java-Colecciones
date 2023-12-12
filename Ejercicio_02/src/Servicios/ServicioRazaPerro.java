/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioRazaPerro {
    
    ArrayList <String> listaRaza = new ArrayList();
   
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarRaza() {

        boolean bandera = true;
        do {
            System.out.println("ingrese la raza del perro");
            String auxRaza = input.next();
            listaRaza.add(auxRaza);
            System.out.println("desea agreagar otra raza (s/n)");
            char resp = input.next().charAt(0);
            Character.toLowerCase(resp);
            if (resp == 'n') {
                bandera = false;
            }
        } while (bandera);

    }

    public void mostrarRazas() {
        System.out.println(listaRaza.toString());
    }
    
    public void eliminiarRaza() {

        Iterator iteradorlistaRaza = listaRaza.iterator();
        boolean bandera = false;
        System.out.println("Ingrese el nombre de la raza que desea elimniar de la lista");
        String razaQuitar = input.next();
        System.out.println(iteradorlistaRaza.next());

        while (iteradorlistaRaza.hasNext()) {
            if (iteradorlistaRaza.next().equals(razaQuitar)) {
                iteradorlistaRaza.remove();
                System.out.println("Raza " + razaQuitar + " eliminada");
                bandera = true;
            }
        }
        if (!bandera) {
            System.out.println("La raza " + razaQuitar + " no se encuentra");
        }
    }
    
    
}
