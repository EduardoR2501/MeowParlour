package InterfazGrafica;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
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
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import meowparlour.Conexion;

public class ReporteUsuarios extends javax.swing.JFrame {

    public ReporteUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Usuario");
        model.addColumn("Rol");
        jTable1.setModel(model);
        BotonGenerarPDF.setEnabled(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BotonGenerarPDF = new javax.swing.JButton();
        SelectorTipoUsuario = new javax.swing.JComboBox<>();
        BotonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(960, 570));
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

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 890, 380));

        BotonGenerarPDF.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonGenerarPDF.setText("Generar reporte en PDF");
        BotonGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGenerarPDFActionPerformed(evt);
            }
        });
        Fondo.add(BotonGenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 290, 50));

        SelectorTipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SelectorTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Administrador", "Contador", "Empleado", "Cliente" }));
        Fondo.add(SelectorTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 40));

        BotonBuscar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });
        Fondo.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 130, 40));

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

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        Conexion con = new Conexion();
        BotonGenerarPDF.setEnabled(true);
        String tipoUsuario = SelectorTipoUsuario.getSelectedItem().toString();
        String sql = "";
        if (tipoUsuario.equals("Todos")) {
            sql = "SELECT nombre, apellido, usuario, rol FROM usuarios";
        } else {
            sql = "SELECT nombre, apellido, usuario, rol FROM usuarios WHERE rol = ?";
        }

        try (Connection cn = con.getConnection();
                PreparedStatement pst = cn.prepareStatement(sql)) {

            if (!tipoUsuario.equals("Todos")) {
                pst.setString(1, tipoUsuario);
            }

            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Usuario");
            model.addColumn("Rol");
            while (rs.next()) {
                Object[] row = new Object[4];
                row[0] = rs.getString("nombre");
                row[1] = rs.getString("apellido");
                row[2] = rs.getString("usuario");
                row[3] = rs.getString("rol");
                model.addRow(row);
            }
            jTable1.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(ReporteUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al buscar usuarios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed

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
                Paragraph titulo = new Paragraph("Reporte de usuarios - Meow Parlour");
                titulo.setAlignment(Paragraph.ALIGN_CENTER);
                titulo.setSpacingAfter(20);
                documento.add(titulo);
                PdfPTable tablaPDF = new PdfPTable(4);
                tablaPDF.setWidthPercentage(100);
                PdfPCell cell;
                cell = new PdfPCell(new Phrase("Nombre"));
                tablaPDF.addCell(cell);
                cell = new PdfPCell(new Phrase("Apellido"));
                tablaPDF.addCell(cell);
                cell = new PdfPCell(new Phrase("Usuario"));
                tablaPDF.addCell(cell);
                cell = new PdfPCell(new Phrase("Rol"));
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
            Logger.getLogger(ReporteUsuarios.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ReporteUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonGenerarPDF;
    private javax.swing.JPanel Fondo;
    private javax.swing.JComboBox<String> SelectorTipoUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
