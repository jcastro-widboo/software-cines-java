/*
 * Autor: Jorge Castro ; Fausto Males
 * Software: SUPERCINES
 * Fecha: 
 * Hora: 
 * Version: 1.0.0
 */

package Principales;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.*;
import javax.swing.*;

public class Ticket extends javax.swing.JFrame implements Printable {

//Componentes caracteristicos de la ventana.
    public Ticket() {
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(0);
        this.setTitle("SUPERCINES - Ticket");
        setIconImage(new ImageIcon(getClass().getResource("/img/favicon.png")).getImage());

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTPelicula = new javax.swing.JTextField();
        JTSala = new javax.swing.JTextField();
        JBImprimir = new javax.swing.JButton();
        JLPelicula = new javax.swing.JLabel();
        JTHorarioPelicula = new javax.swing.JTextField();
        JLHorarioPelicula = new javax.swing.JLabel();
        JTNumeradoButacas = new javax.swing.JTextField();
        JLFechaPelicula = new javax.swing.JLabel();
        JLTipoEntrada = new javax.swing.JLabel();
        JTNumeroButacas = new javax.swing.JTextField();
        JLSala = new javax.swing.JLabel();
        JBCancelar = new javax.swing.JButton();
        JTFechaPelicula = new javax.swing.JTextField();
        JLNumeroButacas = new javax.swing.JLabel();
        JTTipoEntrada = new javax.swing.JTextField();
        cedulaTicket = new javax.swing.JTextField();
        nombreTicket = new javax.swing.JTextField();
        JLNumeradoButacas = new javax.swing.JLabel();
        JLFondoVentana = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTPelicula.setEditable(false);
        JTPelicula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTPelicula.setBorder(null);
        JTPelicula.setOpaque(false);
        JTPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTPeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(JTPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 390, 20));

        JTSala.setEditable(false);
        JTSala.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTSala.setBorder(null);
        JTSala.setOpaque(false);
        JTSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTSalaActionPerformed(evt);
            }
        });
        getContentPane().add(JTSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 410, 20));

        JBImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supercines/icons/printer.png"))); // NOI18N
        JBImprimir.setText("Imprimir");
        JBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(JBImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        JLPelicula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLPelicula.setText("Pelicula :");
        getContentPane().add(JLPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 60, 40));

        JTHorarioPelicula.setEditable(false);
        JTHorarioPelicula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTHorarioPelicula.setBorder(null);
        JTHorarioPelicula.setOpaque(false);
        getContentPane().add(JTHorarioPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 220, 20));

        JLHorarioPelicula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLHorarioPelicula.setText("Horario :");
        getContentPane().add(JLHorarioPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, 40));

        JTNumeradoButacas.setEditable(false);
        JTNumeradoButacas.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        JTNumeradoButacas.setBorder(null);
        JTNumeradoButacas.setOpaque(false);
        JTNumeradoButacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNumeradoButacasActionPerformed(evt);
            }
        });
        getContentPane().add(JTNumeradoButacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 640, 40));

        JLFechaPelicula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLFechaPelicula.setText("Fecha :");
        getContentPane().add(JLFechaPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, 20));

        JLTipoEntrada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLTipoEntrada.setText("Tipo entrada:");
        getContentPane().add(JLTipoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 90, 40));

        JTNumeroButacas.setEditable(false);
        JTNumeroButacas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTNumeroButacas.setBorder(null);
        JTNumeroButacas.setOpaque(false);
        JTNumeroButacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNumeroButacasActionPerformed(evt);
            }
        });
        getContentPane().add(JTNumeroButacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 210, 20));

        JLSala.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLSala.setText("Sala :");
        getContentPane().add(JLSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 40, 40));

        JBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supercines/icons/cancel.png"))); // NOI18N
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, -1, -1));

        JTFechaPelicula.setEditable(false);
        JTFechaPelicula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTFechaPelicula.setBorder(null);
        JTFechaPelicula.setOpaque(false);
        JTFechaPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFechaPeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(JTFechaPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 230, 20));

        JLNumeroButacas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLNumeroButacas.setText("N° Butacas :");
        getContentPane().add(JLNumeroButacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 80, 40));

        JTTipoEntrada.setEditable(false);
        JTTipoEntrada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTTipoEntrada.setBorder(null);
        JTTipoEntrada.setOpaque(false);
        JTTipoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTTipoEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(JTTipoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 360, 20));

        cedulaTicket.setEditable(false);
        cedulaTicket.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cedulaTicket.setForeground(new java.awt.Color(255, 255, 255));
        cedulaTicket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedulaTicket.setBorder(null);
        cedulaTicket.setOpaque(false);
        cedulaTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaTicketActionPerformed(evt);
            }
        });
        getContentPane().add(cedulaTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 130, 20));

        nombreTicket.setEditable(false);
        nombreTicket.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        nombreTicket.setForeground(new java.awt.Color(255, 255, 255));
        nombreTicket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreTicket.setBorder(null);
        nombreTicket.setOpaque(false);
        nombreTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTicketActionPerformed(evt);
            }
        });
        getContentPane().add(nombreTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 130, 20));

        JLNumeradoButacas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLNumeradoButacas.setText("Numerado Butacas :");
        getContentPane().add(JLNumeradoButacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 130, 40));

        JLFondoVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ticketsupercines.png"))); // NOI18N
        JLFondoVentana.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(JLFondoVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Bloque de impresion.
    private void JBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImprimirActionPerformed
        
        //Crea y devuelve un printerjob que se asocia con la impresora predeterminada del sistema, si no hay, retorna NULL
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        //Se pasa la instancia del JFrame al PrinterJob
        printerJob.setPrintable(this);
        //Muestra ventana de dialogo para imprimir
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

    private void JTPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTPeliculaActionPerformed

    }//GEN-LAST:event_JTPeliculaActionPerformed

