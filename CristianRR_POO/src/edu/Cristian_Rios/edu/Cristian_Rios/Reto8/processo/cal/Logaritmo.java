package edu.Cristian_Rios.Reto7.process.cal;

import edu.Cristian_Rios.Reto7.process.cal.Resta;

public class Logaritmo extends Resta {
    public Logaritmo(float x, float y) {
        super(x, y);
    }

    @Override
    public void calcular() {
        resultado = 0;
        float temp = x;
        while (temp >= y) {
            resultado++;
            temp -= y;
        }
        System.out.println(result + resultado);
    }
}

