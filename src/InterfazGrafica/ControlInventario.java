package InterfazGrafica;

import java.awt.Color;

public class ControlInventario extends javax.swing.JFrame {

    CrearNuevoProducto NuevoProducto;
    AgregarProductos MasProductos;
    EliminarProductos Eliminar;
    Inventario VerInventario;
    
    public ControlInventario(String TipoUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        if(TipoUsuario.equals("Empleado")){
            BotonCrearProducto.setEnabled(false);
            BotonAgregarProducto.setEnabled(false);
            BotonEliminarProducto.setEnabled(false);
        } else if(TipoUsuario.equals("Contador")){
            BotonCrearProducto.setEnabled(false);
            BotonEliminarProducto.setEnabled(false);
        }
        
        CrearInstancias();
        
    }
    
    public void CrearInstancias(){
        NuevoProducto = new CrearNuevoProducto();
        MasProductos = new AgregarProductos();
        Eliminar = new EliminarProductos();
        VerInventario = new Inventario();
    }
    
    public void CerrarTodo(){
        NuevoProducto.dispose();
        MasProductos.dispose();
        Eliminar.dispose();
        VerInventario.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        BotonCrearProducto = new javax.swing.JButton();
        BotonAgregarProducto = new javax.swing.JButton();
        BotonEliminarProducto = new javax.swing.JButton();
        BotonVerInventario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 470));
        setMinimumSize(new java.awt.Dimension(900, 470));
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(234, 202, 164));
        Fondo.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.setMaximumSize(new java.awt.Dimension(900, 470));
        Fondo.setMinimumSize(new java.awt.Dimension(900, 470));
        Fondo.setName(""); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(900, 470));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonCrearProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonCrearNuevoProducto.png"))); // NOI18N
        BotonCrearProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearProductoActionPerformed(evt);
            }
        });
        Fondo.add(BotonCrearProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 180, 280));

        BotonAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonAgregarProductos.png"))); // NOI18N
        BotonAgregarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarProductoActionPerformed(evt);
            }
        });
        Fondo.add(BotonAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 180, 280));

        BotonEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonEliminarProductos.png"))); // NOI18N
        BotonEliminarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarProductoActionPerformed(evt);
            }
        });
        Fondo.add(BotonEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 180, 280));

        BotonVerInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonVerInventario.png"))); // NOI18N
        BotonVerInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonVerInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerInventarioActionPerformed(evt);
            }
        });
        Fondo.add(BotonVerInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 180, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearProductoActionPerformed
        NuevoProducto = new CrearNuevoProducto();
        NuevoProducto.setVisible(true);
    }//GEN-LAST:event_BotonCrearProductoActionPerformed

    private void BotonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarProductoActionPerformed
        MasProductos = new AgregarProductos();
        MasProductos.setVisible(true);
    }//GEN-LAST:event_BotonAgregarProductoActionPerformed

    private void BotonEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarProductoActionPerformed
        Eliminar = new EliminarProductos();
        Eliminar.setVisible(true);
    }//GEN-LAST:event_BotonEliminarProductoActionPerformed

    private void BotonVerInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerInventarioActionPerformed
        VerInventario = new Inventario();
        VerInventario.setVisible(true);
    }//GEN-LAST:event_BotonVerInventarioActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControlInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ControlInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarProducto;
    private javax.swing.JButton BotonCrearProducto;
    private javax.swing.JButton BotonEliminarProducto;
    private javax.swing.JButton BotonVerInventario;
    private javax.swing.JPanel Fondo;
    // End of variables declaration//GEN-END:variables
}
