package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "detalle_pedido")
public class DetallePedido extends Base implements Serializable {
    private Integer cantidad;
    private double subTotal;
    private Pedido pedido;

    public DetallePedido(Integer cantidad, double subTotal, Pedido pedido) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.pedido = pedido;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
