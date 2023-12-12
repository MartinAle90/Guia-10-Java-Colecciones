package org.aeternal.appmockito.examples.Entity;

public class Producto {
    private String nombreProducto;

    private String categoriaProducto;

    private double precioProducto;

    private int cantidadProducto;

    public Producto() {
    }

    public Producto(String nombreProducto, String categoriaProducto, double precioProducto, int cantidadProducto) {
        this.nombreProducto = nombreProducto;
        this.categoriaProducto = categoriaProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", categoriaProducto='" + categoriaProducto + '\'' +
                ", precioProducto=" + precioProducto +
                ", cantidadProducto=" + cantidadProducto +
                '}';
    }
}
