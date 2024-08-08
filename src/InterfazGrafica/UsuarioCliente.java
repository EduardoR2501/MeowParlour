package InterfazGrafica;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UsuarioCliente extends javax.swing.JFrame {

    public UsuarioCliente(String Nombre) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        FieldCargo.setText("Cliente");
        FieldNombreBienvenida.setText("Bienvenido(a), " + Nombre);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                InicioSesion Interfaz = new InicioSesion();
                Interfaz.setVisible(true);
            }
        });
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        BotonRealizarCompra = new javax.swing.JButton();
        FieldCargo = new javax.swing.JTextField();
        FieldNombreBienvenida = new javax.swing.JTextField();
        BotonCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1200, 675));
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(234, 202, 164));
        Fondo.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.setMaximumSize(new java.awt.Dimension(1200, 675));
        Fondo.setMinimumSize(new java.awt.Dimension(1200, 675));
        Fondo.setName(""); // NOI18N
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRealizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonRealizarCompra.png"))); // NOI18N
        BotonRealizarCompra.setToolTipText("");
        BotonRealizarCompra.setAlignmentY(0.0F);
        BotonRealizarCompra.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BotonRealizarCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRealizarCompraActionPerformed(evt);
            }
        });
        Fondo.add(BotonRealizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 680, 420));

        FieldCargo.setEditable(false);
        FieldCargo.setBackground(new java.awt.Color(211, 164, 120));
        FieldCargo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        FieldCargo.setForeground(new java.awt.Color(0, 0, 0));
        FieldCargo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FieldCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Fondo.add(FieldCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, 180, 30));

        FieldNombreBienvenida.setEditable(false);
        FieldNombreBienvenida.setBackground(new java.awt.Color(234, 202, 164));
        FieldNombreBienvenida.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        FieldNombreBienvenida.setForeground(new java.awt.Color(0, 0, 0));
        FieldNombreBienvenida.setBorder(null);
        Fondo.add(FieldNombreBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 40, 790, 50));

        BotonCerrarSesion.setBackground(new java.awt.Color(153, 0, 0));
        BotonCerrarSesion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BotonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrarSesion.setText("Cerrar sesión");
        BotonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarSesionActionPerformed(evt);
            }
        });
        Fondo.add(BotonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRealizarCompraActionPerformed
        RealizarCompra Compra = new RealizarCompra();
        Compra.setVisible(true);
    }//GEN-LAST:event_BotonRealizarCompraActionPerformed

    private void BotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesionActionPerformed
        dispose();
        InicioSesion Interfaz = new InicioSesion();
        Interfaz.setVisible(true);
    }//GEN-LAST:event_BotonCerrarSesionActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsuarioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new UsuarioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonRealizarCompra;
    private javax.swing.JTextField FieldCargo;
    private javax.swing.JTextField FieldNombreBienvenida;
    private javax.swing.JPanel Fondo;
    // End of variables declaration//GEN-END:variables
}
