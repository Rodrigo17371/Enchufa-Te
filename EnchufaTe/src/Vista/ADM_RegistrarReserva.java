/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */
public class ADM_RegistrarReserva extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADM_Cubiculos1
     */
    public ADM_RegistrarReserva() {
        initComponents();

        btnRetrocederAdmin.setContentAreaFilled(false);
        btnRetrocederAdmin.setBorder(null);
        txtcodcliente.setBackground(new java.awt.Color(0,0,0,1));
        txtcodempleado.setBackground(new java.awt.Color(0,0,0,1));
        txtfechareserva.setBackground(new java.awt.Color(0,0,0,1));
        txthorareserva.setBackground(new java.awt.Color(0,0,0,1));
        txtcodservicio.setBackground(new java.awt.Color(0,0,0,1));
        txttipopagoreserva.setBackground(new java.awt.Color(0,0,0,1));
        txtcantidadreserva.setBackground(new java.awt.Color(0,0,0,1));
    }
    public void BorrarBordesReserva() {
        txtcodcliente.setBorder(null);
        txtcodempleado.setBorder(null);
        txtfechareserva.setBorder(null);
        txthorareserva.setBorder(null);
        txtcodservicio.setBorder(null);
        txttipopagoreserva.setBorder(null);
        txtcantidadreserva.setBorder(null);
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
        txtcodcliente = new javax.swing.JTextField();
        txtcodempleado = new javax.swing.JTextField();
        txtfechareserva = new javax.swing.JTextField();
        txthorareserva = new javax.swing.JTextField();
        txtcodservicio = new javax.swing.JTextField();
        txttipopagoreserva = new javax.swing.JTextField();
        txtcantidadreserva = new javax.swing.JTextField();
        btnRegistrarReserva = new javax.swing.JButton();
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

        txtcodcliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcodcliente.setBorder(null);
        txtcodcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodclienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 310, 40));

        txtcodempleado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcodempleado.setBorder(null);
        txtcodempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodempleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 310, 40));

        txtfechareserva.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtfechareserva.setBorder(null);
        txtfechareserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechareservaActionPerformed(evt);
            }
        });
        getContentPane().add(txtfechareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 310, 40));

        txthorareserva.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txthorareserva.setBorder(null);
        txthorareserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthorareservaActionPerformed(evt);
            }
        });
        getContentPane().add(txthorareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 310, 40));

        txtcodservicio.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcodservicio.setBorder(null);
        txtcodservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodservicioActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 310, 50));

        txttipopagoreserva.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txttipopagoreserva.setBorder(null);
        txttipopagoreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipopagoreservaActionPerformed(evt);
            }
        });
        getContentPane().add(txttipopagoreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 310, 40));

        txtcantidadreserva.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtcantidadreserva.setBorder(null);
        txtcantidadreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadreservaActionPerformed(evt);
            }
        });
        getContentPane().add(txtcantidadreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 310, 40));

        btnRegistrarReserva.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistrarReserva.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnRegistrarReserva.setText("Registrar");
        btnRegistrarReserva.setBorderPainted(false);
        btnRegistrarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarReservaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/REGISTRARESERVA.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -30, 1460, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederAdminActionPerformed

    private void txtcodclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodclienteActionPerformed

    private void txtcodempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodempleadoActionPerformed

    private void txtfechareservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechareservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechareservaActionPerformed

    private void txthorareservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthorareservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthorareservaActionPerformed

    private void txtcodservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodservicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodservicioActionPerformed

    private void txttipopagoreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipopagoreservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipopagoreservaActionPerformed

    private void txtcantidadreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadreservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadreservaActionPerformed

    private void btnRegistrarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrarReserva;
    public javax.swing.JButton btnRetrocederAdmin;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField txtcantidadreserva;
    public javax.swing.JTextField txtcodcliente;
    public javax.swing.JTextField txtcodempleado;
    public javax.swing.JTextField txtcodservicio;
    public javax.swing.JTextField txtfechareserva;
    public javax.swing.JTextField txthorareserva;
    public javax.swing.JTextField txttipopagoreserva;
    // End of variables declaration//GEN-END:variables
}
