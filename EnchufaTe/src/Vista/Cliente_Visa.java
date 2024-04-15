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
public class Cliente_Visa extends javax.swing.JInternalFrame {

    public Cliente_Visa() {
        initComponents();
        /*
        btnAdministrador.putClientProperty("JButton.buttonType", "roundRect" );
        btnCliente.putClientProperty("JButton.buttonType", "roundRect" );*/
        btnpagarahora.setContentAreaFilled(false);
        configurarTextosPago();
    }
    public void configurarTextosPago() {
        txtitular.setText("Ej. Aldo Santos Borja"); 
        txtnumerotarjeta.setText("XXXX XXXX XXXX XXXX");
        txtdireccion.setText("Ej. Calle LaVictoria123");
        txtprovincia.setText("Ej. Lima");
        txtciudad.setText("Ej. Lima"); 
        txtcodigopostal.setText("Ej. 12345");
        txtfechavencimiento.setText("MM/YYYY");
        txtcvc.setText("Ej. 123");
        txtitular.putClientProperty("JComponent.roundRect", true );
        txtnumerotarjeta.putClientProperty("JComponent.roundRect", true );
        txtdireccion.putClientProperty("JComponent.roundRect", true );
        txtprovincia.putClientProperty("JComponent.roundRect", true );
        txtciudad.putClientProperty("JComponent.roundRect", true );
        txtcodigopostal.putClientProperty("JComponent.roundRect", true );
        txtfechavencimiento.putClientProperty("JComponent.roundRect", true );
        txtcvc.putClientProperty("JComponent.roundRect", true );
        txtmontototal.putClientProperty("JComponent.roundRect", true );
        txtitular.setForeground(Color.LIGHT_GRAY); // Establece el color de texto en gris
        txtnumerotarjeta.setForeground(Color.LIGHT_GRAY);
        txtdireccion.setForeground(Color.LIGHT_GRAY);
        txtprovincia.setForeground(Color.LIGHT_GRAY);
        txtciudad.setForeground(Color.LIGHT_GRAY); // Establece el color de texto en gris
        txtcodigopostal.setForeground(Color.LIGHT_GRAY);
        txtfechavencimiento.setForeground(Color.LIGHT_GRAY);
        txtcvc.setForeground(Color.LIGHT_GRAY);
        // Agrega un FocusListener para el campo DNI
        txtitular.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando el campo obtiene el foco, borra el texto y cambia el color del texto a negro
                if (txtitular.getText().equals("Ej. Aldo Santos Borja")) {
                    txtitular.setText("");
                    txtitular.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando el campo pierde el foco y está vacío, vuelve a mostrar "DNI" en gris
                if (txtitular.getText().isEmpty()) {
                    txtitular.setText("Ej. Aldo Santos Borja");
                    txtitular.setForeground(Color.LIGHT_GRAY);
                }
            }
            
        });
        //Nombre 
        txtnumerotarjeta.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando el campo obtiene el foco, borra el texto y cambia el color del texto a negro
                if (txtnumerotarjeta.getText().equals("XXXX XXXX XXXX XXXX")) {
                    txtnumerotarjeta.setText("");
                    txtnumerotarjeta.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando el campo pierde el foco y está vacío, vuelve a mostrar "DNI" en gris
                if (txtnumerotarjeta.getText().isEmpty()) {
                    txtnumerotarjeta.setText("XXXX XXXX XXXX XXXX");
                    txtnumerotarjeta.setForeground(Color.LIGHT_GRAY);
                }
            }
            
        });
        //Apellido Paterno
        txtdireccion.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando el campo obtiene el foco, borra el texto y cambia el color del texto a negro
                if (txtdireccion.getText().equals("Ej. Calle LaVictoria123")) {
                    txtdireccion.setText("");
                    txtdireccion.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando el campo pierde el foco y está vacío, vuelve a mostrar "DNI" en gris
                if (txtdireccion.getText().isEmpty()) {
                    txtdireccion.setText("Ej. Calle LaVictoria123");
                    txtdireccion.setForeground(Color.LIGHT_GRAY);
                }
            }
            
        });
        //Apellido Materno
        txtprovincia.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando el campo obtiene el foco, borra el texto y cambia el color del texto a negro
                if (txtprovincia.getText().equals("Ej. Lima")) {
                    txtprovincia.setText("");
                    txtprovincia.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando el campo pierde el foco y está vacío, vuelve a mostrar "DNI" en gris
                if (txtprovincia.getText().isEmpty()) {
                    txtprovincia.setText("Ej. Lima");
                    txtprovincia.setForeground(Color.LIGHT_GRAY);
                }
            }
        });
        txtciudad.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando el campo obtiene el foco, borra el texto y cambia el color del texto a negro
                if (txtciudad.getText().equals("Ej. Lima")) {
                    txtciudad.setText("");
                    txtciudad.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando el campo pierde el foco y está vacío, vuelve a mostrar "DNI" en gris
                if (txtciudad.getText().isEmpty()) {
                    txtciudad.setText("Ej. Lima");
                    txtciudad.setForeground(Color.LIGHT_GRAY);
                }
            }
        });
        txtcodigopostal.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando el campo obtiene el foco, borra el texto y cambia el color del texto a negro
                if (txtcodigopostal.getText().equals("Ej. 12345")) {
                    txtcodigopostal.setText("");
                    txtcodigopostal.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando el campo pierde el foco y está vacío, vuelve a mostrar "DNI" en gris
                if (txtcodigopostal.getText().isEmpty()) {
                    txtcodigopostal.setText("Ej. 12345");
                    txtcodigopostal.setForeground(Color.LIGHT_GRAY);
                }
            }
        });
        txtfechavencimiento.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando el campo obtiene el foco, borra el texto y cambia el color del texto a negro
                if (txtfechavencimiento.getText().equals("MM/YYYY")) {
                    txtfechavencimiento.setText("");
                    txtfechavencimiento.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando el campo pierde el foco y está vacío, vuelve a mostrar "DNI" en gris
                if (txtfechavencimiento.getText().isEmpty()) {
                    txtfechavencimiento.setText("MM/YYYY");
                    txtfechavencimiento.setForeground(Color.LIGHT_GRAY);
                }
            }
        });
        txtcvc.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando el campo obtiene el foco, borra el texto y cambia el color del texto a negro
                if (txtcvc.getText().equals("Ej. 123")) {
                    txtcvc.setText("");
                    txtcvc.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando el campo pierde el foco y está vacío, vuelve a mostrar "DNI" en gris
                if (txtcvc.getText().isEmpty()) {
                    txtcvc.setText("Ej. 123");
                    txtcvc.setForeground(Color.LIGHT_GRAY);
                }
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnpagarahora = new javax.swing.JButton();
        txtnumerotarjeta = new javax.swing.JTextField();
        txtmontototal = new javax.swing.JTextField();
        txtciudad = new javax.swing.JTextField();
        txtcodigopostal = new javax.swing.JTextField();
        txtfechavencimiento = new javax.swing.JTextField();
        txtcvc = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtprovincia = new javax.swing.JTextField();
        txtitular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnpagarahora.setBackground(new java.awt.Color(0, 204, 0));
        btnpagarahora.setFont(new java.awt.Font("Monospac821 BT", 0, 24)); // NOI18N
        btnpagarahora.setForeground(new java.awt.Color(255, 255, 255));
        btnpagarahora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnpagarahora.png"))); // NOI18N
        btnpagarahora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnpagarahora.setBorderPainted(false);
        btnpagarahora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagarahoraActionPerformed(evt);
            }
        });
        getContentPane().add(btnpagarahora, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 370, 60));

        txtnumerotarjeta.setBackground(new java.awt.Color(237, 237, 237));
        getContentPane().add(txtnumerotarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 254, 47));

        txtmontototal.setBackground(new java.awt.Color(237, 237, 237));
        getContentPane().add(txtmontototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, 70));

        txtciudad.setBackground(new java.awt.Color(237, 237, 237));
        getContentPane().add(txtciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 198, 47));

        txtcodigopostal.setBackground(new java.awt.Color(237, 237, 237));
        getContentPane().add(txtcodigopostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 198, 47));

        txtfechavencimiento.setBackground(new java.awt.Color(237, 237, 237));
        getContentPane().add(txtfechavencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 198, 47));

        txtcvc.setBackground(new java.awt.Color(237, 237, 237));
        getContentPane().add(txtcvc, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 198, 47));

        txtdireccion.setBackground(new java.awt.Color(237, 237, 237));
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 198, 47));

        txtprovincia.setBackground(new java.awt.Color(237, 237, 237));
        getContentPane().add(txtprovincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 198, 47));

        txtitular.setBackground(new java.awt.Color(237, 237, 237));
        txtitular.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 254, 47));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fondovisa.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpagarahoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagarahoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpagarahoraActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnpagarahora;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField txtciudad;
    public javax.swing.JTextField txtcodigopostal;
    public javax.swing.JTextField txtcvc;
    public javax.swing.JTextField txtdireccion;
    public javax.swing.JTextField txtfechavencimiento;
    public javax.swing.JTextField txtitular;
    public javax.swing.JTextField txtmontototal;
    public javax.swing.JTextField txtnumerotarjeta;
    public javax.swing.JTextField txtprovincia;
    // End of variables declaration//GEN-END:variables
}
