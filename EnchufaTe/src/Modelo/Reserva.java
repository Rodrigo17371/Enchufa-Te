/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Reserva {
    int codreserva;
    int codcliente;
    int codempleado;
    String fechareserva;
    String horareserva;
    int codservicio;
    String tipopagoreserva;
    int cantidadreserva;
    //Getter and Setter

    public int getCantidadreserva() {
        return cantidadreserva;
    }

    public void setCantidadreserva(int cantidadreserva) {
        this.cantidadreserva = cantidadreserva;
    }

    public int getCodreserva() {
        return codreserva;
    }

    public void setCodreserva(int codreserva) {
        this.codreserva = codreserva;
    }

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    public int getCodempleado() {
        return codempleado;
    }

    public void setCodempleado(int codempleado) {
        this.codempleado = codempleado;
    }

    public String getFechareserva() {
        return fechareserva;
    }

    public void setFechareserva(String fechareserva) {
        this.fechareserva = fechareserva;
    }

    public String getHorareserva() {
        return horareserva;
    }

    public void setHorareserva(String horareserva) {
        this.horareserva = horareserva;
    }

    public int getCodservicio() {
        return codservicio;
    }

    public void setCodservicio(int codservicio) {
        this.codservicio = codservicio;
    }

    public String getTipopagoreserva() {
        return tipopagoreserva;
    }

    public void setTipopagoreserva(String tipopagoreserva) {
        this.tipopagoreserva = tipopagoreserva;
    }
    
}
