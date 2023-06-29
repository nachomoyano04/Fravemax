package controladoras;

import entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author nacho
 */
public class VentaData {
    private Connection con;
    private ClienteData cd = new ClienteData();
    
    public VentaData(){
        con = Conexion.getConexion();
    }
    
    public int nuevaVenta(Venta venta) {
        String sql = "INSERT INTO venta (fecha, idCliente) VALUES (?,?)";
        PreparedStatement ps;
        ResultSet res;
        int idVentaGenerado = -1; // Valor por defecto en caso de error
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(venta.getFecha()));
            ps.setInt(2, venta.getCliente().getIdCliente());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                res = ps.getGeneratedKeys();
                if (res.next()) {
                    idVentaGenerado = res.getInt(1);
                }
                JOptionPane.showMessageDialog(null, "Venta realizada con éxito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al añadir nueva venta..." + ex.getMessage());
        }
        return idVentaGenerado;
    }

    public void modificarVenta(Venta venta){
        String sql = "UPDATE venta SET fecha = ?, idCliente = ? WHERE idVenta = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(venta.getFecha()));
            ps.setInt(2, venta.getCliente().getIdCliente());
            ps.setInt(3, venta.getIdVenta());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Venta modificada con éxito");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al modificar datos de la venta..."+ex.getMessage());
        }
    }
    
    public Venta buscarVentaXID(int idVenta){
        String sql = "SELECT * FROM venta WHERE idVenta = ?";
        Venta venta = new Venta();
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idVenta);
            ResultSet res = ps.executeQuery();
            if(res.next()){
                venta.setIdVenta(res.getInt("idVenta"));
                venta.setCliente(cd.buscarClienteXId(res.getInt("idCliente")));
                venta.setFecha(res.getDate("fecha").toLocalDate());
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al buscar venta..."+ex.getMessage());
        }
        return venta;
    }
    
    public ArrayList<Venta> listarVentasPorCliente(int idCliente){
        ArrayList<Venta>ventas = new ArrayList();
        String sql = "SELECT * FROM venta WHERE idCliente = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCliente);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Venta venta = new Venta();
                venta.setIdVenta(res.getInt("idVenta"));
                venta.setFecha(res.getDate("fecha").toLocalDate());
                venta.setCliente(cd.buscarClienteXId(res.getInt("idCliente")));
                ventas.add(venta);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al listar ventas..."+ex.getMessage());
        }
        return ventas;
    }
    
}
