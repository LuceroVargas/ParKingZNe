package pe.edu.upc.parkingzne.dtos;

import jakarta.validation.constraints.NotNull;
import pe.edu.upc.parkingzne.entities.Usuario;

import java.time.LocalDate;

public class SuscripcionDTO {

    private int idSuscripcion;
    @NotNull(message = "El tipo de suscripción debe ser obligatorio")
    private String TipoSuscripcion;
    @NotNull(message = "El estado de suscripción debe ser obligatorio")
    private String estado;
    @NotNull(message = "El tipo de pago de la suscripción debe ser obligatorio")
    private String tipoPago;
    @NotNull(message = "La renovación de suscripcion debe ser obligatorio")
    private double renovada;
    @NotNull(message = "La fecha de inicio de la suscripción debe ser obligatorio")
    private LocalDate fechaInicio;
    @NotNull(message = "La fecha de fin de la suscripción debe ser obligatorio")
    private LocalDate fechaFin;
    @NotNull(message = "El id del usuario es obligatorio")
    private Usuario us;

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getTipoSuscripcion() {
        return TipoSuscripcion;
    }

    public void setTipoSuscripcion(String tipoSuscripcion) {
        TipoSuscripcion = tipoSuscripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getRenovada() {
        return renovada;
    }

    public void setRenovada(double renovada) {
        this.renovada = renovada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }
}
