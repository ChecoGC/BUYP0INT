package Controlador;

import DAOS.CategoriaDAO;
import Modelo.Categoria;
import Vista.GestionarCategoria;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CategoriaController {
    private CategoriaDAO categoriaDAO;
    private GestionarCategoria vista;
    
     public CategoriaController(GestionarCategoria vista) {
        this.vista = vista;
        this.categoriaDAO = new CategoriaDAO();
        cargarTablaCategorias();
        agregarEventoClickTabla();
    }
     
     public CategoriaController() {
        this.categoriaDAO = new CategoriaDAO();
    }

    public void guardarCategoria(String descripcion) {
        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            CategoriaDAO ctrolCategoria = new CategoriaDAO();
            if (!ctrolCategoria.catergoriaRepetida(descripcion)) {
                Categoria categoria = new Categoria();
                categoria.setDescripcion(descripcion);
                categoria.setEstado(1);

                if (ctrolCategoria.guardar(categoria)) {
                    JOptionPane.showMessageDialog(null, "Categoria Guardada excitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe esa Categoria");
            }
        }
    }
    
   public void cargarTablaCategorias() {
        DefaultTableModel model = categoriaDAO.obtenerCategorias();
        vista.setTablaCategorias(model);
        
    }
   
   
   private void agregarEventoClickTabla() {
        vista.getTablaCategorias().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = vista.getTablaCategorias().rowAtPoint(e.getPoint());
                if (fila > -1) {
                    int idCategoria = (int) vista.getTablaCategorias().getValueAt(fila, 0);
                    String descripcion = categoriaDAO.obtenerDescripcionPorId(idCategoria);
                    vista.mostrarDescripcionCategoria(descripcion);
                    vista.setIdCategoria(idCategoria); 
                }
            }
        });
    }
   
   
   public void actCategoria(String descripcion, int idCategoria) {
    if (!descripcion.isEmpty()) {
        Categoria categoria = new Categoria();
        CategoriaDAO conCategoria = new CategoriaDAO();

        categoria.setDescripcion(descripcion.trim());
        if (conCategoria.actualizar(categoria, idCategoria)) {
            JOptionPane.showMessageDialog(null, "Categoria actualizada");
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar categoria");
        }
        this.cargarTablaCategorias(); // <- Mover afuera para que siempre se actualice
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una categoria");
    }
}

public void elimCategoria(String descripcion, int idCategoria) {
    if (!descripcion.isEmpty()) {
        Categoria categoria = new Categoria();
        CategoriaDAO conCategoria = new CategoriaDAO();

        categoria.setDescripcion(descripcion.trim());
        if (conCategoria.eliminar(idCategoria)) {
            JOptionPane.showMessageDialog(null, "Categoria Eliminada");
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar categoria");
        }
        this.cargarTablaCategorias(); // <- Mover afuera para que siempre se actualice
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una categoria");
    }
}

}
