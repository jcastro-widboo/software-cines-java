/*
 * Autor: Jorge Castro ; Fausto Males
 * Software: SUPERCINES
 * Fecha: 
 * Hora: 
 * Version: 1.0.0
 */

package Principales;

import Principales.Main.TipoEntrada;
import static Principales.Main.formatoDecimal;
import static Principales.Main.formatoFechaArchivo;
import static Principales.Main.formatoFechaUsuario;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class NuevaVenta extends javax.swing.JDialog {
    
//Variables atributo.   
    private final Usuario usuario;
    public static String cedula, nombre, telefono, direccion;
    private boolean CedulaCorrecta = false;
    public Calendar fechaCompleta = Calendar.getInstance();
    public static int numeroentradas = 1;
    
    public String fechaActual = formatoFechaUsuario.format(fechaCompleta.getTime());
    public String fechaTexto = formatoFechaArchivo.format(fechaCompleta.getTime());
         
//Componentes caracteristicos de la ventana.    
    public NuevaVenta(java.awt.Frame parent, boolean modal, Usuario usuario) {
        
        super(parent, modal);
        initComponents();
        this.usuario = usuario;
        this.setTitle("SUPERCINES - Nueva Venta");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);
        setIconImage(new ImageIcon(getClass().getResource("/img/favicon.png")).getImage());
        
    }
    
//Metodo para el autollenado de los campos de cedula, nombre, telefono, direccion.
    private void asignarDatos(){
        
        txtCedula.setText(cedula);
        txtNombre.setText(nombre);
        txtTelefono.setText(telefono);
        txtDireccion.setText(direccion);
        
    }
    
//Metodo para asignar la cedula.    
    private void asignarVariablesEstaticas(){
        
        cedula = txtCedula.getText();
        
    }
    
//Metodo para actualizar el total.  
    private void actualizarTotal(){
        
        String s = JCTipoEntrada.getSelectedItem().toString();
        txtTotal.setText(String.valueOf(formatoDecimal.format(Double.parseDouble(txtEntradas.getText().replace(",", ".")) * Main.TipoEntrada.valueOf(s).getPrecio())));
                
    }
    
//Metodo para actualizar las entradas.    
    private void actualizarEntradas(){
        
        String s = JCTipoEntrada.getSelectedItem().toString();
        txtEntradas.setText(String.valueOf(formatoDecimal.format(Double.parseDouble(txtTotal.getText()) / Main.TipoEntrada.valueOf(s).getPrecio())));
          
    }
    
