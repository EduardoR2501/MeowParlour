package InterfazGrafica;

import java.sql.*;
import javax.swing.JOptionPane;
import meowparlour.Conexion;

public class ControlUsuarios extends javax.swing.JFrame {

    CrearUsuario NuevoUsuario;
    ReporteUsuarios Reporte;
    
    public ControlUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        CrearInstancias();
    }
    
    private void CrearInstancias(){
        NuevoUsuario = new CrearUsuario(false);
        Reporte = new ReporteUsuarios();
    }
    
    public void CerrarTodo(){
        NuevoUsuario.dispose();
        Reporte.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        BotonCrearUsuario = new javax.swing.JButton();
        BotonEliminarUsuario = new javax.swing.JButton();
        BotonReporteUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 450));
        setMinimumSize(new java.awt.Dimension(800, 450));
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(234, 202, 164));
        Fondo.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.setMaximumSize(new java.awt.Dimension(1200, 675));
        Fondo.setMinimumSize(new java.awt.Dimension(1200, 675));
        Fondo.setName(""); // NOI18N
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonCrearUsuario.png"))); // NOI18N
        BotonCrearUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearUsuarioActionPerformed(evt);
            }
        });
        Fondo.add(BotonCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 210, 280));

        BotonEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonEliminarUsuario.png"))); // NOI18N
        BotonEliminarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarUsuarioActionPerformed(evt);
            }
        });
        Fondo.add(BotonEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 210, 280));

        BotonReporteUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonReporteUsuarios.png"))); // NOI18N
        BotonReporteUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonReporteUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReporteUsuariosActionPerformed(evt);
            }
        });
        Fondo.add(BotonReporteUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 210, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearUsuarioActionPerformed
        NuevoUsuario = new CrearUsuario(false);
        NuevoUsuario.setVisible(true);
    }//GEN-LAST:event_BotonCrearUsuarioActionPerformed

    private void BotonReporteUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReporteUsuariosActionPerformed
        Reporte = new ReporteUsuarios();
        Reporte.setVisible(true);
    }//GEN-LAST:event_BotonReporteUsuariosActionPerformed

    private void BotonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarUsuarioActionPerformed
        String usuarioEliminar = JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario:");
    
        if (usuarioEliminar != null && !usuarioEliminar.isEmpty()) {
            String sql = "DELETE FROM usuarios WHERE usuario = ?";

            try (Connection cn = new Conexion().getConnection();
                 PreparedStatement pst = cn.prepareStatement(sql)) {

                pst.setString(1, usuarioEliminar);
                int rowsDeleted = pst.executeUpdate();

                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún usuario con ese nombre", "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar usuario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de usuario vacío o cancelado", "Operación Cancelada", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BotonEliminarUsuarioActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControlUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrearUsuario;
    private javax.swing.JButton BotonEliminarUsuario;
    private javax.swing.JButton BotonReporteUsuarios;
    private javax.swing.JPanel Fondo;
    // End of variables declaration//GEN-END:variables
}
