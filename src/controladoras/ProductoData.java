package controladoras;

import entidades.Producto;
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
public class ProductoData {
    private Connection con;
    public ProductoData(){
        con = Conexion.getConexion();
    }
    
    public void nuevoProducto(Producto producto){
        String sql = "INSERT INTO producto (descripcion, precioActual, stock, estado) VALUES (?,?,?,?)";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getDescripcion());
            ps.setBigDecimal(2, producto.getPrecioActual());
            ps.setInt(3, producto.getStock());
            ps.setInt(4, producto.getEstado());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Producto añadido al inventario");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al agregar nuevo producto..."+ex.getMessage());
        }
    }
    
    public void modificarProducto(Producto producto){
        String sql = "UPDATE producto SET descripcion = ?, precioActual = ?, stock = ?, estado = ? WHERE idProducto = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getDescripcion());
            ps.setBigDecimal(2, producto.getPrecioActual());
            ps.setInt(3, producto.getStock());
            ps.setInt(4, producto.getEstado());
            ps.setInt(5, producto.getIdProducto());
            int estado = ps.executeUpdate();
            if(estado == 1){
                JOptionPane.showMessageDialog(null, "Producto modificado con éxito");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al modificar producto..."+ex.getMessage());
        }
    }
    
    public void darDeBajaProducto(int idProducto){
        String sql = "UPDATE producto SET estado = 0 WHERE idProducto = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Producto dado de baja con éxito");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al dar de baja al producto..."+ex.getMessage());
        }
    }
    
    public Producto buscarProductoXId(int idProducto){
        Producto producto = new Producto();
        String sql = "SELECT * FROM producto WHERE idProducto = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idProducto);
            ResultSet res = ps.executeQuery();
            if(res.next()){
                producto.setIdProducto(res.getInt("idProducto"));
                producto.setDescripcion(res.getString("descripcion"));
                producto.setPrecioActual(res.getBigDecimal("precioActual"));
                producto.setStock(res.getInt("stock"));
                producto.setEstado(res.getInt("estado"));
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al buscar producto..."+ex.getMessage());
        }
        return producto;
    }
    
    public ArrayList<Producto> listarProductos(){
        ArrayList<Producto>productos = new ArrayList();
        String sql = "SELECT * FROM producto";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Producto producto = new Producto();
                producto.setIdProducto(res.getInt("idProducto"));
                producto.setDescripcion(res.getString("descripcion"));
                producto.setPrecioActual(res.getBigDecimal("precioActual"));
                producto.setStock(res.getInt("stock"));
                producto.setEstado(res.getInt("estado"));
                productos.add(producto);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al listar productos..."+ex.getMessage());
        }
        return productos;
    }

    public ArrayList<Producto> filtrarProductosPorDescripcion(String descripcion) {
        ArrayList<Producto>productos = new ArrayList();
        String sql = "SELECT * FROM producto WHERE descripcion LIKE ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "%"+descripcion+"%");
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Producto producto = new Producto();
                producto.setIdProducto(res.getInt("idProducto"));
                producto.setDescripcion(res.getString("descripcion"));
                producto.setPrecioActual(res.getBigDecimal("precioActual"));
                producto.setStock(res.getInt("stock"));
                producto.setEstado(res.getInt("estado"));
                productos.add(producto);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al filtrar productos por descripción.");
        }
        return productos;
    }

    public ArrayList<Producto> filtrarPorStock(int desde, int hasta) {
        ArrayList<Producto>productos = new ArrayList();
        String sql = "SELECT * FROM producto WHERE stock >= ? AND stock <= ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, desde);
            ps.setInt(2, hasta);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Producto producto = new Producto();
                producto.setIdProducto(res.getInt("idProducto"));
                producto.setDescripcion(res.getString("descripcion"));
                producto.setPrecioActual(res.getBigDecimal("precioActual"));
                producto.setStock(res.getInt("stock"));
                producto.setEstado(res.getInt("estado"));
                productos.add(producto);                
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al filtrar por stock");
        }
        return productos;
    }
    
    
}
