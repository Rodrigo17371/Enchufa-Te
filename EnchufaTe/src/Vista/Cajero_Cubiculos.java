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
public class Cajero_Cubiculos extends javax.swing.JInternalFrame {
    public Cajero_Cubiculos() {
        initComponents();
    btnultravip.setContentAreaFilled(false);
        btnultravip.setBorder(null);
    btngeneral.setContentAreaFilled(false);
        btngeneral.setBorder(null);
    btngeneral1.setContentAreaFilled(false);
        btngeneral1.setBorder(null);
    btnvip.setContentAreaFilled(false);
        btnvip.setBorder(null);
    btnvip1.setContentAreaFilled(false);
        btnvip1.setBorder(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnultravip = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnvip = new javax.swing.JButton();
        btngeneral = new javax.swing.JButton();
        btnvip1 = new javax.swing.JButton();
        btngeneral1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnultravip.setBackground(new java.awt.Color(255, 0, 0));
        btnultravip.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnultravip.setBorderPainted(false);
        btnultravip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnultravipActionPerformed(evt);
            }
        });
        getContentPane().add(btnultravip, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 250, 50));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 30, 30));

        btnvip.setBackground(new java.awt.Color(255, 0, 0));
        btnvip.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnvip.setBorderPainted(false);
        btnvip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvipActionPerformed(evt);
            }
        });
        getContentPane().add(btnvip, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 310, 50));

        btngeneral.setBackground(new java.awt.Color(255, 0, 0));
        btngeneral.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btngeneral.setBorderPainted(false);
        btngeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngeneralActionPerformed(evt);
            }
        });
        getContentPane().add(btngeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 370, 40));

        btnvip1.setBackground(new java.awt.Color(255, 0, 0));
        btnvip1.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnvip1.setBorderPainted(false);
        btnvip1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvip1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnvip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 200, 40));

        btngeneral1.setBackground(new java.awt.Color(255, 0, 0));
        btngeneral1.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btngeneral1.setBorderPainted(false);
        btngeneral1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngeneral1ActionPerformed(evt);
            }
        });
        getContentPane().add(btngeneral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 120, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ClienteEnchufat.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnultravipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnultravipActionPerformed

    }//GEN-LAST:event_btnultravipActionPerformed

    private void btnvipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvipActionPerformed

    private void btngeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btngeneralActionPerformed

    private void btnvip1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvip1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvip1ActionPerformed

    private void btngeneral1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeneral1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btngeneral1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btngeneral;
    public javax.swing.JButton btngeneral1;
    public javax.swing.JButton btnultravip;
    public javax.swing.JButton btnvip;
    public javax.swing.JButton btnvip1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
