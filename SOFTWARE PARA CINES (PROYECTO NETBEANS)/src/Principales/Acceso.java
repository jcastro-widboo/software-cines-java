/*
 * Autor: Jorge Castro ; Fausto Males
 * Software: SUPERCINES
 * Fecha: 
 * Hora: 
 * Version: 1.0.0
 */

package Principales;

import javax.swing.ImageIcon;

public class Acceso extends javax.swing.JFrame {
    
//Variables atributo para el uso de usuarios en el sistema.    
    public static Usuario usuario;
    public static String perfil = "ninguno";
    
//Componentes caracteristicos de la ventana.
    public Acceso() {

        initComponents();
        this.setTitle("SUPERCINES - Acceso");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);
        setIconImage(new ImageIcon(getClass().getResource("/img/favicon.png")).getImage());

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo1 = new javax.swing.JLabel();
        JDPanel = new javax.swing.JDesktopPane();
        JBInicioDeSesionClientes = new javax.swing.JButton();
        JBInicioDeSesionAdministracion = new javax.swing.JButton();
        JLTextoCliente = new javax.swing.JLabel();
        JLTextoAdministracion = new javax.swing.JLabel();
        JLMensajeBienvenida = new javax.swing.JLabel();
        JLTituloCabecera = new javax.swing.JLabel();
        JBBotonSalir = new javax.swing.JButton();
        JLImagenAdministracion = new javax.swing.JLabel();
        JLBannerSupercines = new javax.swing.JLabel();
        JBInicioDeSesionEmpleado = new javax.swing.JButton();
        JLImagenCliente = new javax.swing.JLabel();
        JLImagenEmpleado = new javax.swing.JLabel();
        JLTextoEmpleado = new javax.swing.JLabel();
        JLFondoVentana = new javax.swing.JLabel();

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoprincipal.jpg"))); // NOI18N
        fondo1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 477));
        setPreferredSize(new java.awt.Dimension(640, 475));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        JBInicioDeSesionClientes.setForeground(new java.awt.Color(240, 240, 240));
        JBInicioDeSesionClientes.setBorder(null);
        JBInicioDeSesionClientes.setBorderPainted(false);
        JBInicioDeSesionClientes.setContentAreaFilled(false);
        JBInicioDeSesionClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBInicioDeSesionClientesActionPerformed(evt);
            }
        });
        JDPanel.add(JBInicioDeSesionClientes);
        JBInicioDeSesionClientes.setBounds(20, 150, 250, 170);

        JBInicioDeSesionAdministracion.setForeground(new java.awt.Color(240, 240, 240));
        JBInicioDeSesionAdministracion.setBorder(null);
        JBInicioDeSesionAdministracion.setBorderPainted(false);
        JBInicioDeSesionAdministracion.setContentAreaFilled(false);
        JBInicioDeSesionAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBInicioDeSesionAdministracionActionPerformed(evt);
            }
        });
        JDPanel.add(JBInicioDeSesionAdministracion);
        JBInicioDeSesionAdministracion.setBounds(620, 160, 310, 160);

        JLTextoCliente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JLTextoCliente.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoCliente.setText("Inicio de Sesión - Clientes");
        JDPanel.add(JLTextoCliente);
        JLTextoCliente.setBounds(30, 250, 211, 70);

        JLTextoAdministracion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JLTextoAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoAdministracion.setText("Inicio de Sesión - Administración");
        JDPanel.add(JLTextoAdministracion);
        JLTextoAdministracion.setBounds(640, 250, 270, 70);

        JLMensajeBienvenida.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLMensajeBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        JLMensajeBienvenida.setText("Bienvenido a SUPERCINES!");
        JDPanel.add(JLMensajeBienvenida);
        JLMensajeBienvenida.setBounds(320, 110, 330, 30);

        JLTituloCabecera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLTituloCabecera.setForeground(new java.awt.Color(255, 255, 255));
        JLTituloCabecera.setText("Castro Males © 2016");
        JDPanel.add(JLTituloCabecera);
        JLTituloCabecera.setBounds(70, 10, 140, 40);

        JBBotonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JBBotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        JBBotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirinicio1.png"))); // NOI18N
        JBBotonSalir.setText("Salir");
        JBBotonSalir.setBorder(null);
        JBBotonSalir.setBorderPainted(false);
        JBBotonSalir.setContentAreaFilled(false);
        JBBotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBBotonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBBotonSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JBBotonSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBotonSalirActionPerformed(evt);
            }
        });
        JDPanel.add(JBBotonSalir);
        JBBotonSalir.setBounds(410, 330, 100, 100);

        JLImagenAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/accesoadministrador.png"))); // NOI18N
        JDPanel.add(JLImagenAdministracion);
        JLImagenAdministracion.setBounds(730, 170, 90, 90);

        JLBannerSupercines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BANNER2.png"))); // NOI18N
        JDPanel.add(JLBannerSupercines);
        JLBannerSupercines.setBounds(350, 30, 270, 80);

        JBInicioDeSesionEmpleado.setForeground(new java.awt.Color(240, 240, 240));
        JBInicioDeSesionEmpleado.setBorder(null);
        JBInicioDeSesionEmpleado.setBorderPainted(false);
        JBInicioDeSesionEmpleado.setContentAreaFilled(false);
        JBInicioDeSesionEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBInicioDeSesionEmpleadoActionPerformed(evt);
            }
        });
        JDPanel.add(JBInicioDeSesionEmpleado);
        JBInicioDeSesionEmpleado.setBounds(310, 160, 290, 160);

        JLImagenCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/accesocliente.png"))); // NOI18N
        JDPanel.add(JLImagenCliente);
        JLImagenCliente.setBounds(110, 170, 60, 85);

        JLImagenEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/accesoadministrador.png"))); // NOI18N
        JDPanel.add(JLImagenEmpleado);
        JLImagenEmpleado.setBounds(410, 170, 90, 90);

        JLTextoEmpleado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JLTextoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoEmpleado.setText("Inicio de Sesión - Empleado");
        JDPanel.add(JLTextoEmpleado);
        JLTextoEmpleado.setBounds(340, 250, 270, 70);

        JLFondoVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoprincipal.jpg"))); // NOI18N
        JLFondoVentana.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JDPanel.add(JLFondoVentana);
        JLFondoVentana.setBounds(0, 0, 950, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Cuando la ventana Acceso es iniciada es ejecutado el condicional para saber el ambito del usuario(cliente, vendedor, administrador).    
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        if(perfil.equals("ninguno")){
            
        }else if(perfil.equals("vendedor")){
            
            PrincipalVendedor ventanavendedor = new PrincipalVendedor(usuario);
            ventanavendedor.setVisible(true);
            perfil = "ninguno";
            this.setVisible(false);
            
        }else if(perfil.equals("administrador")){
            
            PrincipalAdministrador ventanaadministrador = new PrincipalAdministrador(usuario);
            ventanaadministrador.setVisible(true);
            perfil = "ninguno";
            this.setVisible(false);
            
        }else if(perfil.equals("cliente")){
            
            PrincipalCliente ventanacliente = new PrincipalCliente(usuario);
            ventanacliente.setVisible(true);
            perfil = "ninguno";
            this.setVisible(false);
            
        }
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

//Boton de acceso a la ventana AccesoEmpleado.    
    private void JBInicioDeSesionEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInicioDeSesionEmpleadoActionPerformed

        new AccesoEmpleado(this, true, "vendedor").setVisible(true);

    }//GEN-LAST:event_JBInicioDeSesionEmpleadoActionPerformed

