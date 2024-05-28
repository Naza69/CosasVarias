package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "domicilio")

public class Domicilio extends Base implements Serializable {
    private String calle;
    private Integer numero;
    private Integer cp;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Localidad localidad;

    @ManyToOne
    private Cliente cliente;

    public Domicilio() {
    }

    public Domicilio(String calle, Integer numero, Integer cp, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getCp() {
        return cp;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
}
