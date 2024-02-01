package edu.cris_rios.reto1.ui;

import edu.cris_rios.reto1.process.Calcula_IMC;

import java.util.Scanner;

/**
 * Esta clase maneja la interacción con el usuario a través de la línea de comandos.
 */
public class CLI {

    /**
     * Muestra el menú de opciones al usuario.
     */
    public static void showMenu() {
        /**
         * Muestra el menú al usuario enumerando las opciones del 1 al 4.
         * El usuario debe seleccionar una opción para realizar cálculos específicos.
         */
        System.out.println("Bienvenido :D");
        System.out.println("Porfavor, escriba el número de la opción que desees");
        System.out.println("1. Índice de masa corporal");
        System.out.println("2. Masa corporal magra");
        System.out.println("3. Metabolismo basal");
        System.out.println("4. Salir de la aplicacion");
        System.out.println("______________________________");
        System.out.println(":)");
    }

    /**
     * Inicia la aplicación y gestiona la interacción con el usuario.
     */
    public static void launchApp() {
        /**
         * Interactúa con el usuario según la opción seleccionada.
         * - Opción 1: Calcula el índice de masa corporal (IMC).
         * - Opción 2: Calcula la masa corporal magra.
         * - Opción 3: Calcula el metabolismo basal.
         * - Opción 4: Finaliza el programa.
         * Se solicitan diferentes datos según la opción seleccionada.
         * El programa se ejecuta según las operaciones esperadas.
         */
        Scanner sc = new Scanner(System.in);
        showMenu();
        int seleccion = sc.nextInt();

        if (seleccion == 1) {
            System.out.println("Ingrese su altura en metros");
            double altura = sc.nextDouble();
            System.out.println("Ingrese su peso en kilogramos");
            double peso = sc.nextDouble();
            double imc = Calcula_IMC.Calcula_IMC(altura, peso);
            System.out.println("Su IMC es: " + imc);
        } else if (seleccion == 2) {
            System.out.println("Ingrese su sexo. (M para maculino y F para femenino)");
            char sexo = sc.next().charAt(0);
            System.out.println("Ingrese su peso en kilogramos");
            double peso = sc.nextDouble();
            System.out.println("Ingrese su altura en centímetros ");
            double altura = sc.nextDouble();
            double masaMasaMagra = Calcula_IMC.masaMagra(sexo, peso, altura);
            System.out.println("Su masa magra es: " + masaMasaMagra);
        } else if (seleccion == 3) {
            System.out.println("Ingrese su sexo");
            char sexo = sc.next().charAt(0);
            System.out.println("Ingresa su peso en kilogramos");
            double peso = sc.nextDouble();
            System.out.println("Ingresa su altura en centímetros");
            double altura = sc.nextDouble();
            System.out.println("Ingresa su edad");
            int edad = sc.nextInt();
            double metabolismoBasal = Calcula_IMC.metabolismoBasal(sexo, peso, altura, edad);
            System.out.println("Su metabolismo basal es: " + metabolismoBasal);
        } else if (seleccion == 4) {
            System.out.println("Finalizó el programa. Gracias por su atencion y preferencia respecto a nuestro programa");
            System.exit(0);
        }
    }
}