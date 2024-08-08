package InterfazGrafica;
import javax.swing.JOptionPane;
import meowparlour.Conexion;
import java.sql.*;

public class AgregarProductos extends javax.swing.JFrame {

    public AgregarProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        BotonCrearProducto.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FieldCodigoDeBarras = new javax.swing.JTextField();
        CantidadParaAgregar = new javax.swing.JSpinner();
        BotonCrearProducto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        NombreProducto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(590, 375));
        setMinimumSize(new java.awt.Dimension(590, 375));
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(234, 202, 164));
        Fondo.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.setMaximumSize(new java.awt.Dimension(590, 375));
        Fondo.setMinimumSize(new java.awt.Dimension(590, 375));
        Fondo.setName(""); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(590, 375));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Producto");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Código de barras");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 220, 50));

        FieldCodigoDeBarras.setBackground(new java.awt.Color(246, 244, 234));
        FieldCodigoDeBarras.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        FieldCodigoDeBarras.setForeground(new java.awt.Color(0, 0, 0));
        FieldCodigoDeBarras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FieldCodigoDeBarras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        FieldCodigoDeBarras.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FieldCodigoDeBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCodigoDeBarrasActionPerformed(evt);
            }
        });
        Fondo.add(FieldCodigoDeBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 450, 60));

        CantidadParaAgregar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Fondo.add(CantidadParaAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 250, 60));

        BotonCrearProducto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonCrearProducto.setText("Agregar productos");
        BotonCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearProductoActionPerformed(evt);
            }
        });
        Fondo.add(BotonCrearProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 250, 60));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cantidad ");
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, 50));

        NombreProducto.setEditable(false);
        NombreProducto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        NombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.add(NombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 520, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonBorrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldCodigoDeBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCodigoDeBarrasActionPerformed
        Conexion con = new Conexion();
        String codigoDeBarras = FieldCodigoDeBarras.getText().trim();
        String sql = "SELECT nombre FROM productos WHERE CodigoDeBarras = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = con.getConnection();

            if (conn == null || conn.isClosed()) {
                conn = con.getConnection();
            }

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, codigoDeBarras);

            rs = stmt.executeQuery();

            if (rs.next()) {
                String nombreProducto = rs.getString("nombre");
                NombreProducto.setText(nombreProducto);
                BotonCrearProducto.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún producto con ese código de barras", "Producto no encontrado", JOptionPane.WARNING_MESSAGE);
                NombreProducto.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar buscar el producto: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_FieldCodigoDeBarrasActionPerformed

    private void BotonCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearProductoActionPerformed
        Conexion con = new Conexion();
        String codigoDeBarras = FieldCodigoDeBarras.getText().trim();
        int cantidadAAgregar = (int) CantidadParaAgregar.getValue();

        String sql = "UPDATE productos SET Cantidad = Cantidad + ? WHERE CodigoDeBarras = ?";
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = con.getConnection();

            // Verificar y reabrir la conexión si está cerrada
            if (conn == null || conn.isClosed()) {
                conn = con.getConnection();
            }

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, cantidadAAgregar);
            stmt.setString(2, codigoDeBarras);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Cantidad actualizada exitosamente para el producto", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún producto con ese código de barras", "Producto no encontrado", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar actualizar el producto: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            dispose();
        } finally {
            // Cerrar recursos
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_BotonCrearProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FieldCodigoDeBarras.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrearProducto;
    private javax.swing.JSpinner CantidadParaAgregar;
    private javax.swing.JTextField FieldCodigoDeBarras;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField NombreProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
