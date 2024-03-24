package edu.Cristian_Rios.Reto7.process.cal;

import edu.Cristian_Rios.Reto7.process.cal.Suma;

public class Multiplicacion extends Suma {
    public Multiplicacion(float x, float y) {
        super(x, y);
    }

    @Override
    public void calcular() {
        resultado = 0;
        int veces = (int) y;
        for (int i = 0; i < veces; i++) {
            resultado += x;
        }
        System.out.println(result + resultado);
    }
}
