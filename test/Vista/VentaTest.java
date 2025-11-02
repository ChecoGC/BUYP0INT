package Vista;

import Modelo.DetalleVenta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guzma
 */
public class VentaTest {
    
    public VentaTest() {
    }
    
     @Test
    public void testCambioSuficiente() {
        Venta pruebaCambio = new Venta();
        double resultado = pruebaCambio.calcularCambio(100.0, 85.25);
        assertEquals(14.75, resultado, 0.001);
    }

    @Test
    public void testCambioExacto() {
        Venta pruebaCambio = new Venta();
        double resultado = pruebaCambio.calcularCambio(50.0, 50.0);
        assertEquals(0.0, resultado, 0.001);
    }

    @Test
    public void testCambioInsuficiente() {
        Venta pruebaCambio = new Venta();
        double resultado = pruebaCambio.calcularCambio(40.0, 50.0);
        assertEquals(-1.0, resultado, 0.001);
    }
    
    
    @Test
    public void testAgregarProductoSinSeleccion() {
        Venta pruebaCambio = new Venta();
        String resultado = pruebaCambio.agregarProducto("Seleccione producto:", "5");
        assertEquals("Seleccione un producto", resultado);
    }

    @Test
    public void testAgregarProductoCantidadVacia() {
        Venta pruebaCambio = new Venta();
        String resultado = pruebaCambio.agregarProducto("Producto1", "");
        assertEquals("Ingrese la cantidad de producto", resultado);
    }

    @Test
    public void testAgregarProductoCantidadNoValida() {
        Venta pruebaCambio = new Venta();
        String resultado = pruebaCambio.agregarProducto("Producto1", "abc");
        assertEquals("Ingrese un valor válido", resultado);
    }

    @Test
    public void testAgregarProductoCantidadNegativa() {
        Venta pruebaCambio = new Venta();
        String resultado = pruebaCambio.agregarProducto("Producto1", "-3");
        assertEquals("La cantidad no puede ser cero ni negativa", resultado);
    }

    @Test
    public void testAgregarProductoStockExcedido() {
        // Simula que cantidadProductoBBDD = 10 y ya hay 8 en lista
        Venta pruebaCambio = new Venta();
        pruebaCambio.cantidadProductoBBDD = 10;
        pruebaCambio.idProducto = "P001";
        pruebaCambio.listaProductos.clear();
        pruebaCambio.listaProductos.add(new DetalleVenta(1, 1, "P001", "Prod1", 8, 100.0, 800.0, 0.0, 0.0, 800.0, 1));

        String resultado = pruebaCambio.agregarProducto("Prod1", "3");
        assertEquals("La cantidad total supera el stock disponible", resultado);
    }

    @Test
    public void testAgregarProductoExito() {
        Venta pruebaCambio = new Venta();
        pruebaCambio.cantidadProductoBBDD = 20;
        pruebaCambio.idProducto = "P002";
        pruebaCambio.precioUnitario = 50.0;
        pruebaCambio.nombre = "Producto2";
        pruebaCambio.iva = 0.0;
        pruebaCambio.descuento = 0.0;
        pruebaCambio.listaProductos.clear();

        String resultado = pruebaCambio.agregarProducto("Producto2", "5");
        assertEquals("OK", resultado);
        assertEquals(1, pruebaCambio.listaProductos.size());
        assertEquals(5, pruebaCambio.listaProductos.get(0).getCantidad());
    }
}
