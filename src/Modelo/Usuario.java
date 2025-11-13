package Modelo;

public class Usuario {

    //Atributos
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String telefono;
    private int estado;
    private String rol;
    private String hora_entrada;
    private String hora_salida;

    //Constructor
    public Usuario() {
        this.idUsuario = 0;
        this.nombre = "";
        this.apellido = "";
        this.usuario = "";
        this.password = "";
        this.telefono = "";
        this.estado = 0;
        this.rol = "";
        this.hora_entrada = null;
        this.hora_salida = null;
    }

    //Setters y Getters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }
}