//Componentes caracteristicos de la ventana.    
    public NuevaVenta(java.awt.Dialog parent, boolean modal, Usuario usuario) {
        
        super(parent, modal);
        initComponents();
        this.usuario = usuario;
        asignarDatos();
        this.setTitle("SUPERCINES - Nueva Venta");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);
        setIconImage(new ImageIcon(getClass().getResource("/img/favicon.png")).getImage());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLBanner = new javax.swing.JLabel();
        JPDatosCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblValidacionCedula = new javax.swing.JLabel();
        JLFechaActual = new javax.swing.JLabel();
        JLSaludoVentana = new javax.swing.JLabel();
        JPDatosConsumo = new javax.swing.JPanel();
        JCTipoEntrada = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtEntradas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblValidacionEntradas = new javax.swing.JLabel();
        JBBotonMenos = new javax.swing.JButton();
        JBBotonMas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtButacas = new javax.swing.JTextField();
        JLTextoBolteria = new javax.swing.JLabel();
        JBGuardar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        JLFondoVentana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(670, 660));
        setPreferredSize(new java.awt.Dimension(670, 660));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLBanner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLBanner.setForeground(new java.awt.Color(255, 255, 255));
        JLBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BANNER2.png"))); // NOI18N
        getContentPane().add(JLBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 640, 80));

        JPDatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPDatosCliente.setOpaque(false);
        JPDatosCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cédula:");
        JPDatosCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 31, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        JPDatosCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 64, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono:");
        JPDatosCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 95, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección:");
        JPDatosCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 126, -1, -1));

        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        JPDatosCliente.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 28, 175, -1));

        txtNombre.setColumns(5);
        JPDatosCliente.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 61, 175, -1));
        JPDatosCliente.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 92, 175, -1));

        txtDireccion.setColumns(5);
        txtDireccion.setAutoscrolls(false);
        JPDatosCliente.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 123, 175, -1));

        lblValidacionCedula.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacionCedula.setText("* Campo obligatorio");
        JPDatosCliente.add(lblValidacionCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 31, 172, -1));

        getContentPane().add(JPDatosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 600, 170));

        JLFechaActual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLFechaActual.setForeground(new java.awt.Color(255, 255, 255));
        JLFechaActual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JLFechaActual.setText("jLabel6");
        getContentPane().add(JLFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        JLSaludoVentana.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLSaludoVentana.setForeground(new java.awt.Color(255, 255, 255));
        JLSaludoVentana.setText("jLabel7");
        getContentPane().add(JLSaludoVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        JPDatosConsumo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos consumo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPDatosConsumo.setMaximumSize(new java.awt.Dimension(600, 200));
        JPDatosConsumo.setOpaque(false);
        JPDatosConsumo.setPreferredSize(new java.awt.Dimension(600, 200));

        JCTipoEntrada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCTipoEntradaItemStateChanged(evt);
            }
        });
        JCTipoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCTipoEntradaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de entrada:");

        txtEntradas.setText("0");
        txtEntradas.setEnabled(false);
        txtEntradas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEntradasFocusLost(evt);
            }
        });
        txtEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradasActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("N° Entradas:");

        txtTotal.setText("0.0");
        txtTotal.setEnabled(false);
        txtTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalFocusLost(evt);
            }
        });
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total:");

        lblValidacionEntradas.setForeground(new java.awt.Color(255, 255, 255));
        lblValidacionEntradas.setText("* Campo obligatorio");

        JBBotonMenos.setText("-");
        JBBotonMenos.setOpaque(false);
        JBBotonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBotonMenosActionPerformed(evt);
            }
        });

        JBBotonMas.setText("+");
        JBBotonMas.setOpaque(false);
        JBBotonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBotonMasActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Butacas:");

        txtButacas.setEnabled(false);
        txtButacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtButacasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPDatosConsumoLayout = new javax.swing.GroupLayout(JPDatosConsumo);
        JPDatosConsumo.setLayout(JPDatosConsumoLayout);
        JPDatosConsumoLayout.setHorizontalGroup(
            JPDatosConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPDatosConsumoLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(JPDatosConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPDatosConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPDatosConsumoLayout.createSequentialGroup()
                        .addGroup(JPDatosConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPDatosConsumoLayout.createSequentialGroup()
                                .addComponent(JBBotonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBBotonMas))
                            .addComponent(JCTipoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValidacionEntradas))
                    .addComponent(txtButacas, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        JPDatosConsumoLayout.setVerticalGroup(
            JPDatosConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPDatosConsumoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(JPDatosConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCTipoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(JPDatosConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPDatosConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBBotonMas)
                        .addComponent(lblValidacionEntradas))
                    .addComponent(JBBotonMenos))
                .addGap(18, 18, 18)
                .addGroup(JPDatosConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtButacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(JPDatosConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(JPDatosConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 600, 200));

        JLTextoBolteria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLTextoBolteria.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBolteria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLTextoBolteria.setText("Boletería");
        getContentPane().add(JLTextoBolteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 640, -1));

        JBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supercines/icons/cart_add.png"))); // NOI18N
        JBGuardar.setText("Continuar");
        JBGuardar.setOpaque(false);
        JBGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBGuardarMouseClicked(evt);
            }
        });
        JBGuardar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                JBGuardarComponentHidden(evt);
            }
        });
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(JBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        JBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supercines/icons/accept.png"))); // NOI18N
        JBCancelar.setText("Finalizar");
        JBCancelar.setOpaque(false);
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, -1, -1));

        JLFondoVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/azul.jpg"))); // NOI18N
        JLFondoVentana.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(JLFondoVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Acciones del campo de la cedula.    
    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        
        try{
            //Validamos la cedula
            
            Validador.ValidarCedula(txtCedula.getText());
            
            //Si es correcto
            lblValidacionCedula.setForeground(new java.awt.Color(0, 0, 0));
            lblValidacionCedula.setText("Número Correcto");
            CedulaCorrecta = true;
            
            //Metodo para el autollenado de los campos de nombre, telefono, direccion, mediante el numero de cedula.
            Cliente cliente = new Cliente(txtCedula.getText());
            txtNombre.setText(cliente.getNombre());
            txtTelefono.setText(cliente.getTelefono());
            txtDireccion.setText(cliente.getDireccion());

        } catch(CedulaException e){
            
            CedulaCorrecta = false;
            lblValidacionCedula.setForeground(Color.red);
            lblValidacionCedula.setText(e.getMessage());
            txtCedula.requestFocus();
            
        } catch(ClienteException e){

            if(this.isShowing()){
                
                asignarVariablesEstaticas();
                new NuevoCliente(this, true, this.usuario).setVisible(true);
                //txtCedula.requestFocus();
                asignarDatos();
                
            }
        }

    }//GEN-LAST:event_txtCedulaFocusLost

    private void JCTipoEntradaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCTipoEntradaItemStateChanged
       
        actualizarTotal();
        
    }//GEN-LAST:event_JCTipoEntradaItemStateChanged

