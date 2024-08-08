package InterfazGrafica;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import meowparlour.Conexion;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ListaCompras extends javax.swing.JFrame {

    public ListaCompras() {
        initComponents();
        this.setLocationRelativeTo(null);
        inicializarTabla();
    }
    
    private void inicializarTabla() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        String[] columnas = {"NIT Proveedor", "Producto Distribuido", "Descripción", "Monto", "Fecha de Compra"};
        model.setColumnIdentifiers(columnas);

        String sql = "SELECT proveedor_nit, producto_distribuido, descripcion, monto, fecha_compra FROM compras";

        Conexion conexion = new Conexion();

        try (Connection con = conexion.getConnection();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                String nitProveedor = rs.getString("proveedor_nit");
                String producto = rs.getString("producto_distribuido");
                String descripcion = rs.getString("descripcion");
                double monto = rs.getDouble("monto");
                String fechaCompra = rs.getString("fecha_compra");
                model.addRow(new Object[]{nitProveedor, producto, descripcion, monto, fechaCompra});
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos de compras: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BotonGenerarPDF = new javax.swing.JButton();

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

        BotonGenerarPDF.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonGenerarPDF.setText("Generar reporte en PDF");
        BotonGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGenerarPDFActionPerformed(evt);
            }
        });
        Fondo.add(BotonGenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 290, 50));

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

    private void BotonGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGenerarPDFActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar reporte PDF");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PDF", "pdf"));

            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath();
                if (!rutaArchivo.toLowerCase().endsWith(".pdf")) {
                    rutaArchivo += ".pdf";
                }
                Document documento = new Document(PageSize.A4);
                PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
                documento.open();
                Paragraph titulo = new Paragraph("Reporte de compras - Meow Parlour");
                titulo.setAlignment(Paragraph.ALIGN_CENTER);
                titulo.setSpacingAfter(20);
                documento.add(titulo);
                PdfPTable tablaPDF = new PdfPTable(5); 
                tablaPDF.setWidthPercentage(100);

                PdfPCell cell;
                cell = new PdfPCell(new Paragraph("NIT Proveedor"));
                tablaPDF.addCell(cell);
                cell = new PdfPCell(new Paragraph("Producto Distribuido"));
                tablaPDF.addCell(cell);
                cell = new PdfPCell(new Paragraph("Descripción"));
                tablaPDF.addCell(cell);
                cell = new PdfPCell(new Paragraph("Monto"));
                tablaPDF.addCell(cell);
                cell = new PdfPCell(new Paragraph("Fecha de Compra"));
                tablaPDF.addCell(cell);

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        tablaPDF.addCell(model.getValueAt(i, j).toString());
                    }
                }
                documento.add(tablaPDF);
                documento.close();

                JOptionPane.showMessageDialog(null, "Reporte PDF generado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                File file = new File(rutaArchivo);
                if (file.exists()) {
                    Desktop.getDesktop().open(file);
                }
            }
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(ListaCompras.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al generar el reporte PDF", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonGenerarPDFActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGenerarPDF;
    private javax.swing.JPanel Fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
