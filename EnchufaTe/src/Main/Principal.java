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
    public static IngresoCajero icj;
    public static IngresoCliente ic;
    public static Cliente_ServiciosAdicionales csa;
    public static EscMetodosPago emtp;
    public static Cliente_Visa cv;
    public static Cliente_Plin cp;
    public static Cliente_Yape cy;
    public static Cliente_PagoEfectivo cpe;
    public static Cliente_Boleta cb;
    public static Cajero_Cubiculos ccb;
    public static InterfazAdmin ina;
    public static ADM_Cubiculos admc;
    public static ADM_GesEmpleado adme;
    public static ADM_Productos admp;
    public static Fondo fond;
    public static Cajero_CubiculoG cbg;
    public static Cajero_CubiculoV cbv;
    public static Cajero_CubiculoUV cbuv;
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
         cb= new Cliente_Boleta();
         ccb= new Cajero_Cubiculos();
         ina= new InterfazAdmin();
         admc= new ADM_Cubiculos();
         adme= new ADM_GesEmpleado();
         admp= new ADM_Productos();
         fond= new Fondo();
         cbg= new Cajero_CubiculoG();
         cbv= new Cajero_CubiculoV();
         cbuv= new Cajero_CubiculoUV();
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
        SwingUtilities.updateComponentTreeUI(cb);
        SwingUtilities.updateComponentTreeUI(ccb);
        SwingUtilities.updateComponentTreeUI(ina);
        SwingUtilities.updateComponentTreeUI(admc);
        SwingUtilities.updateComponentTreeUI(adme);
        SwingUtilities.updateComponentTreeUI(admp);
        SwingUtilities.updateComponentTreeUI(fond);
        SwingUtilities.updateComponentTreeUI(cbg);
        SwingUtilities.updateComponentTreeUI(cbv);
        SwingUtilities.updateComponentTreeUI(cbuv);
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
        ControladorInicio ci= new ControladorInicio(panel,csa,ic,emtp,cv,cp,cy,cpe,cb,ccb,icj,iad,ina,admc
                ,adme,admp,cbg,cbv,cbuv,adga,adgl,admpro,admcli,admco,admr,rem,raem,ram,acarea,rl,acloc
                ,rep,acprod,repv,acprov,rec,acli,rgc,acom);
        panel.setTitle("Enchufa Te");
        panel.setLocationRelativeTo(null);
        
        iad.BorrarBordesIngresoAdmin();
        icj.BorrarBordesIngresoCliente();
        ic.BorrarBordesIngresoCliente();
        panel.setVisible(true);
    }
    
}