//Reinicia el campo de entradas.    
    private void txtEntradasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEntradasFocusLost
        
        if(txtEntradas.getText().equals("")){
            txtEntradas.setText("0");
        }
            //Cambiamos los totales
            actualizarTotal();
            
    }//GEN-LAST:event_txtEntradasFocusLost

    
    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        
        try{
            //Validamos la cedula
            Validador.ValidarCedula(txtCedula.getText());
            lblValidacionCedula.setForeground(new java.awt.Color(0, 0, 0));
            lblValidacionCedula.setText("Número Correcto");

            //Validamos la cantidad de entradas
            Validador.ValidarEntradas(txtEntradas.getText());
            lblValidacionEntradas.setForeground(new java.awt.Color(0, 0, 0));
            lblValidacionEntradas.setText("Correcto");

            //Actualizamos el valor del total.            
            actualizarTotal();

            //Ingreso a la ventana CompraButacas.
            CompraButacas ac = new CompraButacas(this, true);
            ac.setVisible(true);
            
            //Captura los datos para grabarlos.
            this.usuario.nuevaVenta(
                    
                txtCedula.getText(),
                txtButacas.getText(),
                fechaTexto,
                this.usuario.getCedula(),
                TipoEntrada.valueOf(JCTipoEntrada.getSelectedItem().toString()),
                Double.parseDouble(txtEntradas.getText()),
                TipoEntrada.valueOf(JCTipoEntrada.getSelectedItem().toString()).getPrecio());
            
                JOptionPane.showMessageDialog(this, "Haga clic en Finalizar e Imprima su Ticket y Factura!");
            
            //Ocultar boton continuar.
            JBGuardar.hide();
            
            //Ventana factura.
            Factura fac = new Factura();
            fac.setVisible(true);
        
            //Ventana Ticket.
            Ticket tic = new Ticket();
            tic.setVisible(true);
            
            //Graba los datos y reinicia los campos.
            Cliente cli = new Cliente(txtCedula.getText());
            cli.grabarDatos(txtNombre.getText(), txtTelefono.getText(), txtDireccion.getText());
            cedula = "";
            nombre = "";
            telefono = "";
            direccion = "";            

        } catch(CedulaException e){
            
            lblValidacionCedula.setForeground(Color.red);
            lblValidacionCedula.setText(e.getMessage());
            txtCedula.requestFocus();
            
        } catch(EntradasException e){
            
            lblValidacionEntradas.setForeground(Color.red);
            lblValidacionEntradas.setText(e.getMessage());
            txtEntradas.requestFocus();
            
        } catch(VentaException e){
            
        } catch(ClienteException e){
            
        }
       
    }//GEN-LAST:event_JBGuardarActionPerformed

