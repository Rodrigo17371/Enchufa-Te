/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Main.Principal;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
/**
 *
 * @author Prueba
 */
public class Cliente_PagoEfectivo extends javax.swing.JInternalFrame {

    /**
     * Creates new form Panel
     */
    public Cliente_PagoEfectivo() {
        initComponents();
        /*
        btnAdministrador.putClientProperty("JButton.buttonType", "roundRect" );
        btnCliente.putClientProperty("JButton.buttonType", "roundRect" );*/
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardarDatos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();

        btnGuardarDatos.setBackground(new java.awt.Color(0, 204, 0));
        btnGuardarDatos.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnGuardarDatos.setText("SIGUIENTE");
        btnGuardarDatos.setBorderPainted(false);
        btnGuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDatosActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fondopagoefectivo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 390));
        setJMenuBar(jMenuBar3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDatosActionPerformed

    }//GEN-LAST:event_btnGuardarDatosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardarDatos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar3;
    // End of variables declaration//GEN-END:variables
}
