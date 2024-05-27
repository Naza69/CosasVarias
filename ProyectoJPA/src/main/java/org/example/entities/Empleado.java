package org.example.entities;

import org.example.entities.enums.Rol;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "empleado")
public class Empleado extends Persona implements Serializable {
    private Rol empleado;
    @ManyToOne(cascade = CascadeType.ALL)
    private Sucursal sucursal;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Imagen_Empleado imagenEmpleado;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Usuaro_Empleado usuaroEmpleado;

    public Empleado(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento) {
        super(nombre, apellido, telefono, email, fechaNacimiento);
    }

    public Empleado(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento, Rol empleado, Sucursal sucursal, Imagen_Empleado imagenEmpleado, Usuaro_Empleado usuaroEmpleado) {
        super(nombre, apellido, telefono, email, fechaNacimiento);
        this.empleado = empleado;
        this.sucursal = sucursal;
        this.imagenEmpleado = imagenEmpleado;
        this.usuaroEmpleado = usuaroEmpleado;
    }

    public Rol getEmpleado() {
        return empleado;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public Imagen_Empleado getImagenEmpleado() {
        return imagenEmpleado;
    }

    public Usuaro_Empleado getUsuaroEmpleado() {
        return usuaroEmpleado;
    }

    public void setEmpleado(Rol empleado) {
        this.empleado = empleado;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public void setImagenEmpleado(Imagen_Empleado imagenEmpleado) {
        this.imagenEmpleado = imagenEmpleado;
    }

    public void setUsuaroEmpleado(Usuaro_Empleado usuaroEmpleado) {
        this.usuaroEmpleado = usuaroEmpleado;
    }
}
