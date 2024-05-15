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
    
    public static Empleados LeerDatosEmpleado(ADM_RegistrarEmpleado rem){
       Empleados em= new Empleados();
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
    public static Empleados ActualizarDatosEmpleado(ADM_ActualizarEmpleado raem){
       Empleados em= new Empleados();
       em.setCodlocal(Integer.parseInt(raem.txtcodlocal.getText()));
       em.setCodarea(Integer.parseInt(raem.txtcodarea.getText()));
       em.setNombre_emp(raem.txtnombreempleado.getText());
       em.setApellido_emp(raem.txtapempleado.getText());
       em.setFechanacimiento_emp(raem.txtfechaempleado.getText());
       em.setDni_emp(raem.txtdniempleado.getText());
       em.setSexo_emp(raem.txtsexoempleado.getText());
       em.setCelular_emp(raem.txtcelularempleado.getText());
       em.setCorreo_emp(raem.txtcorreoempleado.getText());
       em.setSalario_emp(Double.parseDouble(raem.txtsalarioempleado.getText()));
       return em;
  }
    public static Area LeerDatosArea(ADM_RegistrarArea ram){
       Area ar= new Area();
       ar.setDescripcionarea(ram.txtdescripcionarea.getText());
       return ar;
  }
    public static Area ActualizarDatosArea(ADM_ActualizarArea acarea){
       Area ar= new Area();
       ar.setDescripcionarea(acarea.txtdescripcionarea.getText());
       return ar;
  }
}
