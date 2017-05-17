/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Conexion.*;
import Entidad.ClsETDUsuario;
import java.sql.Connection;
import java.sql.*;//.CallabeStatement    .SQLException
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ricardo
 */
public class ClsNEGOUsuario {
    
    /**
     * Permite buscar un usuario en la base de datos a través del campo codigo. 
     * @param xCodigo   codigo del usuario que iniciara sesion
     * @param xConexion conexion a la base de datos
     * @return  rs  retorna los valores encontrados en un ResultSet {@link constrasena},
     *              {@link nombre}, y {@link apellido}.
     * @throws Exception 
     */
    public ResultSet SeleccionarUsuarioCodigo(String xCodigo, Connection xConexion) throws Exception{
        ResultSet rs;
        try
        {            
            PreparedStatement st = xConexion.prepareStatement("select USUcontraseña, "
                        + "USUnombre, USUapellido, USUcargo, USUid_usuario "
                        + "from ges_usu_p_usuario where USUcodigo = (?)");
            st.setString(1, xCodigo);
            rs = st.executeQuery();            
            return rs;
        }
        catch(SQLException ex)
        {
            throw ex;            
        }
    }        
}
