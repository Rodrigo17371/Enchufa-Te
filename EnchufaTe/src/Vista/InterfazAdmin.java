/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */
public class InterfazAdmin extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterfazAdmin1
     */
    public InterfazAdmin() {
        initComponents();
        btnRetrocederAdmin.setContentAreaFilled(false);
        btnRetrocederAdmin.setBorder(null);
        btnCubiculos.setContentAreaFilled(false);
        btnCubiculos.setBorder(null);
        btnEmpleados.setContentAreaFilled(false);
        btnEmpleados.setBorder(null);
        btnProductos.setContentAreaFilled(false);
        btnProductos.setBorder(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProductos = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnCubiculos = new javax.swing.JButton();
        btnRetrocederAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnProductos.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnProductos.setBorderPainted(false);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 160, 40));

        btnEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 160, 40));

        btnCubiculos.setBackground(new java.awt.Color(255, 255, 255));
        btnCubiculos.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnCubiculos.setBorderPainted(false);
        btnCubiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCubiculosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCubiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 160, 40));

        btnRetrocederAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnRetrocederAdmin.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnRetrocederAdmin.setBorderPainted(false);
        btnRetrocederAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetrocederAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Adminenchufat.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnCubiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCubiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCubiculosActionPerformed

    private void btnRetrocederAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCubiculos;
    public javax.swing.JButton btnEmpleados;
    public javax.swing.JButton btnProductos;
    public javax.swing.JButton btnRetrocederAdmin;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
