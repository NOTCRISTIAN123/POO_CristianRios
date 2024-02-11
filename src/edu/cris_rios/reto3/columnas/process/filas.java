package edu.cris_rios.reto3.columnas.process;

import java.util.Random;
import java.util.Scanner;

/**
 * Esta parte del programa se encargara de imprimir las filas y columnas con numeros aleatorios
 * En esta parte no solo tuve que verme un par de tutoriales y requerir ayuda a chat gtp para corregir algunos
 * errores y poder tabien tener una vista mas clara de los arrglos:
 *"<a href="https://youtu.be/bPVcx44wgmQ?si=mOPHR4nZ-NQ2DE1-">Es un video</a>"
 *"<a href="https://youtu.be/X8YFTykkGaQ?si=GxvKiUX8SFRdP8ty">Este video</a>"
 */
public class filas {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indica la cantidad de filas: ");
        int FL = scanner.nextInt();
        int CL;
        do {
            System.out.print("Indica la cantidad de columnas: ");
            CL = scanner.nextInt();
            if (FL != CL)
                System.out.println("El numero de filas y columnas debe ser igual. Intente de nuevo.");
        } while (FL != CL);

        int[][] matrix = new int[FL][CL];
        Random random = new Random();

        // Llena la matriz y  comienza contar pares e impares por fila
        System.out.println("Matriz generada:");
        int totalSum = 0;
        for (int i = 0; i < FL; i++) {
            int pares = 0, impares = 0;
            for (int j = 0; j < CL; j++) {
                matrix[i][j] = random.nextInt(100) + 1;
                totalSum += matrix[i][j];
                System.out.print(matrix[i][j] + "   ");
                if (matrix[i][j] % 2 == 0)
                    pares++;
                else
                    impares++;
            }
            System.out.println("\nCantidad de pares: " + pares + ", impares: " + impares + " en la fila " + (i + 1));
        }

        // Contar pares e impares por columna
        System.out.println("--------------------------------");
        for (int j = 0; j < CL; j++) {
            int pares = 0, impares = 0;
            for (int i = 0; i < FL; i++) {
                if (matrix[i][j] % 2 == 0)
                    pares++;
                else
                    impares++;
            }
            System.out.println("Cantidad de pares: " + pares + ", impares: " + impares + " en la columna " + (j + 1));
        }

        // Mostrar suma total de la matriz
        System.out.println("--------------------------------");
        System.out.println("La suma total de los valores del vector es: " + totalSum);
        System.out.println("Profe porfavor denos mas tiempo para las actividades :,D");
        System.out.println(":D");
        scanner.close();
    }
}