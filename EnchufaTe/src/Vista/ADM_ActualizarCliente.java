/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */
public class ADM_ActualizarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADM_Cubiculos1
     */
    public ADM_ActualizarCliente() {
        initComponents();

        btnRetrocederAdmin.setContentAreaFilled(false);
        btnRetrocederAdmin.setBorder(null);
        cbxsexocliente.setBackground(new java.awt.Color(0,0,0,1));
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
        txtnombrecliente = new javax.swing.JTextField();
        txtapecliente = new javax.swing.JTextField();
        txtfechacliente = new javax.swing.JTextField();
        txtdnicliente = new javax.swing.JTextField();
        txtcelularcliente = new javax.swing.JTextField();
        btnActualizarCliente = new javax.swing.JButton();
        cbxsexocliente = new javax.swing.JComboBox<>();
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

        txtnombrecliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtnombrecliente.setBorder(null);
        txtnombrecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreclienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 210, 40));

        txtapecliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtapecliente.setBorder(null);
        txtapecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapeclienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtapecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 210, 40));

        txtfechacliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtfechacliente.setBorder(null);
        txtfechacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaclienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtfechacliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 210, 40));

        txtdnicliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtdnicliente.setBorder(null);
        txtdnicliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniclienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtdnicliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 210, 40));

        txtcelularcliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcelularcliente.setBorder(null);
        txtcelularcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelularclienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtcelularcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 210, 40));

        btnActualizarCliente.setBackground(new java.awt.Color(153, 153, 153));
        btnActualizarCliente.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnActualizarCliente.setText("Actualizar");
        btnActualizarCliente.setBorderPainted(false);
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 160, 40));

        cbxsexocliente.setBackground(new java.awt.Color(255, 0, 0));
        cbxsexocliente.setForeground(new java.awt.Color(255, 255, 255));
        cbxsexocliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        getContentPane().add(cbxsexocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 210, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GestionEmpresa.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -30, 1460, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederAdminActionPerformed

    private void txtnombreclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreclienteActionPerformed

    private void txtapeclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapeclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapeclienteActionPerformed

    private void txtfechaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaclienteActionPerformed

    private void txtdniclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdniclienteActionPerformed

    private void txtcelularclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelularclienteActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarCliente;
    public javax.swing.JButton btnRetrocederAdmin;
    public javax.swing.JComboBox<String> cbxsexocliente;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField txtapecliente;
    public javax.swing.JTextField txtcelularcliente;
    public javax.swing.JTextField txtdnicliente;
    public javax.swing.JTextField txtfechacliente;
    public javax.swing.JTextField txtnombrecliente;
    // End of variables declaration//GEN-END:variables
}