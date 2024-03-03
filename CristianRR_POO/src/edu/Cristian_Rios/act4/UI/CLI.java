package edu.Cristian_Rios.act4.UI;
import java.util.Scanner;
import edu.Cristian_Rios.act4.processes.*;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione un CLI:");
            System.out.println("1. CLI1: Programa de lista inmobiliaria (Selecciona \"1\")");
            System.out.println("2. CLI2: Programa de gestión de cuenta bancaria (Selecciona \"2\")");
            System.out.println("3. CLI3: Programa de articulos de supermercado (Selecciona \"3\")");
            System.out.println("4. CLI4: Programa de agenda telefonica (Selecciona \"4\")");
            System.out.println("5. CLI5: Programa de compras en linea (Selecciona \"5\")");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ejecutando CLI1: Programa de lista inmobiliaria...");
                    CLI1.main(new String[]{});
                    break;
                case 2:
                    System.out.println("Ejecutando CLI2: Programa de gestión de cuenta bancaria...");
                    CLI2.main(new String[]{});
                    break;
                case 3:
                    System.out.println("Ejecutando CLI3: Programa de articulos de supermercado...");
                    CLI3.main(new String[]{});
                    break;
                case 4:
                    System.out.println("Ejecutando CLI4: Programa de agenda telefonica...");
                    CLI4.main(new String[]{});
                    break;
                case 5:
                    System.out.println("Ejecutando CLI5: Programa de compras en linea...");
                    CLI5.main(new String[]{});
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}