//Accion boton Cancelar.    
    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JTNumeradoButacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNumeradoButacasActionPerformed

    }//GEN-LAST:event_JTNumeradoButacasActionPerformed

    private void JTNumeroButacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNumeroButacasActionPerformed

    }//GEN-LAST:event_JTNumeroButacasActionPerformed

    private void JTSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTSalaActionPerformed

    }//GEN-LAST:event_JTSalaActionPerformed

//Cuando la ventana se abre se asignan los valores de la Venta en el Ticket.    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        JTFechaPelicula.setText(" "+PrincipalCliente.dia+"/"+PrincipalCliente.mes+"/"+PrincipalCliente.año+" ");
        JTHorarioPelicula.setText(PrincipalCliente.horarioSalaCine);
        JTNumeroButacas.setText(NuevaVenta.txtEntradas.getText());
    
        JTPelicula.setText(PrincipalCliente.nombrePelicula);
        JTSala.setText(PrincipalCliente.salasCine);
        JTTipoEntrada.setText(NuevaVenta.JCTipoEntrada.getSelectedItem().toString());
        
        JTNumeradoButacas.setText(NuevaVenta.txtButacas.getText());
        
        cedulaTicket.setText(NuevaVenta.txtCedula.getText());
        nombreTicket.setText(NuevaVenta.txtNombre.getText());
        
    }//GEN-LAST:event_formWindowOpened

    private void JTTipoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTipoEntradaActionPerformed

    }//GEN-LAST:event_JTTipoEntradaActionPerformed

    private void JTFechaPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFechaPeliculaActionPerformed

    }//GEN-LAST:event_JTFechaPeliculaActionPerformed

    private void cedulaTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaTicketActionPerformed

    }//GEN-LAST:event_cedulaTicketActionPerformed

    private void nombreTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTicketActionPerformed

    }//GEN-LAST:event_nombreTicketActionPerformed

//Metodo main.    
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBImprimir;
    private javax.swing.JLabel JLFechaPelicula;
    private javax.swing.JLabel JLFondoVentana;
    private javax.swing.JLabel JLHorarioPelicula;
    private javax.swing.JLabel JLNumeradoButacas;
    private javax.swing.JLabel JLNumeroButacas;
    private javax.swing.JLabel JLPelicula;
    private javax.swing.JLabel JLSala;
    private javax.swing.JLabel JLTipoEntrada;
    public static javax.swing.JTextField JTFechaPelicula;
    public static javax.swing.JTextField JTHorarioPelicula;
    public static javax.swing.JTextField JTNumeradoButacas;
    public static javax.swing.JTextField JTNumeroButacas;
    public static javax.swing.JTextField JTPelicula;
    public static javax.swing.JTextField JTSala;
    public static javax.swing.JTextField JTTipoEntrada;
    public static javax.swing.JTextField cedulaTicket;
    public static javax.swing.JTextField nombreTicket;
    // End of variables declaration//GEN-END:variables

}