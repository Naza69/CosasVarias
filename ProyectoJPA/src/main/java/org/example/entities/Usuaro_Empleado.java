package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "usuario_empleado")
public class Usuaro_Empleado extends Base implements Serializable {
    private String auth0Id;
    @JoinColumn(name = "nombre_de_usuario")
    private String username;

    public Usuaro_Empleado(String auth0Id, String username) {
        this.auth0Id = auth0Id;
        this.username = username;
    }
}
