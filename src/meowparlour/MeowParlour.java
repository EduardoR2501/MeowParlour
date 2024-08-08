package meowparlour;

import InterfazGrafica.InicioSesion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MeowParlour {

    public static void main(String[] args) {
        Conexion conectar = new Conexion();
        crearUsuarioAdminSiNoExiste(conectar);
        InicioSesion Interfaz = new InicioSesion();
        Interfaz.setVisible(true);
    }
    
    private static void crearUsuarioAdminSiNoExiste(Conexion conexion) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            con = conexion.getConnection();
            String consulta = "SELECT * FROM usuarios WHERE Usuario = ?";
            pst = con.prepareStatement(consulta);
            pst.setString(1, "admin");
            rs = pst.executeQuery();
            
            if (!rs.next()) {
                String insertar = "INSERT INTO usuarios (Nombre, Apellido, Usuario, Contraseña, Rol) VALUES (?, ?, ?, ?, ?)";
                pst = con.prepareStatement(insertar);
                pst.setString(1, "admin");
                pst.setString(2, "admin");
                pst.setString(3, "admin");
                pst.setString(4, "admin");
                pst.setString(5, "Administrador");
                pst.executeUpdate();
            }
        } catch (SQLException e) {
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
            }
        }
    }
}