//Boton para salir del sistema.    
    private void JBBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBotonSalirActionPerformed

        System.exit(0);

    }//GEN-LAST:event_JBBotonSalirActionPerformed

//Boton de acceso a la ventana AccesoAdministracion.    
    private void JBInicioDeSesionAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInicioDeSesionAdministracionActionPerformed

        new AccesoAdministracion(this, true, "administrador").setVisible(true);

    }//GEN-LAST:event_JBInicioDeSesionAdministracionActionPerformed

//Boton de acceso a la ventana de AccesoCliente.    
    private void JBInicioDeSesionClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInicioDeSesionClientesActionPerformed

        new AccesoCliente(this, true, "cliente" ,usuario).setVisible(true);
        
    }//GEN-LAST:event_JBInicioDeSesionClientesActionPerformed

//Metodo main.    
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBotonSalir;
    private javax.swing.JButton JBInicioDeSesionAdministracion;
    private javax.swing.JButton JBInicioDeSesionClientes;
    private javax.swing.JButton JBInicioDeSesionEmpleado;
    private javax.swing.JDesktopPane JDPanel;
    private javax.swing.JLabel JLBannerSupercines;
    private javax.swing.JLabel JLFondoVentana;
    private javax.swing.JLabel JLImagenAdministracion;
    private javax.swing.JLabel JLImagenCliente;
    private javax.swing.JLabel JLImagenEmpleado;
    private javax.swing.JLabel JLMensajeBienvenida;
    private javax.swing.JLabel JLTextoAdministracion;
    private javax.swing.JLabel JLTextoCliente;
    private javax.swing.JLabel JLTextoEmpleado;
    private javax.swing.JLabel JLTituloCabecera;
    private javax.swing.JLabel fondo1;
    // End of variables declaration//GEN-END:variables
}