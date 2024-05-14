/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos;
import Modelo.*;
import Vista.*;
/**
 *
 * @author Prueba
 */
public class ProcesosAdmin {
    
    public static Empleados LeerDatosEmpleado(RegistrarEmpleado rem){
       Empleados em= new Empleados();
       em.setCoddempleado(Integer.parseInt(rem.txtcodempleado.getText()));
       em.setCodlocal(Integer.parseInt(rem.txtcodlocal.getText()));
       em.setCodarea(Integer.parseInt(rem.txtcodarea.getText()));
       em.setNombre_emp(rem.txtnombreempleado.getText());
       em.setApellido_emp(rem.txtapempleado.getText());
       em.setFechanacimiento_emp(rem.txtfechaempleado.getText());
       em.setDni_emp(rem.txtdniempleado.getText());
       em.setSexo_emp(rem.txtsexoempleado.getText());
       em.setCelular_emp(rem.txtcelularempleado.getText());
       em.setCorreo_emp(rem.txtcorreoempleado.getText());
       em.setSalario_emp(Double.parseDouble(rem.txtsalarioempleado.getText()));
       return em;
  }
}
