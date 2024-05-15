  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Productos {
    int CodProducto;
    int CodCategoria;
    int CodProveedor;
    double Precioprod;
    String Nombreprod;
    String Fechavencimientoprod;
    //Getter and Setter

    public int getCodProducto() {
        return CodProducto;
    }

    public void setCodProducto(int CodProducto) {
        this.CodProducto = CodProducto;
    }

    public int getCodCategoria() {
        return CodCategoria;
    }

    public void setCodCategoria(int CodCategoria) {
        this.CodCategoria = CodCategoria;
    }

    public int getCodProveedor() {
        return CodProveedor;
    }

    public void setCodProveedor(int CodProveedor) {
        this.CodProveedor = CodProveedor;
    }

    public double getPrecioprod() {
        return Precioprod;
    }

    public void setPrecioprod(double Precioprod) {
        this.Precioprod = Precioprod;
    }

    public String getNombreprod() {
        return Nombreprod;
    }

    public void setNombreprod(String Nombreprod) {
        this.Nombreprod = Nombreprod;
    }

    public String getFechavencimientoprod() {
        return Fechavencimientoprod;
    }

    public void setFechavencimientoprod(String Fechavencimientoprod) {
        this.Fechavencimientoprod = Fechavencimientoprod;
    }
    
}

