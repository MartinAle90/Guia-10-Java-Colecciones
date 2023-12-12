/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ciudad;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioCiudad {

    HashMap<Integer, Ciudad> mapaCiudades = new HashMap<Integer, Ciudad>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearCiudad() {
        Ciudad c1 = new Ciudad();
        System.out.println("Ingrese el nombre de la ciudad");
        c1.setNombreCiudad(leer.next());
        System.out.println("Ingrese el codigo postal de la ciudad");
        c1.setCodigoPostal(leer.nextInt());

        mapaCiudades.put(c1.getCodigoPostal(), c1);
    }

//    public void mostrarListaCiudades(){
//        System.out.println(listaCiudades);
//    }
    @Override
    public String toString() {
        return "{" + mapaCiudades + '}' + '\n';
    }

    public void buscarCiudad(int codPost) {
        boolean ciudadEncontrada = mapaCiudades.containsKey(codPost);

        if (ciudadEncontrada) {
            System.out.println(mapaCiudades.get(codPost));
        } else {
            System.out.println("No se encontrola Ciudad ingresada");
        }
    }

    public void eliminarCiudad(int codPost) {
        boolean ciudadEncontrada = mapaCiudades.containsKey(codPost);

        if (ciudadEncontrada) {
            System.out.println("Se ah eliminada a " + mapaCiudades.remove(codPost) + " del mapa");

        } else {
            System.out.println("No se encontro la Ciudad ingresada");
        }
    }

}
