/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */
public class ADM_ActualizarCompra extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADM_Cubiculos1
     */
    public ADM_ActualizarCompra() {
        initComponents();

        btnRetrocederAdmin.setContentAreaFilled(false);
        btnRetrocederAdmin.setBorder(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRetrocederAdmin = new javax.swing.JButton();
        txtcodcliente = new javax.swing.JTextField();
        txtcodempleado = new javax.swing.JTextField();
        txtfechacompra = new javax.swing.JTextField();
        txthoracompra = new javax.swing.JTextField();
        txtcodproducto = new javax.swing.JTextField();
        txttipopago = new javax.swing.JTextField();
        txtcantidadcompra = new javax.swing.JTextField();
        btnActualizarCompra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRetrocederAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnRetrocederAdmin.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnRetrocederAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Button - Symbol.png"))); // NOI18N
        btnRetrocederAdmin.setBorderPainted(false);
        btnRetrocederAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetrocederAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        txtcodcliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcodcliente.setBorder(null);
        txtcodcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodclienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 210, 40));

        txtcodempleado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcodempleado.setBorder(null);
        txtcodempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodempleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 210, 40));

        txtfechacompra.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtfechacompra.setBorder(null);
        txtfechacompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechacompraActionPerformed(evt);
            }
        });
        getContentPane().add(txtfechacompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 210, 40));

        txthoracompra.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txthoracompra.setBorder(null);
        txthoracompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthoracompraActionPerformed(evt);
            }
        });
        getContentPane().add(txthoracompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 210, 40));

        txtcodproducto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcodproducto.setBorder(null);
        txtcodproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodproductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 210, 40));

        txttipopago.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txttipopago.setBorder(null);
        txttipopago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipopagoActionPerformed(evt);
            }
        });
        getContentPane().add(txttipopago, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 210, 40));

        txtcantidadcompra.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcantidadcompra.setBorder(null);
        txtcantidadcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadcompraActionPerformed(evt);
            }
        });
        getContentPane().add(txtcantidadcompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 210, 40));

        btnActualizarCompra.setBackground(new java.awt.Color(153, 153, 153));
        btnActualizarCompra.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnActualizarCompra.setText("Actualizar");
        btnActualizarCompra.setBorderPainted(false);
        btnActualizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GestionEmpresa.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -30, 1460, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederAdminActionPerformed

    private void txtcodclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodclienteActionPerformed

    private void txtcodempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodempleadoActionPerformed

    private void txtfechacompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechacompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechacompraActionPerformed

    private void txthoracompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthoracompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthoracompraActionPerformed

    private void txtcodproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodproductoActionPerformed

    private void txttipopagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipopagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipopagoActionPerformed

    private void txtcantidadcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadcompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadcompraActionPerformed

    private void btnActualizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarCompra;
    public javax.swing.JButton btnRetrocederAdmin;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField txtcantidadcompra;
    public javax.swing.JTextField txtcodcliente;
    public javax.swing.JTextField txtcodempleado;
    public javax.swing.JTextField txtcodproducto;
    public javax.swing.JTextField txtfechacompra;
    public javax.swing.JTextField txthoracompra;
    public javax.swing.JTextField txttipopago;
    // End of variables declaration//GEN-END:variables
}
