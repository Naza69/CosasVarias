package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "provincia")
public class Provincia extends Base implements Serializable {
    private String nombre;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Pais pais;

    public Provincia(){}

    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
