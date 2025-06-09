package pe.edu.upc.parkingzne.dtos;

import jakarta.validation.constraints.NotNull;
import pe.edu.upc.parkingzne.entities.Reserva;

public class NotificacionReservaDTO {

    private int idNotificacionReserva;
    @NotNull(message = "El id de la reserva es obligatorio")
    private Reserva reserva;

    public int getIdNotificacionReserva() {
        return idNotificacionReserva;
    }

    public void setIdNotificacionReserva(int idNotificacionReserva) {
        this.idNotificacionReserva = idNotificacionReserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
