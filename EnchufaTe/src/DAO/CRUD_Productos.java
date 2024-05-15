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

public class CRUD_Productos extends ConectarBD {

    public void MostrarTablaProductos(JTable tabla) {
        String titulos[] = {"CodProducto", "CodCategoria", "CodProveedor", "Nombre_Categoria", "Precio", "Nombre_Producto", "FechaVencimiento"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        //recuperar los datos
        String consulta = "SELECT p.CodProducto, c.CodCategoria, p.CodProveedor, c.Nombre AS Nombre_Categoria, p.Precio, p.Nombre AS Nombre_Producto, p.FechaVencimiento \n"
                + "FROM Producto p \n"
                + "JOIN Categoria c ON p.CodCategoria = c.CodCategoria;";
        try {
            rs = st.executeQuery(consulta);
            int num = 0;
            while (rs.next()) {
                num++;
                Object[] row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getString(4);
                row[4] = rs.getDouble(5);
                row[5] = rs.getString(6);
                row[6] = rs.getDate(7);
                modelo.addRow(row);
            }//fin del while
            //etiqueta.setText("Cantidad de registros : "+num);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "ERROR no se puede recuperar consulta" + ex);
        }
    }

    public void MostrarTablaProveedor(JTable tabla) {
        String titulos[] = {"CodProveedor", "Nombre", "Contacto", "Pais"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        //recuperar los datos
        String consulta = "select * from Proveedor;";
        try {
            rs = st.executeQuery(consulta);
            int num = 0;
            while (rs.next()) {
                num++;
                Object[] row = new Object[4];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                modelo.addRow(row);
            }//fin del while
            //etiqueta.setText("Cantidad de registros : "+num);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "ERROR no se puede recuperar consulta" + ex);
        }
    }
    public void RegistrarProductos(Productos prod) {
        try {
            ps = conexion.prepareStatement("INSERT INTO producto (CodCategoria, CodProveedor, Precio, Nombre, FechaVencimiento) VALUES (?,?,?,?,?);");
            ps.setInt(1, prod.getCodCategoria());
            ps.setInt(2, prod.getCodProveedor());
            ps.setDouble(3, prod.getPrecioprod());
            ps.setString(4, prod.getNombreprod());
            ps.setString(5, prod.getFechavencimientoprod());
            ps.executeUpdate();
            Mensajes.M1("Datos del producto insertados correctamente!");
            conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede insertar." + ex);
        }
    }
    public Productos BuscarProducto(int ID_prod) {
        Productos prod = null;
        try {
            rs = st.executeQuery("SELECT CodCategoria, CodProveedor, Precio, Nombre, FechaVencimiento FROM producto WHERE CodProducto =" + ID_prod + ";");
            if (rs.next()) {
                prod = new Productos();
                prod.setCodCategoria(rs.getInt(1));
                prod.setCodProveedor(rs.getInt(2));
                prod.setPrecioprod(rs.getDouble(3));
                prod.setNombreprod(rs.getString(4));
                prod.setFechavencimientoprod(rs.getString(5));
            }
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede consultar el registro.." + ex);
        }
        return prod;
    }
    public void ActualizarProducto(Productos prod, int ID_prod) {
        try {
            conexion.setAutoCommit(false); // Iniciar transacción

            // Actualizar los datos principales del empleado
            ps = conexion.prepareStatement("UPDATE producto SET CodCategoria=?, CodProveedor=?, Precio=?, Nombre=?, FechaVencimiento=? WHERE CodProducto=?;");
            ps.setInt(1, prod.getCodCategoria());
            ps.setInt(2, prod.getCodProveedor());
            ps.setDouble(3, prod.getPrecioprod());
            ps.setString(4, prod.getNombreprod());
            ps.setString(5, prod.getFechavencimientoprod());
            ps.setInt(6, ID_prod);
            ps.executeUpdate();
            conexion.commit(); // Confirmar transacción
            Mensajes.M1("Datos del producto actualizados correctamente!");
        } catch (Exception ex) {
            try {
                conexion.rollback(); // Deshacer transacción en caso de error
            } catch (SQLException e) {
                e.printStackTrace();
            }
            Mensajes.M1("ERROR no se puede actualizar el registro.." + ex);
        } finally {
            try {
                conexion.setAutoCommit(true); // Restaurar el modo de autocommit
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void RegistrarProveedor(Proveedor prov) {
        try {
            ps = conexion.prepareStatement("INSERT INTO proveedor (Nombre, Contacto, Pais) VALUES (?,?,?);");
            ps.setString(1, prov.getNombreprov());
            ps.setString(2, prov.getContactoprov());
            ps.setString(3, prov.getPaisprov());
            ps.executeUpdate();
            Mensajes.M1("Datos del proveedor insertados correctamente!");
            conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede insertar." + ex);
        }
    }
    public Proveedor BuscarProveedor(int ID_prov) {
        Proveedor prov = null;
        try {
            rs = st.executeQuery("SELECT Nombre, Contacto, Pais FROM proveedor WHERE CodProveedor =" + ID_prov + ";");
            if (rs.next()) {
                prov = new Proveedor();
                prov.setNombreprov(rs.getString(1));
                prov.setContactoprov(rs.getString(2));
                prov.setPaisprov(rs.getString(3));
            }
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede consultar el registro.." + ex);
        }
        return prov;
    }
    public void ActualizarProveedor(Proveedor prov, int ID_prov) {
        try {
            conexion.setAutoCommit(false); // Iniciar transacción

            // Actualizar los datos principales del empleado
            ps = conexion.prepareStatement("UPDATE proveedor SET Nombre=?,Contacto=?,Pais=? WHERE CodProveedor=?;");
            ps.setString(1, prov.getNombreprov());
            ps.setString(2, prov.getContactoprov());
            ps.setString(3, prov.getPaisprov());
            ps.setInt(4, ID_prov);
            ps.executeUpdate();
            conexion.commit(); // Confirmar transacción
            Mensajes.M1("Datos del proveedor actualizados correctamente!");
        } catch (Exception ex) {
            try {
                conexion.rollback(); // Deshacer transacción en caso de error
            } catch (SQLException e) {
                e.printStackTrace();
            }
            Mensajes.M1("ERROR no se puede actualizar el registro.." + ex);
        } finally {
            try {
                conexion.setAutoCommit(true); // Restaurar el modo de autocommit
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
