/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import javax.swing.JOptionPane;
public class ConectarBD implements Parametros{
    public Connection conexion;
    public Statement st;
    public ResultSet rs;
    public PreparedStatement ps;
    public ConectarBD(){ //constructor
        try{
            Class.forName(DRIVER);
            conexion =  
                  DriverManager.getConnection(RUTA,USUARIO,CLAVE);
            st = conexion.createStatement();            
        }catch(Exception ex){
           JOptionPane.showMessageDialog(null,
                   "ERROR: no se puede conectar a la BD..."+ex);
        }        
    }
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(RUTA, USUARIO, CLAVE);
    }
    public static void cerrarConexion(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void cerrarStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void cerrarResultSet(ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
