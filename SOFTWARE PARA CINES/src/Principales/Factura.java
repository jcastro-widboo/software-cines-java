/*
 * Autor: Jorge Castro ; Fausto Males
 * Software: SUPERCINES
 * Fecha: 
 * Hora: 
 * Version: 1.0.0
 */

package Principales;

import static Principales.Main.*;
import java.awt.*;
import java.awt.print.*;
import javax.swing.*;

public class Factura extends javax.swing.JFrame implements Printable {

//Variable atributo del metodo hora().    
    public javax.swing.Timer tiempo;

//Componentes caracteristicos de la venta.    
    public Factura() {
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(0);
        this.setTitle("SUPERCINES - Factura");
        setIconImage(new ImageIcon(getClass().getResource("/img/favicon.png")).getImage());

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTNombre = new javax.swing.JTextField();
        JTCedula = new javax.swing.JTextField();
        JBImprimir = new javax.swing.JButton();
        JLFecha = new javax.swing.JLabel();
        JTValorTotal = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JTPrecioUnitario = new javax.swing.JTextField();
        JTCantidad = new javax.swing.JTextField();
        JTProducto = new javax.swing.JTextField();
        JTNumeroComprobante = new javax.swing.JTextField();
        JTPrecioTotal = new javax.swing.JTextField();
        JLFondoFactura = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTNombre.setEditable(false);
        JTNombre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        JTNombre.setBorder(null);
        JTNombre.setOpaque(false);
        JTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNombreActionPerformed(evt);
            }
        });
        getContentPane().add(JTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 140, -1));

        JTCedula.setEditable(false);
        JTCedula.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        JTCedula.setBorder(null);
        JTCedula.setOpaque(false);
        getContentPane().add(JTCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 140, -1));

        JBImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supercines/icons/printer.png"))); // NOI18N
        JBImprimir.setText("Imprimir");
        JBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(JBImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        JLFecha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(JLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 160, 20));

        JTValorTotal.setEditable(false);
        JTValorTotal.setBorder(null);
        JTValorTotal.setOpaque(false);
        JTValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTValorTotalActionPerformed(evt);
            }
        });
        getContentPane().add(JTValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 170, 20));

        JBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supercines/icons/cancel.png"))); // NOI18N
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, -1, -1));

        JTPrecioUnitario.setEditable(false);
        JTPrecioUnitario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        JTPrecioUnitario.setBorder(null);
        JTPrecioUnitario.setOpaque(false);
        getContentPane().add(JTPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 50, 20));

        JTCantidad.setEditable(false);
        JTCantidad.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        JTCantidad.setBorder(null);
        JTCantidad.setOpaque(false);
        getContentPane().add(JTCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 30, 20));

        JTProducto.setEditable(false);
        JTProducto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        JTProducto.setBorder(null);
        JTProducto.setOpaque(false);
        getContentPane().add(JTProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 20));

        JTNumeroComprobante.setEditable(false);
        JTNumeroComprobante.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        JTNumeroComprobante.setBorder(null);
        JTNumeroComprobante.setOpaque(false);
        JTNumeroComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNumeroComprobanteActionPerformed(evt);
            }
        });
        getContentPane().add(JTNumeroComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 160, -1));

        JTPrecioTotal.setEditable(false);
        JTPrecioTotal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        JTPrecioTotal.setBorder(null);
        JTPrecioTotal.setOpaque(false);
        getContentPane().add(JTPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 50, 20));

        JLFondoFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturasupercines.png"))); // NOI18N
        JLFondoFactura.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(JLFondoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Metodo de impresion.
    private void JBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImprimirActionPerformed
        
//Crea y devuelve un printerjob que se asocia con la impresora predeterminada del sistema, si no hay, retorna NULL.
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        //Se pasa la instancia del JFrame al PrinterJob.
        printerJob.setPrintable(this);
        //Muestra ventana de dialogo para imprimir.
        if (printerJob.printDialog()) {
            try {
                printerJob.print();
            } catch (PrinterException ex) {
                System.out.println("Error:" + ex);
            }
        }
        this.dispose();
        
    }//GEN-LAST:event_JBImprimirActionPerformed

//Metodo propio de Printable
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex == 0) {
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            this.printAll(graphics);
            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }

    private void JTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNombreActionPerformed

    }//GEN-LAST:event_JTNombreActionPerformed

//Boton cancelar que cierra la ventana.    
    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
       
        this.dispose();
        
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JTValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTValorTotalActionPerformed

    }//GEN-LAST:event_JTValorTotalActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        JTProducto.setText(PrincipalCliente.nombrePelicula);
        JTCantidad.setText(NuevaVenta.txtEntradas.getText());
        
        String s = NuevaVenta.JCTipoEntrada.getSelectedItem().toString();
        JTPrecioUnitario.setText(String.valueOf(Main.TipoEntrada.valueOf(s).getPrecio()));
        
        JTPrecioTotal.setText(NuevaVenta.txtTotal.getText());
        
        JTValorTotal.setText("$ "+NuevaVenta.txtTotal.getText());
        
        JLFecha.setText(formatoFechaUsuario.format(today.getTime()));
        int numeroC = (int)(Math.random()*90000); 
        JTNumeroComprobante.setText(numeroC+" ");
        
        JTNombre.setText(NuevaVenta.txtNombre.getText());
        JTCedula.setText(NuevaVenta.txtCedula.getText());
        
    }//GEN-LAST:event_formWindowOpened

    private void JTNumeroComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNumeroComprobanteActionPerformed

    }//GEN-LAST:event_JTNumeroComprobanteActionPerformed

//Metodo main.    
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBImprimir;
    private javax.swing.JLabel JLFecha;
    private javax.swing.JLabel JLFondoFactura;
    private javax.swing.JTextField JTCantidad;
    public static javax.swing.JTextField JTCedula;
    public static javax.swing.JTextField JTNombre;
    public static javax.swing.JTextField JTNumeroComprobante;
    private javax.swing.JTextField JTPrecioTotal;
    private javax.swing.JTextField JTPrecioUnitario;
    private javax.swing.JTextField JTProducto;
    public static javax.swing.JTextField JTValorTotal;
    // End of variables declaration//GEN-END:variables

}