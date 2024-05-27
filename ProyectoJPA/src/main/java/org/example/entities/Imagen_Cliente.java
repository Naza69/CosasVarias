package org.example.entities;

import java.io.Serializable;

public class Imagen_Cliente extends Base implements Serializable {
    private String denominacion;

    public Imagen_Cliente(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
