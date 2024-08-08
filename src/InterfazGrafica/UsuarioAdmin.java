package InterfazGrafica;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UsuarioAdmin extends javax.swing.JFrame {

    String Usuario;
    
    ControlUsuarios Usuarios;
    ControlProveedores Proveedores;
    ControlInventario Inventario;
    Facturas VerFacturas;
    
    public UsuarioAdmin(String TipoUsuario, String Nombre) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        FieldCargo.setText(TipoUsuario);
        FieldNombreBienvenida.setText("Bienvenido(a), " + Nombre);
        if(TipoUsuario.equals("Administrador")){
            Usuario = "Administrador";
        } else if(TipoUsuario.equals("Empleado")){
            Usuario = "Empleado";
            BotonControlUsuarios.setEnabled(false);
        } else if(TipoUsuario.equals("Contador")){
            Usuario = "Contador";
            BotonControlUsuarios.setEnabled(false);
        }
        
        CrearInstancias();
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                CerrarTodo();
                dispose();
                InicioSesion Interfaz = new InicioSesion();
                Interfaz.setVisible(true);
            }
        });
        
    }
    
    private void CrearInstancias(){
        Usuarios = new ControlUsuarios();
        Proveedores = new ControlProveedores(Usuario);
        Inventario = new ControlInventario(Usuario);
        VerFacturas = new Facturas();
    }
    
    private void CerrarTodo(){
        Usuarios.dispose();
        Proveedores.dispose();
        Inventario.dispose();
        VerFacturas.dispose();
        Usuarios.CerrarTodo();
        Proveedores.CerrarTodo();
        Inventario.CerrarTodo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        BotonControlUsuarios = new javax.swing.JButton();
        BotonProveedores = new javax.swing.JButton();
        BotonInventario = new javax.swing.JButton();
        BotonFacturas = new javax.swing.JButton();
        FieldCargo = new javax.swing.JTextField();
        FieldNombreBienvenida = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        BotonControlUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonUsuarios.png"))); // NOI18N
        BotonControlUsuarios.setToolTipText("");
        BotonControlUsuarios.setAlignmentY(0.0F);
        BotonControlUsuarios.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BotonControlUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonControlUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonControlUsuariosActionPerformed(evt);
            }
        });
        Fondo.add(BotonControlUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 230, 420));

        BotonProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonProveedores.png"))); // NOI18N
        BotonProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProveedoresActionPerformed(evt);
            }
        });
        Fondo.add(BotonProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 230, 420));

        BotonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonInventario.png"))); // NOI18N
        BotonInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInventarioActionPerformed(evt);
            }
        });
        Fondo.add(BotonInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 230, 420));

        BotonFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonFacturas.png"))); // NOI18N
        BotonFacturas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFacturasActionPerformed(evt);
            }
        });
        Fondo.add(BotonFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 160, 230, 420));

        FieldCargo.setEditable(false);
        FieldCargo.setBackground(new java.awt.Color(211, 164, 120));
        FieldCargo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        FieldCargo.setForeground(new java.awt.Color(0, 0, 0));
        FieldCargo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FieldCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Fondo.add(FieldCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, 180, 30));

        FieldNombreBienvenida.setEditable(false);
        FieldNombreBienvenida.setBackground(new java.awt.Color(234, 202, 164));
        FieldNombreBienvenida.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        FieldNombreBienvenida.setForeground(new java.awt.Color(0, 0, 0));
        FieldNombreBienvenida.setBorder(null);
        Fondo.add(FieldNombreBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 40, 740, 50));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cerrar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, 140, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("Realizar compra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Fondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, -1, 40));

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

    private void BotonControlUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonControlUsuariosActionPerformed
        Usuarios.setVisible(true);
    }//GEN-LAST:event_BotonControlUsuariosActionPerformed

    private void BotonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProveedoresActionPerformed
        Proveedores.setVisible(true);
    }//GEN-LAST:event_BotonProveedoresActionPerformed

    private void BotonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInventarioActionPerformed
        Inventario.setVisible(true);
    }//GEN-LAST:event_BotonInventarioActionPerformed

    private void BotonFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFacturasActionPerformed
        VerFacturas.setVisible(true);
    }//GEN-LAST:event_BotonFacturasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CerrarTodo();
        dispose();
        InicioSesion Interfaz = new InicioSesion();
        Interfaz.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RealizarCompraEmpleado CompraEmpleado = new RealizarCompraEmpleado();
        CompraEmpleado.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new UsuarioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonControlUsuarios;
    private javax.swing.JButton BotonFacturas;
    private javax.swing.JButton BotonInventario;
    private javax.swing.JButton BotonProveedores;
    private javax.swing.JTextField FieldCargo;
    private javax.swing.JTextField FieldNombreBienvenida;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
