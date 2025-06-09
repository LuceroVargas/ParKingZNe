package pe.edu.upc.parkingzne.dtos;


import jakarta.validation.constraints.NotNull;
import pe.edu.upc.parkingzne.entities.Usuario;

public class EmpresaDTO {

    private int idEmpresa;
    @NotNull(message = "El nombre de la empresa debe ser obligatorio")
    private String nombreEmpresa;
    @NotNull(message = "La dirección de la empresa debe ser obligatorio")
    private String direccionEmpresa;
    private String tipoEmpresa;
    @NotNull(message = "El id del usuario es obligatorio")
    private Usuario us;

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }
}
