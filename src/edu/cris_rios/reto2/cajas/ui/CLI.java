package edu.cris_rios.reto2.cajas.ui;
import edu.cris_rios.reto2.cajas.process.Calculadora_cajas;
import edu.cris_rios.reto2.cajas.process.Calculadora_cajas;

import java.util.Scanner;

public class CLI {
    private static final String USUARIO_CORRECTO = "Cris";
    private static final String CONTRASENIA_CORRECTA = "0001";
    private static final int DINERO_INICIAL = 1000;

    public static void launchApp() {
        Scanner scanner = new Scanner(System.in);
        Calculadora_cajas calculadoraCajas = new Calculadora_cajas();

        System.out.println("Bienvenido al sistema de cajas de papel");
        System.out.println("Por favor, ingrese su nombre de usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña (máximo 4 dígitos):");
        String contrasenia = scanner.nextLine();

        if (autenticarUsuario(usuario, contrasenia)) {
            System.out.println("¡Inicio de sesión exitoso!");

            char opcion;
            do {
                System.out.println("Menú:");
                System.out.println("A. Comprar cajas de papel");
                System.out.println("B. Vender cajas de papel");
                System.out.println("C. Mostrar reporte (modo administrador)");
                System.out.println("D. Salir del programa");

                System.out.print("Seleccione una opción (A/B/C/D): ");
                opcion = scanner.next().charAt(0);
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 'A':
                    case 'a':
                        calculadoraCajas.comprarCajas(DINERO_INICIAL);
                        break;
                    case 'B':
                    case 'b':
                        calculadoraCajas.venderCajas();
                        break;
                    case 'C':
                    case 'c':
                        System.out.println("Ingrese usuario de administrador:");
                        String usuarioAdmin = scanner.nextLine();
                        System.out.println("Ingrese contraseña de administrador:");
                        String contraseniaAdmin = scanner.nextLine();
                        if (autenticarAdmin(usuarioAdmin, contraseniaAdmin)) {
                            calculadoraCajas.mostrarReporteAdmin();
                        } else {
                            System.out.println("Acceso denegado. Cerrando el programa.");
                            opcion = 'D';
                        }
                        break;
                    case 'D':
                    case 'd':
                        calculadoraCajas.mostrarResumen();
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                }

            } while (opcion != 'D' && opcion != 'd');

        } else {
            System.out.println("Error de inicio de sesión. Cerrando el programa.");
        }

        scanner.close();
    }

    private static boolean autenticarUsuario(String usuario, String contrasenia) {
        return usuario.length() <= 26 && contrasenia.length() <= 4 &&
                usuario.equals(USUARIO_CORRECTO) && contrasenia.equals(CONTRASENIA_CORRECTA);
    }

    private static boolean autenticarAdmin(String usuario, String contrasenia) {
        // Aquí puedes agregar lógica adicional si lo deseas
        return true;
    }
}