package edu.Cristian_Rios.Reto7.process.cal;

import edu.Cristian_Rios.Reto7.process.cal.Resta;

public class Divicion extends Resta {
    public Divicion(float x, float y) {
        super(x, y);
    }

    @Override
    public void calcular() {
        if (y != 0) {
            resultado = 0;
            while (x >= y) {
                resultado++;
                x -= y;
            }
            System.out.println(result + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}

