/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */
public class ADM_ActualizarLocal extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADM_Cubiculos1
     */
    public ADM_ActualizarLocal() {
        initComponents();

        btnRetrocederAdmin.setContentAreaFilled(false);
        btnRetrocederAdmin.setBorder(null);
        txtdireccionlocal.setBackground(new java.awt.Color(0,0,0,1));
        txtelefonolocal.setBackground(new java.awt.Color(0,0,0,1));
        txtnombrelocal.setBackground(new java.awt.Color(0,0,0,1));
    }
    public void BorrarBordesLocales() {
        txtdireccionlocal.setBorder(null);
        txtelefonolocal.setBorder(null);
        txtnombrelocal.setBorder(null);
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
        btnActualizarLocal = new javax.swing.JButton();
        txtdireccionlocal = new javax.swing.JTextField();
        txtnombrelocal = new javax.swing.JTextField();
        txtelefonolocal = new javax.swing.JTextField();
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

        btnActualizarLocal.setBackground(new java.awt.Color(153, 153, 153));
        btnActualizarLocal.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnActualizarLocal.setText("Actualizar");
        btnActualizarLocal.setBorderPainted(false);
        btnActualizarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarLocalActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 160, 40));

        txtdireccionlocal.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtdireccionlocal.setBorder(null);
        txtdireccionlocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionlocalActionPerformed(evt);
            }
        });
        getContentPane().add(txtdireccionlocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 300, 50));

        txtnombrelocal.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtnombrelocal.setBorder(null);
        txtnombrelocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrelocalActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombrelocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 300, 50));

        txtelefonolocal.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtelefonolocal.setBorder(null);
        txtelefonolocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtelefonolocalActionPerformed(evt);
            }
        });
        getContentPane().add(txtelefonolocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 300, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ACTUALIZARLOCAL.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -30, 1460, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederAdminActionPerformed

    private void btnActualizarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarLocalActionPerformed

    private void txtdireccionlocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionlocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionlocalActionPerformed

    private void txtnombrelocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrelocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrelocalActionPerformed

    private void txtelefonolocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtelefonolocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtelefonolocalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarLocal;
    public javax.swing.JButton btnRetrocederAdmin;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField txtdireccionlocal;
    public javax.swing.JTextField txtelefonolocal;
    public javax.swing.JTextField txtnombrelocal;
    // End of variables declaration//GEN-END:variables
}
