package Controlador;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


public class ControladorInicio implements ActionListener {
    Inicio panel;
    IngresoCliente ic;
    Cliente_ServiciosAdicionales csa;
    EscMetodosPago emtp;
    Cliente_Visa cv;
    Cliente_Plin cp;
    Cliente_Yape cy;
    Cliente_PagoEfectivo cpe;
    public ControladorInicio(Inicio panel, Cliente_ServiciosAdicionales csa, IngresoCliente ic,EscMetodosPago emtp,Cliente_Visa cv,Cliente_Plin cp,Cliente_Yape cy,Cliente_PagoEfectivo cpe){
        this.panel = panel;
        this.ic = ic;
        this.csa = csa;
        this.emtp=emtp;
        this.cv=cv;
        this.cp=cp;
        this.cy=cy;
        this.cpe=cpe;
        panel.CLT_SVAD.addActionListener(this);
        panel.ADM_Cubiculos.addActionListener(this);
        panel.CLT_Cubiculos.addActionListener(this);
        ic.btnSiguienteCliente.addActionListener(this);
        csa.btnComprar.addActionListener(this);
        emtp.btnPagoEfectivo.addActionListener(this);
        emtp.btnPlin.addActionListener(this);
        emtp.btnVisa.addActionListener(this);
        emtp.btnYape.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.ADM_Cubiculos) {
            IngresoAdministrador ac = new IngresoAdministrador();
            AgregarFrame(ac);
            ac.setTitle("Admin");
            ac.setVisible(true);
        }
        if (e.getSource() == panel.CLT_SVAD) {
            AgregarFrame(ic);
            ic.setTitle("Tienda");
            ic.setVisible(true);
        }
        if (e.getSource() == panel.CLT_Cubiculos) {
            IngresoCajero icj = new IngresoCajero();
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
}
