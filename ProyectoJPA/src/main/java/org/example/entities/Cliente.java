package org.example.entities;

import org.example.entities.enums.Rol;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
@Entity
@Table(name = "cliente")

public class Cliente extends Persona implements Serializable {
    private Rol cliente;
    @ManyToMany (cascade = CascadeType.ALL)
    private Set<Domicilio> domicilios;
    @JoinColumn(name = "Usuario_Cliente")
    private Usuario_Cliente usuarioCliente;
    @JoinColumn(name = "Imagen_Cliente")
    private Imagen_Cliente imagenCliente;

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento) {
        super(nombre, apellido, telefono, email, fechaNacimiento);
    }

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento, Rol cliente, Set<Domicilio> domicilios, Usuario_Cliente usuarioCliente, Imagen_Cliente imagenCliente) {
        super(nombre, apellido, telefono, email, fechaNacimiento);
        this.cliente = cliente;
        this.domicilios = domicilios;
        this.usuarioCliente = usuarioCliente;
        this.imagenCliente = imagenCliente;
    }

    public Rol getCliente() {
        return cliente;
    }

    public Set<Domicilio> getDomicilios() {
        return domicilios;
    }

    public Usuario_Cliente getUsuarioCliente() {
        return usuarioCliente;
    }

    public Imagen_Cliente getImagenCliente() {
        return imagenCliente;
    }

    public void setCliente(Rol cliente) {
        this.cliente = cliente;
    }

    public void setDomicilios(Set<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }

    public void setUsuarioCliente(Usuario_Cliente usuarioCliente) {
        this.usuarioCliente = usuarioCliente;
    }

    public void setImagenCliente(Imagen_Cliente imagenCliente) {
        this.imagenCliente = imagenCliente;
    }
}
