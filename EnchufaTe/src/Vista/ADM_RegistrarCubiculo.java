/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */
public class ADM_RegistrarCubiculo extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADM_Cubiculos1
     */
    public ADM_RegistrarCubiculo() {
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
        txtNivel_cubiculo = new javax.swing.JTextField();
        btnRegistrarCubiculo = new javax.swing.JButton();
        cbxestado_cubiculo = new javax.swing.JComboBox<>();
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

        txtNivel_cubiculo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtNivel_cubiculo.setBorder(null);
        txtNivel_cubiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNivel_cubiculoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNivel_cubiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 210, 40));

        btnRegistrarCubiculo.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistrarCubiculo.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnRegistrarCubiculo.setText("Registrar");
        btnRegistrarCubiculo.setBorderPainted(false);
        btnRegistrarCubiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCubiculoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarCubiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, 160, 40));

        cbxestado_cubiculo.setBackground(new java.awt.Color(255, 0, 0));
        cbxestado_cubiculo.setForeground(new java.awt.Color(255, 255, 255));
        cbxestado_cubiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Ocupado" }));
        getContentPane().add(cbxestado_cubiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 210, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GestionEmpresa.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -30, 1460, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederAdminActionPerformed

    private void txtNivel_cubiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNivel_cubiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNivel_cubiculoActionPerformed

    private void btnRegistrarCubiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCubiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarCubiculoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrarCubiculo;
    public javax.swing.JButton btnRetrocederAdmin;
    public javax.swing.JComboBox<String> cbxestado_cubiculo;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField txtNivel_cubiculo;
    // End of variables declaration//GEN-END:variables
}