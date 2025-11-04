
package Controlador;


import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import Conexiones.Conexion;
import java.sql.PreparedStatement;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;




public class ReportesController {
       
    public void reporteProductos(){
        Document documento = new Document();
        try{
            String ruta= System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Reporte_Producto.pdf"));
            Image Header = Image.getInstance("src/img/header1.jpg");
            Header.scaleToFit(650,1000);
            Header.setAlignment(Chunk.ALIGN_CENTER);
            
            //formato all texto
            Paragraph parrafo= new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \n Poncho perez \n \n");
            parrafo.setFont(FontFactory.getFont("Tahoma",18, Font.BOLD,BaseColor.DARK_GRAY));
            
            parrafo.add("Reporte de productos \n \n");
            
            documento.open();
            //agregamos los datos
            
            documento.add(Header);
            documento.add(parrafo);
            float[] columna= {3,5,4,5,7,5,6};
            
            PdfPTable Tabla = new PdfPTable(columna);
            Tabla.addCell("Codigo");
             Tabla.addCell("Nombre");
              Tabla.addCell("cantidad");
               Tabla.addCell("precio");
                Tabla.addCell("descripcion");
                 Tabla.addCell("por.IVA");
                  Tabla.addCell("categoria");
                
                try{
                    Connection cn = Conexion.conectar();
                    PreparedStatement pst = cn.prepareStatement(" select p.idProducto,p.nombre,p.cantidad,p.precio,p.descripcion,p.porcentajeIva,c.descripcion as categoria,p.estado from producto as p, categoria as c where p.idcategoria=c.idcategoria;");
                    
                    ResultSet rs = pst.executeQuery();
                    if(rs.next()){
                        do{
                       Tabla.addCell(rs.getString(1));
                        Tabla.addCell(rs.getString(2));
                         Tabla.addCell(rs.getString(3));
                          Tabla.addCell(rs.getString(4));
                           Tabla.addCell(rs.getString(5));
                           Tabla.addCell(rs.getString(6));
                           Tabla.addCell(rs.getString(7));
                       
                        }while(rs.next());
                        documento.add(Tabla);
                    }
                }
                catch(SQLException ex){
                    System.out.println("Error en: "+ ex);
                }
            
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
        }catch(DocumentException ex){
            System.out.println("Error en: "+ ex);
        } catch (FileNotFoundException ex) {
             System.out.println("Error en: "+ ex);
            //Logger.getLogger(ReportesController.class.getName()).log(Level.SEVERE, null, ex);
        }  catch (IOException ex) {
             System.out.println("Error en: "+ ex);
            //Logger.getLogger(ReportesController.class.getName()).log(Level.SEVERE, null, ex);
        }
       documento.close();
    }
    
    public void reporteCategorias(){
        Document documento = new Document();
        try{
            String ruta= System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Reporte_Categorias.pdf"));
            Image Header = Image.getInstance("src/img/header1.jpg");
            Header.scaleToFit(650,1000);
            Header.setAlignment(Chunk.ALIGN_CENTER);
            
            //formato all texto
            Paragraph parrafo= new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \n Poncho perez \n \n");
            parrafo.setFont(FontFactory.getFont("Tahoma",18, Font.BOLD,BaseColor.DARK_GRAY));
            
            parrafo.add("Reporte de clientes \n \n");
            
            documento.open();
            //agregamos los datos
            
            documento.add(Header);
            documento.add(parrafo);
            
            PdfPTable Tabla = new PdfPTable(3);
            Tabla.addCell("Codigo");
             Tabla.addCell("descripcion");
              Tabla.addCell("estado");
               
                try{
                    Connection cn = Conexion.conectar();
                    PreparedStatement pst = cn.prepareStatement("select * from categoria");
                    
                    ResultSet rs = pst.executeQuery();
                    if(rs.next()){
                        do{
                       Tabla.addCell(rs.getString(1));
                        Tabla.addCell(rs.getString(2));
                         Tabla.addCell(rs.getString(3));
                          
                       
                        }while(rs.next());
                        documento.add(Tabla);
                    }
                }
                catch(SQLException ex){
                    System.out.println("Error en: "+ ex);
                }
            
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
        }catch(DocumentException ex){
            System.out.println("Error en: "+ ex);
        } catch (FileNotFoundException ex) {
             System.out.println("Error en: "+ ex);
            //Logger.getLogger(ReportesController.class.getName()).log(Level.SEVERE, null, ex);
        }  catch (IOException ex) {
             System.out.println("Error en: "+ ex);
            //Logger.getLogger(ReportesController.class.getName()).log(Level.SEVERE, null, ex);
        }
       documento.close();
    }
    
    
    public void reporteVentas(){
        Document documento = new Document();
        try{
            String ruta= System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Reporte_Ventas.pdf"));
            Image Header = Image.getInstance("src/img/header1.jpg");
            Header.scaleToFit(650,1000);
            Header.setAlignment(Chunk.ALIGN_CENTER);
            
            //formato all texto
            Paragraph parrafo= new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \n Poncho perez \n \n");
            parrafo.setFont(FontFactory.getFont("Tahoma",18, Font.BOLD,BaseColor.DARK_GRAY));
            
            parrafo.add("Reporte de ventas \n \n");
            
            documento.open();
            //agregamos los datos
            
            documento.add(Header);
            documento.add(parrafo);
            float[] columna= {3,4,5,3};
            
            PdfPTable Tabla = new PdfPTable(columna);
            Tabla.addCell("Codigo");
            Tabla.addCell("total- pagar");
            Tabla.addCell("fecha");
            Tabla.addCell("estado");
            
            try{
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select IdReporteVenta as id, valorPagar as total, fechaVenta as fecha, estado from Reporte_Venta;");
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    do{
                        Tabla.addCell(rs.getString(1));
                        Tabla.addCell(rs.getString(2));
                        Tabla.addCell(rs.getString(3));
                        Tabla.addCell(rs.getString(4));
                        }
                    while(rs.next());
                        documento.add(Tabla);
                    }
                }
                catch(SQLException ex){
                    System.out.println("Error en: "+ ex);
                }
            
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
        }catch(DocumentException ex){
            System.out.println("Error en: "+ ex);
        } catch (FileNotFoundException ex) {
             System.out.println("Error en: "+ ex);
        }  catch (IOException ex) {
             System.out.println("Error en: "+ ex);
        }
       documento.close();
    }
    
}
