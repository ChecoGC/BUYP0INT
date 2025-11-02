package Vista;

import Conexiones.Conexion;
import Controlador.ProductoController;
import Modelo.Producto;

import java.sql.Connection;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ActualizarStock extends javax.swing.JInternalFrame {

    int idproducto = 0;
    int cantidad = 0;

    public ActualizarStock() {
        initComponents();
        setTitle("Actualizar el Stock");
        setSize(new Dimension(400, 300));

        this.CargarComboProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmb_Producto = new javax.swing.JComboBox<>();
        txtCantidadActual = new javax.swing.JTextField();
        txtCantidadNueva = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        JLabelFondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar Stock");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("StockNuevo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("StockActual:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        cmb_Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione producto:", "Item 2", "Item 3", "Item 4" }));
        cmb_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 150, 30));

        txtCantidadActual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCantidadActual.setEnabled(false);
        getContentPane().add(txtCantidadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, -1));

        txtCantidadNueva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtCantidadNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 150, -1));

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 190, -1));

        JLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo3.jpg"))); // NOI18N
        getContentPane().add(JLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ProductoActionPerformed
        this.mostrarStock();
    }//GEN-LAST:event_cmb_ProductoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //validacion de seleccion de producto
        if (!cmb_Producto.getSelectedItem().equals("seleccione producto:")) {
            //validacion de campo vacio
            if (!txtCantidadNueva.getText().isEmpty()) {
                //validacion caracteres no numericos
                boolean validacion = validar(txtCantidadNueva.getText().trim());
                if (validacion== true) {
                        // validar la cantidad sea mayor a 0
                        
                        if(Integer.parseInt(txtCantidadNueva.getText() ) > 0){
                            
                            Producto producto = new Producto();
                            ProductoController controlproducto = new ProductoController();
                            int StockActual = Integer.parseInt(txtCantidadActual.getText().trim());
                            int StockNuevo = Integer.parseInt(txtCantidadNueva.getText().trim());
                            
                            StockNuevo= StockActual+ StockNuevo;
                            
                            producto.setCantidad(StockNuevo);
                            
                            if(controlproducto.actualizarStock(producto, idproducto)){
                                JOptionPane.showMessageDialog(null, "Stock actualizado");
                                
                                cmb_Producto.setSelectedItem("Seleccione producto:");
                                txtCantidadActual.setText("");
                                txtCantidadNueva.setText("");
                                
                                this.CargarComboProductos();
                            }else{
                             JOptionPane.showMessageDialog(null, "Error al actualizar");
                            }
                            
                        
                        }else{
                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser 0");
                        }
                        
                        
                } else {
                    JOptionPane.showMessageDialog(null, "En la cantida no se pueden los caracteres no numericos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese cantidad");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        }


    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelFondo;
    private javax.swing.JComboBox<String> cmb_Producto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCantidadActual;
    private javax.swing.JTextField txtCantidadNueva;
    // End of variables declaration//GEN-END:variables

    // cargar productos
    private void CargarComboProductos() {
        Connection con = Conexion.conectar();
        String sql = "select * from producto";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cmb_Producto.removeAllItems();
            cmb_Producto.addItem("seleccione producto:");
            while (rs.next()) {
                cmb_Producto.addItem(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            System.out.println("Error al cargar los productos en: " + ex);
        }
    }

    // mostrar stock seleccionado
    private void mostrarStock() {

        try {
            Connection con = Conexion.conectar();
            String sql = "select * from producto where nombre = '" + this.cmb_Producto.getSelectedItem() + "'";
            Statement st;

            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                idproducto = rs.getInt("idProducto");
                cantidad = rs.getInt("cantidad");

                txtCantidadActual.setText(String.valueOf(cantidad));
            } else {
                txtCantidadActual.setText("");

            }

        } catch (SQLException ex) {
            System.out.println("Error al obtener stock del producto: " + ex);
        }

    }

    //metodo de validacion de caracteres no nuemricos
    private boolean validar(String valor) {
        int num;

        try {
            num = Integer.parseInt(valor);

            return true;

        } catch (NumberFormatException ex) {

            return false;
        }

    }

}
