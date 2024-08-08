package InterfazGrafica;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import meowparlour.Conexion;

public class RegistrarCompra extends javax.swing.JFrame {

    public RegistrarCompra() {
        initComponents();
        this.setLocationRelativeTo(null);
        ComponentesInvisibles();
    }
    
    private void ComponentesInvisibles(){
        LabelProductos.setVisible(false);
        FieldProductos.setVisible(false);
        LabelDescripcion.setVisible(false);
        FieldDescripcion.setVisible(false);
        LabelMonto.setVisible(false);
        FieldMonto.setVisible(false);
        BotonRegistrarCompra.setVisible(false);
    }
    
    private void ComponentesVisibles(){
        LabelProductos.setVisible(true);
        FieldProductos.setVisible(true);
        LabelDescripcion.setVisible(true);
        FieldDescripcion.setVisible(true);
        LabelMonto.setVisible(true);
        FieldMonto.setVisible(true);
        BotonRegistrarCompra.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        LabelProductos = new javax.swing.JLabel();
        FieldNIT = new javax.swing.JTextField();
        BotonRegistrarCompra = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        FieldProductos = new javax.swing.JTextField();
        LabelNIT = new javax.swing.JLabel();
        LabelDescripcion = new javax.swing.JLabel();
        FieldDescripcion = new javax.swing.JTextField();
        LabelMonto = new javax.swing.JLabel();
        FieldMonto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(570, 500));
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(234, 202, 164));
        Fondo.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.setMaximumSize(new java.awt.Dimension(570, 520));
        Fondo.setMinimumSize(new java.awt.Dimension(570, 520));
        Fondo.setName(""); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(570, 520));
        Fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FondoMousePressed(evt);
            }
        });
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelProductos.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LabelProductos.setForeground(new java.awt.Color(0, 0, 0));
        LabelProductos.setText("Productos");
        Fondo.add(LabelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, 50));

        FieldNIT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FieldNIT.setForeground(new java.awt.Color(0, 0, 0));
        FieldNIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldNITMousePressed(evt);
            }
        });
        FieldNIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNITActionPerformed(evt);
            }
        });
        Fondo.add(FieldNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 350, 40));

        BotonRegistrarCompra.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BotonRegistrarCompra.setText("Registrar compra");
        BotonRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarCompraActionPerformed(evt);
            }
        });
        Fondo.add(BotonRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 260, 50));

        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonBuscar.png"))); // NOI18N
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });
        Fondo.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 40, 40));

        FieldProductos.setEditable(false);
        FieldProductos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FieldProductos.setForeground(new java.awt.Color(0, 0, 0));
        FieldProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldProductosMousePressed(evt);
            }
        });
        FieldProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldProductosActionPerformed(evt);
            }
        });
        Fondo.add(FieldProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 510, 40));

        LabelNIT.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LabelNIT.setForeground(new java.awt.Color(0, 0, 0));
        LabelNIT.setText("NIT del proveedor");
        Fondo.add(LabelNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 220, 50));

        LabelDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LabelDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        LabelDescripcion.setText("Descripción de la compra");
        Fondo.add(LabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 280, 50));

        FieldDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FieldDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        FieldDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldDescripcionMousePressed(evt);
            }
        });
        FieldDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldDescripcionActionPerformed(evt);
            }
        });
        Fondo.add(FieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 510, 40));

        LabelMonto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LabelMonto.setForeground(new java.awt.Color(0, 0, 0));
        LabelMonto.setText("Monto de la compra (solo dígitos)");
        Fondo.add(LabelMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 350, 50));

        FieldMonto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FieldMonto.setForeground(new java.awt.Color(0, 0, 0));
        FieldMonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldMontoMousePressed(evt);
            }
        });
        FieldMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldMontoActionPerformed(evt);
            }
        });
        Fondo.add(FieldMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 510, 40));

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

    private void FieldNITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNITActionPerformed

    private void FondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoMousePressed

    }//GEN-LAST:event_FondoMousePressed

    private void FieldNITMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldNITMousePressed
        if(FieldNIT.getText().equals("NIT")){
            FieldNIT.setText("");
            FieldNIT.setForeground(Color.black);
        }
    }//GEN-LAST:event_FieldNITMousePressed

    private void BotonRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarCompraActionPerformed
        Conexion con = new Conexion();
        String proveedorNit = FieldNIT.getText().trim();
        String productoDistribuido = FieldProductos.getText().trim();
        String descripcionCompra = FieldDescripcion.getText().trim();
        double montoCompra = Double.parseDouble(FieldMonto.getText().trim());
        LocalDate fechaCompra = LocalDate.now();

        String sql = "INSERT INTO compras (proveedor_nit, producto_distribuido, descripcion, monto, fecha_compra) VALUES (?, ?, ?, ?, ?)";

        try (Connection cn = con.getConnection();
             PreparedStatement pst = cn.prepareStatement(sql)) {

            pst.setString(1, proveedorNit);
            pst.setString(2, productoDistribuido);
            pst.setString(3, descripcionCompra);
            pst.setDouble(4, montoCompra);
            pst.setDate(5, java.sql.Date.valueOf(fechaCompra));

            int rowsInserted = pst.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Compra registrada correctamente", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la compra", "Error", JOptionPane.ERROR_MESSAGE);
                dispose();
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al registrar compra", "Error", JOptionPane.ERROR_MESSAGE);
            dispose();
        }
    }//GEN-LAST:event_BotonRegistrarCompraActionPerformed

    private boolean buscarProveedorYMostrarProducto() {
        Conexion con = new Conexion();
        String nit = FieldNIT.getText().trim();
        String sql = "SELECT producto_distribuye FROM proveedores WHERE nit = ?";

        try (Connection cn = con.getConnection();
             PreparedStatement pst = cn.prepareStatement(sql)) {

            pst.setString(1, nit);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String productoDistribuye = rs.getString("producto_distribuye");
                FieldProductos.setText(productoDistribuye);
                return true;
            } else {
                FieldProductos.setText("");
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al buscar proveedor", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private void FieldProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldProductosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldProductosMousePressed

    private void FieldProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldProductosActionPerformed

    private void FieldDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldDescripcionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldDescripcionMousePressed

    private void FieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldDescripcionActionPerformed

    private void FieldMontoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldMontoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldMontoMousePressed

    private void FieldMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldMontoActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        if(buscarProveedorYMostrarProducto()){
            ComponentesVisibles();
        } else {
            JOptionPane.showMessageDialog(null, "El proveedor no existe", "Proveedor inexistente", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonRegistrarCompra;
    private javax.swing.JTextField FieldDescripcion;
    private javax.swing.JTextField FieldMonto;
    private javax.swing.JTextField FieldNIT;
    private javax.swing.JTextField FieldProductos;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel LabelDescripcion;
    private javax.swing.JLabel LabelMonto;
    private javax.swing.JLabel LabelNIT;
    private javax.swing.JLabel LabelProductos;
    // End of variables declaration//GEN-END:variables
}
