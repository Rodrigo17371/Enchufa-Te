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
    btnSiguienteCliente.setContentAreaFilled(false);
        btnSiguienteCliente.setBorder(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSiguienteCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSiguienteCliente.setBackground(new java.awt.Color(255, 0, 0));
        btnSiguienteCliente.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnSiguienteCliente.setBorderPainted(false);
        btnSiguienteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguienteCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 370, 230));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 30, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 600));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ClienteEnchufat.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteClienteActionPerformed

    }//GEN-LAST:event_btnSiguienteClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSiguienteCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
