/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author Martin
 */
public class Comparadores {
    
    public static Comparator<Pelicula> ordenarDuracionMenMay = new  Comparator<Pelicula> (){
        @Override
        public int compare (Pelicula p1, Pelicula p2){
            return Double.compare(p1.getDuracion(), p2.getDuracion());
        }
    };
    
        public static Comparator<Pelicula> ordenarDuracionMayMen = new  Comparator<Pelicula> (){
        @Override
        public int compare (Pelicula p1, Pelicula p2){
            return Double.compare(p2.getDuracion(), p1.getDuracion());
        }
    };
        
    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    
        public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
    
    
}
