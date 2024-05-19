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
public class CRUD_Login extends ConectarBD{
    public boolean verificarCuentaAdmin(Login log) {
        try {
            ps = conexion.prepareStatement("SELECT * FROM Login WHERE Usuario = ? AND Clave = ?");
            ps.setString(1, log.getUsuario_login());
            ps.setString(2, log.getContraseña_login());

            try (ResultSet resultSet = ps.executeQuery()) {
                // Cambiar la condición para verificar si hay al menos una fila en el resultado
                return resultSet.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
