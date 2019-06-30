/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorPersonasBD;
import ec.edu.ups.modelo.Persona;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CrearPersona extends javax.swing.JInternalFrame {

    ControladorPersonasBD controladorPersona;
    public CrearPersona(ControladorPersonasBD controladorPersona) {
        initComponents();
        this.controladorPersona=controladorPersona;
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtSalario = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Creacion de Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 18))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Cedula:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 70, 169, 36);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Apellido:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(18, 167, 169, 36);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(18, 113, 169, 36);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(18, 275, 205, 36);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Edad:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(18, 221, 169, 36);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Celular:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(18, 329, 169, 36);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("Salario:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 370, 169, 36);

        jButton1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(350, 440, 139, 56);

        btnGuardar.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar);
        btnGuardar.setBounds(90, 440, 139, 56);
        jPanel1.add(txtSalario);
        txtSalario.setBounds(230, 370, 330, 40);
        jPanel1.add(txtCedula);
        txtCedula.setBounds(230, 72, 330, 40);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(230, 120, 330, 40);
        jPanel1.add(txtApellido);
        txtApellido.setBounds(230, 170, 330, 40);
        jPanel1.add(txtedad);
        txtedad.setBounds(230, 220, 330, 40);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(230, 270, 330, 40);
        jPanel1.add(txtCelular);
        txtCelular.setBounds(230, 320, 330, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Persona persona=new Persona();
        persona.setCedula(txtCedula.getText());
        persona.setNombre(txtNombre.getText());
        persona.setApellido(txtApellido.getText());
        persona.setEdad(Integer.parseInt(txtedad.getText()));
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha;
        try {
            fecha = formato.parse(txtFecha.getText());
             persona.setFechaNacimiento(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(CrearPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        persona.setCelular(txtCelular.getText());
        persona.setSalario(Double.parseDouble(txtSalario.getText()));
        
        controladorPersona.create(persona);
        JOptionPane.showMessageDialog(this, "Creado correctamente");
        
       txtApellido.setText("");
       txtCedula.setText("");
       txtCelular.setText("");
       txtFecha.setText("");
       txtNombre.setText("");
       txtSalario.setText("");
       txtedad.setText("");
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtedad;
    // End of variables declaration//GEN-END:variables
}
