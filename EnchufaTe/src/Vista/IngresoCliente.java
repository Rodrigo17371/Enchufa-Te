/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author usuario
 */
public class IngresoCliente extends javax.swing.JInternalFrame {

    public IngresoCliente() {
        initComponents();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDniCliente = new javax.swing.JTextField();
        cbxMesaCliente = new javax.swing.JComboBox<>();
        txtApellidoMaCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoPaCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnRetrocederCli = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSiguienteCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDniCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtDniCliente.setBorder(null);
        txtDniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 340, 40));

        cbxMesaCliente.setBackground(new java.awt.Color(255, 0, 0));
        cbxMesaCliente.setForeground(new java.awt.Color(255, 255, 255));
        cbxMesaCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5", "Mesa 6", "Mesa 7", "Mesa 8" }));
        getContentPane().add(cbxMesaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 360, 50));

        txtApellidoMaCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        getContentPane().add(txtApellidoMaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 340, 40));

        txtNombreCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        getContentPane().add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 340, 40));

        txtApellidoPaCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        getContentPane().add(txtApellidoPaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 340, 40));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("___________________________________________________________________");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("___________________________________________________________________");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("___________________________________________________________________");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("___________________________________________________________________");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        btnRetrocederCli.setBackground(new java.awt.Color(255, 255, 255));
        btnRetrocederCli.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnRetrocederCli.setBorderPainted(false);
        btnRetrocederCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederCliActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetrocederCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 60));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 30, 30));
        getContentPane().add(btnSiguienteCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 260, 80));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniClienteActionPerformed

    private void btnRetrocederCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederCliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRetrocederCli;
    public javax.swing.JButton btnSiguienteCliente;
    public javax.swing.JComboBox<String> cbxMesaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JTextField txtApellidoMaCliente;
    public javax.swing.JTextField txtApellidoPaCliente;
    public javax.swing.JTextField txtDniCliente;
    public javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
