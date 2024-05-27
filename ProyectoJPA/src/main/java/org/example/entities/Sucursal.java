package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
@Table(name = "sucursal")
public class Sucursal extends Base implements Serializable {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private boolean casaMatriz;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Domicilio domicilio;
    @ManyToOne(cascade = CascadeType.ALL)
    private Empresa empresa;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Categoria categoria;


    public Sucursal() {
    }

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, boolean casaMatriz, Domicilio domicilio, Empresa empresa, Categoria categoria) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.casaMatriz = casaMatriz;
        this.domicilio = domicilio;
        this.empresa = empresa;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public boolean isCasaMatriz() {
        return casaMatriz;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public void setCasaMatriz(boolean casaMatriz) {
        this.casaMatriz = casaMatriz;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
