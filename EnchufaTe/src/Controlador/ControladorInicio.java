package Controlador;

import DAO.CRUD_Administrador;
import Main.Principal;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class ControladorInicio implements ActionListener {

    Inicio panel;
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
    CRUD_Administrador crudadm;
    ADM_Clientes admcli;
    ADM_Compras admco;
    ADM_Reservas admr;
    public ControladorInicio(Inicio panel, Cliente_ServiciosAdicionales csa, IngresoCliente ic, EscMetodosPago emtp, Cliente_Visa cv,
            Cliente_Plin cp, Cliente_Yape cy, Cliente_PagoEfectivo cpe, Cliente_Boleta cb, Cajero_Cubiculos ccb, IngresoCajero icj, IngresoAdministrador iad,
             InterfazAdmin ina, ADM_Cubiculos admc, ADM_GesEmpleado adme, ADM_Productos admp, Cajero_CubiculoG cbg, Cajero_CubiculoV cbv, Cajero_CubiculoUV cbuv,
             ADM_GesArea adga,ADM_GesLocal adgl,ADM_Proovedor admpro,ADM_Clientes admcli,ADM_Compras admco,ADM_Reservas admr) {
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
        adga.btnRetrocederAdmin.addActionListener(this);
        adga.btnEmpleados.addActionListener(this);
        adga.btnlocales.addActionListener(this);
        adgl.btnRetrocederAdmin.addActionListener(this);
        adgl.btnEmpleados.addActionListener(this);
        adgl.btnarea.addActionListener(this);
        admp.btnRetrocederAdmin.addActionListener(this);
        admp.btnproveedor.addActionListener(this);
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
    } 
    void TablaEmp() {
        AgregarFrame(adme);
        adme.setTitle("Registro de Empleados");
        adme.setVisible(true);
        crudadm = new CRUD_Administrador();
        crudadm.MostrarTablaEmpleados(adme.tblDatosEmp);
    }
    void TablaArea() {
        AgregarFrame(adga);
        adga.setTitle("Registro de Area");
        adga.setVisible(true);
        crudadm = new CRUD_Administrador();
        crudadm.MostrarTablaArea(adga.tblDatosArea);
    }
    void TablaLocales() {
        AgregarFrame(adgl);
        adgl.setTitle("Registro de Locales");
        adgl.setVisible(true);
        crudadm = new CRUD_Administrador();
        crudadm.MostrarTablaLocales(adgl.tblDatosLocales);
    }
    void TablaProductos() {
        AgregarFrame(admp);
        admp.setTitle("Registro de Productos");
        admp.setVisible(true);
        crudadm = new CRUD_Administrador();
        crudadm.MostrarTablaProductos(admp.tblDatosProductos);
    }
    void TablaProovedores() {
        AgregarFrame(admpro);
        admpro.setTitle("Registro de Proveedores");
        admpro.setVisible(true);
        crudadm = new CRUD_Administrador();
        crudadm.MostrarTablaProveedor(admpro.tblDatosProveedor);
    }
    void TablaClientes() {
        AgregarFrame(admcli);
        admcli.setTitle("Registro de Clientes");
        admcli.setVisible(true);
        crudadm = new CRUD_Administrador();
        crudadm.MostrarTablaClientes(admcli.tblDatosClientes);
    }
    void TablaCompras() {
        AgregarFrame(admco);
        admco.setTitle("Registro de Compras");
        admco.setVisible(true);
        crudadm = new CRUD_Administrador();
        crudadm.MostrarTablaCompras(admco.tblDatosCompras);
    }
    void TablaReservas() {
        AgregarFrame(admr);
        admr.setTitle("Registro de Reservas");
        admr.setVisible(true);
        crudadm = new CRUD_Administrador();
        crudadm.MostrarTablaReservas(admr.tblDatosReservas);
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
        if (e.getSource() == adga.btnRetrocederAdmin) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        if (e.getSource() == adga.btnEmpleados) {
            TablaEmp();
        }
        if (e.getSource() == adga.btnlocales) {
            TablaLocales();
        }
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
        if (e.getSource() == admp.btnproveedor) {
            TablaProovedores();
        }
        if (e.getSource() == admpro.btnRetrocederAdmin) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        if (e.getSource() == admpro.btnproductos) {
            TablaProductos();
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
