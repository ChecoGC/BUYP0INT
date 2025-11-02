/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexiones.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author agr56
 */
public class ClienteController {

    public boolean guardar(Cliente obj) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();;
        PreparedStatement consulta = null;

        try {
            consulta = cn.prepareStatement("INSERT INTO cliente (nombre, apellido, cedula, telefono, "
                    + "direccion, estado) VALUES (?, ?, ?, ?, ?, ?)");

            consulta.setString(1, obj.getNombre());
            consulta.setString(2, obj.getApellido());
            consulta.setString(3, obj.getCedula());
            consulta.setString(4, obj.getTelefono());
            consulta.setString(5, obj.getDireccion());
            consulta.setInt(6, obj.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar Cliente: " + e.getMessage());
        }

        return respuesta;
    }

    // Metodo para ver ya existe una cateegoria
    public boolean clienteRepetido(String cedula) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        Statement st;
        String sql = "select cedula from cliente where cedula = '" + cedula + "';";

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar cliente: " + e.getMessage());
        }

        return respuesta;
    }
    
    public boolean actuCliente(Cliente obj, int idCliente) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update cliente set nombre=?,apellido=?, cedula=?, telefono=?, direccion=?, estado=? where idCliente='" + idCliente + "'");
            consulta.setString(1, obj.getNombre());
            consulta.setString(2, obj.getApellido());
            consulta.setString(3, obj.getCedula());
            consulta.setString(4, obj.getTelefono());
            consulta.setString(5, obj.getDireccion());
            consulta.setInt(6, obj.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }
            cn.close();

        } catch (SQLException ex) {
            System.out.println("Error al actualizar cliente" + ex);
        }
        return respuesta;
    }

    public boolean elimCliente(int idCliente) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("delete from cliente where idCliente ='" + idCliente + "'");

            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }
            cn.close();

        } catch (SQLException ex) {
            System.out.println("Error al eliminar cliente" + ex);
        }
        return respuesta;

    }
}
