package edu.Cristian_Rios.act4.processes;

import java.util.List;
import java.util.ArrayList;

public class CLI2 {
    private List<Cliente> clientes;

    public CLI2() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public double consultarSaldo(CuentaBancaria cuenta) {
        // Implementa la lógica para consultar el saldo
        return 0.0; // Solo un valor de ejemplo
    }
}
