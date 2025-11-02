package Modelo;

public class DetalleVenta {

    // Atributos
    private int IdDetalleVenta;
    private int idReporteVenta;
    private String idProducto;
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private double descuento;
    private double iva;
    private double totalAPagar;
    private int estado;

    // Constructor 
    public DetalleVenta() {
        this.IdDetalleVenta = 0;
        this.idReporteVenta = 0;
        this.idProducto = "";
        this.nombre = "";
        this.cantidad = 0;
        this.precioUnitario = 0.0;
        this.subtotal = 0.0;
        this.descuento = 0.0;
        this.iva = 0.0;
        this.totalAPagar = 0.0;
        this.estado = 0;
    }

    //Constructor Sobrecargado
    public DetalleVenta(int IdDetalleVenta, int idReporteVenta, String idProducto, String nombre, int cantidad, double precioUnitario, double subtotal, double descuento, double iva, double totalAPagar, int estado) {
        this.IdDetalleVenta = IdDetalleVenta;
        this.idReporteVenta = idReporteVenta;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.iva = iva;
        this.totalAPagar = totalAPagar;
        this.estado = estado;
    }
    
    
    //Getters and Setters
    public int getIdDetalleVenta() {
        return IdDetalleVenta;
    }

    public void setIdDetalleVenta(int IdDetalleVenta) {
        this.IdDetalleVenta = IdDetalleVenta;
    }

    public int getIdReporteVenta() {
        return idReporteVenta;
    }

    public void setIdReporteVenta(int idReporteVenta) {
        this.idReporteVenta = idReporteVenta;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    //toString
    @Override
    public String toString() {
        return "DetalleVenta{" + "IdDetalleVenta=" + IdDetalleVenta + ", idReporteVenta=" + idReporteVenta + ", idProducto=" + idProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", subtotal=" + subtotal + ", descuento=" + descuento + ", iva=" + iva + ", totalAPagar=" + totalAPagar + ", estado=" + estado + '}';
    }
    
}
