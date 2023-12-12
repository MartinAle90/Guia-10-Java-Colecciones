/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Comparadores;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listaPelicula = new ArrayList();

    public void agregarPelicula() {

//        boolean bandera = true;
        do {
            Pelicula p1 = new Pelicula();

            System.out.println("ingrese el nombre de la pelicula");
            p1.setTitulo(leer.next());
            System.out.println("ingrese el nombre del director");
            p1.setDirector(leer.next());
            System.out.println("ingrese la duracion");
            p1.setDuracion(leer.nextDouble());
            listaPelicula.add(p1);

            System.out.println("desea agregar otra pelicula (s/n)?");
            String resp = leer.next();
            if (resp.equals("n")) {
                return;
            }

        } while (true);

    }

    public void mostrarPelicula() {
        System.out.println(listaPelicula);
    }

//    Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void peliculasMasDeUnaHora() {
        for (Pelicula p : listaPelicula) {
            if (p.getDuracion() >= 1) {
                System.out.println(p);
            }
        }
    }

//    Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
    public void ordenarMayorMenor() {
        listaPelicula.sort(Comparadores.ordenarDuracionMayMen);
        mostrarPelicula();
    }

    public void ordenarMenosMayor() {
        listaPelicula.sort(Comparadores.ordenarDuracionMenMay);
        mostrarPelicula();
    }

    public void ordenarTitulor() {
        listaPelicula.sort(Comparadores.ordenarTitulo);
        mostrarPelicula();
    }

    public void ordenarDirector() {
        listaPelicula.sort(Comparadores.ordenarDirector);
        mostrarPelicula();
    }
}
