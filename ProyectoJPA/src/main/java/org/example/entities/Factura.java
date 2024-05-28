package org.example.entities;

import org.example.entities.enums.FormaPago;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
@Entity
@Table(name = "factura")

public class Factura extends Base implements Serializable {
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderld;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;
    private Pedido pedido;

    public Factura() {
    }

    public Factura(LocalDate fechaFacturacion, Integer mpPaymentId, Integer mpMerchantOrderld, String mpPreferenceId, String mpPaymentType, FormaPago formaPago, double totalVenta, Pedido pedido) {
        this.fechaFacturacion = fechaFacturacion;
        this.mpPaymentId = mpPaymentId;
        this.mpMerchantOrderld = mpMerchantOrderld;
        this.mpPreferenceId = mpPreferenceId;
        this.mpPaymentType = mpPaymentType;
        this.formaPago = formaPago;
        this.totalVenta = totalVenta;
        this.pedido = pedido;
    }

    public LocalDate getFechaFacturacion() {
        return fechaFacturacion;
    }

    public Integer getMpPaymentId() {
        return mpPaymentId;
    }

    public Integer getMpMerchantOrderld() {
        return mpMerchantOrderld;
    }

    public String getMpPreferenceId() {
        return mpPreferenceId;
    }

    public String getMpPaymentType() {
        return mpPaymentType;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public void setMpPaymentId(Integer mpPaymentId) {
        this.mpPaymentId = mpPaymentId;
    }

    public void setMpMerchantOrderld(Integer mpMerchantOrderld) {
        this.mpMerchantOrderld = mpMerchantOrderld;
    }

    public void setMpPreferenceId(String mpPreferenceId) {
        this.mpPreferenceId = mpPreferenceId;
    }

    public void setMpPaymentType(String mpPaymentType) {
        this.mpPaymentType = mpPaymentType;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
