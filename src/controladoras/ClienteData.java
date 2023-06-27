package controladoras;

import entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ClienteData {
    private Connection con = null;
    
    public ClienteData(){
        con = Conexion.getConexion();
    }
    
    public void nuevoCliente(Cliente cliente){
        String sql = "INSERT INTO cliente (apellido, nombre, domicilio, telefono) VALUES (?,?,?,?)";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Cliente creado con éxito.");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al crear nuevo cliente..."+ex.getMessage());
        }
    }
    
    public void modificarCliente(Cliente cliente){
        String sql = "UPDATE cliente SET apellido = ?, nombre = ?, domicilio = ?, telefono = ? WHERE idCliente = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.setInt(5, cliente.getIdCliente());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Cliente modificado con éxito.");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al modificar cliente");
        }
    }
    
    public Cliente buscarClienteXId(int idCliente){
        String sql = "SELECT * FROM cliente WHERE idCliente = ?";
        Cliente cliente = new Cliente();
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCliente);
            ResultSet res = ps.executeQuery();
            if(res.next()){
                cliente.setIdCliente(res.getInt("idCliente"));
                cliente.setApellido(res.getString("apellido"));
                cliente.setNombre(res.getString("nombre"));
                cliente.setDomicilio(res.getString("domicilio"));
                cliente.setTelefono(res.getString("telefono"));
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al buscar cliente..."+ex.getMessage());
        }
        return cliente;
    }
}
