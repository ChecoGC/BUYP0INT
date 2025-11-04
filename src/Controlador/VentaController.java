package Controlador;

import DAOS.VentasDAO;
import Modelo.DetalleVenta;
import Modelo.ReporteVenta;

public class VentaController {

    VentasDAO dao = new VentasDAO();

    public boolean registrarVenta(ReporteVenta reporte, DetalleVenta[] detalles) {
        boolean ventaGuardada = dao.guardarReporteVenta(reporte);
        if (!ventaGuardada) return false;

        boolean detallesGuardados = true;
        for (DetalleVenta detalle : detalles) {
            if (!dao.guardarDetalleVenta(detalle)) {
                detallesGuardados = false;
                break;
            }
        }
        return detallesGuardados;
    }

    public boolean actualizarVenta(ReporteVenta reporte, int id) {
        return dao.actualizarReporteVenta(reporte, id);
    }
    
    

}
