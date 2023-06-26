package controladoras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author nacho
 */
public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/";
    private static final String DB = "fravemax";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    
    public static Connection getConexion(){
        if(connection == null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB+"?useLegacyDatetimeCode=false&serverTimezone=UTC"+"&user="+USUARIO+"&password="+PASSWORD);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error al conectarse a la BD");
            }catch(ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null,"Error al cargar los drivers");
            }
        }
        return connection;
    }
}
