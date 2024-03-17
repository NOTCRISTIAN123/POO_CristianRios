package edu.Cristian_Rios.Reto7.process.cal;

public class Potenciacion extends Multiplicacion {
    public Potenciacion(float x, float y) {
        super(x, y);
    }

    @Override
    public void calcular() {
        resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado *= x;
        }
        System.out.println("El resultado de la potenciación es: " + resultado);
    }
}