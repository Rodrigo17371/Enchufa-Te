package Controlador;
import Vista.*;
import javax.swing.JDesktopPane;


public class ControladorInicio {
    
    private static JDesktopPane jDesktopPane_menu;
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Crea una instancia del JFrame
                Inicio Inicio = new Inicio();

                // Hace visible el JFrame
                Inicio.setVisible(true);
            }
        });
    }
    
    private void CLT_CubiculosActionPerformed(java.awt.event.ActionEvent evt) {                                              
        IngresoCajero IngresoCajero = new IngresoCajero();
        jDesktopPane_menu.add(IngresoCajero);
        IngresoCajero.setVisible(true);
// TODO add your handling code here:
    }                                             

    private void CLT_SVADActionPerformed(java.awt.event.ActionEvent evt) {                                         
        IngresoCliente IngresoCliente = new IngresoCliente();
        jDesktopPane_menu.add(IngresoCliente);
        IngresoCliente.setVisible(true);
// TODO add your handling code here:
    }                                        

    private void ADM_CubiculosActionPerformed(java.awt.event.ActionEvent evt) {                                              
        IngresoAdministrador IngresoAdministrador = new IngresoAdministrador();
        jDesktopPane_menu.add(IngresoAdministrador);
        IngresoAdministrador.setVisible(true);
// TODO add your handling code here:
    }         
}
