/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */
public class ADM_RegistrarArea extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADM_Cubiculos1
     */
    public ADM_RegistrarArea() {
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
        txtdescripcionarea = new javax.swing.JTextField();
        btnRegistrarArea = new javax.swing.JButton();
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

        txtdescripcionarea.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtdescripcionarea.setBorder(null);
        txtdescripcionarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionareaActionPerformed(evt);
            }
        });
        getContentPane().add(txtdescripcionarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 630, 240));

        btnRegistrarArea.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistrarArea.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnRegistrarArea.setText("Registrar");
        btnRegistrarArea.setBorderPainted(false);
        btnRegistrarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAreaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/REGISTRARDESCRIPCIONAREA.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -30, 1460, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederAdminActionPerformed

    private void txtdescripcionareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionareaActionPerformed

    private void btnRegistrarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarAreaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrarArea;
    public javax.swing.JButton btnRetrocederAdmin;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField txtdescripcionarea;
    // End of variables declaration//GEN-END:variables
}
