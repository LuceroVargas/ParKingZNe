package pe.edu.upc.parkingzne.dtos;

public class TotalReservasNotificadasDTO {
    private String tipos_reserva;
    private int cantidad;

    public String getTipos_reserva() {
        return tipos_reserva;
    }

    public void setTipos_reserva(String tipos_reserva) {
        this.tipos_reserva = tipos_reserva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
