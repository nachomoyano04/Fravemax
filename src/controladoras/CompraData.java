package controladoras;

import entidades.Compra;
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
public class CompraData {
    
    private Connection con;
    private ProveedorData pd = new ProveedorData();

    
    public CompraData(){
        con = Conexion.getConexion();
    }
    
    public int nuevaCompra(Compra compra){
        String sql = "INSERT INTO compra (fecha, idProveedor) VALUES (?,?)";
        PreparedStatement ps;
        ResultSet res;
        int idCompra = 0;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(compra.getFecha()));
            ps.setInt(2, compra.getProveedor().getIdProveedor());
            int exito = ps.executeUpdate();
            if(exito == 1){
                res = ps.getGeneratedKeys();
                if(res.next()){
                    idCompra = res.getInt(1);
                }
                JOptionPane.showMessageDialog(null, "Compra creada con éxito");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al registrar nueva compra..."+ex.getMessage());
        }
        return idCompra;
    }
    
    public void modificarCompra(Compra compra){
        String sql = "UPDATE compra SET fecha = ?, idProveedor = ? WHERE idCompra = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(compra.getFecha()));
            ps.setInt(2, compra.getProveedor().getIdProveedor());
            ps.setInt(3, compra.getIdCompra());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Compra modificada con éxito...");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al modificar compra..."+ex.getMessage());
        }
    }
    
    public Compra buscarCompraXId(int idCompra){
        String sql = "SELECT * FROM compra WHERE idCompra = ?";
        Compra compra = new Compra();
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCompra);
            ResultSet res = ps.executeQuery();
            if(res.next()){
                compra.setIdCompra(res.getInt("idCompra"));
                compra.setFecha(res.getDate("fecha").toLocalDate());
                compra.setProveedor(pd.buscarProveedorXId(res.getInt("idProveedor")));
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al buscar compra..."+ex.getMessage());
        }
        return compra;
    }
    
    public ArrayList<Compra> listarComprasPorProveedor(int idProveedor){
        ArrayList<Compra>compras = new ArrayList();
        String sql = "SELECT * FROM compra WHERE idProveedor = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idProveedor);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Compra compra = new Compra();
                compra.setIdCompra(res.getInt("idComopra"));
                compra.setFecha(res.getDate("fecha").toLocalDate());
                compra.setProveedor(pd.buscarProveedorXId(res.getInt("idProveedor")));
                compras.add(compra);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al listar compras..."+ex.getMessage());
        }
        return compras;
    }
}
