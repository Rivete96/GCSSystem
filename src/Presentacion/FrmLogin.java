
package Presentacion;


import Conexion.ClsConexion;
import Negocios.ClsNEGOUsuario;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class FrmLogin extends javax.swing.JFrame {

     /**
     * Creates new form FrmInicioSesion
     */
    private String usuarioNombre;
    private String usuarioApellido;
    private String usuarioCargo;
    private String usuarioId;
    Connection conexion;
    
    
    public FrmLogin() {
        initComponents();
          this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        btningresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtcorreo.setForeground(new java.awt.Color(0, 153, 153));
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcorreoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 20, 160, -1));

        txtpassword.setForeground(new java.awt.Color(0, 153, 153));
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswordKeyTyped(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 60, 160, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Login de Acceso");

        btncancelar.setBackground(new java.awt.Color(255, 204, 102));
        btncancelar.setForeground(new java.awt.Color(0, 153, 153));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Exit.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btningresar.setBackground(new java.awt.Color(255, 204, 102));
        btningresar.setForeground(new java.awt.Color(0, 153, 153));
        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/accept.png"))); // NOI18N
        btningresar.setText("Ingresar");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btncancelar)))
                        .addGap(41, 41, 41))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
 //declaracion de variables
        String codigo;
        String contrasena;
        
        //toma de datos
        codigo = txtcorreo.getText();
        char[] aux = txtpassword.getPassword();
        contrasena = new String(aux);
        
        try 
        {
            //Comprueba el usuario y la contraseña
            if(ComprobarUsuarioContrasena(codigo,contrasena))
            {
                JOptionPane.showMessageDialog(this, "Bienvenido(a):\n"+
                        usuarioApellido+", "+usuarioNombre,
                        "Acceso correcto =)",JOptionPane.INFORMATION_MESSAGE);
                         
                if(usuarioCargo.equals("Administrador"))
                {
                    AbrirVentanaPrincipal("", usuarioApellido+", "+ usuarioNombre, usuarioId);
                }
                else
                {
                    AbrirVentanaPrincipal("", usuarioApellido+", "+ usuarioNombre, usuarioId);
                }                
                this.dispose();          
                
                
            }
        } catch (Exception ex) {
            Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }//GEN-LAST:event_btningresarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
         int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
              if(resp != 1){
              System.exit(0);
               }
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        txtpassword.requestFocus();
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))
        {
            evt.consume();
        }
        if (txtpassword.getText().length() >= 6) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
        }
    }//GEN-LAST:event_txtpasswordKeyTyped

    private void txtcorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            txtcorreo.grabFocus();
        }
    }//GEN-LAST:event_txtcorreoKeyPressed

    private void txtcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyTyped
       if(txtcorreo.getText().length()>=25) evt.consume();  
    }//GEN-LAST:event_txtcorreoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    
    /**
     * Permite comprobar el codigo y contraseña del usuario que iniciara sesion.
     * @param xCorreo   el correo ingresado por el usuario.
     * @param xContrasena la contraseña ingresada por el usuario.
     * @return usuarioContrasenaCorrecto true si se comprueban los datos.
     * @throws Exception Excepcion en el ResultSet rsDatos.
     */
    private boolean ComprobarUsuarioContrasena(String xCodigo, String xContrasena) throws Exception {
                
        ResultSet rsDatos;
        ClsNEGOUsuario usuarioNEGO = new ClsNEGOUsuario();        
        conexion = ClsConexion.AbrirConexion();
        boolean usuarioContrasenaCorrecto = false;
        
        try
        {
            rsDatos = usuarioNEGO.SeleccionarUsuarioCodigo(xCodigo, conexion);            
            while(rsDatos.next())
            {
                if(xContrasena.equals(rsDatos.getString("USUcontraseña")))
                {
                   usuarioContrasenaCorrecto = true;
                   usuarioNombre = rsDatos.getString("USUnombre");
                   usuarioApellido = rsDatos.getString("USUapellido");
                   usuarioCargo = rsDatos.getString("USUcargo");
                   usuarioId = rsDatos.getString("USUid_usuario");
                }
                else
                {
                    usuarioContrasenaCorrecto = false;
                    JOptionPane.showMessageDialog(this, "Contraseña Incorrecta", 
                                        "Error autenticando", 0);
                }
            }
            ClsConexion.CerrarConexion(conexion);
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return usuarioContrasenaCorrecto;
    }
    
    /**
     * Abre el formulario Principal {@link MDIprincipal} donde se trabajara
     * con las ventanas modales del sistema.
     * <p>
     * Se visualiza el formulario, se centra y se maximiza.
     * @param xCargo variable que ira al formulario Principal {@link MDIprincipal}
     * @param xUsuario variable que ira al formulario Principal {@link MDIprincipal}
     * para que todo el sistema identifique si el usuario es jefe de proyecto o no.
     */
    private void AbrirVentanaPrincipal 
        (
            String xCargo,
            String xUsuario, 
            String xUsuarioId
        ) {
        
        Presentacion.FrmMDIprincipal obj= new  Presentacion.FrmMDIprincipal(xCargo, xUsuario, xUsuarioId);  
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        obj.setExtendedState(FrmMDIprincipal.MAXIMIZED_BOTH);        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btningresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
