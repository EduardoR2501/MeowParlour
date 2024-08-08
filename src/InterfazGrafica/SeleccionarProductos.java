package InterfazGrafica;

import java.sql.*;
import meowparlour.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SeleccionarProductos extends javax.swing.JFrame {
    
    String CodigoDeBarras;
    
    public SeleccionarProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        inicializarTablaProductos(); // Llama al método para cargar los datos al iniciar
    }
    
    private void inicializarTablaProductos() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        String[] columnNames = {"Código de Barras", "Nombre", "Descripción", "Precio", "Disponibilidad"};
        model.setColumnIdentifiers(columnNames); // Establecer nombres de columnas
        
        String sql = "SELECT CodigoDeBarras, Nombre, Descripcion, Precio, Cantidad FROM productos";

        Conexion conexion = new Conexion();

        try (Connection con = conexion.getConnection();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                String codigoBarras = rs.getString("CodigoDeBarras");
                String nombre = rs.getString("Nombre");
                String descripcion = rs.getString("Descripcion");
                double precio = rs.getDouble("Precio");
                int cantidad = rs.getInt("Cantidad");
                model.addRow(new Object[]{codigoBarras, nombre, descripcion, "Q" + precio, cantidad});
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos de productos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BotonAgregarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(960, 570));
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(234, 202, 164));
        Fondo.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.setMaximumSize(new java.awt.Dimension(960, 570));
        Fondo.setMinimumSize(new java.awt.Dimension(960, 570));
        Fondo.setName(""); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(960, 570));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 890, 430));

        BotonAgregarProducto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonAgregarProducto.setText("Agregar producto");
        BotonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarProductoActionPerformed(evt);
            }
        });
        Fondo.add(BotonAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 290, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarProductoActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {
            CodigoDeBarras = (String) jTable1.getValueAt(filaSeleccionada, 0);
            getCodigoDeBarras();
            dispose();
        }
        else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un producto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonAgregarProductoActionPerformed
    
    public String getCodigoDeBarras() {
        return CodigoDeBarras;
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
            java.util.logging.Logger.getLogger(SeleccionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarProducto;
    private javax.swing.JPanel Fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
