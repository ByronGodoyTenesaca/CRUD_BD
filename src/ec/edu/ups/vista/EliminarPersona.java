/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorPersonasBD;
import ec.edu.ups.modelo.Persona;
import java.text.Format;
import java.text.SimpleDateFormat;

/**
 *
 * @author Usuario
 */
public class EliminarPersona extends javax.swing.JInternalFrame {

    /**
     * Creates new form CrearPersona
     */
    ControladorPersonasBD controladorPersona;
    public EliminarPersona(ControladorPersonasBD controladorPersona) {
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
        btnEliminar = new javax.swing.JButton();
        txtSalario = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar de Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 18))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Cedula:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 50, 169, 36);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Apellido:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 150, 169, 36);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 90, 169, 36);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 250, 205, 36);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Edad:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 200, 169, 36);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Celular:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 310, 169, 36);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("Salario:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 350, 169, 36);

        jButton1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(390, 430, 139, 56);

        btnEliminar.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(240, 430, 139, 56);

        txtSalario.setEditable(false);
        jPanel1.add(txtSalario);
        txtSalario.setBounds(240, 350, 330, 40);
        jPanel1.add(txtCedula);
        txtCedula.setBounds(240, 50, 330, 40);

        txtNombre.setEditable(false);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(240, 100, 330, 40);

        txtApellido.setEditable(false);
        jPanel1.add(txtApellido);
        txtApellido.setBounds(240, 150, 330, 40);

        txtedad.setEditable(false);
        jPanel1.add(txtedad);
        txtedad.setBounds(240, 200, 330, 40);

        txtFecha.setEditable(false);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(240, 250, 330, 40);

        txtCelular.setEditable(false);
        jPanel1.add(txtCelular);
        txtCelular.setBounds(240, 300, 330, 40);

        jButton3.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(90, 430, 139, 56);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controladorPersona.delete(txtCedula.getText());
        txtApellido.setText("");
        txtCedula.setText("");
        txtCelular.setText("");
        txtFecha.setText("");
        txtNombre.setText("");
        txtSalario.setText("");
        txtedad.setText("");
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Persona persona=controladorPersona.buscar(txtCedula.getText());
        
        txtApellido.setText(persona.getApellido());
        txtCedula.setText(persona.getCedula());
        txtCelular.setText(persona.getCelular());
        Format formato = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formato.format(persona.getFechaNacimiento());
        txtFecha.setText(fecha);
        txtNombre.setText(persona.getNombre());
        txtSalario.setText(String.valueOf(persona.getSalario()));
        txtedad.setText(String.valueOf(persona.getEdad()));
        btnEliminar.setEnabled(true);
        
       
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
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
