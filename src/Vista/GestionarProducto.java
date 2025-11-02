package Vista;

import Conexiones.Conexion;
import Controlador.CategoriaController;
import Controlador.ProductoController;
import Modelo.Categoria;
import Modelo.Producto;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class GestionarProducto extends javax.swing.JInternalFrame {

    private String idProducto;
    int obtenerCategoria = 0;

    public GestionarProducto() {
        initComponents();
        this.setTitle("Gestionar Productos");
        this.CargarTablaProductos();
        this.CargarComboCategorias();

        // imagen 
        ImageIcon wallpaper = new ImageIcon("src/img/fondo3.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(900, 500, WIDTH));
        jLabelWallpaper.setIcon(icono);
        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
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
        jLabelWallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 660, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 680, 280));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditar.setBackground(new java.awt.Color(21, 204, 0));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 100, 30));

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 100, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 170, 280));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Cantidad:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Precio:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Drescripcion:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("IVA:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Categoria:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 100, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, -1));

        txtCantidad.setEditable(false);
        jPanel3.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));
        jPanel3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 180, -1));
        jPanel3.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 190, -1));

        cmbIVA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione IVA:", "Sin IVA", "16%" }));
        cmbIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIVAActionPerformed(evt);
            }
        });
        jPanel3.add(cmbIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 190, -1));

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoria:", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 190, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 610, 100));
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int obtenerIdCategoriaCombo = 0;
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        Producto producto = new Producto();
        ProductoController controlPro = new ProductoController();
        String iva = "";
        String categoria = "";
        iva = cmbIVA.getSelectedItem().toString().trim();
        categoria = cmbCategoria.getSelectedItem().toString().trim();

        // Validar los campor
        if (txtNombre.getText().isEmpty() || txtCantidad.getText().isEmpty()
                || txtPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");

        } else {

            if (iva.equalsIgnoreCase("Seleccione IVA:")) {
                JOptionPane.showMessageDialog(null, "Seleccione el IVA");
            } else {
                if (categoria.equalsIgnoreCase("Seleccione Categoria")) {
                    JOptionPane.showMessageDialog(null, "Seleccione una categoria");
                } else {
                    try {
                        
                        producto.setNombre(txtNombre.getText());
                        producto.setCantidad(Integer.parseInt(txtCantidad.getText()));
                        String precioTXT = "";
                        double Precio = 0.0;
                        precioTXT = txtPrecio.getText().trim();
                        boolean aux = false;
                        // Si el usuario ingresa , (coma) com punto decimal, lo transformamos a punto

                        for (int i = 0; i < precioTXT.length(); i++) {
                            if (precioTXT.charAt(i) == ',') {
                                String precioNuevo = precioTXT.replace(",", ".");
                                Precio = Double.parseDouble(precioNuevo);
                                aux = true;
                            }
                        }

                        //Evaluar la condicion
                        if (aux == true) {
                            producto.setPrecio(Precio);
                        } else {
                            Precio = Double.parseDouble(precioTXT);
                            producto.setPrecio(Precio);
                        }

                        producto.setDescripcion(txtDescripcion.getText().trim());
                        // Porcentaje IVA
                        if (iva.equalsIgnoreCase("Sin IVA")) {
                            producto.setPorcentajeIVA(0);
                        } else if (iva.equalsIgnoreCase("16%")) {
                            producto.setPorcentajeIVA(16);
                        }

                        // idCategoria -- Cargar metodo para obtener el id
                        this.obtnerIdCategoria();
                        producto.setIdCategoria(obtenerIdCategoriaCombo);
                        producto.setEstado(1);

                        if (controlPro.actuProducto(producto, idProducto)) {
                            JOptionPane.showMessageDialog(null, "Producto Actualizado");
                            this.CargarComboCategorias();
                            this.CargarTablaProductos();
                            this.cmbIVA.setSelectedItem("Seleccione IVA:");
                            this.cmbCategoria.setSelectedItem("Seleccione Categoria");
                            this.limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                        }

                    } catch (HeadlessException | NumberFormatException e) {
                        System.out.println("Error en: " + e);
                    }

                }
            }

        }

    }//GEN-LAST:event_btnEditarActionPerformed
    private int obtnerIdCategoria() {
        String sql = "SELECT * FROM categoria where descripcion = '" + this.cmbCategoria.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("IdCategoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener la categoria");
        }
        return obtenerIdCategoriaCombo;
    }


    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ProductoController controlprod = new ProductoController();
        if (idProducto == null || idProducto.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        } else {
        if (controlprod.elimProd(idProducto)) {
        JOptionPane.showMessageDialog(null, "Producto eliminado");

                this.CargarComboCategorias();
                this.CargarTablaProductos();
                this.limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar producto");
            }
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIVAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbIVA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelWallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void CargarComboCategorias() {

        Connection cn = Conexion.conectar();
        String sql = "select * from categoria";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cmbCategoria.removeAllItems();
            cmbCategoria.addItem("Seleccione categoria");

            while (rs.next()) {

                cmbCategoria.addItem(rs.getString("descripcion"));
            }

            cn.close();
        } catch (SQLException ex) {
            System.out.println("!Error al cargar categorias");
        }
    }

    String descripcionCategoria = "";
    double precio = 0.0;
    int porcentajeIVA = 0;
    double IVA = 0;

    private void CargarTablaProductos() {

        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select p.IdProducto, p.nombre,p.cantidad,p.precio ,p.descripcion,p.porcentajeIva,c.descripcion,p.estado from Producto as p, categoria as c where p.IdCategoria =c.IdCategoria;";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            GestionarProducto.tbProductos = new JTable(model);
            GestionarProducto.jScrollPane1.setViewportView(GestionarProducto.tbProductos);

            model.addColumn("IdProducto");
            model.addColumn("nombre");
            model.addColumn("cantidad");
            model.addColumn("precio");
            model.addColumn("descripcion");
            model.addColumn("Iva");
            model.addColumn("categoria");
            model.addColumn("estado");

            while (rs.next()) {
                precio = rs.getDouble("precio");
                porcentajeIVA = rs.getInt("porcentajeIva");

                Object fila[] = new Object[8];
                for (int i = 0; i < 8; i++) {

                    if (i == 5) {
                        this.calcularIva(precio, porcentajeIVA);
                        fila[i] = IVA;
                        rs.getObject(i + 1);
                    } else {
                        fila[i] = rs.getObject(i + 1);
                    }
                }

                model.addRow(fila);

            }

        } catch (SQLException ex) {
            System.out.println("Error al llenar la tabla productos");

        }

        tbProductos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent ex) {
                int fila_point = tbProductos.rowAtPoint(ex.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idProducto = model.getValueAt(fila_point, columna_point).toString();
                    EnviarDatosProductoSeleccionado(idProducto);
                }
            }

        });

    }

    private double calcularIva(double precio, int iva) {
        int p_iva = iva;

        switch (p_iva) {
            case 0:
                IVA = 0.0;
                break;
            case 12:
                IVA = precio * 0.12;
                break;
            case 14:
                IVA = precio * 0.14;
                break;
            default:
                break;
        }

        IVA = (double) Math.round(IVA * 100) / 100;
        return IVA;

    }

    private void EnviarDatosProductoSeleccionado(String idproducto) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from Producto where IdProducto = '" + idproducto + "'");

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtNombre.setText(rs.getString("nombre"));
                txtCantidad.setText(rs.getString("cantidad"));
                txtPrecio.setText(rs.getString("precio"));
                txtDescripcion.setText(rs.getString("descripcion"));

                int iva = rs.getInt("porcentajeIva");
                switch (iva) {
                    case 0:
                        cmbIVA.setSelectedItem("no grava iva");
                        break;
                    case 12:
                        cmbIVA.setSelectedItem("12%");

                        break;
                    case 14:
                        cmbIVA.setSelectedItem("14%");

                        break;
                    default:
                        cmbIVA.setSelectedItem("Selecione iva");
                        break;
                }
                int idCate = rs.getInt("idCategoria");

                cmbCategoria.setSelectedItem(relacionarCategoria(idCate));
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al seleccionar producto" + ex);
        }
    }

    private String relacionarCategoria(int idcate) {

        String sql = "select descripcion from categoria where idCategoria = '" + idcate + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                descripcionCategoria = rs.getString("descripcion");
            }

            cn.close();
        } catch (SQLException ex) {
            System.out.println("!Error al obtener el id de la categoria");
        }

        return descripcionCategoria;
    }

    //Metodo para mostrar todas las categorias registradas
    public void setTablaCategorias(DefaultTableModel model) {
        tbProductos.setModel(model);
    }

    public JTable getTablaCategorias() {
        return tbProductos;
    }

    public void mostrarDescripcionCategoria(String descripcion) {
        txtNombre.setText(descripcion);
    }

    public void setIdCategoria(int idCategoria) {
        //this.idCategoria = idCategoria;
    }

    private void limpiar() {
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtDescripcion.setText("");
        cmbIVA.setSelectedItem("Seleccione iva:");
        cmbCategoria.setSelectedItem("Seleccione categoria:");
    }

}
