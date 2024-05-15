/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import Modelo.*;
import Formatos.*;
import java.sql.*;

public class CRUD_Clientes extends ConectarBD {

    public void MostrarTablaClientes(JTable tabla) {
        String titulos[] = {"CodCliente", "Nombre", "Apellidos", "FechaNacimiento", "DNI", "Celular", "Sexo"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        //recuperar los datos
        String consulta = "select * from cliente;";
        try {
            rs = st.executeQuery(consulta);
            int num = 0;
            while (rs.next()) {
                num++;
                Object[] row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                modelo.addRow(row);
            }//fin del while
            //etiqueta.setText("Cantidad de registros : "+num);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "ERROR no se puede recuperar consulta" + ex);
        }
    }
    
    public void MostrarTablaCompras(JTable tabla) {
        String titulos[] = {"CodCompra", "CodCliente", "CodEmpleado", "Fecha", "Hora", "CodProducto", "TipoPago", "Cantidad"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        //recuperar los datos
        String consulta = "SELECT c.CodCompra, c.CodCliente, c.CodEmpleado, c.Fecha, c.Hora,\n"
                + "       d.CodProducto, d.TipoPago, d.Cantidad\n"
                + "FROM Compra c\n"
                + "JOIN DetalleCompra d ON c.CodCompra = d.CodCompra;";
        try {
            rs = st.executeQuery(consulta);
            int num = 0;
            while (rs.next()) {
                num++;
                Object[] row = new Object[8];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getDate(4);
                row[4] = rs.getTime(5);
                row[5] = rs.getInt(6);
                row[6] = rs.getString(7);
                row[7] = rs.getInt(8);
                modelo.addRow(row);
            }//fin del while
            //etiqueta.setText("Cantidad de registros : "+num);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "ERROR no se puede recuperar consulta" + ex);
        }
    }

    public void MostrarTablaReservas(JTable tabla) {
        String titulos[] = {"CodReserva", "CodCliente", "CodEmpleado", "Fecha", "Hora","CodServicio ", "TipoPago","Cantidad"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        //recuperar los datos
        String consulta = "SELECT r.CodReserva, r.CodCliente, r.CodEmpleado, r.Fecha, r.Hora,\n"
                + "       dr.CodServicio, dr.TipoPago, dr.Cantidad\n"
                + "FROM Reserva r\n"
                + "JOIN DetalleReserva dr ON r.CodReserva = dr.CodReserva;";
        try {
            rs = st.executeQuery(consulta);
            int num = 0;
            while (rs.next()) {
                num++;
                Object[] row = new Object[8];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getDate(4);
                row[4] = rs.getTime(5);
                row[5] = rs.getInt(6);
                row[6] = rs.getString(7);
                row[7] = rs.getInt(8);
                modelo.addRow(row);
            }//fin del while
            //etiqueta.setText("Cantidad de registros : "+num);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "ERROR no se puede recuperar consulta" + ex);
        }
    }
}
