/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */
public class Cajero_CubiculoV extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADM_Cubiculos1
     */
    public Cajero_CubiculoV() {
        initComponents();

        btnRetrocederAdmin.setContentAreaFilled(false);
        btnRetrocederAdmin.setBorder(null);
        btnadquirir.setContentAreaFilled(false);
        btnadquirir.setBorder(null);
        btnadquirir1.setContentAreaFilled(false);
        btnadquirir1.setBorder(null);
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
        btnadquirir = new javax.swing.JButton();
        btnadquirir1 = new javax.swing.JButton();
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

        btnadquirir.setBackground(new java.awt.Color(255, 0, 0));
        btnadquirir.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnadquirir.setBorderPainted(false);
        btnadquirir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadquirirActionPerformed(evt);
            }
        });
        getContentPane().add(btnadquirir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 120, 30));

        btnadquirir1.setBackground(new java.awt.Color(255, 0, 0));
        btnadquirir1.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnadquirir1.setBorderPainted(false);
        btnadquirir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadquirir1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnadquirir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 570, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cubiculos VIP.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -10, 1440, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederAdminActionPerformed

    private void btnadquirirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadquirirActionPerformed

    }//GEN-LAST:event_btnadquirirActionPerformed

    private void btnadquirir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadquirir1ActionPerformed

    }//GEN-LAST:event_btnadquirir1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRetrocederAdmin;
    public javax.swing.JButton btnadquirir;
    public javax.swing.JButton btnadquirir1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
