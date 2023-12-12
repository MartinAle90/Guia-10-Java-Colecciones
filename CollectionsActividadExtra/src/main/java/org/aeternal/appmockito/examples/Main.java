package org.aeternal.appmockito.examples;

import org.aeternal.appmockito.examples.Service.ServicioMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServicioMenu servicioMenu = new ServicioMenu();
        servicioMenu.inicializarServicioTienda();
    }
}