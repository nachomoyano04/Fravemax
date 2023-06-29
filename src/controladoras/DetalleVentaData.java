package controladoras;

import entidades.DetalleVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * @author nacho
 */
public class DetalleVentaData {
    private Connection con;
    private ProductoData pd = new ProductoData();
    private VentaData vd = new VentaData();
    
    public DetalleVentaData(){
        con = Conexion.getConexion();
    }
    
    public void nuevoDetalleVenta(DetalleVenta dv){
        String sql = "INSERT INTO detalleventa (cantidad, precioVenta, idVenta, idProducto) VALUES (?,?,?,?)";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getCantidad());
            ps.setBigDecimal(2, dv.getPrecioVenta());
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
            ps.setBigDecimal(2, dv.getPrecioVenta());
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
    
    public ArrayList<DetalleVenta> listarVentasRealizadas(){
        ArrayList<DetalleVenta>dVentas = new ArrayList();
        String sql = "SELECT * FROM detalleventa";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                DetalleVenta dv = new DetalleVenta();
                dv.setIdDetalleVenta(res.getInt("idDetalleVenta"));
                dv.setCantidad(res.getInt("cantidad"));
                dv.setPrecioVenta(res.getBigDecimal("precioVenta"));
                dv.setVenta(vd.buscarVentaXID(res.getInt("idVenta")));
                dv.setProducto(pd.buscarProductoXId(res.getInt("idProducto")));
                dVentas.add(dv);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al listar ventas realizadas");
        }
        return dVentas;
    }
    
    public ArrayList<DetalleVenta> filtrarPorClientes(String apellido){
        ArrayList<DetalleVenta>detalleVentas = new ArrayList();
        String sql = "SELECT * FROM detalleVenta JOIN venta ON detalleVenta.idVenta = venta.idVenta JOIN cliente ON venta.idCliente = cliente.idCliente WHERE cliente.apellido LIKE ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "%"+apellido+"%");
            ResultSet res = ps.executeQuery();
            while(res.next()){
                DetalleVenta dv = new DetalleVenta();
                dv.setIdDetalleVenta(res.getInt("idDetalleVenta"));
                dv.setCantidad(res.getInt("cantidad"));
                dv.setPrecioVenta(res.getBigDecimal("precioVenta"));
                dv.setVenta(vd.buscarVentaXID(res.getInt("idVenta")));
                dv.setProducto(pd.buscarProductoXId(res.getInt("idProducto")));
                detalleVentas.add(dv);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al filtrar por clientes");
        }
        return detalleVentas;
    }

    public ArrayList<DetalleVenta> filtrarPorProductos(String descripcion) {
        ArrayList<DetalleVenta>dVenta = new ArrayList();
        String sql = "SELECT * FROM detalleventa JOIN producto ON detalleventa.idProducto = producto.idProducto WHERE producto.descripcion LIKE ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "%"+descripcion+"%");
            ResultSet res = ps.executeQuery();
            while(res.next()){
                DetalleVenta dv = new DetalleVenta();
                dv.setIdDetalleVenta(res.getInt("idDetalleVenta"));
                dv.setCantidad(res.getInt("cantidad"));
                dv.setPrecioVenta(res.getBigDecimal("precioVenta"));
                dv.setVenta(vd.buscarVentaXID(res.getInt("idVenta")));
                dv.setProducto(pd.buscarProductoXId(res.getInt("idProducto")));
                dVenta.add(dv);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al filtrar por productos");
        }
        return dVenta;
    }
    
}
