package InterfazGrafica;

import java.sql.*;
import javax.swing.JOptionPane;
import meowparlour.Conexion;

public class ControlProveedores extends javax.swing.JFrame {

    ListaProveedores Proveedores;
    RegistrarCompra NuevaCompra;
    ListaCompras VerCompras;
    AgregarProveedor NuevoProveedor;
    
    public ControlProveedores(String TipoUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        if(TipoUsuario.equals("Empleado")){
            BotonAgregarProveedor.setEnabled(false);
            BotonEliminarProveedor.setEnabled(false);
            BotonRegistrarCompra.setEnabled(false);
        } else if(TipoUsuario.equals("Contador")){
            BotonAgregarProveedor.setEnabled(false);
            BotonEliminarProveedor.setEnabled(false);
        }
        
        CrearInstancias();
       
    }
    
    private void CrearInstancias(){
        Proveedores = new ListaProveedores();
        NuevaCompra = new RegistrarCompra();
        VerCompras = new ListaCompras();
        NuevoProveedor = new AgregarProveedor();
    }
    
    public void CerrarTodo(){
        Proveedores.dispose();
        NuevaCompra.dispose();
        VerCompras.dispose();
        NuevoProveedor.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        BotonAgregarProveedor = new javax.swing.JButton();
        BotonEliminarProveedor = new javax.swing.JButton();
        BotonVerProveedores = new javax.swing.JButton();
        BotonRegistrarCompra = new javax.swing.JButton();
        BotonListaCompras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1100, 450));
        setMinimumSize(new java.awt.Dimension(1100, 450));
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(234, 202, 164));
        Fondo.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.setMaximumSize(new java.awt.Dimension(1100, 450));
        Fondo.setMinimumSize(new java.awt.Dimension(1100, 450));
        Fondo.setName(""); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(1100, 450));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonAgregarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonAgregarProveedor.png"))); // NOI18N
        BotonAgregarProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarProveedorActionPerformed(evt);
            }
        });
        Fondo.add(BotonAgregarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 180, 280));

        BotonEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonEliminarProveedor.png"))); // NOI18N
        BotonEliminarProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarProveedorActionPerformed(evt);
            }
        });
        Fondo.add(BotonEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 180, 280));

        BotonVerProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonListaProveedores.png"))); // NOI18N
        BotonVerProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonVerProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerProveedoresActionPerformed(evt);
            }
        });
        Fondo.add(BotonVerProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 180, 280));

        BotonRegistrarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonRegistrarCompra.png"))); // NOI18N
        BotonRegistrarCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarCompraActionPerformed(evt);
            }
        });
        Fondo.add(BotonRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 180, 280));

        BotonListaCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonVerListaDeCompras.png"))); // NOI18N
        BotonListaCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonListaCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListaComprasActionPerformed(evt);
            }
        });
        Fondo.add(BotonListaCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, 180, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarProveedorActionPerformed
        Conexion con = new Conexion();
        String ProveedorNIT = JOptionPane.showInputDialog(null, "Ingrese el NIT del proveedor:");

        if (ProveedorNIT != null && !ProveedorNIT.isEmpty()) {
            String sql = "DELETE FROM proveedores WHERE nit = ?";

            try (Connection cn = con.getConnection();
                 PreparedStatement pst = cn.prepareStatement(sql)) {

                pst.setString(1, ProveedorNIT);
                int rowsDeleted = pst.executeUpdate();

                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Proveedor eliminado correctamente", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún proveedor con ese NIT", "Proveedor no encontrado", JOptionPane.WARNING_MESSAGE);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar proveedor: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "NIT de proveedor vacío o cancelado", "Operación Cancelada", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BotonEliminarProveedorActionPerformed

    private void BotonVerProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerProveedoresActionPerformed
        Proveedores = new ListaProveedores();
        Proveedores.setVisible(true);
    }//GEN-LAST:event_BotonVerProveedoresActionPerformed

    private void BotonRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarCompraActionPerformed
        NuevaCompra = new RegistrarCompra();
        NuevaCompra.setVisible(true);
    }//GEN-LAST:event_BotonRegistrarCompraActionPerformed

    private void BotonListaComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListaComprasActionPerformed
        VerCompras = new ListaCompras();
        VerCompras.setVisible(true);
    }//GEN-LAST:event_BotonListaComprasActionPerformed

    private void BotonAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarProveedorActionPerformed
        NuevoProveedor = new AgregarProveedor();
        NuevoProveedor.setVisible(true);
    }//GEN-LAST:event_BotonAgregarProveedorActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControlProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ControlProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarProveedor;
    private javax.swing.JButton BotonEliminarProveedor;
    private javax.swing.JButton BotonListaCompras;
    private javax.swing.JButton BotonRegistrarCompra;
    private javax.swing.JButton BotonVerProveedores;
    private javax.swing.JPanel Fondo;
    // End of variables declaration//GEN-END:variables
}
