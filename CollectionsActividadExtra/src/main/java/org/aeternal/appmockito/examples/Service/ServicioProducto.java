package org.aeternal.appmockito.examples.Service;

import org.aeternal.appmockito.examples.Entity.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioProducto {

    /*
    * ArrayList ? Para buscar elementos por su indice de forma super rapida.
    * LinkedList ? Para anadir, remover elementos de forma rapida.
    * */

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Producto> listaProductos = new ArrayList<>();

    public void anadirProducto(){
        System.out.println("Ingresa el nombre del producto : ");
        String nombreProducto = input.next();
        System.out.println("Ingresa la categoria del producto : ");
        String categoriaProducto = input.next();
        System.out.println("Ingresa el precio del producto : ");
        double precioProducto = input.nextDouble();
        System.out.println("Ingresa la cantidad del producto : ");
        int cantidadProducto = input.nextInt();
        listaProductos.add(new Producto(nombreProducto, categoriaProducto, precioProducto, cantidadProducto));
    }

    public String leerProducto(String nombre){
        for (Producto producto : listaProductos){
            if(producto.getNombreProducto().equals(nombre)){
                return producto.toString();
            }
        }
        return "No se encontro el producto";
    }

    public void stockProductos(){
        if(!listaProductos.isEmpty()) {
            System.out.println(listaProductos);
        } else {
            System.out.println("La lista de productos se encuentra vacia actualmente. \n");
        }
    }

    public void actualizarProducto(String nombre){
        for (Producto producto : listaProductos){
            if(producto.getNombreProducto().equals(nombre)){
                System.out.println("Ingresa el NUEVO nombre del producto : ");
                producto.setNombreProducto(input.next());
                System.out.println("Ingresa la NUEVA categoria del producto : ");
                producto.setCategoriaProducto(input.next());
                System.out.println("Ingresa el NUEVO precio del producto : ");
                producto.setPrecioProducto(input.nextDouble());
                System.out.println("Ingresa la NUEVA cantidad del producto : ");
                producto.setCantidadProducto(input.nextInt());
            }
        }
    }

    public boolean borrarProducto(String nombre){
        for (Producto producto : listaProductos){
            if(producto.getNombreProducto().equals(nombre)){
                if(producto.getCantidadProducto() >= 1){
                    producto.setCantidadProducto(producto.getCantidadProducto() - 1);
                    System.out.println("Se ha reducido el stock en 1.");
                    return true;
                } else {
                    System.out.println("El producto no tiene stock.");
                    return false;
                }
            }
        }
        return false;
    }
}
