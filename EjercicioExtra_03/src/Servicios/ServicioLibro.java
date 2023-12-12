/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

//En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
import Entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;


//Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
//busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
//método decrementa de a uno, como un carrito de compras, el atributo ejemplares
//prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
//produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
//ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
//caso contrario.
//Método toString para mostrar los datos de los libros. 
public class ServicioLibro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearLibro(HashSet<Libro> listaLibro) {

        Libro auxLibro = new Libro();
        System.out.println("ingrese titulo de libro");
        auxLibro.setTitulo(leer.next());

        System.out.println("ingrese autor del libro");
        auxLibro.setAutor(leer.next());
        System.out.println("ejemplares");
        auxLibro.setEjemplares(leer.nextInt());
        System.out.println("ejemplares prestados");
        auxLibro.setEjemplaresPrestados(leer.nextInt());

        listaLibro.add(auxLibro);

    }

    //Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
//en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
//método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
//prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
//préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
//disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
//caso contrario.
    public boolean prestamo(HashSet<Libro> listaLibro, String tituloABuscar) {

        for (Libro libroActual : listaLibro) {
            if (libroActual.getTitulo().equals(tituloABuscar)) {
                if (libroActual.getEjemplares() - libroActual.getEjemplaresPrestados() > 0) {
                    libroActual.setEjemplaresPrestados(libroActual.getEjemplaresPrestados() + 1);
                    return true;
                } else {
                    System.out.println("no hay ejemplares para prestar");
                    return false;
                }
            }
        }
        return false;
    }
    
    //Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
//busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
//método decrementa de a uno, como un carrito de compras, el atributo ejemplares
//prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
//produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
//ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
//caso contrario.
    
        public boolean devolucion(HashSet<Libro> listaLibro, String tituloADevolver) {

        for (Libro libroActual : listaLibro) {
            if (libroActual.getTitulo().equals(tituloADevolver)) {
                if (libroActual.getEjemplaresPrestados() > 0) {
                    libroActual.setEjemplaresPrestados(libroActual.getEjemplaresPrestados() - 1);
                    return true;
                } else {
                    System.out.println("no hay ejemplares para devolver");
                    return false;
                }
            }
        }
        return false;
    }

}
