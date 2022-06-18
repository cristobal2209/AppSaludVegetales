/**
 * **********COMENTARIO ENTREGA**********
 * PB2: Las interfaces graficas que se incluyeron son: el menu principal, el menu
 * usuario y el panel para mostrar el IMC de un usuario (linea 184 de MenuUsuario).
 * PB3: Se pusieron en privado todos los atributos de los objetos, exceptuando los atibutos
 * de las clases que se extienden de una clase abstracta, además se pusieron en privado
 * algunos métodos de Principal que no era necesario que estuvieran en publico. 
 * Se ocupó el principio DIP, creando interfaces polivantes para nuestro problema, y tratando de modelar
 * las clases que implementaban estas interfaces, a dicha interface, buscando que los cambios
 * ocurrieran en la clase y no en la interface.
 * 
 * 
 * La función de este programa es manejar y seguir la dieta de frutas y verduras de 
 * diferentes usuarios, otorgando herramientas como el cálculo de IMC, cálculo
 * de información nutrucional de vegetales ingeridos, creación de documentos y
 * futuras opciones que se planean implementar, como por ejemplo: mostrar
 * información adicional y curiosa de cada vegetal, como plantar dicho vegetal y alertas
 * de exceso o falta de algún nutriente.
 * 
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @version 1.0
 */
package GUI;

import classes.DatosVegetales;
import classes.RegistroUsuariosAplicacion;
import java.util.Scanner;

/**
 * Esta clase tiene el deber de controlar lo que sucede en el programa, cumpliendo
 * tambien el papel de ser la interfaz de un menu principal.
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @Versión 1.0
 */
public class Principal extends javax.swing.JFrame {

    public static int MAX_VEGETALES = 6;
    private static DatosVegetales datos;
    private static RegistroUsuariosAplicacion usuarios;
    private static Principal ventanaPrincipal;
    private static MenuUsuario ventanaUsuario;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCrearUsuarios = new javax.swing.JButton();
        btnEliminarUsuarios = new javax.swing.JButton();
        btnAccesUsuarios = new javax.swing.JButton();
        btnVerUsuarios = new javax.swing.JButton();
        btnArchivoUsuarios = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 202, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnCrearUsuarios.setText("Crear Usuario");
        btnCrearUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuariosActionPerformed(evt);
            }
        });

        btnEliminarUsuarios.setText("Eliminar Usuario");
        btnEliminarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuariosActionPerformed(evt);
            }
        });

        btnAccesUsuarios.setText("Acceder Usuario");
        btnAccesUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesUsuariosActionPerformed(evt);
            }
        });

        btnVerUsuarios.setText("Ver Usuarios");
        btnVerUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerUsuariosActionPerformed(evt);
            }
        });

        btnArchivoUsuarios.setText("Archivo Usuarios");
        btnArchivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoUsuariosActionPerformed(evt);
            }
        });

        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrearUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAccesUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnArchivoUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit)
                .addGap(50, 50, 50)
                .addComponent(btnCrearUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btnAccesUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btnVerUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btnArchivoUsuarios)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuariosActionPerformed
        ventanaPrincipal.setVisible(false);
        if (usuarios.crearUsuario())
            System.out.println("Usuario agregado");
        else
            System.out.println("No se pudo agregar usuario");
        ventanaPrincipal.setVisible(true);
    }//GEN-LAST:event_btnCrearUsuariosActionPerformed

    private void btnEliminarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuariosActionPerformed

        Scanner input = new Scanner(System.in);
        
        ventanaPrincipal.setVisible(false);
        usuarios.mostrarIdUsuarios();
        System.out.println("Ingrese id del usuario a eliminar");
        if (usuarios.eliminarUsuario(input.nextInt()))
            System.out.println("Usuario eliminado");
        else
            System.out.println("No se elimino el usuario");
        ventanaPrincipal.setVisible(true);
    }//GEN-LAST:event_btnEliminarUsuariosActionPerformed

    private void btnAccesUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesUsuariosActionPerformed
        ventanaPrincipal.setVisible(false);
        Scanner input = new Scanner(System.in);
        usuarios.mostrarIdUsuarios();
        System.out.println("Ingrese id del usuario a acceder");
        ventanaUsuario.setUsuario(usuarios.getUsuario(input.nextInt()));
        ventanaUsuario.setDatos(datos);
        ventanaUsuario.setVentanaUsuario(ventanaUsuario);
        ventanaUsuario.setVentanaPrincipal(ventanaPrincipal);
        ventanaUsuario.setVisible(true);
        
    }//GEN-LAST:event_btnAccesUsuariosActionPerformed

    private void btnVerUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerUsuariosActionPerformed
        usuarios.imprimirUsuarios();
    }//GEN-LAST:event_btnVerUsuariosActionPerformed

    private void btnArchivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoUsuariosActionPerformed
        usuarios.crearArchivoUsuarios();
    }//GEN-LAST:event_btnArchivoUsuariosActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        ventanaPrincipal = new Principal();
        ventanaUsuario = new MenuUsuario();
        datos = new DatosVegetales();
        usuarios = new RegistroUsuariosAplicacion();
        
        if (datos.leerDatos())
            System.out.println("Lectura de datos correcta");
        usuarios.setDatos(datos.getListaVegetales());
        
        ventanaPrincipal.setVisible(true);
        
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccesUsuarios;
    private javax.swing.JButton btnArchivoUsuarios;
    private javax.swing.JButton btnCrearUsuarios;
    private javax.swing.JButton btnEliminarUsuarios;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnVerUsuarios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
