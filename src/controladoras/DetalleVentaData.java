package controladoras;

import entidades.DetalleVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 * @author nacho
 */
public class DetalleVentaData {
    private Connection con;
    
    public DetalleVentaData(){
        con = Conexion.getConexion();
    }
    
    public void nuevoDetalleVenta(DetalleVenta dv){
        String sql = "INSERT INTO detalleventa (cantidad, precioVenta, idVenta, idProducto) VALUES (?,?,?,?)";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getCantidad());
            ps.setInt(2, dv.getPrecioVenta());
            ps.setInt(3, dv.getVenta().getIdVenta());
            ps.setInt(4, dv.getProducto().getIdProducto());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Detalle de venta creado con éxito.");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al agregar el detalle de venta..."+ex.getMessage());
        }
    }
    
    public void modificarDetalleVenta(DetalleVenta dv){
        String sql = "UPDATE detalleventa SET cantidad = ?, precioVenta = ?, idVenta = ?, idProducto = ? WHERE idDetalleVenta = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getCantidad());
            ps.setInt(2, dv.getPrecioVenta());
            ps.setInt(3, dv.getVenta().getIdVenta());
            ps.setInt(4, dv.getProducto().getIdProducto());
            ps.setInt(5, dv.getIdDetalleVenta());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Datos del detalle de venta modificados con éxito.");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al modificar datos del detalle de la venta..."+ex.getMessage());
        }
    }
    
    
}
