package Controlador;
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
    
    public ControladorInicio(Inicio panel, Cliente_ServiciosAdicionales csa, IngresoCliente ic,EscMetodosPago emtp,Cliente_Visa cv,
            Cliente_Plin cp,Cliente_Yape cy,Cliente_PagoEfectivo cpe,Cliente_Boleta cb,Cajero_Cubiculos ccb,IngresoCajero icj,IngresoAdministrador iad
            ,InterfazAdmin ina,ADM_Cubiculos admc,ADM_Empleados adme,ADM_Productos admp){
        this.panel = panel;
        this.ic = ic;
        this.csa = csa;
        this.emtp=emtp;
        this.cv=cv;
        this.cp=cp;
        this.cy=cy;
        this.cpe=cpe;
        this.cb=cb;
        this.ccb=ccb;
        this.icj=icj;
        this.iad=iad;
        this.ina=ina;
        this.admc=admc;
        this.adme=adme;
        this.admp=admp;
        panel.CLT_SVAD.addActionListener(this);
        panel.ADM_Cubiculos.addActionListener(this);
        panel.CLT_Cubiculos.addActionListener(this);
        ic.btnSiguienteCliente.addActionListener(this);
        csa.btnComprar.addActionListener(this);
        emtp.btnPagoEfectivo.addActionListener(this);
        emtp.btnPlin.addActionListener(this);
        emtp.btnVisa.addActionListener(this);
        emtp.btnYape.addActionListener(this);
        cv.btnpagarahora.addActionListener(this);
        ccb.btnSiguienteCliente.addActionListener(this);
        icj.btnSiguienteCliente.addActionListener(this);
        iad.btnIngresarAdm.addActionListener(this);
        ina.btnCubiculos.addActionListener(this);
        ina.btnEmpleados.addActionListener(this);
        ina.btnProductos.addActionListener(this);
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
        if (e.getSource()==csa.btnComprar){
            AgregarFrame(emtp);
            emtp.setTitle("Metodos de Pago");
            emtp.setVisible(true);
        }
        if (e.getSource()==emtp.btnVisa){
            AgregarFrameemtp(cv);
            cv.setTitle("Visa");
            cv.setVisible(true);
        }
        if (e.getSource()==emtp.btnPlin){
            AgregarFrameemtp(cp);
            cp.setTitle("Plin");
            cp.setVisible(true);
        }
        if (e.getSource()==emtp.btnYape){
            AgregarFrameemtp(cy);
            cy.setTitle("Yape");
            cy.setVisible(true);
        }
        if (e.getSource()==emtp.btnPagoEfectivo){
            AgregarFrameemtp(cpe);
            cpe.setTitle("Pago Efectivo");
            cpe.setVisible(true);
        }
        if (e.getSource()==cv.btnpagarahora){
            AgregarFrame(cb);
            cb.setTitle("Boleta");
            cb.setVisible(true);
        }
        if (e.getSource()==icj.btnSiguienteCliente){
            AgregarFrame(ccb);
            ccb.setTitle("Cubiculos");
            ccb.setVisible(true);
        }
        if (e.getSource()==ccb.btnSiguienteCliente){
            AgregarFrame(emtp);
            emtp.setTitle("Cubiculos");
            emtp.setVisible(true);
        }
        if (e.getSource()==iad.btnIngresarAdm){
            AgregarFrame(ina);
            ina.setTitle("Interfaz Admin");
            ina.setVisible(true);
        }
        if (e.getSource()==ina.btnCubiculos){
            AgregarFrameadm(admc);
            admc.setTitle("Estado de Cubiculos");
            admc.setVisible(true);
        }
        if (e.getSource()==ina.btnEmpleados){
            AgregarFrameadm(adme);
            adme.setTitle("Registro de Empleados");
            adme.setVisible(true);
        }
        if (e.getSource()==ina.btnProductos){
            AgregarFrameadm(admp);
            admp.setTitle("Registro de Productos");
            admp.setVisible(true);
        }
        
    }
    
    void AgregarFrame(JInternalFrame frame) {
        panel.dspEscritorio.removeAll();
        panel.dspEscritorio.add(frame);
        panel.dspEscritorio.repaint();
    }
    void AgregarFrameemtp(JInternalFrame frame) {
        emtp.dspEscritorio.removeAll();// Elimina cualquier InternalFrame existente en el panel de escritorio
        emtp.dspEscritorio.add(frame);// Agrega el InternalFrame al panel de escritorio
        emtp.dspEscritorio.repaint();// Vuelve a pintar el panel de escritorio para mostrar el InternalFrame agregado
    }
    void AgregarFrameadm(JInternalFrame frame) {
        ina.dspEscritorio.removeAll();// Elimina cualquier InternalFrame existente en el panel de escritorio
        ina.dspEscritorio.add(frame);// Agrega el InternalFrame al panel de escritorio
        ina.dspEscritorio.repaint();// Vuelve a pintar el panel de escritorio para mostrar el InternalFrame agregado
    }
}
