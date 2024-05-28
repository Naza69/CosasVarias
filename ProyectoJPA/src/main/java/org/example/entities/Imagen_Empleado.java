package org.example.entities;

import java.io.Serializable;

public class Imagen_Empleado extends Base implements Serializable {
    private String denominacion;

    public Imagen_Empleado(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
