package Vista;

import java.sql.Connection;
import Conexiones.Conexion;
import Controlador.ProductoController;
import Modelo.Producto;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class NuevoProducto extends javax.swing.JInternalFrame {

    int obtenerIdCategoriaCombo = 0;

    public NuevoProducto() {
        initComponents();
        this.setTitle("Nuevo Producto");

        this.cargarComboCategoria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        cmbIVA = new javax.swing.JComboBox<>();
        cmbCategoria = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        txtIdProducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(402, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 100, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripcion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("IVA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Categorias:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, -1));

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, -1));

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        cmbIVA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione IVA:", "Sin IVA", "16%" }));
        cmbIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIVAActionPerformed(evt);
            }
        });
        getContentPane().add(cmbIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 170, -1));

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoria:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 170, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 90, 30));

        txtIdProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("IdProducto:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo3.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Producto producto = new Producto();
        ProductoController controlPro = new ProductoController();
        String iva = "";
        String categoria = "";
        iva = cmbIVA.getSelectedItem().toString().trim();
        categoria = cmbCategoria.getSelectedItem().toString().trim();

        // Validar los campor
        if (txtNombre.getText().equals("") || txtCantidad.getText().equals("")
                || txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
            txtNombre.setBackground(Color.red);
            txtCantidad.setBackground(Color.red);
            txtPrecio.setBackground(Color.red);
        } else {
            // Consulta para verificar producto repetido
            if (!controlPro.productoRepetido(txtIdProducto.getText().trim())) {
                if (iva.equalsIgnoreCase("Seleccione IVA:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione el IVA");
                } else {
                    if (categoria.equalsIgnoreCase("Seleccione Categoria")) {
                        JOptionPane.showMessageDialog(null, "Seleccione una categoria");
                    } else {
                        try{
                            producto.setIdProducto(txtIdProducto.getText().trim());
                            producto.setNombre(txtNombre.getText());
                            producto.setCantidad(Integer.parseInt(txtCantidad.getText()));
                            String precioTXT = "";
                            double Precio = 0.0;
                            precioTXT = txtPrecio.getText().trim();
                            boolean aux = false;
                            // Si el usuario ingresa , (coma) com punto decimal, lo transformamos a punto
                            
                            for(int i=0; i< precioTXT.length(); i++){
                                if(precioTXT.charAt(i) == ','){
                                    String precioNuevo = precioTXT.replace(",", ".");
                                    Precio = Double.parseDouble(precioNuevo);
                                    aux=true;
                                }
                            }
                            
                            //Evaluar la condicion
                            if(aux == true){
                                producto.setPrecio(Precio);
                            }else{
                                Precio = Double.parseDouble(precioTXT);
                                producto.setPrecio(Precio);
                            }
                            
                            producto.setDescripcion(txtDescripcion.getText().trim());
                            // Porcentaje IVA
                            if(iva.equalsIgnoreCase("Sin IVA")){
                                producto.setPorcentajeIVA(0);
                            }else if(iva.equalsIgnoreCase("16%")){
                                producto.setPorcentajeIVA(16);
                            }
                            
                            
                            // idCategoria -- Cargar metodo para obtener el id
                            this.obtnerIdCategoria();
                            producto.setIdCategoria(obtenerIdCategoriaCombo);
                            producto.setEstado(1);
                            
                            
                            if(controlPro.guardar(producto)){
                                JOptionPane.showMessageDialog(null, "Producto Guardado");
                                 txtNombre.setBackground(Color.white);
                                 txtCantidad.setBackground(Color.white);
                                 txtPrecio.setBackground(Color.white);
                                 txtDescripcion.setBackground(Color.white); 
                                this.cmbIVA.setSelectedItem("Seleccione IVA:");
                                this.cmbCategoria.setSelectedItem("Seleccione Categoria");
                                this.limpiar();
                            }else{
                                JOptionPane.showMessageDialog(null, "Error al guardar");
                            }
                            
                            
                        }catch(HeadlessException | NumberFormatException e){
                            System.out.println("Error en: "+ e);   
                        }
                            
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe");
            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIVAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbIVA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    // cargar las categorias
    private void cargarComboCategoria() {
        Connection cn = Conexion.conectar();
        String sql = "select * from categoria";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cmbCategoria.removeAllItems();
            cmbCategoria.addItem("Seleccione Categoria");
            while (rs.next()) {
                cmbCategoria.addItem(rs.getString("descripcion"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar Categoria");
        }

    }
    
    
    
    private int obtnerIdCategoria(){
        String sql = "SELECT * FROM categoria where descripcion = '" + this.cmbCategoria.getSelectedItem()+"'";
        Statement st;
        try{
            Connection cn = Conexion.conectar();
            st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                obtenerIdCategoriaCombo = rs.getInt("IdCategoria");
            }
        }catch(SQLException e){
            System.out.println("Error al obtener la categoria");
        }
        return obtenerIdCategoriaCombo;
    }
    
    
    private void limpiar(){
        txtIdProducto.setText("");
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtDescripcion.setText("");
    }
    
}
