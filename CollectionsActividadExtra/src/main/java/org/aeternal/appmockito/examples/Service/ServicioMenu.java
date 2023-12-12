package org.aeternal.appmockito.examples.Service;

import org.aeternal.appmockito.examples.Entity.Producto;

import java.util.Scanner;

public class ServicioMenu {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    private ServicioProducto servicioProducto = new ServicioProducto();

    private ServicioTienda servicioTienda = new ServicioTienda();

    public void inicializarServicioTienda(){
        int eleccion;
        do {
            System.out.println(
                    "Que accion deseas realizar en la tienda? \n\n " +
                    "1. Anadir producto a la lista. \n " +
                    "2. Listar productos. \n " +
                    "3. Buscar producto por nombre. \n " +
                    "4. Vender producto. \n " +
                    "5. Reponer producto. \n " +
                    "6. Salir \n "
            );
            eleccion = input.nextInt();
            switch (eleccion){
                case 1 : {
                    servicioProducto.anadirProducto();
                }
                case 2 : {
                    servicioProducto.stockProductos();
                }
                case 3 : {
                    System.out.println("Cual es el nombre del producto que deseas buscar?");
                    System.out.println(servicioProducto.leerProducto(input.next()));
                }
                case 4 : {
                    System.out.println("Cual es el nombre del producto que deseas comprar?");
                    Producto producto = servicioTienda.buscarProducto(servicioProducto.listaProductos, input.next());
                    boolean venta = servicioTienda.ventaProducto(producto);
                    if(venta){
                        System.out.println("El producto se ha vendido con exito!");
                    } else {
                        System.out.println("No se ha podido vender el producto...");
                    }
                }
                case 5 : {
                    System.out.println("Cual es el nombre del producto que deseas reponer?");
                    Producto producto = servicioTienda.buscarProducto(servicioProducto.listaProductos, input.next());
                    boolean reposicion = servicioTienda.reposicionProducto(producto);
                    if(reposicion){
                        System.out.println("El producto se ha repuesto con exito!");
                    } else {
                        System.out.println("No se ha podido reponer el producto...");
                    }
                }
                case 6 : {
                    System.out.println("Has salido de la aplicacion, vuelve pronto :)");
                }
                default : {
                    System.out.println("Opcion incorrecta, ingresa un numero del 1 al 6.");
                }
            }
        } while (eleccion != 6);
    }

}
