package edu.Cristian_Rios.Reto7.process.cal;

import edu.Cristian_Rios.Reto7.process.cal.Resta;

public class Modulo extends Resta {
    public Modulo(float x, float y) {
        super(x, y);
    }

    @Override
    public void calcular() {
        resultado = x % y;
        System.out.println(result + resultado);
    }
}

