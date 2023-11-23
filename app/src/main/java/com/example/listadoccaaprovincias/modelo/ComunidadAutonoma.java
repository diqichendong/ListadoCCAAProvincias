package com.example.listadoccaaprovincias.modelo;

import java.util.List;

public class ComunidadAutonoma {
    private String nombre;
    private String[] privincias;

    public ComunidadAutonoma(String nombre, String[] privincias) {
        this.nombre = nombre;
        this.privincias = privincias;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getPrivincias() {
        return privincias;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
