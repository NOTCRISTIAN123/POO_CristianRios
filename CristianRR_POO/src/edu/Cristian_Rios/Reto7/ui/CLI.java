package edu.Cristian_Rios.Reto7.ui;

import java.util.Scanner;
import edu.Cristian_Rios.Reto7.process.Calculadora;

public class CLI {
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        float x, y;

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
                System.out.print("Ingresa el primer número: ");
                x = scanner.nextFloat();
                System.out.print("Ingresa el segundo número: ");
                y = scanner.nextFloat();

                Calculadora calculadora = new Calculadora();
                switch (opcion) {
                    case 1:
                        calculadora.calcular(new Suma(x, y));
                        break;
                    case 2:
                        calculadora.calcular(new Resta(x, y));
                        break;
                    case 3:
                        calculadora.calcular(new Multiplicacion(x, y));
                        break;
                    case 4:
                        calculadora.calcular(new Division(x, y));
                        break;
                    case 5:
                        calculadora.calcular(new Modulo(x, y));
                        break;
                    case 6:
                        calculadora.calcular(new Logaritmo(x, y));
                        break;
                    case 7:
                        calculadora.calcular(new Potenciacion(x, y));
                        break;
                    case 8:
                        calculadora.calcular(new RaizCuadrada(x, y));
                        break;
                }
            } else if (opcion == 0) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
