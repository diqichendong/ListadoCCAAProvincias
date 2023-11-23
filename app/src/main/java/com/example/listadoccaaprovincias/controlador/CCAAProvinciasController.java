package com.example.listadoccaaprovincias.controlador;

import com.example.listadoccaaprovincias.modelo.ComunidadAutonoma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CCAAProvinciasController {
    static private List<ComunidadAutonoma> ccaa = new ArrayList<>();

    static public void cargarDatos() {
        ccaa.add(new ComunidadAutonoma(
                "Andalucía",
                new String[] {"Almería", "Cádiz", "Córdoba", "Granada", "Huelva", "Jaén", "Málaga", "Sevilla"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Aragón",
                new String[] {"Huesca", "Teruel", "Zaragoza"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Asturias",
                new String[] {"Asturias"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Cantabria",
                new String[] {"Cantabria"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Castilla y León",
                new String[] {"Ávila", "Burgos", "León", "Palencia", "Salamanca", "Segovia", "Soria", "Valladolid", "Zamora"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Castilla-La Mancha",
                new String[] {"Albacete", "Ciudad Real", "Cuenca", "Guadalajara", "Toledo"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Cataluña",
                new String[] {"Barcelona", "Girona", "Lleida", "Tarragona"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Extremadura",
                new String[] {"Badajoz", "Cáceres"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Galicia",
                new String[] {"A Coruña", "Lugo", "Ourense", "Pontevedra"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Islas Baleares",
                new String[] {"Islas Baleares"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Islas Canarias",
                new String[] {"Las Palmas", "Santa Cruz de Tenerife"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "La Rioja",
                new String[] {"La Rioja"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Madrid",
                new String[] {"Madrid"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Murcia",
                new String[] {"Murcia"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Navarra",
                new String[] {"Navarra"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "País Vasco",
                new String[] {"Álava", "Gipuzkoa", "Bizkaia"}
        ));
        ccaa.add(new ComunidadAutonoma(
                "Valencia",
                new String[] {"Alicante", "Castellón", "Valencia"}
        ));
    }

    static public List<ComunidadAutonoma> getCcaa() {
        return ccaa;
    }

    static public String[] getCcaaString() {
        String[] res = new String[ccaa.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ccaa.get(i).toString();
        }
        return res;
    }
}
