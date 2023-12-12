/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioProducto {
    
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
//    CRUD -> C: Create / R: Read / U: Update / D: Delete
    
    private HashMap<String, Double> inventario = new HashMap<>();
    
//    Crear
    
    public void anadirProducto(){
        System.out.println("Ingresa el nombre del producto : ");
        String nombreProducto = input.next();
        System.out.println("Ingresa el precio del producto : ");
        double precioProducto = input.nextDouble();
        System.out.println("Ingresa la cantidad del producto : ");
        int cantidadProducto = input.nextInt();
        
        if (inventario.get(nombreProducto) == null) {
//            inventario.put(nombreProducto, new Producto(nombreProducto, precioProducto, cantidadProducto));
//             inventario.put(nombreProducto, new Producto (nombreProducto, precioProducto, cantidadProducto));
        }
       
    }
    
//    Leer producto por nombre y leer todos los productos
    
    public void leerProductoPorNombre(){
        
    }
    
//    Actualizar productos
    
    public void actualizarProducto(){
        
    }
            
            
            
}
