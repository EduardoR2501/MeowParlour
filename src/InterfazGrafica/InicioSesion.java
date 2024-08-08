package InterfazGrafica;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import meowparlour.Conexion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InicioSesion extends javax.swing.JFrame {
    
    public InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        BarraLateralIzquierda = new javax.swing.JPanel();
        LogoColegio = new javax.swing.JLabel();
        LogoEmpresa = new javax.swing.JLabel();
        TituloPanelIzquierdo = new javax.swing.JLabel();
        TituloIniciarSesion = new javax.swing.JLabel();
        TituloUsuario = new javax.swing.JLabel();
        FieldUsuario = new javax.swing.JTextField();
        TituloContra = new javax.swing.JLabel();
        FieldContra = new javax.swing.JPasswordField();
        BotonInciarSesion = new javax.swing.JButton();
        BotonRegistrate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 675));
        setMinimumSize(new java.awt.Dimension(1200, 675));
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(234, 202, 164));
        Fondo.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.setMaximumSize(new java.awt.Dimension(1200, 675));
        Fondo.setMinimumSize(new java.awt.Dimension(1200, 675));
        Fondo.setName(""); // NOI18N
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateralIzquierda.setBackground(new java.awt.Color(255, 255, 255));
        BarraLateralIzquierda.setMaximumSize(new java.awt.Dimension(350, 750));
        BarraLateralIzquierda.setMinimumSize(new java.awt.Dimension(350, 750));
        BarraLateralIzquierda.setPreferredSize(new java.awt.Dimension(350, 750));

        LogoColegio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoColegio.png"))); // NOI18N
        LogoColegio.setText("jLabel1");

        LogoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoEmpresa.png"))); // NOI18N
        LogoEmpresa.setText("jLabel1");

        TituloPanelIzquierdo.setBackground(new java.awt.Color(255, 255, 255));
        TituloPanelIzquierdo.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        TituloPanelIzquierdo.setForeground(new java.awt.Color(0, 0, 0));
        TituloPanelIzquierdo.setText("Meow Parlour");

        javax.swing.GroupLayout BarraLateralIzquierdaLayout = new javax.swing.GroupLayout(BarraLateralIzquierda);
        BarraLateralIzquierda.setLayout(BarraLateralIzquierdaLayout);
        BarraLateralIzquierdaLayout.setHorizontalGroup(
            BarraLateralIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralIzquierdaLayout.createSequentialGroup()
                .addGroup(BarraLateralIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarraLateralIzquierdaLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(LogoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BarraLateralIzquierdaLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(LogoColegio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BarraLateralIzquierdaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(TituloPanelIzquierdo)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        BarraLateralIzquierdaLayout.setVerticalGroup(
            BarraLateralIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralIzquierdaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(TituloPanelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(LogoColegio)
                .addGap(18, 18, 18)
                .addComponent(LogoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        Fondo.add(BarraLateralIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 675));

        TituloIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        TituloIniciarSesion.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        TituloIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        TituloIniciarSesion.setText("Iniciar Sesión");
        Fondo.add(TituloIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 290, 50));

        TituloUsuario.setBackground(new java.awt.Color(255, 255, 255));
        TituloUsuario.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TituloUsuario.setForeground(new java.awt.Color(0, 0, 0));
        TituloUsuario.setText("Usuario");
        Fondo.add(TituloUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, 50));

        FieldUsuario.setBackground(new java.awt.Color(255, 255, 255));
        FieldUsuario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        FieldUsuario.setForeground(new java.awt.Color(160, 160, 160));
        FieldUsuario.setText("Ingresa tu usuario");
        FieldUsuario.setBorder(null);
        FieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldUsuarioMousePressed(evt);
            }
        });
        FieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsuarioActionPerformed(evt);
            }
        });
        Fondo.add(FieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 690, 60));

        TituloContra.setBackground(new java.awt.Color(255, 255, 255));
        TituloContra.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TituloContra.setForeground(new java.awt.Color(0, 0, 0));
        TituloContra.setText("Contraseña");
        Fondo.add(TituloContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, 50));

        FieldContra.setBackground(new java.awt.Color(255, 255, 255));
        FieldContra.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        FieldContra.setForeground(new java.awt.Color(160, 160, 160));
        FieldContra.setText("12345678");
        FieldContra.setBorder(null);
        FieldContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldContraMousePressed(evt);
            }
        });
        Fondo.add(FieldContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 690, 60));

        BotonInciarSesion.setBackground(new java.awt.Color(64, 71, 65));
        BotonInciarSesion.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonInciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BotonInciarSesion.setText("Iniciar Sesión");
        BotonInciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInciarSesionActionPerformed(evt);
            }
        });
        Fondo.add(BotonInciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 200, 70));

        BotonRegistrate.setBackground(new java.awt.Color(64, 71, 65));
        BotonRegistrate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonRegistrate.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrate.setText("Registrate");
        BotonRegistrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrateActionPerformed(evt);
            }
        });
        Fondo.add(BotonRegistrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 200, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldUsuarioMousePressed
        if(FieldUsuario.getText().equals("Ingresa tu usuario")){
            FieldUsuario.setText("");
            FieldUsuario.setForeground(Color.black);
        }
        if(String.valueOf(FieldContra.getPassword()).isEmpty()){
            FieldContra.setText("12345678");
            FieldContra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_FieldUsuarioMousePressed

    private void FieldContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldContraMousePressed
        if(String.valueOf(FieldContra.getPassword()).equals("12345678")){
            FieldContra.setText("");
            FieldContra.setForeground(Color.black);
        }
        if(FieldUsuario.getText().isEmpty()){
            FieldUsuario.setText("Ingresa tu usuario");
            FieldUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_FieldContraMousePressed

    private void FieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldUsuarioActionPerformed

    private void BotonRegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrateActionPerformed
        CrearUsuario NuevoUsuario = new CrearUsuario(true);
        NuevoUsuario.setVisible(true);
    }//GEN-LAST:event_BotonRegistrateActionPerformed

    private void BotonInciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInciarSesionActionPerformed
        if (!FieldUsuario.getText().trim().isEmpty() && !FieldContra.getText().trim().isEmpty()) {
            Conexion con = new Conexion();
            Connection cn = con.getConnection();

            if (cn != null) {
                PreparedStatement ps = null;
                ResultSet rs = null;
                try {
                    String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ?";
                    ps = cn.prepareStatement(sql);
                    ps.setString(1, FieldUsuario.getText().trim());
                    ps.setString(2, FieldContra.getText().trim());
                    rs = ps.executeQuery();

                    if (rs.next()) {
                        String rol = rs.getString("rol");
                        switch (rol) {
                            case "Administrador":
                                String NombreAdmin = rs.getString("nombre");
                                UsuarioAdmin Administrador = new UsuarioAdmin("Administrador", NombreAdmin);
                                Administrador.setVisible(true);
                                break;
                            case "Empleado":
                                String NombreEmpleado = rs.getString("nombre");
                                UsuarioAdmin Empleado = new UsuarioAdmin("Empleado", NombreEmpleado);
                                Empleado.setVisible(true);
                                break;
                            case "Cliente":
                                String NombreCliente = rs.getString("nombre");
                                UsuarioCliente Cliente = new UsuarioCliente(NombreCliente);
                                Cliente.setVisible(true);
                                break;
                            case "Contador":
                                String NombreContador = rs.getString("nombre");
                                UsuarioAdmin Contador = new UsuarioAdmin("Contador", NombreContador);
                                Contador.setVisible(true);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Rol no reconocido", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    // Cerrar ResultSet y PreparedStatement
                    try {
                        if (rs != null) {
                            rs.close();
                        }
                        if (ps != null) {
                            ps.close();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión con la base de datos", "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingresa usuario y contraseña", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BotonInciarSesionActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateralIzquierda;
    private javax.swing.JButton BotonInciarSesion;
    private javax.swing.JButton BotonRegistrate;
    private javax.swing.JPasswordField FieldContra;
    private javax.swing.JTextField FieldUsuario;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel LogoColegio;
    private javax.swing.JLabel LogoEmpresa;
    private javax.swing.JLabel TituloContra;
    private javax.swing.JLabel TituloIniciarSesion;
    private javax.swing.JLabel TituloPanelIzquierdo;
    private javax.swing.JLabel TituloUsuario;
    // End of variables declaration//GEN-END:variables
}
