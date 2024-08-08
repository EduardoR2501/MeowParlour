package InterfazGrafica;

import java.sql.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import meowparlour.Conexion;

public class CrearUsuario extends javax.swing.JFrame {
    
    public CrearUsuario(boolean TipoCliente) {
        initComponents();
        this.setLocationRelativeTo(null);
        if(TipoCliente == true){
            ComboBoxRol.setSelectedItem("Cliente");
            ComboBoxRol.setEnabled(false);
        }
        else{
            ComboBoxRol.setEnabled(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        FieldUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FieldApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxRol = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        FieldConfirmacionContra = new javax.swing.JPasswordField();
        FieldContra = new javax.swing.JPasswordField();
        BotonCrearCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(570, 620));
        setMinimumSize(new java.awt.Dimension(570, 620));
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(234, 202, 164));
        Fondo.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.setMaximumSize(new java.awt.Dimension(570, 620));
        Fondo.setMinimumSize(new java.awt.Dimension(570, 620));
        Fondo.setName(""); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(570, 620));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FieldUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FieldUsuario.setForeground(new java.awt.Color(153, 153, 153));
        FieldUsuario.setText("Usuario");
        FieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldUsuarioMousePressed(evt);
            }
        });
        Fondo.add(FieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 510, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Introduzca su nombre");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Introduzca su nombre de usuario");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 320, 50));

        FieldNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FieldNombre.setForeground(new java.awt.Color(153, 153, 153));
        FieldNombre.setText("Nombre");
        FieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldNombreMousePressed(evt);
            }
        });
        FieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNombreActionPerformed(evt);
            }
        });
        Fondo.add(FieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 510, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Introduzca su apellido");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, 50));

        FieldApellido.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FieldApellido.setForeground(new java.awt.Color(153, 153, 153));
        FieldApellido.setText("Apellido");
        FieldApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldApellidoMousePressed(evt);
            }
        });
        FieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldApellidoActionPerformed(evt);
            }
        });
        Fondo.add(FieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 510, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Introduzca su contraseña");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 240, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Rol");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 230, 50));

        ComboBoxRol.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ComboBoxRol.setForeground(new java.awt.Color(0, 0, 0));
        ComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Contador", "Empleado", "Cliente" }));
        ComboBoxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxRolActionPerformed(evt);
            }
        });
        Fondo.add(ComboBoxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 190, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Confirme su contraseña");
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 230, 50));

        FieldConfirmacionContra.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        FieldConfirmacionContra.setForeground(new java.awt.Color(153, 153, 153));
        FieldConfirmacionContra.setText("********");
        FieldConfirmacionContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldConfirmacionContraMousePressed(evt);
            }
        });
        Fondo.add(FieldConfirmacionContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 510, 40));

        FieldContra.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        FieldContra.setForeground(new java.awt.Color(153, 153, 153));
        FieldContra.setText("********");
        FieldContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldContraMousePressed(evt);
            }
        });
        Fondo.add(FieldContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 510, 40));

        BotonCrearCuenta.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        BotonCrearCuenta.setText("Crear cuenta");
        BotonCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearCuentaActionPerformed(evt);
            }
        });
        Fondo.add(BotonCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 270, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldApellidoActionPerformed

    private void FieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNombreActionPerformed

    private void FieldNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldNombreMousePressed
        if(FieldNombre.getText().equals("Nombre")){
            FieldNombre.setText("");
            FieldNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_FieldNombreMousePressed

    private void FieldApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldApellidoMousePressed
        if(FieldApellido.getText().equals("Apellido")){
            FieldApellido.setText("");
            FieldApellido.setForeground(Color.black);
        }
    }//GEN-LAST:event_FieldApellidoMousePressed

    private void FieldUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldUsuarioMousePressed
        if(FieldUsuario.getText().equals("Usuario")){
            FieldUsuario.setText("");
            FieldUsuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_FieldUsuarioMousePressed

    private void FieldContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldContraMousePressed
        if(FieldContra.getText().equals("********")){
            FieldContra.setText("");
            FieldContra.setForeground(Color.black);
        }
    }//GEN-LAST:event_FieldContraMousePressed

    private void FieldConfirmacionContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldConfirmacionContraMousePressed
        if(FieldConfirmacionContra.getText().equals("********")){
            FieldConfirmacionContra.setText("");
            FieldConfirmacionContra.setForeground(Color.black);
        }
    }//GEN-LAST:event_FieldConfirmacionContraMousePressed

    private void BotonCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearCuentaActionPerformed
        Conexion con = new Conexion();
        String nombre = FieldNombre.getText().trim();
        String apellido = FieldApellido.getText().trim();
        String usuario = FieldUsuario.getText().trim();
        String contrasena = FieldContra.getText();
        String confirmacionContrasena = FieldConfirmacionContra.getText();

        if (!nombre.isEmpty() && !nombre.equals("Nombre") 
                && !apellido.isEmpty() && !apellido.equals("Apellido") 
                && !usuario.isEmpty() && !usuario.equals("Usuario") 
                && !contrasena.isEmpty() && !contrasena.equals("********") 
                && !confirmacionContrasena.isEmpty() && !confirmacionContrasena.equals("********")) {

            if (contrasena.equals(confirmacionContrasena)) {
                try (Connection cn = con.getConnection()) {
                    String sqlVerificarUsuario = "SELECT usuario FROM usuarios WHERE usuario = ?";
                    try (PreparedStatement pstVerificarUsuario = cn.prepareStatement(sqlVerificarUsuario)) {
                        pstVerificarUsuario.setString(1, usuario);
                        ResultSet rs = pstVerificarUsuario.executeQuery();

                        if (rs.next()) {
                            JOptionPane.showMessageDialog(null, "El nombre de usuario ya está en uso", "Usuario existente", JOptionPane.WARNING_MESSAGE);
                            dispose();
                        } else {
                            String sqlInsertarUsuario = "INSERT INTO usuarios (nombre, apellido, usuario, contraseña, rol) VALUES (?, ?, ?, ?, ?)";
                            try (PreparedStatement pstInsertarUsuario = cn.prepareStatement(sqlInsertarUsuario)) {
                                pstInsertarUsuario.setString(1, nombre);
                                pstInsertarUsuario.setString(2, apellido);
                                pstInsertarUsuario.setString(3, usuario);
                                pstInsertarUsuario.setString(4, contrasena);
                                String rolSeleccionado = ComboBoxRol.getSelectedItem().toString();
                                pstInsertarUsuario.setString(5, rolSeleccionado);
                                int rowsInserted = pstInsertarUsuario.executeUpdate();

                                if (rowsInserted > 0) {
                                    JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
                                    dispose();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error al crear la cuenta", "Error", JOptionPane.ERROR_MESSAGE);
                                    dispose();
                                }
                            }
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta", "Error", JOptionPane.ERROR_MESSAGE);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña no coincide", "Contraseña inválida", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor llena los campos correctamente", "Campos inválidos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BotonCrearCuentaActionPerformed

    private void ComboBoxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxRolActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario(false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrearCuenta;
    private javax.swing.JComboBox<String> ComboBoxRol;
    private javax.swing.JTextField FieldApellido;
    private javax.swing.JPasswordField FieldConfirmacionContra;
    private javax.swing.JPasswordField FieldContra;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldUsuario;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
