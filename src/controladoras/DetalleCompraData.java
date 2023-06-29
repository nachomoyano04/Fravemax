/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import entidades.DetalleCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
           int exito = ps.executeUpdate();
           if(exito == 1){
               JOptionPane.showMessageDialog(null, "Detalle de compra hecho con éxito");
           }
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
   
   
}
