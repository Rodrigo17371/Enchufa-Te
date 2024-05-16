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
    public void RegistrarClientes(Clientes cli) {
        try {
            ps = conexion.prepareStatement("INSERT INTO cliente (Nombre, Apellidos, FechaNacimiento, DNI, Celular, Sexo) VALUES (?,?,?,?,?,?);");
            ps.setString(1, cli.getNombre_cli());
            ps.setString(2, cli.getApe_cli());
            ps.setString(3, cli.getFechanacimiento_cli());
            ps.setString(4, cli.getDni_cli());
            ps.setString(5, cli.getCelular_cli());
            ps.setString(6, cli.getSexo_cli());
            ps.executeUpdate();
            Mensajes.M1("Datos del cliente insertados correctamente!");
            conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede insertar." + ex);
        }
    }
    public Clientes BuscarCliente(int ID_cliente) {
        Clientes cli = null;
        try {
            rs = st.executeQuery("SELECT Nombre, Apellidos, FechaNacimiento, DNI, Celular, Sexo FROM cliente WHERE CodCliente =" + ID_cliente + ";");
            if (rs.next()) {
                cli = new Clientes();
                cli.setNombre_cli(rs.getString(1));
                cli.setApe_cli(rs.getString(2));
                cli.setFechanacimiento_cli(rs.getString(3));
                cli.setDni_cli(rs.getString(4));
                cli.setCelular_cli(rs.getString(5));
                cli.setSexo_cli(rs.getString(6));
            }
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede consultar el registro.." + ex);
        }
        return cli;
    }
    public void ActualizarCliente(Clientes cli, int ID_cliente) {
        try {
            conexion.setAutoCommit(false); // Iniciar transacción

            // Actualizar los datos principales del empleado
            ps = conexion.prepareStatement("UPDATE cliente SET Nombre=?, Apellidos=?, FechaNacimiento=?, DNI=?, Celular=?, Sexo=? WHERE CodCliente=?;");
            ps.setString(1, cli.getNombre_cli());
            ps.setString(2, cli.getApe_cli());
            ps.setString(3, cli.getFechanacimiento_cli());
            ps.setString(4, cli.getDni_cli());
            ps.setString(5, cli.getCelular_cli());
            ps.setString(6, cli.getSexo_cli());
            ps.setInt(7, ID_cliente);
            ps.executeUpdate();
            conexion.commit(); // Confirmar transacción
            Mensajes.M1("Datos del cliente actualizados correctamente!");
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
    public void RegistrarCompra(Compra com) {
        try {
            int codcompra;

                // Si el proveedor no existe, inserta un nuevo registro en la tabla de proveedores
                ps = conexion.prepareStatement("INSERT INTO Compra (CodCliente,CodEmpleado,Fecha,Hora) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, com.getCodcliente());
                ps.setInt(2, com.getCodempleado());
                ps.setString(3, com.getFechacompra());
                ps.setString(4, com.getHoracompra());
                ps.executeUpdate();
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    codcompra = generatedKeys.getInt(1);
                } else {
                    throw new SQLException("Fallo al obtener ID de la compra.");
                }

            // Insertar en la tabla DESCRIPCION_PROVEEDORES
            ps = conexion.prepareStatement("INSERT INTO detallecompra  (CodCompra, CodProducto, TipoPago, Cantidad) VALUES (?,?,?,?)");
            ps.setInt(1, codcompra);
            ps.setInt(2, com.getCodproducto());
            ps.setString(3, com.getTipopagocompra());
            ps.setInt(4, com.getCantidadcompra());
            ps.executeUpdate();
            Mensajes.M1("Datos de la compra insertados correctamente!");
            conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede insertar." + ex);
        }
    }
    public Compra BuscarCompra(int ID_compra) {
        Compra com = null;
        try {
            rs = st.executeQuery("SELECT c.CodCliente, c.CodEmpleado, c.Fecha, c.Hora, d.CodProducto, d.TipoPago, d.Cantidad "
                    + "FROM Compra c JOIN DetalleCompra d ON c.CodCompra = d.CodCompra WHERE c.CodCompra =" + ID_compra + ";");
            if (rs.next()) {
                com = new Compra();
                com.setCodcliente(rs.getInt(1));
                com.setCodempleado(rs.getInt(2));
                com.setFechacompra(rs.getString(3));
                com.setHoracompra(rs.getString(4));
                com.setCodproducto(rs.getInt(5));
                com.setTipopagocompra(rs.getString(6));
                com.setCantidadcompra(rs.getInt(7));
            }
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede consultar el registro.." + ex);
        }
        return com;
    }
    public void ActualizarCompra(Compra com, int ID_compra) {
        try {
            conexion.setAutoCommit(false); // Iniciar transacción

            // Actualizar los datos principales del empleado
            ps = conexion.prepareStatement("UPDATE Compra SET CodCliente = ?, CodEmpleado = ?, Fecha = ?, Hora = ? WHERE CodCompra = ?;");
            ps.setInt(1, com.getCodcliente());
            ps.setInt(2, com.getCodempleado());
            ps.setString(3, com.getFechacompra());
            ps.setString(4, com.getHoracompra());
            ps.setInt(5, ID_compra);
            ps.executeUpdate();
            
            ps = conexion.prepareStatement("UPDATE DetalleCompra SET CodProducto = ?, TipoPago = ?, Cantidad = ? WHERE CodCompra = ?");
            ps.setInt(1, com.getCodproducto());
            ps.setString(2, com.getTipopagocompra());
            ps.setInt(3, com.getCantidadcompra());
            ps.setInt(4, ID_compra);
            ps.executeUpdate();
            conexion.commit(); // Confirmar transacción
            Mensajes.M1("Datos de la compra actualizados correctamente!");
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
