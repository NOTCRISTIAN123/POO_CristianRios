package edu.Cristian_Rios.Reto7.ui;

import java.util.Scanner;
import edu.Cristian_Rios.Reto8.processo.Calculadora;
import edu.Cristian_Rios.Reto8.processo.cal.Suma;
import edu.Cristian_Rios.Reto8.processo.cal.Resta;
import edu.Cristian_Rios.Reto8.processo.cal.Multiplicacion;
import edu.Cristian_Rios.Reto8.processo.cal.Potenciacion;
import edu.Cristian_Rios.Reto8.processo.cal.Divicion;
import edu.Cristian_Rios.Reto8.processo.cal.Modulo;
import edu.Cristian_Rios.Reto8.processo.cal.Logaritmo;
import edu.Cristian_Rios.Reto8.processo.cal.RaizCuadrada;
import edi.Cristian_Rios.Reto8.processo.cal.ENG
import edi.Cristian_Rios.Reto8.processo.cal.ESP

public class CLI {
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int languageChoice;
        int operationChoice;
        ResourceBundle messages;

        // Pregunta al usuario por el idioma
        System.out.println("¿Wich language?");
        System.out.println("0. English");
        System.out.println("1. Español");
        languageChoice = scanner.nextInt();
        // Cargar el archivo de propiedades correspondiente al idioma seleccionado
        if (languageChoice == 0) {
            messages = ResourceBundle.getBundle("edu.Cristian_Rios.Reto8.processo.doc.ENG");
        } else {
            messages = ResourceBundle.getBundle("edu.Cristian_Rios.Reto8.processo.doc.ESP");
        }

        // Mostrar el menú de operaciones
        System.out.println(messages.getString("menu.title"));
        System.out.println(messages.getString("menu.addition"));
        // Otros mensajes...
        Scanner scanner = new Scanner(System.in);
        int opcion;
        float x, y;

        do {
            System.out.println(menu.tittle);
            System.out.println(menu.addition);
            System.out.println(menu.subtraction);
            System.out.println(menu.multiplication);
            System.out.println(menu.division);
            System.out.println(menu.modulo);
            System.out.println(menu.logarithm);
            System.out.println(menu.power);
            System.out.println(menu.squareRoot);
            System.out.println(menu.exit);
            System.out.print("Option: ");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 8) {
                System.out.print(input.firstNumber);
                x = scanner.nextFloat();
                System.out.print(input.secondNumber);
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
                        calculadora.calcular(new Divicion(x, y));
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

        // Leer la opción de operación
        operationChoice = scanner.nextInt();
        // Implementa el resto de la lógica según la opción elegida
        // Usa messages.getString("clave") para obtener los mensajes del archivo de propiedades
        // según el idioma seleccionado

        scanner.close();
        scanner.close();
    }
}
