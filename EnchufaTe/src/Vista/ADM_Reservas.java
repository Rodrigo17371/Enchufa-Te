/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */
public class ADM_Reservas extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADM_Cubiculos1
     */
    public ADM_Reservas() {
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
        tblDatosReservas = new javax.swing.JTable();
        btnRegistrarReserva = new javax.swing.JButton();
        btnActualizarReserva = new javax.swing.JButton();
        btnEliminarReserva = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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

        tblDatosReservas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDatosReservas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 740, 440));

        btnRegistrarReserva.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistrarReserva.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnRegistrarReserva.setBorderPainted(false);
        btnRegistrarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarReservaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 160, 40));

        btnActualizarReserva.setBackground(new java.awt.Color(153, 153, 153));
        btnActualizarReserva.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnActualizarReserva.setBorderPainted(false);
        btnActualizarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarReservaActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 160, 40));

        btnEliminarReserva.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarReserva.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnEliminarReserva.setBorderPainted(false);
        btnEliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarReservaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 540, 160, 40));

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cliente.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -30, 1460, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederAdminActionPerformed

    private void btnRegistrarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarReservaActionPerformed

    private void btnActualizarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarReservaActionPerformed

    private void btnEliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarReservaActionPerformed

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
    public javax.swing.JButton btnActualizarReserva;
    public javax.swing.JButton btnClientes;
    public javax.swing.JButton btnCompras;
    public javax.swing.JButton btnEliminarReserva;
    public javax.swing.JButton btnRegistrarReserva;
    public javax.swing.JButton btnReservas;
    public javax.swing.JButton btnRetrocederAdmin;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblDatosReservas;
    // End of variables declaration//GEN-END:variables
}
