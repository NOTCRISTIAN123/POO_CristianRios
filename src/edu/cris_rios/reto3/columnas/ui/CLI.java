package edu.cris_rios.reto3.columnas.ui;

import edu.cris_rios.reto3.columnas.process.filas;

import java.util.Scanner;

/**
 * Parte del menu:
 * Primero se seleccion si se desea realizar una operacion o no
 * Si se desea relizar una operacion se llama a "filas"
 *
 */
public class CLI {
    public static void launchApp() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Menu:");
            System.out.println("1. Realizar operacion");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opcion: ");
            option = scanner.nextInt();
            switch (option) {
                /*
                  Si la opcion o dato pedido no corresponde entonces se mandarra error
                 */
                case 1:
                    filas.execute();
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo. (D:)");
                    break;
            }
        } while (option != 2);
        scanner.close();
    }
}