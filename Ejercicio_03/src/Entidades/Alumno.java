/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin
 */
public class Alumno {

    private String nombre;
    private List<Integer> notaAlumno;

    public Alumno() {
        this.notaAlumno = new ArrayList<>();
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notaAlumno = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotaAlumno() {
        return notaAlumno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotaAlumno(List<Integer> notaAlumno) {
        this.notaAlumno = notaAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{"
                + "Nombre='" + nombre + '\''
                + ", Notas del Alumno=" + notaAlumno
                + '}'+"\n";
        
    }

}
