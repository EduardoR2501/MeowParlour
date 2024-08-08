package InterfazGrafica;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import meowparlour.Conexion;

public class Facturas extends javax.swing.JFrame {

    public Facturas() {
        initComponents();
        this.setLocationRelativeTo(null);
        establecerTitulosTablaFacturas();
        cargarFacturas(); 
        BotonImprimirFactura.setEnabled(false); 
    }
    
    private void establecerTitulosTablaFacturas() {
        String[] titulos = {"ID Factura", "NIT", "Nombre Cliente", "Dirección Cliente"};
        DefaultTableModel model = (DefaultTableModel) TablaFacturas.getModel();
        model.setColumnIdentifiers(titulos);
    }
    
    private void cargarFacturas() {
        DefaultTableModel model = (DefaultTableModel) TablaFacturas.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar datos

        Conexion conexion = new Conexion();
        String sql = "SELECT IdFactura, NIT, NombreCliente, DireccionCliente, Subtotal, IVA, Total FROM facturas";

        try (Connection con = conexion.getConnection();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                int idFactura = rs.getInt("IdFactura");
                String nit = rs.getString("NIT");
                String nombreCliente = rs.getString("NombreCliente");
                String direccionCliente = rs.getString("DireccionCliente");
                double subtotal = rs.getDouble("Subtotal");
                double iva = rs.getDouble("IVA");
                double total = rs.getDouble("Total");

                model.addRow(new Object[]{idFactura, nit, nombreCliente, direccionCliente, subtotal, iva, total});
            }
            TablaFacturas.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int filaSeleccionada = TablaFacturas.getSelectedRow();
                    if (filaSeleccionada != -1) {
                        BotonImprimirFactura.setEnabled(true);
                    } else {
                        BotonImprimirFactura.setEnabled(false);
                    }
                }
            });

        } catch (SQLException ex) {
            Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaFacturas = new javax.swing.JTable();
        BotonImprimirFactura = new javax.swing.JButton();

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

        TablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaFacturas);

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 890, 430));

        BotonImprimirFactura.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonImprimirFactura.setText("Imprimir factura");
        BotonImprimirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonImprimirFacturaActionPerformed(evt);
            }
        });
        Fondo.add(BotonImprimirFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 220, 50));

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

    private void BotonImprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonImprimirFacturaActionPerformed
        int filaSeleccionada = TablaFacturas.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idFactura = (int) TablaFacturas.getValueAt(filaSeleccionada, 0); 
            guardarPDF(idFactura);
        }
    }//GEN-LAST:event_BotonImprimirFacturaActionPerformed
    
    private void guardarPDF(int idFactura) {
        Conexion conexion = new Conexion();
        String sql = "SELECT FacturaPDF FROM facturas_pdf WHERE FacturaID = ?";
        File fileToSave = null;

        try (Connection con = conexion.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, idFactura);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                byte[] pdfBytes = rs.getBytes("FacturaPDF");
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Guardar PDF");
                fileChooser.setSelectedFile(new File("factura_" + idFactura + ".pdf"));
                int userSelection = fileChooser.showSaveDialog(this);
                
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    fileToSave = fileChooser.getSelectedFile();
                    
                    try (FileOutputStream fos = new FileOutputStream(fileToSave)) {
                        fos.write(pdfBytes);
                        JOptionPane.showMessageDialog(this, "PDF de la factura guardado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "Error al guardar el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró PDF asociado a la factura seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al consultar el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonImprimirFactura;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTable TablaFacturas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
