package Controlador;

import Conexiones.Conexion;
import DAOS.UsuarioDAO;
import Modelo.Usuario;
import Vista.Menu;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LoginController {
    
    // Método que abre el menu si la contraseña y usuario existen en la db
public void iniciarSesion(String usuario, String password, javax.swing.JFrame loginFrame) {
    if (!usuario.isEmpty() && !password.isEmpty()) {
        Usuario user = new Usuario();
        user.setUsuario(usuario.trim());
        user.setPassword(password.trim());
        UsuarioDAO use = new UsuarioDAO();
        
        Usuario usuarioLogeado = use.loginAndGetUser(user); 
        
        if (usuarioLogeado != null) { // Si el login fue exitoso
            
            String rol = usuarioLogeado.getRol();
            
            Menu menu = new Menu(rol);
            menu.setVisible(true);
            loginFrame.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese su usuario y contraseña");
    }
}


public boolean guardar(Usuario obj) {
    boolean respuesta = false;
    Connection cn = Conexion.conectar();;
    PreparedStatement consulta = null;

    try {
        consulta = cn.prepareStatement("INSERT INTO usuario (nombre, apellido, usuario, password, "
                + "telefono, estado, rol, hora_entrada, hora_salida) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
        
        consulta.setString(1, obj.getNombre());
        consulta.setString(2, obj.getApellido());
        consulta.setString(3, obj.getUsuario());
        consulta.setString(4, obj.getPassword());
        consulta.setString(5, obj.getTelefono());
        consulta.setInt(6, obj.getEstado());
        consulta.setString(7, obj.getRol());
        
        // Manejar valores nulos para los campos TIME
        if (obj.getHora_entrada() == null || obj.getHora_entrada().isEmpty()) {
            consulta.setNull(8, java.sql.Types.TIME);
        } else {
            consulta.setString(8, obj.getHora_entrada());
        }

        if (obj.getHora_salida() == null || obj.getHora_salida().isEmpty()) {
            consulta.setNull(9, java.sql.Types.TIME);
        } else {
            consulta.setString(9, obj.getHora_salida());
        }


        if (consulta.executeUpdate() > 0) {
            respuesta = true;
        }

        cn.close();

    } catch (SQLException e) {
        System.out.println("Error al guardar usuario: " + e.getMessage());
    }

    return respuesta;
}
    // Metodo para ver ya existe una cateegoria
    public boolean UsuarioRepetido(String usuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        Statement st;
        String sql = "select usuario from usuario where usuario = '" + usuario + "';";

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar usuario: " + e.getMessage());
        }

        return respuesta;
    }

    
    public boolean actualizarUsuario(Usuario obj, int idUsuario) {
    boolean respuesta = false;
    Connection cn = Conexion.conectar();
    try {
        PreparedStatement consulta = cn.prepareStatement("UPDATE usuario SET nombre=?, apellido=?, usuario=?, "
                + "password=?, telefono=?, estado=?, rol=?, hora_entrada=?, hora_salida=? WHERE IdUsuario='" + idUsuario + "'");
        
        consulta.setString(1, obj.getNombre());
        consulta.setString(2, obj.getApellido());
        consulta.setString(3, obj.getUsuario());
        consulta.setString(4, obj.getPassword());
        consulta.setString(5, obj.getTelefono());
        consulta.setInt(6, obj.getEstado());

        // Parámetros 7-9 (NUEVOS)
        consulta.setString(7, obj.getRol());
        
        if (obj.getHora_entrada() == null || obj.getHora_entrada().isEmpty()) {
            consulta.setNull(8, java.sql.Types.TIME);
        } else {
            consulta.setString(8, obj.getHora_entrada());
        }

        if (obj.getHora_salida() == null || obj.getHora_salida().isEmpty()) {
            consulta.setNull(9, java.sql.Types.TIME);
        } else {
            consulta.setString(9, obj.getHora_salida());
        }

        if (consulta.executeUpdate() > 0) {
            respuesta = true;
        }
        cn.close();

    } catch (SQLException ex) {
        System.out.println("Error al actualizar usuario" + ex);
    }
    return respuesta;
}

    public boolean elimCliente(int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("delete from usuario where IdUsuario ='" + idUsuario + "'");

            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }
            cn.close();

        } catch (SQLException ex) {
            System.out.println("Error al eliminar Usuario" + ex);
        }
        return respuesta;

    }

}
