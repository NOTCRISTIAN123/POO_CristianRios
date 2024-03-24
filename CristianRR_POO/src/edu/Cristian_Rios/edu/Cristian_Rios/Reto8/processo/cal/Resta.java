package edu.Cristian_Rios.Reto7.process.cal;

import edu.Cristian_Rios.Reto7.process.operacion_aritmetica;

public class Resta extends operacion_aritmetica {
    public Resta(float x, float y) {
        super(x, y);
    }

    @Override
    public void calcular() {
        resultado = x - y;
        System.out.println(result + resultado);
    }
}
