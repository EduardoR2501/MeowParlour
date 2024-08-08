package InterfazGrafica;

import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import meowparlour.Conexion;

public class CrearNuevoProducto extends javax.swing.JFrame {

    Conexion con = new Conexion();
    
    public CrearNuevoProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        FieldPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FieldCodigoDeBarras = new javax.swing.JTextField();
        StockInicial = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        FieldDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BotonCrearProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 550));
        setMinimumSize(new java.awt.Dimension(800, 550));
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(234, 202, 164));
        Fondo.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.setMaximumSize(new java.awt.Dimension(800, 550));
        Fondo.setMinimumSize(new java.awt.Dimension(800, 550));
        Fondo.setName(""); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 550));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FieldPrecio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FieldPrecio.setForeground(new java.awt.Color(153, 153, 153));
        FieldPrecio.setText("Precio con IVA");
        FieldPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldPrecioMousePressed(evt);
            }
        });
        FieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPrecioActionPerformed(evt);
            }
        });
        Fondo.add(FieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 740, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del producto");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Stock inicial");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 130, 50));

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
        Fondo.add(FieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 740, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Código de barras");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 220, 50));

        FieldCodigoDeBarras.setBackground(new java.awt.Color(246, 244, 234));
        FieldCodigoDeBarras.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        FieldCodigoDeBarras.setForeground(new java.awt.Color(153, 153, 153));
        FieldCodigoDeBarras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FieldCodigoDeBarras.setText("Escanea o digita el código de barras");
        FieldCodigoDeBarras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        FieldCodigoDeBarras.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FieldCodigoDeBarras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldCodigoDeBarrasMousePressed(evt);
            }
        });
        FieldCodigoDeBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCodigoDeBarrasActionPerformed(evt);
            }
        });
        Fondo.add(FieldCodigoDeBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 530, 60));

        StockInicial.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Fondo.add(StockInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 140, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripcíón del producto");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 320, 50));

        FieldDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FieldDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        FieldDescripcion.setText("Descripción");
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
        Fondo.add(FieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 740, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio del producto con IVA incluido (solo dígitos)");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 570, 50));

        BotonCrearProducto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonCrearProducto.setText("Crear Producto");
        BotonCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearProductoActionPerformed(evt);
            }
        });
        Fondo.add(BotonCrearProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 230, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldCodigoDeBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCodigoDeBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCodigoDeBarrasActionPerformed

    private void FieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNombreActionPerformed

    private void FieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPrecioActionPerformed

    private void FieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldDescripcionActionPerformed

    private void FieldCodigoDeBarrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldCodigoDeBarrasMousePressed
        if(String.valueOf(FieldCodigoDeBarras.getText()).equals("Escanea o digita el código de barras")){
            FieldCodigoDeBarras.setText("");
            FieldCodigoDeBarras.setForeground(Color.black);
        }
    }//GEN-LAST:event_FieldCodigoDeBarrasMousePressed

    private void FieldNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldNombreMousePressed
        if(String.valueOf(FieldNombre.getText()).equals("Nombre")){
            FieldNombre.setText("");
            FieldNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_FieldNombreMousePressed

    private void FieldDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldDescripcionMousePressed
        if(String.valueOf(FieldDescripcion.getText()).equals("Descripción")){
            FieldDescripcion.setText("");
            FieldDescripcion.setForeground(Color.black);
        }
    }//GEN-LAST:event_FieldDescripcionMousePressed

    private void FieldPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldPrecioMousePressed
        if(String.valueOf(FieldPrecio.getText()).equals("Precio con IVA")){
            FieldPrecio.setText("");
            FieldPrecio.setForeground(Color.black);
        }
    }//GEN-LAST:event_FieldPrecioMousePressed

    private void BotonCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearProductoActionPerformed
        if (!FieldCodigoDeBarras.getText().trim().isEmpty() && !FieldCodigoDeBarras.getText().equals("Escanea o digita el código de barras") 
                && !FieldNombre.getText().trim().isEmpty() && !FieldNombre.getText().equals("Nombre") 
                && !FieldDescripcion.getText().trim().isEmpty() && !FieldDescripcion.getText().equals("Descripción") 
                && !FieldPrecio.getText().trim().isEmpty() && !FieldPrecio.getText().equals("Precio con IVA")) {

            try {
                double precio = Double.parseDouble(FieldPrecio.getText().trim());
                if ((int) StockInicial.getValue() >= 0) {
                    int cantidad = (int) StockInicial.getValue();
                    CrearDatos(precio, cantidad);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingresa un stock inicial válido", "Error de formato", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido para el precio", "Error de formato", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor llena los campos correctamente", "Campos inválidos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BotonCrearProductoActionPerformed
    
    
    public void CrearDatos(double precio, int cantidad){
        String codigoDeBarras = FieldCodigoDeBarras.getText().trim();
        String nombre = FieldNombre.getText().trim();
        String descripcion = FieldDescripcion.getText().trim();

        String verificarProductoQuery = "SELECT COUNT(*) FROM productos WHERE CodigoDeBarras = ?";
        String insertarProductoQuery = "INSERT INTO productos (CodigoDeBarras, Nombre, Descripcion, Precio, Cantidad) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = con.getConnection();
             PreparedStatement verificarProductoStmt = connection.prepareStatement(verificarProductoQuery);
             PreparedStatement insertarProductoStmt = connection.prepareStatement(insertarProductoQuery)) {

            verificarProductoStmt.setString(1, codigoDeBarras);
            try (ResultSet resultSet = verificarProductoStmt.executeQuery()) {
                if (resultSet.next() && resultSet.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, "El producto con el código de barras ingresado ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
                    dispose();
                    return;
                }
            }

            insertarProductoStmt.setString(1, codigoDeBarras);
            insertarProductoStmt.setString(2, nombre);
            insertarProductoStmt.setString(3, descripcion);
            insertarProductoStmt.setDouble(4, precio);
            insertarProductoStmt.setInt(5, cantidad);

            int rowsInserted = insertarProductoStmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Producto creado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CrearNuevoProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al crear el producto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(CrearNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearNuevoProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrearProducto;
    private javax.swing.JTextField FieldCodigoDeBarras;
    private javax.swing.JTextField FieldDescripcion;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldPrecio;
    private javax.swing.JPanel Fondo;
    private javax.swing.JSpinner StockInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
