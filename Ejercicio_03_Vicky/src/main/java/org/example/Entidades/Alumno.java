/*Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
*/

package org.example.Entidades;

import java.util.ArrayList;
import java.util.List;

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
        return "Alumno{" +
                "Nombre='" + nombre + '\'' +
                ", Notas del Alumno=" + notaAlumno +
                '}';
    }
}
