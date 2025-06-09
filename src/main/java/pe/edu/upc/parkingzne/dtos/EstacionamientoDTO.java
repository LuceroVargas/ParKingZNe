package pe.edu.upc.parkingzne.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import pe.edu.upc.parkingzne.entities.Empresa;

public class EstacionamientoDTO {

    private int idEstacionamiento;
    @NotNull(message = "El nombre del estacionamiento debe ser obligatorio")
    private String nombreEstacionamiento;
    @NotNull(message = "La dirección del estacionamiento debe ser obligatorio")
    private String direccionEstacionamiento;
    @NotNull(message = "El tipo de estacionamiento debe ser obligatorio")
    private String tipoEstacionamiento;
    @Positive(message = "La tarifa debe ser mayor que 0")
    private double tarifaHoraEstacionamiento;
    @NotNull(message = "La capacidad del estacionamiento debe ser obligatorio")
    private String capacidadEstacionamiento;
    @NotNull(message = "El estado del estacionamiento debe ser obligatorio")
    private String estadoEstacionamiento;
    @NotNull(message = "La latitud del estacionamiento debe ser obligatorio")
    private double latitudEstacionamiento;
    @NotNull(message = "La longitud del estacionamiento debe ser obligatorio")
    private double longitudEstacionamiento;
    private Empresa empresa;

    public int getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public String getNombreEstacionamiento() {
        return nombreEstacionamiento;
    }

    public void setNombreEstacionamiento(String nombreEstacionamiento) {
        this.nombreEstacionamiento = nombreEstacionamiento;
    }

    public String getDireccionEstacionamiento() {
        return direccionEstacionamiento;
    }

    public void setDireccionEstacionamiento(String direccionEstacionamiento) {
        this.direccionEstacionamiento = direccionEstacionamiento;
    }

    public String getTipoEstacionamiento() {
        return tipoEstacionamiento;
    }

    public void setTipoEstacionamiento(String tipoEstacionamiento) {
        this.tipoEstacionamiento = tipoEstacionamiento;
    }

    public double getTarifaHoraEstacionamiento() {
        return tarifaHoraEstacionamiento;
    }

    public void setTarifaHoraEstacionamiento(double tarifaHoraEstacionamiento) {
        this.tarifaHoraEstacionamiento = tarifaHoraEstacionamiento;
    }

    public String getCapacidadEstacionamiento() {
        return capacidadEstacionamiento;
    }

    public void setCapacidadEstacionamiento(String capacidadEstacionamiento) {
        this.capacidadEstacionamiento = capacidadEstacionamiento;
    }

    public String getEstadoEstacionamiento() {
        return estadoEstacionamiento;
    }

    public void setEstadoEstacionamiento(String estadoEstacionamiento) {
        this.estadoEstacionamiento = estadoEstacionamiento;
    }

    public double getLatitudEstacionamiento() {
        return latitudEstacionamiento;
    }

    public void setLatitudEstacionamiento(double latitudEstacionamiento) {
        this.latitudEstacionamiento = latitudEstacionamiento;
    }

    public double getLongitudEstacionamiento() {
        return longitudEstacionamiento;
    }

    public void setLongitudEstacionamiento(double longitudEstacionamiento) {
        this.longitudEstacionamiento = longitudEstacionamiento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
