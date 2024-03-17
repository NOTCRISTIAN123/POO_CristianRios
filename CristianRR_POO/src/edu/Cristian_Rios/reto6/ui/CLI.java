// Archivo CLI.java
package edu.Cristian_Rios.reto6.ui;

import java.util.Scanner;
import edu.Cristian_Rios.reto6.process.calculos;

public class CLI {
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int calculomodo; // Variable para almacenar la opción de cálculo

        do {
            System.out.println("Por favor, selecciona la operación que deseas hacer:");
            System.out.println("1. Suma (Coloca un 1)");
            System.out.println("2. Resta (Coloca un 2)");
            System.out.println("3. Multiplicación (Coloca un 3)");
            System.out.println("4. División (Coloca un 4)");
            System.out.println("5. Modulo (Coloca un 5)");
            System.out.println("6. Logaritmo (Coloca un 6)");
            System.out.println("7. Potencia (Coloca un 7)");
            System.out.println("8. Raíz (Coloca un 8)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 8) {
                // Si la opción es válida, se guarda en la variable calculomodo
                calculomodo = opcion;
                // Se llama a la calculadora
                calculos.iniciarCalculadora(calculomodo);
            } else if (opcion == 0) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}