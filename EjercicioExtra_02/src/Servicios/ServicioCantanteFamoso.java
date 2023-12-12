/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CantanteFamoso;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Martin
 */

//Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
//tendrá como atributos el nombre y discoConMasVentas.
//Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
//de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
//y su disco con más ventas por pantalla.
//Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
//agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
//elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios


public class ServicioCantanteFamoso {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarCantanteFamoso(List listaCantante){
        CantanteFamoso auxCF = new CantanteFamoso();
        
        System.out.println("ingrese cantante famoso");
        auxCF.setNombre(leer.next());
        System.out.println("cuantos disco vendio su mejor disco");
        auxCF.setDiscoConMasVentas(leer.nextInt());
        listaCantante.add(auxCF);
    }
    
    public void mostraListaCantates(List listaCantante){
        System.out.println(listaCantante.toString());
    }
    
}
