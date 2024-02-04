package edu.cris_rios.reto2.promedios.process;
import java.util.Scanner;

/**
 * Se mada a llamar el documento y el escaner
 */
public class Calculadora_Prom {

    public void calculaPromedio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántas materias desea calcular el promedio?");
        int numMaterias = scanner.nextInt();
        double[][] arregloProm = new double[numMaterias][2]; // arregloProm[i][0] para la calificación, arregloProm[i][1] para el peso
/**
 *Se crea el arreglo con el numero de materias
 */
        for (int i = 0; i < numMaterias; i++) {
            System.out.println("Ingrese la calificación para la materia #" + (i + 1) + ": ");
            arregloProm[i][0] = scanner.nextDouble();
            System.out.println("Ingrese el valor de la mataria sobre promedio global. Materia #" + (i + 1) + ": (Si todas las calificaciones valen lo mismo coloca 100)");
            arregloProm[i][1] = scanner.nextDouble();
        }

        double promFinal = calcularPromedio(arregloProm);
        System.out.println("El promedio final es: " + promFinal);

        scanner.close();
    }

    private double calcularPromedio(double[][] arregloProm) {
        double sumaCalificaciones = 0;
        double sumaPesos = 0;

        for (int i = 0; i < arregloProm.length; i++) {
            sumaCalificaciones += arregloProm[i][0] * arregloProm[i][1];
            sumaPesos += arregloProm[i][1];
        }

        return sumaCalificaciones / sumaPesos;
    }
}
