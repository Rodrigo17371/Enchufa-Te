/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */
public class ADM_RegistrarLocal extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADM_Cubiculos1
     */
    public ADM_RegistrarLocal() {
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
        txtcodlocal = new javax.swing.JTextField();
        txtcodarea = new javax.swing.JTextField();
        txtnombreempleado = new javax.swing.JTextField();
        txtapempleado = new javax.swing.JTextField();
        txtfechaempleado = new javax.swing.JTextField();
        txtdniempleado = new javax.swing.JTextField();
        txtsexoempleado = new javax.swing.JTextField();
        txtcelularempleado = new javax.swing.JTextField();
        txtcorreoempleado = new javax.swing.JTextField();
        txtsalarioempleado = new javax.swing.JTextField();
        btnRegistrarLocal = new javax.swing.JButton();
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

        txtcodlocal.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcodlocal.setBorder(null);
        txtcodlocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodlocalActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodlocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 210, 40));

        txtcodarea.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcodarea.setBorder(null);
        txtcodarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodareaActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 210, 40));

        txtnombreempleado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtnombreempleado.setBorder(null);
        txtnombreempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreempleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombreempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 210, 40));

        txtapempleado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtapempleado.setBorder(null);
        txtapempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapempleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtapempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 210, 40));

        txtfechaempleado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtfechaempleado.setBorder(null);
        txtfechaempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaempleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfechaempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 210, 40));

        txtdniempleado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtdniempleado.setBorder(null);
        txtdniempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniempleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtdniempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 210, 40));

        txtsexoempleado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtsexoempleado.setBorder(null);
        txtsexoempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsexoempleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtsexoempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 210, 40));

        txtcelularempleado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcelularempleado.setBorder(null);
        txtcelularempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelularempleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcelularempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 210, 40));

        txtcorreoempleado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcorreoempleado.setBorder(null);
        txtcorreoempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoempleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcorreoempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 210, 30));

        txtsalarioempleado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtsalarioempleado.setBorder(null);
        txtsalarioempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalarioempleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtsalarioempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 210, 40));

        btnRegistrarLocal.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistrarLocal.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnRegistrarLocal.setText("Registrar");
        btnRegistrarLocal.setBorderPainted(false);
        btnRegistrarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLocalActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GestionEmpresa.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -30, 1460, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederAdminActionPerformed

    private void txtcodlocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodlocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodlocalActionPerformed

    private void txtcodareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodareaActionPerformed

    private void txtnombreempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreempleadoActionPerformed

    private void txtapempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapempleadoActionPerformed

    private void txtfechaempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaempleadoActionPerformed

    private void txtdniempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdniempleadoActionPerformed

    private void txtsexoempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsexoempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsexoempleadoActionPerformed

    private void txtcelularempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelularempleadoActionPerformed

    private void txtcorreoempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoempleadoActionPerformed

    private void txtsalarioempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalarioempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalarioempleadoActionPerformed

    private void btnRegistrarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarLocalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrarLocal;
    public javax.swing.JButton btnRetrocederAdmin;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField txtapempleado;
    public javax.swing.JTextField txtcelularempleado;
    public javax.swing.JTextField txtcodarea;
    public javax.swing.JTextField txtcodlocal;
    public javax.swing.JTextField txtcorreoempleado;
    public javax.swing.JTextField txtdniempleado;
    public javax.swing.JTextField txtfechaempleado;
    public javax.swing.JTextField txtnombreempleado;
    public javax.swing.JTextField txtsalarioempleado;
    public javax.swing.JTextField txtsexoempleado;
    // End of variables declaration//GEN-END:variables
}
