/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */
public class ADM_GesArea extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADM_Cubiculos1
     */
    public ADM_GesArea() {
        initComponents();

        btnRetrocederAdmin.setContentAreaFilled(false);
        btnRetrocederAdmin.setBorder(null);
        btnEmpleados.setContentAreaFilled(false);
        btnEmpleados.setBorder(null);
        btnarea.setContentAreaFilled(false);
        btnarea.setBorder(null);
        btnlocales.setContentAreaFilled(false);
        btnlocales.setBorder(null);
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
        tblDatosArea = new javax.swing.JTable();
        btnRegistrarArea = new javax.swing.JButton();
        btnActualizarArea = new javax.swing.JButton();
        btnarea = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnlocales = new javax.swing.JButton();
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

        tblDatosArea.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDatosArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 740, 440));

        btnRegistrarArea.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistrarArea.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnRegistrarArea.setText("Registrar");
        btnRegistrarArea.setBorderPainted(false);
        btnRegistrarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAreaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 160, 40));

        btnActualizarArea.setBackground(new java.awt.Color(153, 153, 153));
        btnActualizarArea.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnActualizarArea.setText("Actualizar");
        btnActualizarArea.setBorderPainted(false);
        btnActualizarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAreaActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 160, 40));

        btnarea.setBackground(new java.awt.Color(255, 255, 255));
        btnarea.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnarea.setBorderPainted(false);
        btnarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnareaActionPerformed(evt);
            }
        });
        getContentPane().add(btnarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 160, 30));

        btnEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 160, 30));

        btnlocales.setBackground(new java.awt.Color(255, 255, 255));
        btnlocales.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnlocales.setBorderPainted(false);
        btnlocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlocalesActionPerformed(evt);
            }
        });
        getContentPane().add(btnlocales, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 160, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GestionEmpresa.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -30, 1460, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederAdminActionPerformed

    private void btnRegistrarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarAreaActionPerformed

    private void btnActualizarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarAreaActionPerformed

    private void btnareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnareaActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnlocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlocalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlocalesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarArea;
    public javax.swing.JButton btnEmpleados;
    public javax.swing.JButton btnRegistrarArea;
    public javax.swing.JButton btnRetrocederAdmin;
    public javax.swing.JButton btnarea;
    public javax.swing.JButton btnlocales;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblDatosArea;
    // End of variables declaration//GEN-END:variables
}
