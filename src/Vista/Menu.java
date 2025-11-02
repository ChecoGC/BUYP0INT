package Vista;

import Controlador.ReportesController;
import javax.swing.JDesktopPane;

public class Menu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_Menu;

    public Menu() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("MENU - BUYPOINT");

        this.setLayout(null);
        jDesktopPane_Menu = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_Menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_Menu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiNuevoUsuario = new javax.swing.JMenuItem();
        jmiGestionarUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiNuevoProducto = new javax.swing.JMenuItem();
        jmiGestionarProducto = new javax.swing.JMenuItem();
        jmiActualizarInventario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiNuevoCliente = new javax.swing.JMenuItem();
        jmiGestionarCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiNuevaCategoria = new javax.swing.JMenuItem();
        jmiGestionarCategoria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmiNuevaVenta = new javax.swing.JMenuItem();
        jmiGestionarVenta = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmiReportesClientes = new javax.swing.JMenuItem();
        jmiReportesCategorias = new javax.swing.JMenuItem();
        jmiReportesProductos = new javax.swing.JMenuItem();
        jmiReportesVentas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiNuevoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo-cliente.png"))); // NOI18N
        jmiNuevoUsuario.setText("Nuevo Usuario");
        jmiNuevoUsuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevoUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jmiNuevoUsuario);

        jmiGestionarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiGestionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/configuraciones.png"))); // NOI18N
        jmiGestionarUsuario.setText("Gestionar Usuario");
        jmiGestionarUsuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiGestionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGestionarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jmiGestionarUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/producto.png"))); // NOI18N
        jMenu2.setText("Producto");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiNuevoProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo-producto.png"))); // NOI18N
        jmiNuevoProducto.setText("Nuevo Producto");
        jmiNuevoProducto.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevoProductoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiNuevoProducto);

        jmiGestionarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiGestionarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/producto.png"))); // NOI18N
        jmiGestionarProducto.setText("Gestionar Producto");
        jmiGestionarProducto.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiGestionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGestionarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiGestionarProducto);

        jmiActualizarInventario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiActualizarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        jmiActualizarInventario.setText("Actualizar Inventario");
        jmiActualizarInventario.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiActualizarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiActualizarInventarioActionPerformed(evt);
            }
        });
        jMenu2.add(jmiActualizarInventario);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cliente.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiNuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo-cliente.png"))); // NOI18N
        jmiNuevoCliente.setText("Nuevo Cliente");
        jmiNuevoCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevoClienteActionPerformed(evt);
            }
        });
        jMenu3.add(jmiNuevoCliente);

        jmiGestionarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiGestionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cliente.png"))); // NOI18N
        jmiGestionarCliente.setText("Gestionar Cliente");
        jmiGestionarCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiGestionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGestionarClienteActionPerformed(evt);
            }
        });
        jMenu3.add(jmiGestionarCliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/categorias.png"))); // NOI18N
        jMenu4.setText("Categoria");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiNuevaCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiNuevaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        jmiNuevaCategoria.setText("Nueva Categoria");
        jmiNuevaCategoria.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiNuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevaCategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jmiNuevaCategoria);

        jmiGestionarCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiGestionarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/categorias.png"))); // NOI18N
        jmiGestionarCategoria.setText("Gestionar Categoria");
        jmiGestionarCategoria.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiGestionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGestionarCategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jmiGestionarCategoria);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito.png"))); // NOI18N
        jMenu5.setText("Venta");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiNuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/anadir.png"))); // NOI18N
        jmiNuevaVenta.setText("Nueva Venta");
        jmiNuevaVenta.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevaVentaActionPerformed(evt);
            }
        });
        jMenu5.add(jmiNuevaVenta);

        jmiGestionarVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiGestionarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/configuraciones.png"))); // NOI18N
        jmiGestionarVenta.setText("Gestionar Venta");
        jmiGestionarVenta.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiGestionarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGestionarVentaActionPerformed(evt);
            }
        });
        jMenu5.add(jmiGestionarVenta);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reportes.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiReportesClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiReportesClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reporte1.png"))); // NOI18N
        jmiReportesClientes.setText("Reportes Clientes");
        jmiReportesClientes.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiReportesClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReportesClientesActionPerformed(evt);
            }
        });
        jMenu6.add(jmiReportesClientes);

        jmiReportesCategorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiReportesCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reporte1.png"))); // NOI18N
        jmiReportesCategorias.setText("Reportes Categorias");
        jmiReportesCategorias.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiReportesCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReportesCategoriasActionPerformed(evt);
            }
        });
        jMenu6.add(jmiReportesCategorias);

        jmiReportesProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiReportesProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reporte1.png"))); // NOI18N
        jmiReportesProductos.setText("Reportes productos");
        jmiReportesProductos.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiReportesProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReportesProductosActionPerformed(evt);
            }
        });
        jMenu6.add(jmiReportesProductos);

        jmiReportesVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmiReportesVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reporte1.png"))); // NOI18N
        jmiReportesVentas.setText("Reportes Ventas");
        jmiReportesVentas.setPreferredSize(new java.awt.Dimension(180, 30));
        jmiReportesVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReportesVentasActionPerformed(evt);
            }
        });
        jMenu6.add(jmiReportesVentas);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/historial1.png"))); // NOI18N
        jMenu7.setText("Historial");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/historial1.png"))); // NOI18N
        jMenuItem16.setText("Ver Historial");
        jMenuItem16.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem16);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesión");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cerrar-sesion.png"))); // NOI18N
        jMenuItem17.setText("Cerrar Sesión");
        jMenuItem17.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem17);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevoUsuarioActionPerformed
        NuevoUsuario Usuario = new NuevoUsuario();
        jDesktopPane_Menu.add(Usuario);
        Usuario.setVisible(true);
    }//GEN-LAST:event_jmiNuevoUsuarioActionPerformed

    private void jmiReportesCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReportesCategoriasActionPerformed
        ReportesController reporte = new ReportesController();
       reporte.reporteCategorias();
    }//GEN-LAST:event_jmiReportesCategoriasActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jmiNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevaVentaActionPerformed
        Venta nuevaVenta = new Venta();
        jDesktopPane_Menu.add(nuevaVenta);
        nuevaVenta.setVisible(true);

    }//GEN-LAST:event_jmiNuevaVentaActionPerformed

    private void jmiNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevaCategoriaActionPerformed
        NuevaCategoria nuevaCategoria = new NuevaCategoria();
        jDesktopPane_Menu.add(nuevaCategoria);
        nuevaCategoria.setVisible(true);
    }//GEN-LAST:event_jmiNuevaCategoriaActionPerformed

    private void jmiGestionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGestionarCategoriaActionPerformed
        GestionarCategoria gestionCategoria = new GestionarCategoria();
        jDesktopPane_Menu.add(gestionCategoria);
        gestionCategoria.setVisible(true);
    }//GEN-LAST:event_jmiGestionarCategoriaActionPerformed

    private void jmiNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevoProductoActionPerformed
        NuevoProducto nuevoPr = new NuevoProducto();
        jDesktopPane_Menu.add(nuevoPr);
        nuevoPr.setVisible(true);
    }//GEN-LAST:event_jmiNuevoProductoActionPerformed

    private void jmiNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevoClienteActionPerformed
        NuevoCliente nuevoC = new NuevoCliente();
        jDesktopPane_Menu.add(nuevoC);
        nuevoC.setVisible(true);
    }//GEN-LAST:event_jmiNuevoClienteActionPerformed

    private void jmiGestionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGestionarProductoActionPerformed
        GestionarProducto GestProducto = new GestionarProducto();
        jDesktopPane_Menu.add(GestProducto);
        GestProducto.setVisible(true);
    }//GEN-LAST:event_jmiGestionarProductoActionPerformed

    private void jmiGestionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGestionarClienteActionPerformed
        GestionarCliente Gestcliente = new GestionarCliente();
        jDesktopPane_Menu.add(Gestcliente);
        Gestcliente.setVisible(true);
    }//GEN-LAST:event_jmiGestionarClienteActionPerformed

    private void jmiActualizarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiActualizarInventarioActionPerformed
        ActualizarStock Stock = new ActualizarStock();
        jDesktopPane_Menu.add(Stock);
        Stock.setVisible(true);
    }//GEN-LAST:event_jmiActualizarInventarioActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jmiGestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGestionarUsuarioActionPerformed
        GestionarUsuario GestUsuario = new GestionarUsuario();
        jDesktopPane_Menu.add(GestUsuario);
        GestUsuario.setVisible(true);
    }//GEN-LAST:event_jmiGestionarUsuarioActionPerformed

    private void jmiGestionarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGestionarVentaActionPerformed
        GestionarVentas gestionVenta = new GestionarVentas();
        jDesktopPane_Menu.add(gestionVenta);
        gestionVenta.setVisible(true);
    }//GEN-LAST:event_jmiGestionarVentaActionPerformed

    private void jmiReportesClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReportesClientesActionPerformed
       ReportesController reporte = new ReportesController();
       reporte.reporteClientes();
    }//GEN-LAST:event_jmiReportesClientesActionPerformed

    private void jmiReportesProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReportesProductosActionPerformed
        ReportesController reporte = new ReportesController();
       reporte.reporteProductos();
    }//GEN-LAST:event_jmiReportesProductosActionPerformed

    private void jmiReportesVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReportesVentasActionPerformed
        ReportesController reporte = new ReportesController();
       reporte.reporteVentas();
    }//GEN-LAST:event_jmiReportesVentasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jmiActualizarInventario;
    private javax.swing.JMenuItem jmiGestionarCategoria;
    private javax.swing.JMenuItem jmiGestionarCliente;
    private javax.swing.JMenuItem jmiGestionarProducto;
    private javax.swing.JMenuItem jmiGestionarUsuario;
    private javax.swing.JMenuItem jmiGestionarVenta;
    private javax.swing.JMenuItem jmiNuevaCategoria;
    private javax.swing.JMenuItem jmiNuevaVenta;
    private javax.swing.JMenuItem jmiNuevoCliente;
    private javax.swing.JMenuItem jmiNuevoProducto;
    private javax.swing.JMenuItem jmiNuevoUsuario;
    private javax.swing.JMenuItem jmiReportesCategorias;
    private javax.swing.JMenuItem jmiReportesClientes;
    private javax.swing.JMenuItem jmiReportesProductos;
    private javax.swing.JMenuItem jmiReportesVentas;
    // End of variables declaration//GEN-END:variables
}
