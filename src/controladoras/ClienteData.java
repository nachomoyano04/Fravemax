package controladoras;

import entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
