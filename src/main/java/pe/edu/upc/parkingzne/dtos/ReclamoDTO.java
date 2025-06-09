package pe.edu.upc.parkingzne.dtos;

import jakarta.validation.constraints.NotNull;
import pe.edu.upc.parkingzne.entities.Reserva;
import pe.edu.upc.parkingzne.entities.Usuario;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReclamoDTO {

    private int idReclamo;
    @NotNull(message = "La titulo del reclamo debe ser obligatorio")
    private String titulo;
    @NotNull(message = "La descripción del reclamo debe ser obligatorio")
    private String descripcion;
    private Boolean archivo;
    @NotNull(message = "La fecha del reclamo debe ser obligatorio")
    private LocalDate fecha;
    @NotNull(message = "El estado del reclamo debe ser obligatorio")
    private String estado;
    @NotNull(message = "La hora del reclamo debe ser obligatorio")
    private LocalTime hora;
    @NotNull(message = "El id del usuario es obligatorio")
    private Usuario us;
    @NotNull(message = "El id de la reserva es obligatorio")
    private Reserva reserva;

    public int getIdReclamo() {
        return idReclamo;
    }

    public void setIdReclamo(int idReclamo) {
        this.idReclamo = idReclamo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getArchivo() {
        return archivo;
    }

    public void setArchivo(Boolean archivo) {
        this.archivo = archivo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
