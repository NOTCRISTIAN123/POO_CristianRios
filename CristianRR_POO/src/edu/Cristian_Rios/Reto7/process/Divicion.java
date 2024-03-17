package edu.Cristian_Rios.Reto7.process;

import edu.Cristian_Rios.Reto7.process.Resta;

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
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
