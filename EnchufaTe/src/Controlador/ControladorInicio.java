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
    public ControladorInicio(Inicio panel, Cliente_ServiciosAdicionales csa,IngresoCliente ic  ){
        this.panel=panel;
        this.ic=ic;
        this.csa=csa;
        panel.CLT_SVAD.addActionListener(this);
        panel.ADM_Cubiculos.addActionListener(this);
        panel.CLT_Cubiculos.addActionListener(this);
        ic.btnSiguienteCliente.addActionListener(this);
        csa.btnSiguienteCliente.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== panel.ADM_Cubiculos){
            IngresoAdministrador ac= new IngresoAdministrador();
            AgregarFrame(ac);
            ac.setTitle("Admin");
            ac.setVisible(true);
           
        }
        if(e.getSource()==panel.CLT_SVAD){
            IngresoCliente ic= new IngresoCliente();
            AgregarFrame(ic);
            ic.setTitle("Tienda");
            ic.setVisible(true);
        }
        if(e.getSource()==panel.CLT_Cubiculos){
            IngresoCajero icj= new IngresoCajero();
            AgregarFrame(icj);
            icj.setTitle("Cubiculos");
            icj.setVisible(true);
        }
        if(e.getSource()==ic.btnSiguienteCliente){
            Cliente_ServiciosAdicionales csa= new Cliente_ServiciosAdicionales();
            AgregarFrame(csa);
            csa.setTitle("Productos");
            csa.setVisible(true);
        }
    }
    void AgregarFrame(JInternalFrame frame){
        panel.Panelprin.removeAll();// Elimina cualquier InternalFrame existente en el panel de escritorio
        panel.Panelprin.add(frame);// Agrega el InternalFrame al panel de escritorio
        panel.Panelprin.repaint();// Vuelve a pintar el panel de escritorio para mostrar el InternalFrame agregado
    }
}
