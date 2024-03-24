package edu.Cristian_Rios.Reto8.processo.cal;

import edu.Cristian_Rios.Reto7.process.operacion_aritmetica;

public class Suma extends operacion_aritmetica {
    public Suma(float x, float y) {
        super(x, y);
    }

    @Override
    public void calcular() {
        resultado = x + y;
        System.out.println(result + resultado);
    }
}
