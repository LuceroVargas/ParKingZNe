package pe.edu.upc.parkingzne.dtos;


import jakarta.validation.constraints.NotNull;

public class TipoNotificacionDTO {

    private int idTipoNotificacion;
    @NotNull(message = "La descripción del tipo de notificación debe ser obligatorio")
    private String Descripcion;

    public int getIdTipoNotificacion() { return idTipoNotificacion; }

    public void setIdTipoNotificacion(int idTipoNotificacion) {
        this.idTipoNotificacion = idTipoNotificacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
