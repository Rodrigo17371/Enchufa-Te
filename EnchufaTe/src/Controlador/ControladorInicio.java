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
    ADM_Empleados adme;
    ADM_Productos admp;
    Cajero_CubiculoG cbg;
    Cajero_CubiculoV cbv;
    Cajero_CubiculoUV cbuv;
    CRUD_Administrador crudadm;
    public ControladorInicio(Inicio panel, Cliente_ServiciosAdicionales csa, IngresoCliente ic, EscMetodosPago emtp, Cliente_Visa cv,
            Cliente_Plin cp, Cliente_Yape cy, Cliente_PagoEfectivo cpe, Cliente_Boleta cb, Cajero_Cubiculos ccb, IngresoCajero icj, IngresoAdministrador iad,
             InterfazAdmin ina, ADM_Cubiculos admc, ADM_Empleados adme, ADM_Productos admp, Cajero_CubiculoG cbg, Cajero_CubiculoV cbv, Cajero_CubiculoUV cbuv) {
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
        admc.btnRetrocederAdmin.addActionListener(this);
        adme.btnRetrocederAdmin.addActionListener(this);
        admp.btnRetrocederAdmin.addActionListener(this);
        cbg.btnRetrocederAdmin.addActionListener(this);
        cbg.btnadquirir.addActionListener(this);
        cbg.btnadquirir1.addActionListener(this);
        cbv.btnRetrocederAdmin.addActionListener(this);
        cbv.btnadquirir.addActionListener(this);
        cbv.btnadquirir1.addActionListener(this);
        cbuv.btnRetrocederAdmin.addActionListener(this);
        cbuv.btnadquirir.addActionListener(this);
        cbuv.btnadquirir1.addActionListener(this);
        
    } 
    void TablaEmp() {
        AgregarFrame(adme);
        adme.setTitle("Registro de Empleados");
        adme.setVisible(true);
        crudadm = new CRUD_Administrador();
        crudadm.MostrarTablaEmpleados(adme.tblDatosEmp);
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
        if (e.getSource() == adme.btnRetrocederAdmin) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        if (e.getSource() == ina.btnProductos) {
            AgregarFrame(admp);
            admp.setTitle("Registro de productos");
            admp.setVisible(true);
        }
        if (e.getSource() == admp.btnRetrocederAdmin) {
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
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
