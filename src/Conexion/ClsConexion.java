
package Conexion;

import java.sql.*; /*.Connecion     .DriverManager     .SQLException*/
/*import com.microsoft.sqlserver.jdbc.*;*/ /*Para la conexion con SQLServer*/
import com.mysql.jdbc.jdbc2.optional.*;/*Para la conexion con MySQL*/
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class ClsConexion {
  /**
     * Estable la conexion con el servidor MySQL con los
     * parámetros de conexion establecidos en la clase.
     * <p>
     * Este metodo retorna la conexion obtenida.
     * 
     * @author      Ricardo Velasquez Tejerina
     * @return      la conexion realizada con MySQL.
     */
    
    public static Connection AbrirConexion() {
        
        Connection conexion = null;
        try
        {
            MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
            ds.setServerName("127.0.0.1");
            ds.setPort(3306);
            ds.setDatabaseName("gestiondb");
            conexion = ds.getConnection("root","");
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ClsConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
        
    }
    
    /**
     * Cierra la conexion con MySQL.
     * <p>
     * @author      Kevin Montes De Oca V.
     * @param       xConexion       La conexion a cerrar.
     */
    public static void CerrarConexion(Connection xConexion) {
        
        try
        {
            xConexion.close();            
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ClsConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
