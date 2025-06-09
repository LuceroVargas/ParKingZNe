package pe.edu.upc.parkingzne.dtos;

import jakarta.validation.constraints.NotNull;
import pe.edu.upc.parkingzne.entities.Estacionamiento;
import pe.edu.upc.parkingzne.entities.Usuario;

import java.time.LocalDate;

public class RecomendacionDTO {

    private int idRecomendacion;
    @NotNull(message = "El comentario debe ser obligatorio")
    private String comentario;
    @NotNull(message = "La calificación de la recomendación debe ser obligatorio")
    private String calificacion;
    @NotNull(message = "La fecha de recomendación es obligatorio")
    private LocalDate fechaRecomendacion;
    @NotNull(message = "El id del usuario es obligatorio")
    private Usuario us;
    private Estacionamiento estacionamiento;

    public int getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(int idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public LocalDate getFechaRecomendacion() {
        return fechaRecomendacion;
    }

    public void setFechaRecomendacion(LocalDate fechaRecomendacion) {
        this.fechaRecomendacion = fechaRecomendacion;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }
}
