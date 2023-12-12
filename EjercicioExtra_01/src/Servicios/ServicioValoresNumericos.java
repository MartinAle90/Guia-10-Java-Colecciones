package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

/*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).*/

public class ServicioValoresNumericos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Integer> valoresNum = new ArrayList<>();


    public void ingresarValoresNumericos() {
        int valNum;

        do {
            System.out.println("Ingrese un valor numerico entero. (-99 para terminar)");
            valNum = leer.nextInt();
            if (valNum == -99) {
                System.out.println("Se termino");
                break;
            } else {
                System.out.println("Se ingreso correctamente " + valNum);
                valoresNum.add(valNum);
            }
        } while (true);
        mostrarValoresNumericos();
        System.out.println("la suma de los valores ingresados es: " + sumaValoresNumericos());
        System.out.println("La media de los valores ingresados es: " + mediaValoresNumericos());

    }

    public void mostrarValoresNumericos() {
        System.out.println("Los numero ingresados son:");
        System.out.println(valoresNum);
    }

    public int sumaValoresNumericos() {
        int suma = 0;
        for (int vn : valoresNum) {
            suma = suma + vn;
        }
        return suma;
    }

    public double mediaValoresNumericos() {
        int suma = sumaValoresNumericos();
        double promedio;
        promedio = 1.0*suma/valoresNum.size();
        return promedio;
    }


}
