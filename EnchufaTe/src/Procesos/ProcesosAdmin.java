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
    
    public static Login LeerDatosLogin(IngresoAdministrador iad){
        Login log=new Login();
        log.setUsuario_login(iad.txtUsuarioAdm.getText());
        log.setContraseña_login(iad.txtContraseñaAdm.getText());
        return log;
    }
    public static Login BorrarDatosEscritos(IngresoAdministrador iad) {
    Login log = new Login();
    log.setUsuario_login(iad.txtUsuarioAdm.getText());
    log.setContraseña_login(iad.txtContraseñaAdm.getText());

    // Borrar lo que estaba escrito antes
    iad.txtUsuarioAdm.setText("");
    iad.txtContraseñaAdm.setText("");

    return log;
}
    public static Empleados LeerDatosEmpleado(ADM_RegistrarEmpleado rem){
       Empleados em= new Empleados();
       em.setCodlocal(Integer.parseInt(rem.txtcodlocal.getText()));
       em.setCodarea(Integer.parseInt(rem.txtcodarea.getText()));
       em.setNombre_emp(rem.txtnombreempleado.getText());
       em.setApellido_emp(rem.txtapempleado.getText());
       em.setFechanacimiento_emp(rem.txtfechaempleado.getText());
       em.setDni_emp(rem.txtdniempleado.getText());
       em.setSexo_emp(rem.cbxsexoempleado.getSelectedItem().toString());
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
       em.setSexo_emp(raem.cbxsexoempleado.getSelectedItem().toString());
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
    public static Locales LeerDatosLocal(ADM_RegistrarLocal rl){
       Locales loc= new Locales();
       loc.setDireccionlocal(rl.txtdireccionlocal.getText());
       loc.setNombrelocal(rl.txtnombrelocal.getText());
       loc.setTelefonolocal(rl.txtelefonolocal.getText());
       return loc;
  }
    public static Locales ActualizarDatosLocal(ADM_ActualizarLocal acloc){
       Locales loc= new Locales();
       loc.setDireccionlocal(acloc.txtdireccionlocal.getText());
       loc.setNombrelocal(acloc.txtnombrelocal.getText());
       loc.setTelefonolocal(acloc.txtelefonolocal.getText());
       return loc;
  }
    public static Productos LeerDatosProducto(ADM_RegistrarProducto rep){
       Productos prod= new Productos();
       prod.setCodCategoria(Integer.parseInt(rep.txtcodcategoria.getText()));
       prod.setCodProveedor(Integer.parseInt(rep.txtcodprov.getText()));
       prod.setPrecioprod(Double.parseDouble(rep.txtprecioprod.getText()));
       prod.setNombreprod(rep.txtnombreprod.getText());
       prod.setFechavencimientoprod(rep.txtfechavencimientoprod.getText());
       return prod;
  }
    public static Productos ActualizarDatosProducto(ADM_ActualizarProducto acprod){
       Productos prod= new Productos();
       prod.setCodCategoria(Integer.parseInt(acprod.txtcodcategoria.getText()));
       prod.setCodProveedor(Integer.parseInt(acprod.txtcodprov.getText()));
       prod.setPrecioprod(Double.parseDouble(acprod.txtprecioprod.getText()));
       prod.setNombreprod(acprod.txtnombreprod.getText());
       prod.setFechavencimientoprod(acprod.txtfechavencimientoprod.getText());
       return prod;
  }
    public static Proveedor LeerDatosProveedor(ADM_RegistrarProveedor repv){
       Proveedor prov= new Proveedor();
       prov.setNombreprov(repv.txtnombreprov.getText());
       prov.setContactoprov(repv.txtcontactoprov.getText());
       prov.setPaisprov(repv.txtpaisprov.getText());
       return prov;
  }
    public static Proveedor ActualizarDatosProveedor(ADM_ActualizarProveedor acprov){
       Proveedor prov= new Proveedor();
       prov.setNombreprov(acprov.txtnombreprov.getText());
       prov.setContactoprov(acprov.txtcontactoprov.getText());
       prov.setPaisprov(acprov.txtpaisprov.getText());
       return prov;
  }
    public static Clientes LeerDatosClientes(ADM_RegistrarCliente rec){
       Clientes cli= new Clientes();
       cli.setNombre_cli(rec.txtnombrecliente.getText());
       cli.setApe_cli(rec.txtapecliente.getText());
       cli.setFechanacimiento_cli(rec.txtfechacliente.getText());
       cli.setDni_cli(rec.txtdnicliente.getText());
       cli.setCelular_cli(rec.txtcelularcliente.getText());
       cli.setSexo_cli(rec.cbxsexocliente.getSelectedItem().toString());
       return cli;
  }
    public static Clientes ActualizarDatosClientes (ADM_ActualizarCliente acli){
       Clientes cli= new Clientes();
       cli.setNombre_cli(acli.txtnombrecliente.getText());
       cli.setApe_cli(acli.txtapecliente.getText());
       cli.setFechanacimiento_cli(acli.txtfechacliente.getText());
       cli.setDni_cli(acli.txtdnicliente.getText());
       cli.setCelular_cli(acli.txtcelularcliente.getText());
       cli.setSexo_cli(acli.cbxsexocliente.getSelectedItem().toString());
       return cli;
  }
    public static Compra LeerDatosCompra(ADM_RegistrarCompra rgc){
       Compra com= new Compra();
       com.setCodcliente(Integer.parseInt(rgc.txtcodcliente.getText()));
       com.setCodempleado(Integer.parseInt(rgc.txtcodempleado.getText()));
       com.setFechacompra(rgc.txtfechacompra.getText());
       com.setHoracompra(rgc.txthoracompra.getText());
       com.setCodproducto(Integer.parseInt(rgc.txtcodproducto.getText()));
       com.setTipopagocompra(rgc.txttipopago.getText());
       com.setCantidadcompra(Integer.parseInt(rgc.txtcantidadcompra.getText()));
       return com;
  }
    public static Compra ActualizarDatosCompra (ADM_ActualizarCompra acom){
       Compra com= new Compra();
       com.setCodcliente(Integer.parseInt(acom.txtcodcliente.getText()));
       com.setCodempleado(Integer.parseInt(acom.txtcodempleado.getText()));
       com.setFechacompra(acom.txtfechacompra.getText());
       com.setHoracompra(acom.txthoracompra.getText());
       com.setCodproducto(Integer.parseInt(acom.txtcodproducto.getText()));
       com.setTipopagocompra(acom.txttipopago.getText());
       com.setCantidadcompra(Integer.parseInt(acom.txtcantidadcompra.getText()));
       return com;
  }
    public static Reserva LeerDatosReserva(ADM_RegistrarReserva rgr){
       Reserva res= new Reserva();
       res.setCodcliente(Integer.parseInt(rgr.txtcodcliente.getText()));
       res.setCodempleado(Integer.parseInt(rgr.txtcodempleado.getText()));
       res.setFechareserva(rgr.txtfechareserva.getText());
       res.setHorareserva(rgr.txthorareserva.getText());
       res.setCodservicio(Integer.parseInt(rgr.txtcodservicio.getText()));
       res.setTipopagoreserva(rgr.txttipopagoreserva.getText());
       res.setCantidadreserva(Integer.parseInt(rgr.txtcantidadreserva.getText()));
       return res;
  }
    public static Reserva ActualizarDatosReserva(ADM_ActualizarReserva acre){
       Reserva res= new Reserva();
       res.setCodcliente(Integer.parseInt(acre.txtcodcliente.getText()));
       res.setCodempleado(Integer.parseInt(acre.txtcodempleado.getText()));
       res.setFechareserva(acre.txtfechareserva.getText());
       res.setHorareserva(acre.txthorareserva.getText());
       res.setCodservicio(Integer.parseInt(acre.txtcodservicio.getText()));
       res.setTipopagoreserva(acre.txttipopagoreserva.getText());
       res.setCantidadreserva(Integer.parseInt(acre.txtcantidadreserva.getText()));
       return res;
  }
    
}
