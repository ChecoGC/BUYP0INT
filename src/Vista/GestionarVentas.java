package Vista;

import Conexiones.Conexion;
import Controlador.VentaController;
import Modelo.ReporteVenta;
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
import javax.swing.JTable;

public class GestionarVentas extends javax.swing.JInternalFrame {
    private int idVenta;

    public GestionarVentas() {
        initComponents();
        this.setTitle("Gestionar Venta");
        this.CargarTablaVentas();
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
        tbVentas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabelWallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Ventas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbVentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 660, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 680, 280));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setBackground(new java.awt.Color(21, 204, 0));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 100, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 170, 280));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("TotalPagar:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Fecha:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 50, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Estado:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 100, 40));

        txtTotalPagar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTotalPagar.setEnabled(false);
        jPanel3.add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 180, -1));

        txtFecha.setEnabled(false);
        jPanel3.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 180, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jPanel3.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 155, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 800, 100));
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 890, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int obtenerIdCategoriaCombo = 0;

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    VentaController controlV = new VentaController();
        String estado = cmbEstado.getSelectedItem().toString().trim();

        if (idVenta > 0) {
            ReporteVenta reporte = new ReporteVenta();
            reporte.setEstado(estado.equalsIgnoreCase("Activo") ? 1 : 0);
            if (controlV.actualizarVenta(reporte, idVenta)) {
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            this.CargarTablaVentas();
            this.limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona un registro para actualizar");
    }
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelWallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbVentas;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables

    private void CargarTablaVentas() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT IdReporteVenta, valorPagar, fechaVenta, estado FROM Reporte_Venta"; 
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            GestionarVentas.tbVentas = new JTable(model);
            GestionarVentas.jScrollPane1.setViewportView(GestionarVentas.tbVentas);

            model.addColumn("Numero");
            model.addColumn("Total Pagar");
            model.addColumn("Fecha Venta");
            model.addColumn("Estado");

            while (rs.next()) {
                Object fila[] = new Object[4];
                for (int i = 0; i < 4; i++) {
                    if (i == 3) {
                        String estado = String.valueOf(rs.getObject(i + 1));
                        if (estado.equalsIgnoreCase("1")) {
                            fila[i] = "Activo";
                        } else {
                            fila[i] = "Inactivo";
                        }
                    } else {
                        fila[i] = rs.getObject(i + 1);
                    }
                }

                model.addRow(fila);

            }

        } catch (SQLException ex) {
            System.out.println("Error al llenar la tabla de ventas" + ex);

        }

        tbVentas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent ex) {
                int fila_point = tbVentas.rowAtPoint(ex.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idVenta = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosVentaSeleccionada(idVenta);
                }
            }

        });

    }

    private void EnviarDatosVentaSeleccionada(int idVenta) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement("SELECT IdReporteVenta, valorPagar, fechaVenta, estado "
                + "FROM Reporte_Venta WHERE IdReporteVenta = ?");
            pst.setInt(1, idVenta);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtTotalPagar.setText(rs.getString("valorPagar"));
                txtFecha.setText(rs.getString("fechaVenta"));
                int estado = rs.getInt("estado");
                if (estado == 1) {
                    cmbEstado.setSelectedItem("Activo");
                } else {
                    cmbEstado.setSelectedItem("Inactivo");
                }
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al seleccionar venta" + ex);
        }
    }

    //Metodo para mostrar todas las categorias registradas
    public void setTablaCategorias(DefaultTableModel model) {
        tbVentas.setModel(model);
    }

    public JTable getTablaCategorias() {
        return tbVentas;
    }

    public void mostrarDescripcionCategoria(String descripcion) {
        txtTotalPagar.setText(descripcion);
    }

    public void setIdCategoria(int idCategoria) {
        //this.idCategoria = idCategoria;
    }

    private void limpiar() {
        this.txtTotalPagar.setText("");
        this.txtFecha.setText("");
        this.cmbEstado.setSelectedItem("Activo");
    }

}
