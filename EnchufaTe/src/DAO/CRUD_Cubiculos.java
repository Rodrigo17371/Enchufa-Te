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
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class CRUD_Cubiculos extends ConectarBD{
    public void MostrarTablaCubiculos(JTable tabla) {
        String titulos[] = {"CodCubiculo", "Nivel", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        //recuperar los datos
        String consulta = "select * from cubiculo;";
        try {
            rs = st.executeQuery(consulta);
            int num = 0;
            while (rs.next()) {
                num++;
                Object[] row = new Object[3];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getString(3);
                modelo.addRow(row);
            }//fin del while
            //etiqueta.setText("Cantidad de registros : "+num);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "ERROR no se puede recuperar consulta" + ex);
        }
    }
    public void RegistrarCubiculo(Cubiculo cu) {
        try {
            ps = conexion.prepareStatement("INSERT INTO cubiculo (Nivel, Estado) VALUES (?,?);");
            ps.setInt(1, cu.getNivel());
            ps.setString(2, cu.getEstado());
            ps.executeUpdate();
            Mensajes.M1("Datos del cubiculo insertados correctamente!");
            conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede insertar." + ex);
        }
    }
    public Cubiculo BuscarCubiculo(int ID_Cubiculo) {
        Cubiculo cu = null;
        try {
            rs = st.executeQuery("SELECT Nivel, Estado FROM cubiculo WHERE CodCubiculo =" + ID_Cubiculo + ";");
            if (rs.next()) {
                cu = new Cubiculo();
                cu.setNivel(rs.getInt(1));
                cu.setEstado(rs.getString(2));
            }
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede consultar el registro.." + ex);
        }
        return cu;
    }
    public void ActualizarCubiculo(Cubiculo cu, int ID_Cubiculo) {
        try {
            conexion.setAutoCommit(false); // Iniciar transacción

            // Actualizar los datos principales del empleado
            ps = conexion.prepareStatement("UPDATE cubiculo SET Nivel=?, Estado=? WHERE CodCubiculo=?;");
            ps.setInt(1, cu.getNivel());
            ps.setString(2, cu.getEstado());
            ps.setInt(3, ID_Cubiculo);
            ps.executeUpdate();
            conexion.commit(); // Confirmar transacción
            Mensajes.M1("Datos del cubiculo actualizados correctamente!");
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
