package Servicios;

import java.util.*;

public class ServicioPais {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<String> pais = new HashSet<>();

    public void agregarPais() {

        do {
            System.out.println("Ingrese un pais:");

            pais.add(leer.next());

            do {
                System.out.println("Desea agregar otro pais? S/N");
                String resp = leer.next();
                if (resp.equalsIgnoreCase("S")) {
                    break;
                } else if (resp.equalsIgnoreCase("N")) {
                    return;
                } else {
                    System.out.println("respuesta incorrecta");
                }
            } while (true);

//        System.out.println("Desea agregar otro pais? S/N");
//        String resp = leer.next();
//        if (resp.equalsIgnoreCase("N")) {
//            return;
//        }
        } while (true);
    }

    public void mostrarPaises() {

        System.out.println(pais);
    }

    public void ordenarPaises() {
        ArrayList<String> paisesOrdenados = new ArrayList<>(pais);
        Collections.sort(paisesOrdenados);
        System.out.println(paisesOrdenados);
    }

    public void buscarPais() {
        System.out.println("Ingrese el pais a buscar:");
        String p1 = leer.next();

        Iterator i = pais.iterator();

        while (i.hasNext()) {
            if (i.next().equals(p1)) {
                i.remove();
                System.out.println("El pais " + p1 + " fue eliminado.");
                return;
            }
        }
        System.out.println("No se encontró el pais ingresado");
    }

}
