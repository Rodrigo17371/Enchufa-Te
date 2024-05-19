package Main;
import Vista.*;
import Controlador.*;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import javax.swing.JInternalFrame;
import javax.swing.UnsupportedLookAndFeelException;
public class Principal {
    public static Inicio panel;
    public static IngresoAdministrador iad;
    public static EscMetodosPago emtp;
    public static InterfazAdmin ina;
    public static ADM_Cubiculos admc;
    public static ADM_GesEmpleado adme;
    public static ADM_Productos admp;
    public static Fondo fond;
    public static ADM_GesArea adga;
    public static ADM_GesLocal adgl;
    public static ADM_Proovedor admpro;
    public static ADM_Clientes admcli;
    public static ADM_Compras admco;
    public static ADM_Reservas admr;
    public static ADM_RegistrarEmpleado rem;
    public static ADM_ActualizarEmpleado raem;
    public static ADM_RegistrarArea ram;
    public static ADM_ActualizarArea acarea;
    public static ADM_RegistrarLocal rl;
    public static ADM_ActualizarLocal acloc;
    public static ADM_RegistrarProducto rep;
    public static ADM_ActualizarProducto acprod;
    public static ADM_RegistrarProveedor repv;
    public static ADM_ActualizarProveedor acprov;
    public static ADM_RegistrarCliente rec;
    public static ADM_ActualizarCliente acli;
    public static ADM_RegistrarCompra rgc;
    public static ADM_ActualizarCompra acom;
    public static ADM_RegistrarReserva rgr;
    public static ADM_ActualizarReserva acre;
     public static void main(String[] args) throws UnsupportedLookAndFeelException{
         panel= new Inicio();
         iad= new IngresoAdministrador();
         emtp= new EscMetodosPago();
         ina= new InterfazAdmin();
         admc= new ADM_Cubiculos();
         adme= new ADM_GesEmpleado();
         admp= new ADM_Productos();
         fond= new Fondo();
         adga= new ADM_GesArea();
         adgl= new ADM_GesLocal();
         admpro= new ADM_Proovedor();
         admcli= new ADM_Clientes();
         admco= new ADM_Compras();
         admr= new ADM_Reservas();
         rem= new ADM_RegistrarEmpleado();
         raem= new ADM_ActualizarEmpleado();
         ram= new ADM_RegistrarArea();
         acarea= new ADM_ActualizarArea();
         rl= new ADM_RegistrarLocal();
         acloc= new ADM_ActualizarLocal();
         rep= new ADM_RegistrarProducto();
         acprod= new ADM_ActualizarProducto();
         repv=new ADM_RegistrarProveedor();
         acprov= new ADM_ActualizarProveedor();
         rec= new ADM_RegistrarCliente();
         acli= new ADM_ActualizarCliente();
         rgc= new ADM_RegistrarCompra();
         acom= new ADM_ActualizarCompra();
         rgr= new ADM_RegistrarReserva();
         acre=new ADM_ActualizarReserva();
        UIManager.setLookAndFeel(new FlatCarbonIJTheme());
        SwingUtilities.updateComponentTreeUI(panel);
        SwingUtilities.updateComponentTreeUI(iad);

        SwingUtilities.updateComponentTreeUI(emtp);
        SwingUtilities.updateComponentTreeUI(ina);
        SwingUtilities.updateComponentTreeUI(admc);
        SwingUtilities.updateComponentTreeUI(adme);
        SwingUtilities.updateComponentTreeUI(admp);
        SwingUtilities.updateComponentTreeUI(fond);
        SwingUtilities.updateComponentTreeUI(adga);
        SwingUtilities.updateComponentTreeUI(adgl);
        SwingUtilities.updateComponentTreeUI(admpro);
        SwingUtilities.updateComponentTreeUI(admcli);
        SwingUtilities.updateComponentTreeUI(admco);
        SwingUtilities.updateComponentTreeUI(admr);
        SwingUtilities.updateComponentTreeUI(rem);
        SwingUtilities.updateComponentTreeUI(raem);
        SwingUtilities.updateComponentTreeUI(ram);
        SwingUtilities.updateComponentTreeUI(acarea);
        SwingUtilities.updateComponentTreeUI(rl);
        SwingUtilities.updateComponentTreeUI(acloc);
        SwingUtilities.updateComponentTreeUI(rep);
        SwingUtilities.updateComponentTreeUI(acprod);
        SwingUtilities.updateComponentTreeUI(repv);
        SwingUtilities.updateComponentTreeUI(acprov);
        SwingUtilities.updateComponentTreeUI(rec);
        SwingUtilities.updateComponentTreeUI(acli);
        SwingUtilities.updateComponentTreeUI(rgc);
        SwingUtilities.updateComponentTreeUI(acom);
        SwingUtilities.updateComponentTreeUI(rgr);
        SwingUtilities.updateComponentTreeUI(acre);
        ControladorInicio ci= new ControladorInicio(panel,emtp,iad,ina,admc
                ,adme,admp,adga,adgl,admpro,admcli,admco,admr,rem,raem,ram,acarea,rl,acloc
                ,rep,acprod,repv,acprov,rec,acli,rgc,acom,rgr,acre);
        panel.setTitle("Enchufa Te");
        panel.setLocationRelativeTo(null);
        iad.BorrarBordesIngresoAdmin();
        panel.setVisible(true);
        panel.dspEscritorio.removeAll();
        panel.dspEscritorio.add(iad);
        int x = (panel.dspEscritorio.getWidth() - iad.getWidth()) / 2;
        int y = (panel.dspEscritorio.getHeight() - iad.getHeight()) / 2;
        iad.setLocation(x, y);
        panel.dspEscritorio.repaint();
        iad.setTitle("Admin");
        iad.setVisible(true);

        
    }
     /*
     void AgregarFramePrincipal(JInternalFrame frame) {
        panel.dspEscritorio.removeAll();
        panel.dspEscritorio.add(iad);
        int x = (panel.dspEscritorio.getWidth() - frame.getWidth()) / 2;
        int y = (panel.dspEscritorio.getHeight() - frame.getHeight()) / 2;
        frame.setLocation(x, y);
        panel.dspEscritorio.repaint();
        iad.setTitle("Admin");
        iad.setVisible(true);
    }*/
    
}
