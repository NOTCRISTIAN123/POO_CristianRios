package edu.Cristian_Rios.act4.processes;

import java.util.List;
import java.util.ArrayList;

public class CLI4 {
    private List<Contacto> contactos;

    public CLI4() {
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public Contacto buscarContacto(String nombre) {
        // Implementa la lógica para buscar un contacto por nombre
        return null; // Solo un valor de ejemplo
    }
}
