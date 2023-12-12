/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Martin
 */
public class Ciudad {
    private String nombreCiudad;
    private int codigoPostal;

    public Ciudad() {
    }

    public Ciudad(String nombreCiudad, int codigoPostal) {
        this.nombreCiudad = nombreCiudad;
        this.codigoPostal = codigoPostal;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "Ciudad=" + nombreCiudad + ", codigo Postal=" + codigoPostal + '}'+'\n';
    }
    
    
    
}
