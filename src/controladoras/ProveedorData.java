package controladoras;

import entidades.Proveedor;
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
public class ProveedorData {
    
    private Connection con;
    
    public ProveedorData(){
        con = Conexion.getConexion();
    }
    
    public void nuevoProveedor(Proveedor proveedor){
        String sql = "INSERT INTO proveedor (razonSocial, domicilio, telefono) VALUES (?,?,?)";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Nuevo proveedor añadido con éxito.");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al agregar nuevo proveedor..."+ex.getMessage());
        }
    }
    
    public void modificarProveedor(Proveedor proveedor){
        String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ? WHERE idProveedor = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setInt(4, proveedor.getIdProveedor());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Datos del proveedor modificados con éxito.");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al modificar datos del proveedor..."+ex.getMessage());
        }
    }
    
    public Proveedor buscarProveedorXId(int idProveedor){
        Proveedor proveedor = new Proveedor();
        String sql = "SELECT * FROM proveedor WHERE idProveedor = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idProveedor);
            ResultSet res = ps.executeQuery();
            if(res.next()){
                proveedor.setIdProveedor(res.getInt("idProveedor"));
                proveedor.setRazonSocial(res.getString("razonSocial"));
                proveedor.setDomicilio(res.getString("domicilio"));
                proveedor.setTelefono(res.getString("telefono"));
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al buscar proveedor..."+ex.getMessage());
        }
        return proveedor;
    }
    
    public ArrayList<Proveedor> listarProveedores(){
        ArrayList<Proveedor>proveedores = new ArrayList();
        String sql = "SELECT * FROM proveedor";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Proveedor pro = new Proveedor();
                pro.setIdProveedor(res.getInt("idProveedor"));
                pro.setRazonSocial(res.getString("razonSocial"));
                pro.setDomicilio(res.getString("domicilio"));
                pro.setTelefono(res.getString("telefono"));
                proveedores.add(pro);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al listar proveedores..."+ex.getMessage());
        }
        return proveedores;
    }
}
