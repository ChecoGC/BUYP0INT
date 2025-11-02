package Controlador;

import Conexiones.Conexion;
import DAOS.ProductoDAO;
import Modelo.Producto;
import Vista.GestionarProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductoController {

    public boolean guardar(Producto obj) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();;
        PreparedStatement consulta = null;

        try {
            consulta = cn.prepareStatement("INSERT INTO Producto (IdProducto, nombre, cantidad, precio, descripcion, "
                    + "porcentajeIVA, idCategoria, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, obj.getIdProducto());
            consulta.setString(2, obj.getNombre());
            consulta.setInt(3, obj.getCantidad());
            consulta.setDouble(4, obj.getPrecio());
            consulta.setString(5, obj.getDescripcion());
            consulta.setInt(6, obj.getPorcentajeIVA());
            consulta.setInt(7, obj.getIdCategoria());
            consulta.setInt(8, obj.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar Producto: " + e.getMessage());
        }

        return respuesta;
    }

    // Metodo para ver ya existe una cateegoria
    public boolean productoRepetido(String IdProducto) {
     boolean respuesta = false;
     Connection cn = Conexion.conectar();
     PreparedStatement pst;
     String sql = "SELECT nombre FROM Producto WHERE IdProducto = ?";

     try {
         pst = cn.prepareStatement(sql);
         pst.setString(1, IdProducto);  // Usando PreparedStatement para evitar inyecciones SQL
         ResultSet rs = pst.executeQuery();
         if (rs.next()) {
             respuesta = true;
         }
     } catch (SQLException e) {
         System.out.println("Error al consultar producto: " + e.getMessage());
     }

     return respuesta;
 }


    public boolean actuProducto(Producto obj, String idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update producto set nombre=?,cantidad=?, precio=?, "
                    + "descripcion=?, porcentajeIva=?, idCategoria=?, estado=? where idProducto=?");

            consulta.setString(1, obj.getNombre());
            consulta.setInt(2, obj.getCantidad());
            consulta.setDouble(3, obj.getPrecio());
            consulta.setString(4, obj.getDescripcion());
            consulta.setInt(5, obj.getPorcentajeIVA());
            consulta.setInt(6, obj.getIdCategoria());
            consulta.setInt(7, obj.getEstado());
            consulta.setString(8, idProducto);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }
            cn.close();

        } catch (SQLException ex) {
            System.out.println("Error al actualizar producto" + ex);
        }
        return respuesta;
    }

   public boolean elimProd(String idProducto) {
     boolean respuesta = false;
     Connection cn = Conexion.conectar();

     try {
         PreparedStatement consulta = cn.prepareStatement("DELETE FROM producto WHERE idProducto = ?");
         consulta.setString(1, idProducto);

         int rowsAffected = consulta.executeUpdate();  // Elimina la segunda llamada
         if (rowsAffected > 0) {
             respuesta = true;
         }
         cn.close();

     } catch (SQLException ex) {
         System.out.println("Error al eliminar producto: " + ex);
     }
     return respuesta;
 }


    public boolean actualizarStock(Producto obj, int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("update producto set cantidad=? where idProducto ='" + idProducto + "'");

            consulta.setInt(1, obj.getCantidad());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }
            cn.close();

        } catch (SQLException ex) {
            System.out.println("Error al actualizar el stock" + ex);
        }
        return respuesta;

    }

}
