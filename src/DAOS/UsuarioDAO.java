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
    public boolean loginUser(Usuario obj) {

        boolean respuesta = false;

        Connection cn = Conexion.conectar();
        String sql = "select usuario,password from usuario where usuario = '" + obj.getUsuario() + "' and password = '"
                + obj.getPassword() + "'";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al iniciar Sesion");
        }
        return respuesta;
    }
}
