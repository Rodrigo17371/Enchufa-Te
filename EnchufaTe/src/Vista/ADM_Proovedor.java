/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */
public class ADM_Proovedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADM_Cubiculos1
     */
    public ADM_Proovedor() {
        initComponents();

        btnRetrocederAdmin.setContentAreaFilled(false);
        btnRetrocederAdmin.setBorder(null);
        btnproductos.setContentAreaFilled(false);
        btnproductos.setBorder(null);
        btnproveedor.setContentAreaFilled(false);
        btnproveedor.setBorder(null);
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
        btnproductos = new javax.swing.JButton();
        btnproveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosProveedor = new javax.swing.JTable();
        btnRegistrarProveedor = new javax.swing.JButton();
        btnActualizarProveedor = new javax.swing.JButton();
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

        btnproductos.setBackground(new java.awt.Color(255, 255, 255));
        btnproductos.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnproductos.setBorderPainted(false);
        btnproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 160, 30));

        btnproveedor.setBackground(new java.awt.Color(255, 255, 255));
        btnproveedor.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnproveedor.setBorderPainted(false);
        btnproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproveedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 160, 30));

        tblDatosProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDatosProveedor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 740, 440));

        btnRegistrarProveedor.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistrarProveedor.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnRegistrarProveedor.setText("Registrar");
        btnRegistrarProveedor.setBorderPainted(false);
        btnRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 160, 40));

        btnActualizarProveedor.setBackground(new java.awt.Color(153, 153, 153));
        btnActualizarProveedor.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnActualizarProveedor.setText("Actualizar");
        btnActualizarProveedor.setBorderPainted(false);
        btnActualizarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/productos.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -40, 1440, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederAdminActionPerformed

    private void btnproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnproductosActionPerformed

    private void btnproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnproveedorActionPerformed

    private void btnRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarProveedorActionPerformed

    private void btnActualizarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarProveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarProveedor;
    public javax.swing.JButton btnRegistrarProveedor;
    public javax.swing.JButton btnRetrocederAdmin;
    public javax.swing.JButton btnproductos;
    public javax.swing.JButton btnproveedor;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblDatosProveedor;
    // End of variables declaration//GEN-END:variables
}
