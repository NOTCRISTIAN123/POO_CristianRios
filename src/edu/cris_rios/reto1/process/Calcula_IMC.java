package edu.cris_rios.reto1.process;

/**
 * Esta practica sirve para realizar calculos de masa corporal,
 * se incluyen los siguientes metodos:
 * Indice de mada corporal
 * Masa magra
 *
 */
public class Calcula_IMC {
    /**
     * Este metodo sirve para calcular el indice de masa corporal
     * @param estatura esta en centimetros
     * @param peso esta en kilogramos
     * @return indice de masa corporal
     */
    public static double Calcula_IMC(double estatura, double peso){
        return peso/Math.pow(estatura,2);
    }

}
