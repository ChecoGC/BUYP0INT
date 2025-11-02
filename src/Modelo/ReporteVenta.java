package Modelo;

public class ReporteVenta {
    
    //Atributos
    private int idReporteVenta; 
    private int IdCliente;
    private double valorPagar;
    private  String fechaVenta;
    private int estado;
    
    
    // Constructor
    public ReporteVenta(){
        this.idReporteVenta = 0;
        this.IdCliente = 0;
        this.valorPagar = 0.0;
        this.fechaVenta = "";
        this.estado = 0;
    }
    
    // Constructor sobrecargado
    public ReporteVenta(int idIdReporteVenta, int IdCliente, double valorPagar, String fechaVenta, int estado) {
        this.idReporteVenta = idIdReporteVenta;
        this.IdCliente = IdCliente;
        this.valorPagar = valorPagar;
        this.fechaVenta = fechaVenta;
        this.estado = estado;
    }
    
    
    //Getters and Setters
    public int getIdIdReporteVenta() {
        return idReporteVenta;
    }

    public void setIdIdReporteVenta(int idIdReporteVenta) {
        this.idReporteVenta = idIdReporteVenta;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    // toString
    @Override
    public String toString() {
        return "ReporteVenta{" + "idIdReporteVenta=" + idReporteVenta + ", IdCliente=" + IdCliente + ", valorPagar=" + valorPagar + ", fechaVenta=" + fechaVenta + ", estado=" + estado + '}';
    }
    
}
