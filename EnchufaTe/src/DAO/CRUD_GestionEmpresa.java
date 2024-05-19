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

public class CRUD_GestionEmpresa extends ConectarBD {

    public void MostrarTablaEmpleados(JTable tabla) {
        String titulos[] = {"CodEmpleado", "CodLocal", "CodArea", "Nombre", "Apellidos", "FechaNacimiento", "DNI", "Sexo", "Celular", "Correo", "Salario"};
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
                row[9] = rs.getString(10);
                row[10] = rs.getDouble(11);
                modelo.addRow(row);
            }//fin del while
            //etiqueta.setText("Cantidad de registros : "+num);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "ERROR no se puede recuperar consulta" + ex);
        }
    }

    public void MostrarTablaArea(JTable tabla) {
        String titulos[] = {"CodArea", "Descripcion"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        //recuperar los datos
        String consulta = "select * from area;";
        try {
            rs = st.executeQuery(consulta);
            int num = 0;
            while (rs.next()) {
                num++;
                Object[] row = new Object[2];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                modelo.addRow(row);
            }//fin del while
            //etiqueta.setText("Cantidad de registros : "+num);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "ERROR no se puede recuperar consulta" + ex);
        }
    }

    public void MostrarTablaLocales(JTable tabla) {
        String titulos[] = {"CodLocal", "Direccion", "Nombre", "Telefono"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        //recuperar los datos
        String consulta = "select * from locales;";
        try {
            rs = st.executeQuery(consulta);
            int num = 0;
            while (rs.next()) {
                num++;
                Object[] row = new Object[4];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getInt(4);
                modelo.addRow(row);
            }//fin del while
            //etiqueta.setText("Cantidad de registros : "+num);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "ERROR no se puede recuperar consulta" + ex);
        }
    }
    public void RegistrarEmpleado(Empleados em) {
        try {
            ps = conexion.prepareStatement("INSERT INTO Empleado (CodLocal, CodArea, Nombre, Apellidos, FechaNacimiento, DNI, Sexo, Celular, Correo, Salario) VALUES (?,?,?,?,?,?,?,?,?,?);");
            ps.setInt(1, em.getCodlocal());
            ps.setInt(2, em.getCodarea());
            ps.setString(3, em.getNombre_emp());
            ps.setString(4, em.getApellido_emp());
            ps.setString(5, em.getFechanacimiento_emp());
            ps.setString(6, em.getDni_emp());
            ps.setString(7, em.getSexo_emp());
            ps.setString(8, em.getCelular_emp());
            ps.setString(9, em.getCorreo_emp());
            ps.setDouble(10, em.getSalario_emp());
            ps.executeUpdate();
            Mensajes.M1("Datos del empleado insertados correctamente!");
            conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede insertar." + ex);
        }
    }
    public Empleados BuscarEmpleado(int ID_emp) {
        Empleados em = null;
        try {
            //rs = st.executeQuery("select * from empleados where IDEmpleado=" + ID_emp + ";");
            rs = st.executeQuery("SELECT CodLocal, CodArea, Nombre, Apellidos, FechaNacimiento, DNI, Sexo, Celular, Correo, Salario FROM Empleado WHERE CodEmpleado =" + ID_emp + ";");
            if (rs.next()) {
                em = new Empleados();
                em.setCodlocal(rs.getInt(1));
                em.setCodarea(rs.getInt(2));
                em.setNombre_emp(rs.getString(3));
                em.setApellido_emp(rs.getString(4));
                em.setFechanacimiento_emp(rs.getString(5));
                em.setDni_emp(rs.getString(6));
                em.setSexo_emp(rs.getString(7));
                em.setCelular_emp(rs.getString(8));
                em.setCorreo_emp(rs.getString(9));
                em.setSalario_emp(rs.getDouble(10));
            }
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede consultar el registro.." + ex);
        }
        return em;
    }
    public void ActualizarEmpleado(Empleados em, int ID_emp) {
        try {
            conexion.setAutoCommit(false); // Iniciar transacción

            // Actualizar los datos principales del empleado
            ps = conexion.prepareStatement("UPDATE Empleado SET CodLocal=?, CodArea=?, Nombre=?, Apellidos=?, FechaNacimiento=?, DNI=?, Sexo=?, Celular=?, Correo=?, Salario=? WHERE CodEmpleado=?;");
            ps.setInt(1, em.getCodlocal());
            ps.setInt(2, em.getCodarea());
            ps.setString(3, em.getNombre_emp());
            ps.setString(4, em.getApellido_emp());
            ps.setString(5, em.getFechanacimiento_emp());
            ps.setString(6, em.getDni_emp());
            ps.setString(7, em.getSexo_emp());
            ps.setString(8, em.getCelular_emp());
            ps.setString(9, em.getCorreo_emp());
            ps.setDouble(10, em.getSalario_emp());
            ps.setInt(11, ID_emp);
            ps.executeUpdate();
            conexion.commit(); // Confirmar transacción
            Mensajes.M1("Datos del empleado actualizados correctamente!");
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
    public void RegistrarArea(Area ar) {
        try {
            ps = conexion.prepareStatement("INSERT INTO area (Descripcion) VALUES (?);");
            ps.setString(1, ar.getDescripcionarea());
            ps.executeUpdate();
            Mensajes.M1("Datos del area insertados correctamente!");
            conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede insertar." + ex);
        }
    }
    public Area BuscarArea(int ID_Area) {
        Area ar = null;
        try {
            //rs = st.executeQuery("select * from empleados where IDEmpleado=" + ID_emp + ";");
            rs = st.executeQuery("SELECT Descripcion from area WHERE CodArea =" + ID_Area + ";");
            if (rs.next()) {
                ar = new Area();
                ar.setDescripcionarea(rs.getString(1));
            }
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede consultar el registro.." + ex);
        }
        return ar;
    }
    public void ActualizarArea(Area ar, int ID_Area) {
        try {
            conexion.setAutoCommit(false); // Iniciar transacción

            // Actualizar los datos principales del empleado
            ps = conexion.prepareStatement("UPDATE area SET Descripcion=? WHERE CodArea=?;");
            ps.setString(1, ar.getDescripcionarea());
            ps.setInt(2, ID_Area);
            ps.executeUpdate();
            conexion.commit(); // Confirmar transacción
            Mensajes.M1("Datos del area actualizados correctamente!");
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
    public void RegistrarLocal(Locales loc) {
        try {
            ps = conexion.prepareStatement("INSERT INTO locales (Direccion,Nombre,Telefono) VALUES (?,?,?);");
            ps.setString(1, loc.getDireccionlocal());
            ps.setString(2, loc.getNombrelocal());
            ps.setString(3, loc.getTelefonolocal());
            ps.executeUpdate();
            Mensajes.M1("Datos del local insertados correctamente!");
            conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede insertar." + ex);
        }
    }
    public Locales BuscarLocal(int ID_Local) {
        Locales loc = null;
        try {
            //rs = st.executeQuery("select * from empleados where IDEmpleado=" + ID_emp + ";");
            rs = st.executeQuery("SELECT Direccion,Nombre,Telefono from locales WHERE CodLocal =" + ID_Local + ";");
            if (rs.next()) {
                loc = new Locales();
                loc.setDireccionlocal(rs.getString(1));
                loc.setNombrelocal(rs.getString(2));
                loc.setTelefonolocal(rs.getString(3));
            }
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede consultar el registro.." + ex);
        }
        return loc;
    }
    public void ActualizarLocal(Locales loc, int ID_Local) {
        try {
            conexion.setAutoCommit(false); // Iniciar transacción

            // Actualizar los datos principales del empleado
            ps = conexion.prepareStatement("UPDATE locales SET Direccion=?,Nombre=?,Telefono=? WHERE CodLocal=?;");
            ps.setString(1, loc.getDireccionlocal());
            ps.setString(2, loc.getNombrelocal());
            ps.setString(3, loc.getTelefonolocal());
            ps.setInt(4, ID_Local);
            ps.executeUpdate();
            conexion.commit(); // Confirmar transacción
            Mensajes.M1("Datos del local actualizados correctamente!");
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
