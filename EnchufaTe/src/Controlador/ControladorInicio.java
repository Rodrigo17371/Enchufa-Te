package Controlador;

import DAO.CRUD_GestionEmpresa;
import DAO.CRUD_Productos;
import DAO.CRUD_Clientes;
import Main.Principal;
import Procesos.ProcesosAdmin;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import Formatos.Mensajes;
public class ControladorInicio implements ActionListener {

    Inicio panel;
    Empleados em;
    Area ar;
    Locales loc;
    Productos prod;
    Proveedor prov;
    IngresoCliente ic;
    IngresoCajero icj;
    IngresoAdministrador iad;
    Cliente_ServiciosAdicionales csa;
    EscMetodosPago emtp;
    Cliente_Visa cv;
    Cliente_Plin cp;
    Cliente_Yape cy;
    Cliente_PagoEfectivo cpe;
    Cliente_Boleta cb;
    Cajero_Cubiculos ccb;
    InterfazAdmin ina;
    ADM_Cubiculos admc;
    ADM_GesEmpleado adme;
    ADM_Productos admp;
    ADM_Proovedor admpro;
    ADM_GesArea adga;
    ADM_GesLocal adgl;
    Cajero_CubiculoG cbg;
    Cajero_CubiculoV cbv;
    Cajero_CubiculoUV cbuv;
    CRUD_GestionEmpresa crudadm;
    CRUD_Productos crudprod;
    CRUD_Clientes crudcli;
    ADM_Clientes admcli;
    ADM_Compras admco;
    ADM_Reservas admr;
    ADM_RegistrarEmpleado rem;
    ADM_ActualizarEmpleado raem;
    ADM_RegistrarArea ram;
    ADM_ActualizarArea acarea;
    ADM_RegistrarLocal rl;
    ADM_ActualizarLocal acloc;
    ADM_RegistrarProducto rep;
    ADM_ActualizarProducto acprod;
    ADM_RegistrarProveedor repv;
    ADM_ActualizarProveedor acprov;
    int ID_emp;
    int ID_Area;
    int ID_Local;
    int ID_prod;
    int ID_prov;
    public ControladorInicio(Inicio panel, Cliente_ServiciosAdicionales csa, IngresoCliente ic, EscMetodosPago emtp, Cliente_Visa cv,
            Cliente_Plin cp, Cliente_Yape cy, Cliente_PagoEfectivo cpe, Cliente_Boleta cb, Cajero_Cubiculos ccb, IngresoCajero icj, IngresoAdministrador iad,
             InterfazAdmin ina, ADM_Cubiculos admc, ADM_GesEmpleado adme, ADM_Productos admp, Cajero_CubiculoG cbg, Cajero_CubiculoV cbv, Cajero_CubiculoUV cbuv,
             ADM_GesArea adga,ADM_GesLocal adgl,ADM_Proovedor admpro,ADM_Clientes admcli,ADM_Compras admco,ADM_Reservas admr,ADM_RegistrarEmpleado rem,ADM_ActualizarEmpleado raem,
             ADM_RegistrarArea ram,ADM_ActualizarArea acarea,ADM_RegistrarLocal rl,ADM_ActualizarLocal acloc,ADM_RegistrarProducto rep,ADM_ActualizarProducto acprod,
             ADM_RegistrarProveedor repv,ADM_ActualizarProveedor acprov) {
        this.panel = panel;
        this.ic = ic;
        this.csa = csa;
        this.emtp = emtp;
        this.cv = cv;
        this.cp = cp;
        this.cy = cy;
        this.cpe = cpe;
        this.cb = cb;
        this.ccb = ccb;
        this.icj = icj;
        this.iad = iad;
        this.ina = ina;
        this.admc = admc;
        this.adme = adme;
        this.admp = admp;
        this.cbg= cbg;
        this.cbv= cbv;
        this.cbuv=cbuv;
        this.adga=adga;
        this.adgl=adgl;
        this.admpro=admpro;
        this.admcli=admcli;
        this.admco=admco;
        this.admr=admr;
        this.rem=rem;
        this.raem=raem;
        this.ram=ram;
        this.acarea=acarea;
        this.rl=rl;
        this.acloc=acloc;
        this.rep=rep;
        this.acprod=acprod;
        this.repv=repv;
        this.acprov=acprov;
        panel.CLT_SVAD.addActionListener(this);
        panel.ADM_Cubiculos.addActionListener(this);
        panel.CLT_Cubiculos.addActionListener(this);
        ic.btnSiguienteCliente.addActionListener(this);
        csa.btnpagar12.addActionListener(this);
        csa.btnpagar1.addActionListener(this);
        csa.btnpagar13.addActionListener(this);
        emtp.btnPagoEfectivo.addActionListener(this);
        emtp.btnPlin.addActionListener(this);
        emtp.btnVisa.addActionListener(this);
        emtp.btnYape.addActionListener(this);
        cv.btnpagarahora.addActionListener(this);
        ccb.btngeneral.addActionListener(this);
        ccb.btngeneral1.addActionListener(this);
        ccb.btnvip.addActionListener(this);
        ccb.btnvip1.addActionListener(this);
        ccb.btnultravip.addActionListener(this);
        icj.btnSiguienteCliente.addActionListener(this);
        iad.btnIngresarAdm.addActionListener(this);
        ina.btnCubiculos.addActionListener(this);
        ina.btnEmpleados.addActionListener(this);
        ina.btnProductos.addActionListener(this);
        ina.btnClientes.addActionListener(this);
        admc.btnRetrocederAdmin.addActionListener(this);
        adme.btnRetrocederAdmin.addActionListener(this);
        adme.btnEmpleados.addActionListener(this);
        adme.btnarea.addActionListener(this);
        adme.btnlocales.addActionListener(this);
        adme.btnActualizarEmpleado.addActionListener(this);
        adga.btnRetrocederAdmin.addActionListener(this);
        adga.btnRegistrarArea.addActionListener(this);
        adga.btnActualizarArea.addActionListener(this);
        adga.btnEmpleados.addActionListener(this);
        adga.btnlocales.addActionListener(this);
        adgl.btnRetrocederAdmin.addActionListener(this);
        adgl.btnRegistrarLocal.addActionListener(this);
        adgl.btnActualizarLocal.addActionListener(this);
        adgl.btnEmpleados.addActionListener(this);
        adgl.btnarea.addActionListener(this);
        admp.btnRetrocederAdmin.addActionListener(this);
        admp.btnproveedor.addActionListener(this);
        admp.btnRegistrarProducto.addActionListener(this);
        admp.btnActualizarProducto.addActionListener(this);
        cbg.btnRetrocederAdmin.addActionListener(this);
        cbg.btnadquirir.addActionListener(this);
        cbg.btnadquirir1.addActionListener(this);
        cbv.btnRetrocederAdmin.addActionListener(this);
        cbv.btnadquirir.addActionListener(this);
        cbv.btnadquirir1.addActionListener(this);
        cbuv.btnRetrocederAdmin.addActionListener(this);
        cbuv.btnadquirir.addActionListener(this);
        cbuv.btnadquirir1.addActionListener(this);
        admpro.btnRetrocederAdmin.addActionListener(this);
        admpro.btnproductos.addActionListener(this);
        admpro.btnRegistrarProveedor.addActionListener(this);
        admpro.btnActualizarProveedor.addActionListener(this);
        admcli.btnRetrocederAdmin.addActionListener(this);
        admcli.btnClientes.addActionListener(this);
        admcli.btnCompras.addActionListener(this);
        admcli.btnReservas.addActionListener(this);
        admco.btnRetrocederAdmin.addActionListener(this);
        admco.btnClientes.addActionListener(this);
        admco.btnCompras.addActionListener(this);
        admco.btnReservas.addActionListener(this);
        admr.btnRetrocederAdmin.addActionListener(this);
        admr.btnClientes.addActionListener(this);
        admr.btnCompras.addActionListener(this);
        admr.btnReservas.addActionListener(this);
        adme.btnRegistrarEmpleado.addActionListener(this);
        rem.btnRegistrarEmpleado.addActionListener(this);
        rem.btnRetrocederAdmin.addActionListener(this);
        raem.btnRetrocederAdmin.addActionListener(this);
        raem.btnActualizarEmpleado.addActionListener(this);
        ram.btnRetrocederAdmin.addActionListener(this);
        ram.btnRegistrarArea.addActionListener(this);
        acarea.btnRetrocederAdmin.addActionListener(this);
        acarea.btnActualizarArea.addActionListener(this);
        rl.btnRetrocederAdmin.addActionListener(this);
        rl.btnRegistrarLocal.addActionListener(this);
        acloc.btnRetrocederAdmin.addActionListener(this);
        acloc.btnActualizarLocal.addActionListener(this);
        rep.btnRetrocederAdmin.addActionListener(this);
        rep.btnRegistrarProducto.addActionListener(this);
        acprod.btnRetrocederAdmin.addActionListener(this);
        acprod.btnActualizarProducto.addActionListener(this);
        repv.btnRetrocederAdmin.addActionListener(this);
        repv.btnRegistrarProveedor.addActionListener(this);
        acprov.btnRetrocederAdmin.addActionListener(this);
        acprov.btnActualizarProveedor.addActionListener(this);
    } 
    void TablaEmp() {
        AgregarFrame(adme);
        adme.setTitle("Registro de Empleados");
        adme.setVisible(true);
        crudadm = new CRUD_GestionEmpresa();
        crudadm.MostrarTablaEmpleados(adme.tblDatosEmp);
    }
    void TablaArea() {
        AgregarFrame(adga);
        adga.setTitle("Registro de Area");
        adga.setVisible(true);
        crudadm = new CRUD_GestionEmpresa();
        crudadm.MostrarTablaArea(adga.tblDatosArea);
    }
    void TablaLocales() {
        AgregarFrame(adgl);
        adgl.setTitle("Registro de Locales");
        adgl.setVisible(true);
        crudadm = new CRUD_GestionEmpresa();
        crudadm.MostrarTablaLocales(adgl.tblDatosLocales);
    }
    void TablaProductos() {
        AgregarFrame(admp);
        admp.setTitle("Registro de Productos");
        admp.setVisible(true);
        crudprod = new CRUD_Productos();
        crudprod.MostrarTablaProductos(admp.tblDatosProductos);
    }
    void TablaProovedores() {
        AgregarFrame(admpro);
        admpro.setTitle("Registro de Proveedores");
        admpro.setVisible(true);
        crudprod = new CRUD_Productos();
        crudprod.MostrarTablaProveedor(admpro.tblDatosProveedor);
    }
    void TablaClientes() {
        AgregarFrame(admcli);
        admcli.setTitle("Registro de Clientes");
        admcli.setVisible(true);
        crudcli = new CRUD_Clientes();
        crudcli.MostrarTablaClientes(admcli.tblDatosClientes);
    }
    void TablaCompras() {
        AgregarFrame(admco);
        admco.setTitle("Registro de Compras");
        admco.setVisible(true);
        crudcli = new CRUD_Clientes();
        crudcli.MostrarTablaCompras(admco.tblDatosCompras);
    }
    void TablaReservas() {
        AgregarFrame(admr);
        admr.setTitle("Registro de Reservas");
        admr.setVisible(true);
        crudcli = new CRUD_Clientes();
        crudcli.MostrarTablaReservas(admr.tblDatosReservas);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.ADM_Cubiculos) {
            AgregarFrame(iad);
            iad.setTitle("Admin");
            iad.setVisible(true);
        }
        if (e.getSource() == panel.CLT_SVAD) {
            AgregarFrame(ic);
            ic.setTitle("Tienda");
            ic.setVisible(true);
        }
        if (e.getSource() == panel.CLT_Cubiculos) {
            AgregarFrame(icj);
            icj.setTitle("Cubiculos");
            icj.setVisible(true);
        }
        if (e.getSource() == ic.btnSiguienteCliente) {
            AgregarFrame(csa);
            csa.setTitle("Productos");
            csa.setVisible(true);
        }
        if (e.getSource() == csa.btnpagar12) {
            AgregarFrame(emtp);
            emtp.setTitle("Metodos de Pago");
            emtp.setVisible(true);
        }
        if (e.getSource() == csa.btnpagar1) {
            AgregarFrame(emtp);
            emtp.setTitle("Metodos de Pago");
            emtp.setVisible(true);
        }
        if (e.getSource() == csa.btnpagar13) {
            AgregarFrame(emtp);
            emtp.setTitle("Metodos de Pago");
            emtp.setVisible(true);
        }
        if (e.getSource() == emtp.btnVisa) {
            AgregarFrameemtp(cv);
            cv.setTitle("Visa");
            cv.setVisible(true);
        }
        if (e.getSource() == emtp.btnPlin) {
            AgregarFrameemtp(cp);
            cp.setTitle("Plin");
            cp.setVisible(true);
        }
        if (e.getSource() == emtp.btnYape) {
            AgregarFrameemtp(cy);
            cy.setTitle("Yape");
            cy.setVisible(true);
        }
        if (e.getSource() == emtp.btnPagoEfectivo) {
            AgregarFrameemtp(cpe);
            cpe.setTitle("Pago Efectivo");
            cpe.setVisible(true);
        }
        if (e.getSource() == cv.btnpagarahora) {
            AgregarFrame(cb);
            cb.setTitle("Boleta");
            cb.setVisible(true);
        }
        if (e.getSource() == icj.btnSiguienteCliente) {
            AgregarFrame(ccb);
            ccb.setTitle("Cubiculos");
            ccb.setVisible(true);
        }
        if (e.getSource() == ccb.btngeneral) {
            AgregarFrame(cbg);
            cbg.setTitle("Cubiculos General");
            cbg.setVisible(true);
        }
        if (e.getSource() == ccb.btngeneral1) {
            AgregarFrame(cbg);
            cbg.setTitle("Cubiculos General");
            cbg.setVisible(true);
        }
        if (e.getSource() == ccb.btnvip) {
            AgregarFrame(cbv);
            cbv.setTitle("Cubiculos VIP");
            cbv.setVisible(true);
        }
        if (e.getSource() == ccb.btnvip1) {
            AgregarFrame(cbv);
            cbv.setTitle("Cubiculos VIP");
            cbv.setVisible(true);
        }
        if (e.getSource() == ccb.btnultravip) {
            AgregarFrame(cbuv);
            cbuv.setTitle("Cubiculos ULTRAVIP");
            cbuv.setVisible(true);
        }
        if (e.getSource() == cbg.btnadquirir) {
            AgregarFrame(emtp);
            emtp.setTitle("Metodos de Pago");
            emtp.setVisible(true);
        }
        if (e.getSource() == cbg.btnadquirir1) {
            AgregarFrame(emtp);
            emtp.setTitle("Metodos de Pago");
            emtp.setVisible(true);
        }
        if (e.getSource() == cbv.btnadquirir) {
            AgregarFrame(emtp);
            emtp.setTitle("Metodos de Pago");
            emtp.setVisible(true);
        }
        if (e.getSource() == cbv.btnadquirir1) {
            AgregarFrame(emtp);
            emtp.setTitle("Metodos de Pago");
            emtp.setVisible(true);
        }
        if (e.getSource() == cbuv.btnadquirir) {
            AgregarFrame(emtp);
            emtp.setTitle("Metodos de Pago");
            emtp.setVisible(true);
        }
        if (e.getSource() == cbuv.btnadquirir1) {
            AgregarFrame(emtp);
            emtp.setTitle("Metodos de Pago");
            emtp.setVisible(true);
        }
        if (e.getSource() == cbg.btnRetrocederAdmin) {
            AgregarFrame(ccb);
            ccb.setTitle("Cubiculos");
            ccb.setVisible(true);
        }
        if (e.getSource() == cbuv.btnRetrocederAdmin) {
            AgregarFrame(ccb);
            ccb.setTitle("Cubiculos");
            ccb.setVisible(true);
        }
        if (e.getSource() == cbv.btnRetrocederAdmin) {
            AgregarFrame(ccb);
            ccb.setTitle("Cubiculos");
            ccb.setVisible(true);
        }
        if (e.getSource() == iad.btnIngresarAdm) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        if (e.getSource() == ina.btnCubiculos) {
            AgregarFrame(admc);
            admc.setTitle("Estado de Cubiculos");
            admc.setVisible(true);
        }
        if (e.getSource() == admc.btnRetrocederAdmin) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        if (e.getSource() == ina.btnEmpleados) {
            TablaEmp();
        }
        if (e.getSource() == adme.btnEmpleados) {
            TablaEmp();
        }
        if (e.getSource() == adme.btnarea) {
            TablaArea();
        }
        if (e.getSource() == adme.btnlocales) {
            TablaLocales();
        }
        //Registrar Empleados
        if (e.getSource() == adme.btnRegistrarEmpleado) {
            AgregarFrame(rem);
            rem.setTitle("Registrar empleado");
            rem.setVisible(true);
        }
        if (e.getSource() == rem.btnRetrocederAdmin) {
            TablaEmp();
        }
        if (e.getSource()==rem.btnRegistrarEmpleado){
            em = ProcesosAdmin.LeerDatosEmpleado(rem);
                crudadm = new CRUD_GestionEmpresa();
                crudadm.RegistrarEmpleado(em);
                TablaEmp();
        }
        //Actualizar Empleados
        if (e.getSource() == adme.btnActualizarEmpleado) {
            ID_emp = Mensajes.M2("Ingrese el ID del empleado a buscar..");
            AgregarFrame(raem);
            raem.setTitle("Actualizar Empleado");
            raem.setVisible(true);
            crudadm = new CRUD_GestionEmpresa();
            em = crudadm.BuscarEmpleado(ID_emp);
            if (em == null) {
                Mensajes.M1("El id " + ID_emp + " no existe en la tabla de empleados");
                TablaEmp();
            } else {
                raem.txtcodlocal.setText(Integer.toString(em.getCodlocal()));
                raem.txtcodarea.setText(Integer.toString(em.getCodarea()));
                raem.txtnombreempleado.setText(em.getNombre_emp());
                raem.txtapempleado.setText(em.getApellido_emp());
                raem.txtfechaempleado.setText(em.getFechanacimiento_emp());
                raem.txtdniempleado.setText(em.getDni_emp());
                raem.txtsexoempleado.setText(em.getSexo_emp());
                raem.txtcelularempleado.setText(em.getCelular_emp());
                raem.txtcorreoempleado.setText(em.getCorreo_emp());
                raem.txtsalarioempleado.setText(Double.toString(em.getSalario_emp()));
            }
        }
        else if (e.getSource() == raem.btnActualizarEmpleado) {
            em = ProcesosAdmin.ActualizarDatosEmpleado(raem);
            crudadm = new CRUD_GestionEmpresa();
            crudadm.ActualizarEmpleado(em, ID_emp);
            TablaEmp();
        }
        if (e.getSource() == raem.btnRetrocederAdmin) {
            TablaEmp();
        }
        //Registrar Area
        if (e.getSource() == adga.btnRetrocederAdmin) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        if (e.getSource() == adga.btnRegistrarArea) {
            AgregarFrame(ram);
            ram.setTitle("Registrar Area");
            ram.setVisible(true);
        }
        if (e.getSource() == ram.btnRetrocederAdmin) {
            TablaArea();
        }
        if (e.getSource()==ram.btnRegistrarArea){
            ar = ProcesosAdmin.LeerDatosArea(ram);
                crudadm = new CRUD_GestionEmpresa();
                crudadm.RegistrarArea(ar);
            TablaArea();
        }
        //Actualizar Area
        if (e.getSource() == acarea.btnRetrocederAdmin) {
            TablaArea();
        }
        if (e.getSource()==adga.btnActualizarArea){
            ID_Area = Mensajes.M2("Ingrese el ID del Area a buscar..");
            AgregarFrame(acarea);
            acarea.setTitle("Actualizar Area");
            acarea.setVisible(true);
            crudadm = new CRUD_GestionEmpresa();
            ar = crudadm.BuscarArea(ID_Area);
            if (ar == null) {
                Mensajes.M1("El id " + ID_Area + " no existe en la tabla de area");
                TablaArea();
            } else {
                acarea.txtdescripcionarea.setText(ar.getDescripcionarea());
            }
        }
        if (e.getSource()==acarea.btnActualizarArea){
            ar = ProcesosAdmin.ActualizarDatosArea(acarea);
            crudadm = new CRUD_GestionEmpresa();
            crudadm.ActualizarArea(ar, ID_Area);
            TablaArea();
        }
        if (e.getSource() == adga.btnEmpleados) {
            TablaEmp();
        }
        if (e.getSource() == adga.btnlocales) {
            TablaLocales();
        }
        //Registrar Local
        if (e.getSource() == adgl.btnRetrocederAdmin) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        if (e.getSource() == adgl.btnEmpleados) {
            TablaEmp();
        }
        if (e.getSource() == adgl.btnarea) {
            TablaArea();
        }
        if (e.getSource() == adgl.btnRegistrarLocal) {
            AgregarFrame(rl);
            rl.setTitle("Registrar Local");
            rl.setVisible(true);
        }
        if (e.getSource()==rl.btnRetrocederAdmin){
                TablaLocales();
        }
        if (e.getSource()==rl.btnRegistrarLocal){
            loc = ProcesosAdmin.LeerDatosLocal(rl);
                crudadm = new CRUD_GestionEmpresa();
                crudadm.RegistrarLocal(loc);
                TablaLocales();
        }
        //Actualizar Local
        if (e.getSource()==adgl.btnActualizarLocal){
            ID_Local = Mensajes.M2("Ingrese el ID del Local a buscar..");
            AgregarFrame(acloc);
            acloc.setTitle("Actualizar Local");
            acloc.setVisible(true);
            crudadm = new CRUD_GestionEmpresa();
            loc = crudadm.BuscarLocal(ID_Local);
            if (loc == null) {
                Mensajes.M1("El id " + ID_Local + " no existe en la tabla de locales");
                TablaArea();
            } else {
                acloc.txtdireccionlocal.setText(loc.getDireccionlocal());
                acloc.txtnombrelocal.setText(loc.getNombrelocal());
                acloc.txtelefonolocal.setText(loc.getTelefonolocal());
            }
        }
        if (e.getSource()==acloc.btnRetrocederAdmin){
            TablaLocales();
        }
        if (e.getSource()==acloc.btnActualizarLocal){
            loc = ProcesosAdmin.ActualizarDatosLocal(acloc);
            crudadm = new CRUD_GestionEmpresa();
            crudadm.ActualizarLocal(loc, ID_Local);
            TablaLocales();
        }
        if (e.getSource() == adme.btnRetrocederAdmin) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        if (e.getSource() == ina.btnProductos) {
            TablaProductos();
        }
        if (e.getSource() == admp.btnRetrocederAdmin) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        //Registrar Producto
        if (e.getSource() == admp.btnproveedor) {
            TablaProovedores();
        }
        if (e.getSource() == admp.btnRegistrarProducto) {
            AgregarFrame(rep);
            rep.setTitle("Registrar Producto");
            rep.setVisible(true);
        }
        if (e.getSource() == rep.btnRegistrarProducto) {
            prod = ProcesosAdmin.LeerDatosProducto(rep);
                crudprod = new CRUD_Productos();
                crudprod.RegistrarProductos(prod);
                TablaProductos();
        }
        //Actualizar Producto
        if (e.getSource()==admp.btnActualizarProducto){
            ID_prod = Mensajes.M2("Ingrese el ID del Producto a buscar..");
            AgregarFrame(acprod);
            acprod.setTitle("Actualizar Producto");
            acprod.setVisible(true);
            crudprod = new CRUD_Productos();
            prod = crudprod.BuscarProducto(ID_prod);
            if (prod == null) {
                Mensajes.M1("El id " + ID_prod + " no existe en la tabla de productos");
                TablaProductos();
            } else {
                acprod.txtcodcategoria.setText(Integer.toString(prod.getCodCategoria()));
                acprod.txtcodprov.setText(Integer.toString(prod.getCodProveedor()));
                acprod.txtprecioprod.setText(Double.toString(prod.getPrecioprod()));
                acprod.txtnombreprod.setText(prod.getNombreprod());
                acprod.txtfechavencimientoprod.setText(prod.getFechavencimientoprod());
            }
        }
        if (e.getSource()==acprod.btnRetrocederAdmin){
            TablaProductos();
        }
        if (e.getSource()==acprod.btnActualizarProducto){
            prod = ProcesosAdmin.ActualizarDatosProducto(acprod);
            crudprod = new CRUD_Productos();
            crudprod.ActualizarProducto(prod, ID_prod);
            TablaProductos();
        }
        //Registrar Proveedor
        if (e.getSource() == admpro.btnRetrocederAdmin) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        if (e.getSource() == admpro.btnproductos) {
            TablaProductos();
        }
        if (e.getSource() == admpro.btnRegistrarProveedor) {
            AgregarFrame(repv);
            repv.setTitle("Registrar Proveedor");
            repv.setVisible(true);
        }
        if (e.getSource() == repv.btnRegistrarProveedor) {
            prov = ProcesosAdmin.LeerDatosProveedor(repv);
                crudprod = new CRUD_Productos();
                crudprod.RegistrarProveedor(prov);
                TablaProovedores();
        }
        //Actualizar Proveedor
        if (e.getSource()==admpro.btnActualizarProveedor){
            ID_prov = Mensajes.M2("Ingrese el ID del Proveedor a buscar..");
            AgregarFrame(acprov);
            acprov.setTitle("Actualizar Proveedor");
            acprov.setVisible(true);
            crudprod = new CRUD_Productos();
            prov = crudprod.BuscarProveedor(ID_prov);
            if (prov == null) {
                Mensajes.M1("El id " + ID_prov + " no existe en la tabla de proveedores");
                TablaProovedores();
            } else {
                acprov.txtnombreprov.setText(prov.getNombreprov());
                acprov.txtcontactoprov.setText(prov.getContactoprov());
                acprov.txtpaisprov.setText(prov.getPaisprov());
            }
        }
        if (e.getSource()==acprov.btnRetrocederAdmin){
            TablaProovedores();
        }
        if (e.getSource()==acprov.btnActualizarProveedor){
            prov = ProcesosAdmin.ActualizarDatosProveedor(acprov);
            crudprod = new CRUD_Productos();
            crudprod.ActualizarProveedor(prov, ID_prov);
            TablaProovedores();
        }
        if (e.getSource() == ina.btnClientes) {
            TablaClientes();
        }
        if (e.getSource() == admcli.btnRetrocederAdmin) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        if (e.getSource() == admcli.btnCompras) {
            TablaCompras();
        }
        if (e.getSource() == admcli.btnReservas) {
            TablaReservas();
        }
        if (e.getSource() == admco.btnRetrocederAdmin) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        if (e.getSource() == admco.btnClientes) {
            TablaClientes();
        }
        if (e.getSource() == admco.btnReservas) {
            TablaReservas();
        }
        if (e.getSource() == admr.btnRetrocederAdmin) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        if (e.getSource() == admr.btnClientes) {
            TablaClientes();
        }
        if (e.getSource() == admr.btnCompras) {
            TablaCompras();
        }
    }

    void AgregarFrame(JInternalFrame frame) {
        panel.dspEscritorio.removeAll();
        panel.dspEscritorio.add(frame);
        int x = (panel.dspEscritorio.getWidth() - frame.getWidth()) / 2;
        int y = (panel.dspEscritorio.getHeight() - frame.getHeight()) / 2;
        frame.setLocation(x, y);
        panel.dspEscritorio.repaint();
    }
    void AgregarFrameemtp(JInternalFrame frame) {
        emtp.dspEscritorio.removeAll();
        emtp.dspEscritorio.add(frame);
        emtp.dspEscritorio.repaint();
    }

}
