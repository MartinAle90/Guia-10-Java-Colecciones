package org.aeternal.appmockito.examples.Service;

import org.aeternal.appmockito.examples.Entity.Producto;

import java.util.List;

public class ServicioTienda {

    public Producto buscarProducto(List<Producto> listaProductos, String nombre){
        for (Producto producto : listaProductos){
            if(producto.getNombreProducto().equals(nombre)){
                return producto;
            }
        }
        return null;
    }

    public boolean ventaProducto(Producto producto){
        if(producto != null){
            if(producto.getCantidadProducto() >= 1){
                producto.setCantidadProducto(producto.getCantidadProducto() - 1);
                System.out.println("Se ha reducido el stock en 1.");
                return true;
            } else {
                System.out.println("El producto no tiene stock.");
                return false;
            }
        } else {
            System.out.println("El producto no se encuentra en la lista.");
            return false;
        }
    }

    public boolean reposicionProducto(Producto producto){
        if(producto != null){
            producto.setCantidadProducto(producto.getCantidadProducto() + 1);
            System.out.println("Se ha aumentado el stock en 1.");
            return true;
        } else {
            System.out.println("El producto no se encuentra en la lista.");
            return false;
        }
    }



}
