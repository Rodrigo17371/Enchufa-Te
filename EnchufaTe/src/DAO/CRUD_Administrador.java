package DAO;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import Modelo.*;
import Formatos.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class CRUD_Administrador extends ConectarBD {

    public void MostrarTablaEmpleados(JTable tabla) {
        String titulos[] = {"CodEmpleado", "CodLocal", "CodArea", "Nombre", "Apellidos","FechaNacimiento","DNI","Sexo","Celular","Correo","Salario"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        //recuperar los datos
        String consulta = "select * from empleado;";
        try {
            rs = st.executeQuery(consulta);
            int num = 0;
            while (rs.next()) {
                num++;
                Object[] row = new Object[11];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getDate(6);
                row[6] = rs.getInt(7);
                row[7] = rs.getString(8);
                row[8] = rs.getInt(9);
                row[9] = rs.getInt(10);
                row[10] = rs.getDouble(11);
                modelo.addRow(row);
            }//fin del while
            //etiqueta.setText("Cantidad de registros : "+num);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "ERROR no se puede recuperar consulta" + ex);
        }
    }
}
