package edu.Cristian_Rios.act4.processes;

import java.util.ArrayList;
import java.util.List;

public class CLI1 {
    private List<PropiedadInmobiliaria> propiedades;

    public CLI1() {
        this.propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(PropiedadInmobiliaria propiedad) {
        propiedades.add(propiedad);
    }

    public List<PropiedadInmobiliaria> getPropiedades() {
        return propiedades;
    }

    public List<PropiedadInmobiliaria> buscarPropiedades(String criterio) {
        List<PropiedadInmobiliaria> resultado = new ArrayList<>();
        // Implementa la lógica para buscar propiedades
        return resultado;
    }

    public void mostrarListaPropiedades() {
        // Implementa la lógica para mostrar la lista de propiedades
    }
}
