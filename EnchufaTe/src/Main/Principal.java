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
    public static IngresoCliente ic;
    public static Cliente_ServiciosAdicionales csa;
    public static EscMetodosPago emtp;
    public static Cliente_Visa cv;
    public static Cliente_Plin cp;
    public static Cliente_Yape cy;
    public static Cliente_PagoEfectivo cpe;
    
     public static void main(String[] args) throws UnsupportedLookAndFeelException{
         panel= new Inicio();
         iad= new IngresoAdministrador();
         icj= new IngresoCajero();
         ic= new IngresoCliente();
         csa= new Cliente_ServiciosAdicionales();
         emtp= new EscMetodosPago();
         cv= new Cliente_Visa();
         cp= new Cliente_Plin();
         cy= new Cliente_Yape();
         cpe= new Cliente_PagoEfectivo();
        UIManager.setLookAndFeel(new FlatCarbonIJTheme());
        SwingUtilities.updateComponentTreeUI(panel);
        SwingUtilities.updateComponentTreeUI(iad);
        SwingUtilities.updateComponentTreeUI(icj);
        SwingUtilities.updateComponentTreeUI(ic);
        SwingUtilities.updateComponentTreeUI(csa);
        SwingUtilities.updateComponentTreeUI(emtp);
        SwingUtilities.updateComponentTreeUI(cv);
        SwingUtilities.updateComponentTreeUI(cp);
        SwingUtilities.updateComponentTreeUI(cy);
        SwingUtilities.updateComponentTreeUI(cpe);
        ControladorInicio ci= new ControladorInicio(panel,csa,ic,emtp,cv,cp,cy,cpe);
        panel.setTitle("Enchufa Te");
        panel.setLocationRelativeTo(null);
        iad.BorrarBordesIngresoAdmin();
        panel.setVisible(true);
    }
}
