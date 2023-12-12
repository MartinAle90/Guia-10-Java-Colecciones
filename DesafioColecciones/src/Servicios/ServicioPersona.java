/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.HashMap;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashMap<Integer, Persona> listaPersona = new HashMap<>();

    //    Persona (Nombre, Edad, DNI, País)
    public void crearPersona() {
        Persona p1 = new Persona();

        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese su dni");
        p1.setDni(leer.nextInt());
        System.out.println("Ingrese su pais");
        p1.setPais(leer.next());

        listaPersona.put(p1.getDni(), p1);
    }

    public void mostrarPersona() {
        System.out.println(listaPersona);
    }

    public void modificarPersona() {

        System.out.println("Ingrese el dni de la persona a modificar");
        int auxDni = leer.nextInt();
        if (listaPersona.containsKey(auxDni)) {
            Persona auxP = listaPersona.get(auxDni);
            
            do {

                System.out.println("Que desea modificar de la persona");
                System.out.println("****************************************");
                System.out.println("1 - Cambiar nombre");
                System.out.println("2 - Cambiar edad");
                System.out.println("3 - Cambiar dni");
                System.out.println("4 - Cambiar pais");
                System.out.println("5 - Salir");
                int opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Ingrese su nuevo nombre");
                        auxP.setNombre(leer.next());
                        System.out.println("Cambio exitoso");
                        break;
                    case 2:
                        System.out.println("Ingrese edad");
                        auxP.setEdad(leer.nextInt());
                        System.out.println("Cambio exitoso");
                        break;
                    case 3:
                        System.out.println("Ingrese su dni");
                        auxP.setDni(leer.nextInt());
                        System.out.println("Cambio exitoso");
                        break;
                    case 4:
                        System.out.println("Ingrese su pais");
                        auxP.setPais(leer.next());
                        System.out.println("Cambio exitoso");
                        break;
                    case 5:
                        System.out.println("Salir");
                        return;
                    default:
                        System.out.println("Ingrese una opcion valida");
                }
            } while (true);

        }
        
        System.out.println("No se encontro el dni");
    }

    public void eliminarPersona() {
        System.out.println("Ingrese el dni de la persona a eliminar");
        int auxDni = leer.nextInt();
        if (listaPersona.containsKey(auxDni)) {
            listaPersona.remove(auxDni);
            System.out.println("Persona eliminada");
            return;
        }
        System.out.println("No se encotro el dni");
    }

}
