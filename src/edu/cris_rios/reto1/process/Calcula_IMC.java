package edu.cris_rios.reto1.process;

import java.util.Scanner;

/**
 * Esta práctica sirve para realizar cálculos de masa corporal,
 * se incluyen los siguientes métodos:
 * Índice de masa corporal
 * Masa magra
 */
public class Calcula_IMC {
    /**
     * Este método sirve para calcular el índice de masa corporal.
     *
     * @param altura está en centímetros.
     * @param peso   está en kilogramos.
     * @return índice de masa corporal.
     */
    public static double Calcula_IMC(double altura, double peso) {
        return peso / Math.pow(altura, 2);
    }

    /**
     * Este método nos indica que a través de un if y else if
     * ponemos los casos posibles o condiciones a cumplir
     * para calcular el índice masa corporal, además que en la
     * fórmula especificamos que las variables se resolverán matemáticamente
     * a través de Math.pow
     *
     * @param altura está en centímetros.
     * @param peso   está en kilogramos.
     * @return índice de masa corporal.
     */
    public static double calcularIMC(double altura, double peso) {
        double estatura = altura / 100;
        double imc = peso / Math.pow(estatura, 2);
        if (imc <= 18.50) {
            System.out.println("Su peso es menor");
        } else if (imc <= 24.99) {
            System.out.println("Su peso es normal");
        } else if (imc <= 29.99) {
            System.out.println("Tiene sobrepeso");
        } else if (imc <= 34.99) {
            System.out.println("Tiene obesidad menor");
        } else if (imc <= 39.99) {
            System.out.println("Tiene obesidad media");
        } else if (imc <= 40.00) {
            System.out.println("Usted presenta obesidad mórbida");
        }
        return imc;
    }

    /**
     * Este método sirve para calcular la masa magra de una
     * persona con base a su sexo, peso, altura
     *
     * @param sexo   sexo del paciente si es masculino "m || M" o femenino "f || F"
     * @param peso   peso del paciente en kg
     * @param altura estatura del paciente en centímetros
     * @return masa magra
     */
    public static double masaMagra(char sexo, double peso, double altura) {
        double masaMagra = 0;
        if (sexo == 'f' || sexo == 'F') {
            masaMagra = 1.07 * peso - 148 * Math.pow(peso, 2) / Math.pow(altura, 2);
        } else if (sexo == 'm' || sexo == 'M') {
            masaMagra = 1.10 * peso - 128 * Math.pow(peso, 2) / Math.pow(altura, 2);
        } else {
            System.out.println("Error al ingresar sexo");
        }

        return masaMagra;
    }

    /**
     * Este método sirve para calcular el metabolismo basal de una
     * persona con base a su sexo, peso, altura y edad.
     *
     * @param sexo   sexo del paciente si es masculino "m || M" o femenino "f || F"
     * @param peso   peso del paciente en kg
     * @param altura estatura del paciente en centímetros
     * @param edad   pide la edad del usuario en un valor entero
     * @return metabolismo basal
     */
    public static double metabolismoBasal(char sexo, double peso, double altura, int edad) {
        double metabolismoBasal = 0;
        if (sexo == 'f' || sexo == 'F') {
            metabolismoBasal = 655.1 + (9.563 * peso) + (1.85 * altura) - (4.676 * edad);
        } else if (sexo == 'm' || sexo == 'M') {
            metabolismoBasal = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.775 * edad);
        } else {
            System.out.println("Error al ingresar sexo");
        }

        return metabolismoBasal;
    }
}
