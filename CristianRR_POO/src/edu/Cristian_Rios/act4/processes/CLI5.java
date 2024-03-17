package edu.Cristian_Rios.act4.processes;

import java.util.List;
import java.util.ArrayList;

public class CLI5 {
    private List<Producto> productos;

    public CLI5() {
        this.productos = new ArrayList<>();
    }

    public void registrarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        // Implementa la lógica para mostrar los productos
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public double calcularIVA(Producto producto) {
        // Implementa la lógica para calcular el IVA
        return 0.0; // Solo un valor de ejemplo
    }
}
