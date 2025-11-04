package DAOS;

import Conexiones.Conexion;
import Modelo.DetalleVenta;
import Modelo.ReporteVenta;
import java.sql.*;

public class VentasDAO {

    public static int idReporteVentaRegistrada;

    public boolean guardarReporteVenta(ReporteVenta obj) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "INSERT INTO Reporte_Venta VALUES (?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS
            );
            consulta.setDouble(2, obj.getValorPagar());
            consulta.setString(3, obj.getFechaVenta());
            consulta.setInt(4, obj.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
                ResultSet rs = consulta.getGeneratedKeys();
                if (rs.next()) {
                    idReporteVentaRegistrada = rs.getBigDecimal(1).intValue();
                }
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar Reporte de Venta: " + e);
        }
        return respuesta;
    }

    public boolean guardarDetalleVenta(DetalleVenta obj) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "INSERT INTO Detalle_Venta VALUES (?,?,?,?,?,?,?,?,?,?)"
            );
            consulta.setInt(1, 0);
            consulta.setInt(2, idReporteVentaRegistrada);
            consulta.setString(3, obj.getIdProducto());
            consulta.setInt(4, obj.getCantidad());
            consulta.setDouble(5, obj.getPrecioUnitario());
            consulta.setDouble(6, obj.getSubtotal());
            consulta.setDouble(7, obj.getDescuento());
            consulta.setDouble(8, obj.getIva());
            consulta.setDouble(9, obj.getTotalAPagar());
            consulta.setInt(10, obj.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar detalle de Venta: " + e.getMessage());
        }
        return respuesta;
    }

    public boolean actualizarReporteVenta(ReporteVenta obj, int idReporteVenta) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "UPDATE Reporte_Venta SET estado=? WHERE IdReporteVenta=?"
            );
            consulta.setInt(1, obj.getEstado());
            consulta.setInt(2, idReporteVenta);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar Reporte de venta: " + ex);
        }
        return respuesta;
    }

}
