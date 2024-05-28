package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "localidad")

public class Localidad extends Base implements Serializable {
    private String nombre;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Provincia provincia;

    public Localidad() {
    }

    public Localidad(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
