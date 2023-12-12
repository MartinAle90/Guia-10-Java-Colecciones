/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioAlumno {

    ArrayList<Alumno> aula = new ArrayList<>();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumno() {
        Alumno a1;
        boolean bandera = false;
        do {
            a1 = new Alumno();
            System.out.println("Ingrese el nombre del alumno:");
            String nombreAlumno = leer.next();
            a1.setNombre(nombreAlumno);

            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese nota " + (i + 1));
                a1.getNotaAlumno().add(leer.nextInt());
            }

            aula.add(a1);
            System.out.println("Desea crear otro alumno? S/N");
            String opcion = leer.next().toUpperCase();

            if (opcion.equals("N")) {
                bandera = true;
            }

        } while (!bandera);

    }

    public void mostrarAlumnos() {
        System.out.println(aula.toString());
    }

    public void buscarAlumno() {
        char opcion;
        do {
            boolean bandera;
            notaFinal();
            System.out.println("Desea la nota final de otro alumno? (s/n)");
            opcion = leer.next().charAt(0);
            Character.toLowerCase(opcion);

        } while (opcion != 'n');

    }

    public void notaFinal() {

        Iterator iteradorlistaAlumnos = aula.iterator();
        boolean bandera = false;
        double avg =0.0;
        int cont = 0;
        System.out.println("-------- Nota Final --------");
        System.out.println("Ingrese el nombre del alumno");
        String auxAlumno = leer.next();

        for (int i = 0; i < aula.size(); i++) {
            if (aula.get(i).getNombre().equals(auxAlumno)) {
                System.out.println("Alumno, " + auxAlumno + ", fue selecciono");

                for (int j = 0; j < aula.get(i).getNotaAlumno().size(); j++) {
                    avg = avg + aula.get(i).getNotaAlumno().get(j);
                    cont++;
                }
                System.out.println("Alumno, " + auxAlumno + ", tiene una nota promedio de " + (avg / cont));
                bandera = true;
                break;
            }
        }
        if (!bandera) {
            System.out.println("Alumno " + auxAlumno + " no se encuentra");
        }
    }

}
