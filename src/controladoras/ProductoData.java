package controladoras;

import java.sql.Connection;

/**
 * @author nacho
 */
public class ProductoData {
    
    public ProductoData(){
        Connection con = Conexion.getConexion();
    }
    
    public void nuevoProducto(String descripcion, int precioActual, int stock, int estado){
        String sql = "";
    }
    
    
}
