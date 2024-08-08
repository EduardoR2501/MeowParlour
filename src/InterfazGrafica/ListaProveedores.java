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

public class ListaProveedores extends javax.swing.JFrame {

    public ListaProveedores() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("NIT");
        model.addColumn("Dirección");
        model.addColumn("Producto que distribuye");
        jTable1.setModel(model);
        llenarTablaProveedores();
    }
    
    private void llenarTablaProveedores() {
        Conexion con = new Conexion();
        String sql = "SELECT nombre, nit, direccion, producto_distribuye FROM proveedores";
        
        try (Connection cn = con.getConnection();
             PreparedStatement pst = cn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String nit = rs.getString("nit");
                String direccion = rs.getString("direccion");
                String producto = rs.getString("producto_distribuye");
                
                model.addRow(new Object[]{nombre, nit, direccion, producto});
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
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
                Paragraph titulo = new Paragraph("Reporte de proveedores - Meow Parlour");
                titulo.setAlignment(Paragraph.ALIGN_CENTER);
                titulo.setSpacingAfter(20);
                documento.add(titulo);
                PdfPTable tablaPDF = new PdfPTable(4);
                tablaPDF.setWidthPercentage(100);
                PdfPCell cell;
                cell = new PdfPCell(new Paragraph("Nombre"));
                tablaPDF.addCell(cell);
                cell = new PdfPCell(new Paragraph("NIT"));
                tablaPDF.addCell(cell);
                cell = new PdfPCell(new Paragraph("Dirección"));
                tablaPDF.addCell(cell);
                cell = new PdfPCell(new Paragraph("Producto que distribuye"));
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
            Logger.getLogger(ListaProveedores.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ListaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProveedores().setVisible(true);
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
