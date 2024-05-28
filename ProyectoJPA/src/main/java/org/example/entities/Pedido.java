package org.example.entities;

import org.example.entities.enums.Estado;
import org.example.entities.enums.FormaPago;
import org.example.entities.enums.TipoEnvio;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name = "pedido")

public class Pedido extends Base implements Serializable {
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Domicilio domicilio;
    @OneToMany (cascade = CascadeType.PERSIST)
    private Set<DetallePedido> detallePedido;
    @OneToOne
    private Factura factura;

    public Pedido() {
    }

    public Pedido(LocalTime horaEstimadaFinalizacion, double total, double totalCosto, Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago, LocalDate fechaPedido, Domicilio domicilio, Set<DetallePedido> detallePedido, Factura factura) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.fechaPedido = fechaPedido;
        this.domicilio = domicilio;
        this.detallePedido = detallePedido;
        this.factura = factura;
    }

    public LocalTime getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public double getTotal() {
        return total;
    }

    public double getTotalCosto() {
        return totalCosto;
    }

    public Estado getEstado() {
        return estado;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public Set<DetallePedido> getDetallePedido() {
        return detallePedido;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void setDetallePedido(Set<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}
