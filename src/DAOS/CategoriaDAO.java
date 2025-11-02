package DAOS;

import Modelo.Categoria;
import Conexiones.Conexion;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class CategoriaDAO {

    public boolean guardar(Categoria obj) {
        boolean respuesta = false;
        Connection cn = null;
        PreparedStatement consulta = null;

        try {
            cn = Conexion.conectar();
            consulta = cn.prepareStatement("INSERT INTO categoria VALUES (?, ?, ?)");
            consulta.setInt(1, 0); // O puedes usar auto_increment y omitir esta columna
            consulta.setString(2, obj.getDescripcion());
            consulta.setInt(3, obj.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar categoria: " + e.getMessage());
        } finally {
            // Cierre seguro de recursos
            try {
                if (consulta != null) {
                    consulta.close();
                }
                if (cn != null && !cn.isClosed()) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }

        return respuesta;
    }

    // Metodo para ver ya existe una cateegoria
    public boolean catergoriaRepetida(String categoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        Statement st;
        String sql = "select descripcion from categoria where descripcion = '" + categoria + "';";

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar categoria: " + e.getMessage());
        }

        return respuesta;
    }
     
    // Método para obtener todas las categorías como un DefaultTableModel
    public DefaultTableModel obtenerCategorias() {
        Connection cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT IdCategoria, descripcion, estado FROM categoria";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            model.addColumn("idCategoria");
            model.addColumn("descripcion");
            model.addColumn("estado");

            while (rs.next()) {
                Object[] fila = new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener categorías: " + e);
        }

        return model;
    }

    public String obtenerDescripcionPorId(int idCategoria) {
        String descripcion = "";
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT descripcion FROM categoria WHERE IdCategoria = ?");
            pst.setInt(1, idCategoria);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                descripcion = rs.getString("descripcion");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener descripción por ID: " + e);
        }

        return descripcion;
    }
    
    // Metodo para actualizar categoria
     public boolean actualizar(Categoria obj, int idCategoria) {
        boolean respuesta = false;
        Connection cn = null;
    
        try {
            cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement("update categoria set descripcion=? where IdCategoria ='"
            + idCategoria + "'");
            consulta.setString(1, obj.getDescripcion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar categoria: " + e.getMessage());
        } 
          
        return respuesta;
    }
     
     
     // Metodo para eliminar categoria
     public boolean eliminar(int idCategoria) {
        boolean respuesta = false;
        Connection cn = null;
    
        try {
            cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement("delete from categoria where IdCategoria ='"
            + idCategoria + "'");
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar categoria: " + e.getMessage());
        } 
          
        return respuesta;
    }
     
}
