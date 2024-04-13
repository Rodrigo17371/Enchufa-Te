package Main;
import Vista.*;
import Controlador.*;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import javax.swing.UnsupportedLookAndFeelException;
public class Principal {
    public static Inicio panel;
    public static IngresoAdministrador iad;
    public static IngresoCajero icj;
    public static IngresoCliente icl;
    public static Cliente_ServiciosAdicionales csa;
     public static void main(String[] args) throws UnsupportedLookAndFeelException{
         panel= new Inicio();
         iad= new IngresoAdministrador();
         icj= new IngresoCajero();
         icl= new IngresoCliente();
         csa= new Cliente_ServiciosAdicionales();
        UIManager.setLookAndFeel(new FlatCarbonIJTheme());
        SwingUtilities.updateComponentTreeUI(panel);
        SwingUtilities.updateComponentTreeUI(iad);
        SwingUtilities.updateComponentTreeUI(icj);
        SwingUtilities.updateComponentTreeUI(icl);
        SwingUtilities.updateComponentTreeUI(csa);
        ControladorInicio ci= new ControladorInicio(panel,csa,icl);
        panel.setTitle("Enchufa Te");
        panel.setLocationRelativeTo(null);
        iad.BorrarBordesIngresoAdmin();
        panel.setVisible(true);
    }
}
