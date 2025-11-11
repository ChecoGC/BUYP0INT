package DAOS;

import Conexiones.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UsuarioDAO {
      //Metodo para iniciar
    public Usuario loginAndGetUser(Usuario obj) {
        
        Connection cn = Conexion.conectar();
        Usuario usuarioLogeado = null; 
        String sql = "SELECT IdUsuario, nombre, apellido, usuario, "
                + "password, telefono, estado, rol, hora_entrada, hora_salida "
                   + "FROM usuario WHERE usuario = '" + obj.getUsuario() + 
                "' AND password = '" + obj.getPassword() + "'";
        
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) { 
                usuarioLogeado = new Usuario();
                
                usuarioLogeado.setIdUsuario(rs.getInt("IdUsuario"));
                usuarioLogeado.setNombre(rs.getString("nombre"));
                usuarioLogeado.setApellido(rs.getString("apellido"));
                usuarioLogeado.setUsuario(rs.getString("usuario"));
                usuarioLogeado.setPassword(rs.getString("password"));
                usuarioLogeado.setTelefono(rs.getString("telefono"));
                usuarioLogeado.setEstado(rs.getInt("estado"));
                usuarioLogeado.setRol(rs.getString("rol")); 
            
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al iniciar Sesion: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al iniciar Sesion");
        }
        
        return usuarioLogeado; 
    }
}
