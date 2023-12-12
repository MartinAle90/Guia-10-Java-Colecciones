/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioRazaPerro {
    
    ArrayList <String> rp = new ArrayList();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarRaza() {

        boolean bandera = true;
        do {
            System.out.println("ingrese la raza del perro");
            String auxRaza = input.next();
            rp.add(auxRaza);
            System.out.println("desea agreagar otra raza (s/n)");
            char resp = input.next().charAt(0);
            Character.toLowerCase(resp);
            if (resp == 'n') {
                bandera = false;
            }
        } while (bandera);
        mostrarRazas();
    }
    
    public void mostrarRazas() {
        System.out.println(rp.toString());
    }
    
}
