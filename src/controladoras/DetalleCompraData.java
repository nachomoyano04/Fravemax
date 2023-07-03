/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import entidades.DetalleCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class DetalleCompraData {
   private Connection con;
   
   public DetalleCompraData(){
       con = Conexion.getConexion();
   }
    
   public void nuevoDetalleDeCompra(DetalleCompra detalleCompra){
       String sql = "INSERT INTO detallecompra (cantidad, precioCosto, idCompra, idProducto) VALUES (?,?,?,?)";
       PreparedStatement ps;
       try{
           ps = con.prepareStatement(sql);
           ps.setInt(1, detalleCompra.getCantidad());
           ps.setBigDecimal(2, detalleCompra.getPrecioCosto());
           ps.setInt(3, detalleCompra.getCompra().getIdCompra());
           ps.setInt(4, detalleCompra.getProducto().getIdProducto());
           ps.executeUpdate();
           ps.close();
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error al hacer una nueva compra..."+ex.getMessage());
       }
   }
   
   public void modificarDetalleCompra(DetalleCompra detalleCompra){
       String sql = "UPDATE detallecompra SET cantidad = ?, precioCosto = ?, idCompra = ?, idProducto = ? WHERE idDetalleCompra = ?";
       PreparedStatement ps;
       try{
           ps = con.prepareStatement(sql);
           ps.setInt(1, detalleCompra.getCantidad());
           ps.setBigDecimal(2, detalleCompra.getPrecioCosto());
           ps.setInt(3, detalleCompra.getCompra().getIdCompra());
           ps.setInt(4, detalleCompra.getProducto().getIdProducto());
           int exito = ps.executeUpdate();
           if(exito == 1){
               JOptionPane.showMessageDialog(null, "Detalle de compra modificado con éxito");
           }
           ps.close();
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Error al modificar detalle de compra");
       }
   }

    public ArrayList<DetalleCompra> listarComprasRealizadas() {
        ArrayList<DetalleCompra>detalles = new ArrayList();
        String sql = "SELECT * FROM detallecompra";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                DetalleCompra dc = new DetalleCompra();
                dc.setIdDetalleCompra(res.getInt("idDetalleCompra"));
                dc.setCantidad(res.getInt("cantidad"));
                dc.setPrecioCosto(res.getBigDecimal("precioCosto"));
                dc.setCompra(new CompraData().buscarCompraXId(Integer.parseInt(res.getInt("idCompra")+"")));
                dc.setProducto(new ProductoData().buscarProductoXId(Integer.parseInt(res.getInt("idProducto")+"")));
                detalles.add(dc);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al listar compras realizadas");
        }
        return detalles;
    }

    public ArrayList<DetalleCompra> filtrarComprasPorProducto(String descripcion) {
        ArrayList<DetalleCompra>detCom = new ArrayList();
        String sql = "SELECT * FROM detallecompra JOIN producto ON detallecompra.idProducto = producto.idProducto WHERE producto.descripcion LIKE ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "%"+descripcion+"%");
            ResultSet res = ps.executeQuery();
            while(res.next()){
                DetalleCompra de = new DetalleCompra();
                de.setIdDetalleCompra(res.getInt("idDetalleCompra"));
                de.setCantidad(res.getInt("cantidad"));
                de.setPrecioCosto(res.getBigDecimal("precioCosto"));
                de.setCompra(new CompraData().buscarCompraXId(Integer.parseInt(res.getInt("idCompra")+"")));
                de.setProducto(new ProductoData().buscarProductoXId(Integer.parseInt(res.getInt("idProducto")+"")));
                detCom.add(de);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al filtrar por productos");
        }
        return detCom;
    }

    public ArrayList<DetalleCompra> filtrarComprasPorProveedores(String razonSocial) {
        ArrayList<DetalleCompra>detCom = new ArrayList();
        String sql = "SELECT * FROM detallecompra JOIN compra ON detallecompra.idCompra = compra.idCompra JOIN proveedor ON compra.idProveedor = proveedor.idProveedor WHERE proveedor.razonSocial LIKE ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "%"+razonSocial+"%");
            ResultSet res = ps.executeQuery();
            while(res.next()){
                DetalleCompra de = new DetalleCompra();
                de.setIdDetalleCompra(res.getInt("idDetalleCompra"));
                de.setCantidad(res.getInt("cantidad"));
                de.setPrecioCosto(res.getBigDecimal("precioCosto"));
                de.setCompra(new CompraData().buscarCompraXId(Integer.parseInt(res.getInt("idCompra")+"")));
                de.setProducto(new ProductoData().buscarProductoXId(Integer.parseInt(res.getInt("idProducto")+"")));
                detCom.add(de);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al filtrar por proveedores");
        }
        return detCom;
    }
   
   
}
