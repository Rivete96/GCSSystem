/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
     * @author      Ricardo Velasquez Tejerina
     */
public class ClsETDUsuario {

    private int USUid_usuario;
	private String USUapellido;
	private String USUnombre;
	private int USUtelefono;
	private String USUcorreo;
	private int USUdni;
	private String USUcargo;
        private String USUcontraseña;
        private String USUcodigo;
    
    public ClsETDUsuario(int USUid_usuario, String USUapellido, String USUnombre, int USUtelefono, String USUcorreo, int USUdni, String USUcargo, String USUcontraseña, String USUcodigo) {
        this.USUid_usuario = USUid_usuario;
        this.USUapellido = USUapellido;
        this.USUnombre = USUnombre;
        this.USUtelefono = USUtelefono;
        this.USUcorreo = USUcorreo;
        this.USUdni = USUdni;
        this.USUcargo = USUcargo;
        this.USUcontraseña = USUcontraseña;
        this.USUcodigo = USUcodigo;
    }

    	
     
      
   

       //Campos Encapsulados
    
    public int getUSUid_usuario() {
        return USUid_usuario;
    }

    public void setUSUid_usuario(int USUid_usuario) {
        this.USUid_usuario = USUid_usuario;
    }

    public String getUSUapellido() {
        return USUapellido;
    }

    public void setUSUapellido(String USUapellido) {
        this.USUapellido = USUapellido;
    }

    public String getUSUnombre() {
        return USUnombre;
    }

    public void setUSUnombre(String USUnombre) {
        this.USUnombre = USUnombre;
    }

    public int getUSUtelefono() {
        return USUtelefono;
    }

    public void setUSUtelefono(int USUtelefono) {
        this.USUtelefono = USUtelefono;
    }

    public String getUSUcorreo() {
        return USUcorreo;
    }

    public void setUSUcorreo(String USUcorreo) {
        this.USUcorreo = USUcorreo;
    }

    public int getUSUdni() {
        return USUdni;
    }

    public void setUSUdni(int USUdni) {
        this.USUdni = USUdni;
    }

    public String getUSUcargo() {
        return USUcargo;
    }

    public void setUSUcargo(String USUcargo) {
        this.USUcargo = USUcargo;
    }

    public String getUSUcontraseña() {
        return USUcontraseña;
    }

    public void setUSUcontraseña(String USUcontraseña) {
        this.USUcontraseña = USUcontraseña;
    }

    public String getUSUcodigo() {
        return USUcodigo;
    }

    public void setUSUcodigo(String USUcodigo) {
        this.USUcodigo = USUcodigo;
    }
    
    
        
}
