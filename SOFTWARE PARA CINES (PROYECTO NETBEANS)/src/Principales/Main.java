/*
 * Autor: Jorge Castro ; Fausto Males
 * Software: SUPERCINES
 * Fecha: 
 * Hora: 
 * Version: 1.0.0
 */

package Principales;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    
    //Formato de fechas
    public static final DecimalFormat formatoDecimal = new DecimalFormat("0.00");
    public static final SimpleDateFormat formatoFechaUsuario = new SimpleDateFormat("EEEEE, dd 'de' MMMMM 'de' yyyy");
    public static final SimpleDateFormat formatoFechaArchivo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    //Fechas
    public static final Calendar today = Calendar.getInstance();
    public static final String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static final String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    
    //Archivos de texto plano
    public static String direccionArchivoClientes = "\\Base_de_datos_clientes.txt";
    public static String direccionArchivoVentas = "\\Base_de_datos_ventas.txt";
    public static String direccionArchivoUsuarios = "\\Base_de_datos_usuarios.txt";
    
    //Datos generales del cine
    public static final int startYear = 2016;
    public static final String moneda = "Dólares";
    
    //Precio de las entradas.
    public enum TipoEntrada {
        
        Normal(5.50), Vip(12.50);
        private double precio;
        
        TipoEntrada(double precio){
            this.precio = precio;
        }
        public double getPrecio(){
            return this.precio;
        }
        
    };
    
//Bloque principal de ejecucion del programa.
    public static void main(String[] args) {
        
        //Devuelve la cadena de ruta canónica de esta ruta abstracta. Elimina nombres redundantes como "." y ".." de la ruta.
        File miDir = new File (".");
        try{
            
            direccionArchivoUsuarios = miDir.getCanonicalPath()+"\\Base_de_datos_usuarios.txt";
            direccionArchivoClientes = miDir.getCanonicalPath()+"\\Base_de_datos_clientes.txt";
            direccionArchivoVentas = miDir.getCanonicalPath()+"\\Base_de_datos_ventas.txt";
            
        }catch(Exception e){
            
        }
        
        try { 
            
            UIManager.setLookAndFeel( 
            UIManager.getSystemLookAndFeelClassName()); 
            
        }catch (UnsupportedLookAndFeelException e) { 
        
        }catch (ClassNotFoundException e) { 
        
        }catch (InstantiationException e) { 
        
        }catch (IllegalAccessException e) { 
        
        } 
               
        //Se hace visible la ventana Portada
        Portada p = new Portada();
        p.setVisible(true);

    }
}