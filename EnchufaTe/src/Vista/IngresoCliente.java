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
public class IngresoCliente extends javax.swing.JInternalFrame {

    public IngresoCliente() {
        initComponents();
        btnSiguienteCliente.setContentAreaFilled(false);
        btnSiguienteCliente.setBorder(null);
        txtDniCliente.setBackground(new java.awt.Color(0,0,0,1));
        txtNombreCliente.setBackground(new java.awt.Color(0,0,0,1));
        txtApellidoPaCliente.setBackground(new java.awt.Color(0,0,0,1));
        txtApellidoMaCliente.setBackground(new java.awt.Color(0,0,0,1));
        btnSiguienteCliente.putClientProperty("JButton.buttonType", "roundRect" );
        configurarTextosIngresoCliente();
        BorrarBordesIngresoCliente();
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

        txtApellidoMaCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoPaCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSiguienteCliente = new javax.swing.JButton();
        txtDniCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellidoMaCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        getContentPane().add(txtApellidoMaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 320, 40));

        txtNombreCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        getContentPane().add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 320, 40));

        txtApellidoPaCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        getContentPane().add(txtApellidoPaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 320, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 30, 30));
        getContentPane().add(btnSiguienteCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 160, 50));

        txtDniCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtDniCliente.setBorder(null);
        getContentPane().add(txtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 320, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LOGINuser.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSiguienteCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField txtApellidoMaCliente;
    public javax.swing.JTextField txtApellidoPaCliente;
    public javax.swing.JTextField txtDniCliente;
    public javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
