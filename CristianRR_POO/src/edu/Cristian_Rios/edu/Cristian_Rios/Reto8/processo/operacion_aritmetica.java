package edu.Cristian_Rios.Reto8.processo;

public abstract class operacion_aritmetica {
    protected float x;
    protected float y;
    protected float resultado;

    public operacion_aritmetica(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract void calcular();
}