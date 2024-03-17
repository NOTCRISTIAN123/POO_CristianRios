package edu.Cristian_Rios.Reto7.process;

import edu.Cristian_Rios.Reto7.process.Resta;

public class Modulo extends Resta {
    public Modulo(float x, float y) {
        super(x, y);
    }

    @Override
    public void calcular() {
        resultado = x % y;
        System.out.println("El resultado del módulo es: " + resultado);
    }
}
