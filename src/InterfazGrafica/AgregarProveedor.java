package InterfazGrafica;

import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import meowparlour.Conexion;

public class AgregarProveedor extends javax.swing.JFrame {

    public AgregarProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        FieldDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FieldNIT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxProducto = new javax.swing.JComboBox<>();
        BotonAgregarProveedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(570, 500));
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

        FieldDireccion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FieldDireccion.setForeground(new java.awt.Color(153, 153, 153));
        FieldDireccion.setText("Dirección");
        FieldDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldDireccionMousePressed(evt);
            }
        });
        FieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldDireccionActionPerformed(evt);
            }
        });
        Fondo.add(FieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 510, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del proveedor");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Dirección del proveedor");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 240, 50));

        FieldNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FieldNombre.setForeground(new java.awt.Color(153, 153, 153));
        FieldNombre.setText("Nombre");
        FieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldNombreMousePressed(evt);
            }
        });
        Fondo.add(FieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 510, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NIT del proveedor");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, 50));

        FieldNIT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FieldNIT.setForeground(new java.awt.Color(153, 153, 153));
        FieldNIT.setText("NIT");
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
        Fondo.add(FieldNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 510, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Producto que distribuye");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 240, 50));

        ComboBoxProducto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ComboBoxProducto.setForeground(new java.awt.Color(0, 0, 0));
        ComboBoxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comida y bebidas", "Productos de oficina", "Productos de limpieza", "Energía eléctrica", "Equipo de cocina", "Mobiliario y decoración", "Servicios de mantenimiento", "Seguridad", "Uniforme y ropa de trabajo", "Marketing y publicidad", "Servicio de agua", "Otros" }));
        Fondo.add(ComboBoxProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 390, 40));

        BotonAgregarProveedor.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BotonAgregarProveedor.setText("Agregar proveedor");
        BotonAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarProveedorActionPerformed(evt);
            }
        });
        Fondo.add(BotonAgregarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 270, 70));

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

    private void FieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldDireccionActionPerformed

    private void FieldNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldNombreMousePressed
        if(FieldNombre.getText().equals("Nombre")){
            FieldNombre.setText("");
            FieldNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_FieldNombreMousePressed

    private void FondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoMousePressed

    }//GEN-LAST:event_FondoMousePressed

    private void FieldDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldDireccionMousePressed
        if(FieldDireccion.getText().equals("Dirección")){
            FieldDireccion.setText("");
            FieldDireccion.setForeground(Color.black);
        }
    }//GEN-LAST:event_FieldDireccionMousePressed

    private void FieldNITMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldNITMousePressed
        if(FieldNIT.getText().equals("NIT")){
            FieldNIT.setText("");
            FieldNIT.setForeground(Color.black);
        }
    }//GEN-LAST:event_FieldNITMousePressed

    private void BotonAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarProveedorActionPerformed
        Conexion con = new Conexion();
        String nombre = FieldNombre.getText();
        String nit = FieldNIT.getText();
        String direccion = FieldDireccion.getText();
        String productoDistribuye = ComboBoxProducto.getSelectedItem().toString();

        // Verificar si el NIT ya existe en la base de datos
        if (nitExiste(nit)) {
            JOptionPane.showMessageDialog(null, "El NIT ingresado ya existe en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            dispose();
            return;
        }

        // Si el NIT no está repetido, proceder a insertar el proveedor
        String sql = "INSERT INTO proveedores (nombre, nit, direccion, producto_distribuye) VALUES (?, ?, ?, ?)";
        try (Connection cn = con.getConnection();
             PreparedStatement pst = cn.prepareStatement(sql)) {

            pst.setString(1, nombre);
            pst.setString(2, nit);
            pst.setString(3, direccion);
            pst.setString(4, productoDistribuye);

            int rowsInserted = pst.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Proveedor agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el proveedor", "Error", JOptionPane.ERROR_MESSAGE);
                dispose();
            }

        } catch (SQLException ex) {
            Logger.getLogger(AgregarProveedor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al agregar proveedor: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            dispose();
        }
    }//GEN-LAST:event_BotonAgregarProveedorActionPerformed
    
    private boolean nitExiste(String nit) {
        Conexion con = new Conexion();
        String sql = "SELECT COUNT(*) AS count FROM proveedores WHERE nit = ?";
        try (Connection cn = con.getConnection();
             PreparedStatement pst = cn.prepareStatement(sql)) {

            pst.setString(1, nit);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int count = rs.getInt("count");
                return count > 0; // Retorna true si hay algún proveedor con ese NIT
            }

        } catch (SQLException ex) {
            Logger.getLogger(AgregarProveedor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al verificar NIT: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarProveedor;
    private javax.swing.JComboBox<String> ComboBoxProducto;
    private javax.swing.JTextField FieldDireccion;
    private javax.swing.JTextField FieldNIT;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
