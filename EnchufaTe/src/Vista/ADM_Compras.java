/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */
public class ADM_Compras extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADM_Cubiculos1
     */
    public ADM_Compras() {
        initComponents();

        btnRetrocederAdmin.setContentAreaFilled(false);
        btnRetrocederAdmin.setBorder(null);
        btnClientes.setContentAreaFilled(false);
        btnClientes.setBorder(null);
        btnCompras.setContentAreaFilled(false);
        btnCompras.setBorder(null);
        btnReservas.setContentAreaFilled(false);
        btnReservas.setBorder(null);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosCompras = new javax.swing.JTable();
        btnRegistrarCompra = new javax.swing.JButton();
        btnActualizarCompra = new javax.swing.JButton();
        btnEliminarCompra = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
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

        tblDatosCompras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDatosCompras);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 740, 440));

        btnRegistrarCompra.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistrarCompra.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnRegistrarCompra.setBorderPainted(false);
        btnRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 160, 40));

        btnActualizarCompra.setBackground(new java.awt.Color(153, 153, 153));
        btnActualizarCompra.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnActualizarCompra.setBorderPainted(false);
        btnActualizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 160, 40));

        btnEliminarCompra.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarCompra.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnEliminarCompra.setBorderPainted(false);
        btnEliminarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 540, 160, 40));

        btnReservas.setBackground(new java.awt.Color(255, 255, 255));
        btnReservas.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnReservas.setBorderPainted(false);
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });
        getContentPane().add(btnReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 160, 30));

        btnCompras.setBackground(new java.awt.Color(255, 255, 255));
        btnCompras.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnCompras.setBorderPainted(false);
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 160, 30));

        btnClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnClientes.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnClientes.setBorderPainted(false);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 160, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cliente.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -30, 1460, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederAdminActionPerformed

    private void btnRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarCompraActionPerformed

    private void btnActualizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarCompraActionPerformed

    private void btnEliminarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCompraActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarCompra;
    public javax.swing.JButton btnClientes;
    public javax.swing.JButton btnCompras;
    public javax.swing.JButton btnEliminarCompra;
    public javax.swing.JButton btnRegistrarCompra;
    public javax.swing.JButton btnReservas;
    public javax.swing.JButton btnRetrocederAdmin;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblDatosCompras;
    // End of variables declaration//GEN-END:variables
}