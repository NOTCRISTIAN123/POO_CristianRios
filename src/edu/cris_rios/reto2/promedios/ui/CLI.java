package edu.cris_rios.reto2.promedios.ui;

import edu.cris_rios.reto2.promedios.process.Calculadora_Prom;

import java.util.Scanner;

public class CLI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora_Prom calculadoraProm = new Calculadora_Prom();

        char opcion;
        do {
            System.out.println("Buenos días, ¿en qué podemos ayudarle?");
            System.out.println("   - Calcular promedio (Presiona 'C' para calcular promedio)");
            System.out.println("   - Salir (Presiona 'S' para terminar el programa)");
            System.out.print(":D ");

            if (scanner.hasNext()) {
                opcion = scanner.next().charAt(0);
                scanner.nextLine(); // Consumir el salto de línea
            } else {
                // Manejar el caso en que no hay más entrada
                System.out.println("Entrada no válida. Saliendo del programa.");
                opcion = 'S'; // O cualquier otra acción que desees tomar
            }

            switch (opcion) {
                case 'C':
                case 'c':
                    calculadoraProm.calculaPromedio();
                    break;
                case 'S':
                case 's':
                    System.out.println("Gracias por su preferencia, que tenga un excelente día ;D");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 'S' && opcion != 's');

        scanner.close();
    }
}