//Boton cancelar reinicia los campos.    
    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
       
        cedula = "";
        nombre = "";
        telefono = "";
        direccion = "";
        this.setVisible(false);
        
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
        asignarDatos();
        
    }//GEN-LAST:event_formFocusGained

//Reinicia los campos.    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      
        cedula = "";
        nombre = "";
        telefono = "";
        direccion = "";
        
    }//GEN-LAST:event_formWindowClosing

//Accion al abrir la ventana.    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        for(TipoEntrada c : TipoEntrada.values()){
            
            modelo.addElement(c);
            
        }
       
        //Si el usuario es cliente entonces se autollena el campo de la cedula.
        if(usuario.getPerfil().equals("cliente")){
            
            txtCedula.setText(AccesoCliente.txtCedula.getText());
            
        }
        
        //Reinicio de campos.
        JCTipoEntrada.setModel(modelo);
        cedula = "";
        nombre = "";
        telefono = "";
        direccion = "";
        
        //Saludo de bienvenida.
        JLFechaActual.setText(fechaActual);
        JLSaludoVentana.setText("Vendedor: "+usuario.getNombre());
        
        //Reinicio del contador entradas.
        NuevaVenta.numeroentradas = 1;   
        
    }//GEN-LAST:event_formWindowOpened

//Valor total de las entradas.    
    private void txtTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalFocusLost
       
        if(txtTotal.getText(). replace(" ", "").equals("")){
            
            txtTotal.setText("0.0");
            
        }
        
        actualizarEntradas();
        
    }//GEN-LAST:event_txtTotalFocusLost

    private void JCTipoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCTipoEntradaActionPerformed

    }//GEN-LAST:event_JCTipoEntradaActionPerformed

    private void txtEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradasActionPerformed
        
    }//GEN-LAST:event_txtEntradasActionPerformed

//Boton "menos" que resta el numero de entradas.    
    private void JBBotonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBotonMenosActionPerformed
    
    if(txtEntradas.getText().equals("1")){
        
        JBBotonMenos.setEnabled(true);
        numeroentradas++;
        
    }else{
        
    txtEntradas.setText(numeroentradas--+"");
        
    }   
    
    actualizarTotal();
    
    }//GEN-LAST:event_JBBotonMenosActionPerformed

//Boton "mas" para aumentar el numero de entradas hasta el tope maximo de 5 entradas por compra.   
    private void JBBotonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBotonMasActionPerformed
    
    if(txtEntradas.getText().equals("5")){
        
        JBBotonMas.setEnabled(true);
        JOptionPane.showMessageDialog(this, "Solo se permite hasta 5 entradas");
        numeroentradas--;
            
    }else{
        
        txtEntradas.setText(numeroentradas+++"");
        
    }

    actualizarTotal();
    
    }//GEN-LAST:event_JBBotonMasActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed

    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtButacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtButacasActionPerformed

    }//GEN-LAST:event_txtButacasActionPerformed

    private void JBGuardarComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_JBGuardarComponentHidden

    }//GEN-LAST:event_JBGuardarComponentHidden

    private void JBGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBGuardarMouseClicked

    }//GEN-LAST:event_JBGuardarMouseClicked

//Al cerrar la ventana se reinicia el contador de las entradas.    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
        NuevaVenta.numeroentradas = 1;        
        
    }//GEN-LAST:event_formWindowClosed

//Metodo main.    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NuevaVenta dialog = new NuevaVenta(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBotonMas;
    private javax.swing.JButton JBBotonMenos;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBGuardar;
    public static javax.swing.JComboBox JCTipoEntrada;
    private javax.swing.JLabel JLBanner;
    private javax.swing.JLabel JLFechaActual;
    private javax.swing.JLabel JLFondoVentana;
    private javax.swing.JLabel JLSaludoVentana;
    private javax.swing.JLabel JLTextoBolteria;
    private javax.swing.JPanel JPDatosCliente;
    private javax.swing.JPanel JPDatosConsumo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblValidacionCedula;
    private javax.swing.JLabel lblValidacionEntradas;
    public static javax.swing.JTextField txtButacas;
    public static javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtEntradas;
    public static javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}