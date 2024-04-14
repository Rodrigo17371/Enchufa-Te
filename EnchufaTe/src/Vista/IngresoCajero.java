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
public class IngresoCajero extends javax.swing.JInternalFrame {

    public IngresoCajero() {
        initComponents();
        btnRetrocederCli.setContentAreaFilled(false);
        txtDniCliente.setBackground(new java.awt.Color(0,0,0,1));
        txtNombreCliente.setBackground(new java.awt.Color(0,0,0,1));
        txtApellidoPaCliente.setBackground(new java.awt.Color(0,0,0,1));
        txtApellidoMaCliente.setBackground(new java.awt.Color(0,0,0,1));
        btnSiguienteCliente.putClientProperty("JButton.buttonType", "roundRect" );
        configurarTextosIngresoCliente();
    }
    public void BorrarBordesIngresoCliente() {
        txtDniCliente.setBorder(null);
        txtNombreCliente.setBorder(null);
        txtApellidoPaCliente.setBorder(null);
        txtApellidoMaCliente.setBorder(null);
    }
    public void configurarTextosIngresoCliente() {
        txtDniCliente.setText("DNI"); // Establece el texto inicial
        txtNombreCliente.setText("Nombre");
        txtApellidoPaCliente.setText("Apellido Paterno");
        txtApellidoMaCliente.setText("Apellido Materno");
        txtDniCliente.setForeground(Color.LIGHT_GRAY); // Establece el color de texto en gris
        txtNombreCliente.setForeground(Color.LIGHT_GRAY);
        txtApellidoPaCliente.setForeground(Color.LIGHT_GRAY);
        txtApellidoMaCliente.setForeground(Color.LIGHT_GRAY);
        // Agrega un FocusListener para el campo DNI
        txtDniCliente.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando el campo obtiene el foco, borra el texto y cambia el color del texto a negro
                if (txtDniCliente.getText().equals("DNI")) {
                    txtDniCliente.setText("");
                    txtDniCliente.setForeground(Color.WHITE);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando el campo pierde el foco y está vacío, vuelve a mostrar "DNI" en gris
                if (txtDniCliente.getText().isEmpty()) {
                    txtDniCliente.setText("DNI");
                    txtDniCliente.setForeground(Color.LIGHT_GRAY);
                }
            }
            
        });
        //Nombre 
        txtNombreCliente.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando el campo obtiene el foco, borra el texto y cambia el color del texto a negro
                if (txtNombreCliente.getText().equals("Nombre")) {
                    txtNombreCliente.setText("");
                    txtNombreCliente.setForeground(Color.WHITE);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando el campo pierde el foco y está vacío, vuelve a mostrar "DNI" en gris
                if (txtNombreCliente.getText().isEmpty()) {
                    txtNombreCliente.setText("Nombre");
                    txtNombreCliente.setForeground(Color.LIGHT_GRAY);
                }
            }
            
        });
        //Apellido Paterno
        txtApellidoPaCliente.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando el campo obtiene el foco, borra el texto y cambia el color del texto a negro
                if (txtApellidoPaCliente.getText().equals("Apellido Paterno")) {
                    txtApellidoPaCliente.setText("");
                    txtApellidoPaCliente.setForeground(Color.WHITE);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando el campo pierde el foco y está vacío, vuelve a mostrar "DNI" en gris
                if (txtApellidoPaCliente.getText().isEmpty()) {
                    txtApellidoPaCliente.setText("Apellido Paterno");
                    txtApellidoPaCliente.setForeground(Color.LIGHT_GRAY);
                }
            }
            
        });
        //Apellido Materno
        txtApellidoMaCliente.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando el campo obtiene el foco, borra el texto y cambia el color del texto a negro
                if (txtApellidoMaCliente.getText().equals("Apellido Materno")) {
                    txtApellidoMaCliente.setText("");
                    txtApellidoMaCliente.setForeground(Color.WHITE);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando el campo pierde el foco y está vacío, vuelve a mostrar "DNI" en gris
                if (txtApellidoMaCliente.getText().isEmpty()) {
                    txtApellidoMaCliente.setText("Apellido Materno");
                    txtApellidoMaCliente.setForeground(Color.LIGHT_GRAY);
                }
            }
        });
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDniCliente = new javax.swing.JTextField();
        btnSiguienteCliente = new javax.swing.JButton();
        txtApellidoMaCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoPaCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnRetrocederCli = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDniCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtDniCliente.setBorder(null);
        txtDniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 340, 40));

        btnSiguienteCliente.setBackground(new java.awt.Color(255, 0, 0));
        btnSiguienteCliente.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnSiguienteCliente.setText("Siguiente");
        btnSiguienteCliente.setBorderPainted(false);
        btnSiguienteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguienteCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 400, 50));

        txtApellidoMaCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        getContentPane().add(txtApellidoMaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 340, 40));

        txtNombreCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        getContentPane().add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 340, 40));

        txtApellidoPaCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        getContentPane().add(txtApellidoPaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 340, 40));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("___________________________________________________________________");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("___________________________________________________________________");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("___________________________________________________________________");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("___________________________________________________________________");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        btnRetrocederCli.setBackground(new java.awt.Color(255, 255, 255));
        btnRetrocederCli.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnRetrocederCli.setBorderPainted(false);
        btnRetrocederCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederCliActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetrocederCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 60));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 30, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniClienteActionPerformed

    private void btnSiguienteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteClienteActionPerformed

    }//GEN-LAST:event_btnSiguienteClienteActionPerformed

    private void btnRetrocederCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrocederCliActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRetrocederCli;
    public javax.swing.JButton btnSiguienteCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JTextField txtApellidoMaCliente;
    public javax.swing.JTextField txtApellidoPaCliente;
    public javax.swing.JTextField txtDniCliente;
    public javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
