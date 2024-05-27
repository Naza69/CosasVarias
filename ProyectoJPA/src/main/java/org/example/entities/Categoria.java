package org.example.entities;

import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Categoria extends Base implements Serializable {
    private String denominacion;

    @ManyToOne
    private Categoria categoriaPadre;
    private List<Categoria> subcategorias ;

    public Categoria() {
    }

    public Categoria(String denominacion, Categoria categoriaPadre, List<Categoria> subcategorias) {
        this.denominacion = denominacion;
        this.categoriaPadre = categoriaPadre;
        this.subcategorias = new ArrayList<>();
    }

    public String getDenominacion() {
        return denominacion;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public List<Categoria> getSubcategorias() {
        return subcategorias;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    public void setSubcategorias(List<Categoria> subcategorias) {
        this.subcategorias = subcategorias;
    }
}
