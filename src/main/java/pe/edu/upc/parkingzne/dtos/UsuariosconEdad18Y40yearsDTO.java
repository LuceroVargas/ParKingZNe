package pe.edu.upc.parkingzne.dtos;

import java.time.LocalDate;

public class UsuariosconEdad18Y40yearsDTO {
    private int IDUser;
    private String username;
    private LocalDate fecha;
    private String correo;

    public int getIDUser() {
        return IDUser;
    }

    public void setIDUser(int IDUser) {
        this.IDUser = IDUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
