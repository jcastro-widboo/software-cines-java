/*
 * Autor: Jorge Castro ; Fausto Males
 * Software: SUPERCINES
 * Fecha: 
 * Hora: 
 * Version: 1.0.0
 */

package Principales;

import java.io.*;
import static Principales.Main.*;

public class Venta {
    
    //Variables atributo para administrar la Venta.
    private String cedulaCliente;
    private String butacas;
    private String fecha;
    private TipoEntrada entrada;
    private double entradas, ganancia, precio;
    private String cedulaVendedor;
    
    public Venta(int id) throws VentaException{
        
        this(String.valueOf(id));
        
    }
    
    //Crea un objeto venta a partir de su cedula.
    public Venta(String id) throws VentaException{
        
        File archivoVentas = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            
            archivoVentas = new File(Main.direccionArchivoVentas);
            fr = new FileReader(archivoVentas);
            br = new BufferedReader(fr);
            String ventas = "";
            String linea;
            
            while((linea = br.readLine())!=null){
                
                ventas += linea+"\n";
                
            }
            
            String [] venta = ventas.split("\n");
            boolean ventaExiste = false;
            int indice = 0;
            
            for(int i = 0; i < venta.length; i++){
                
                if(venta[i].split("_")[0].equals(id)){
                    
                    ventaExiste = true;
                    indice = i;
                    break;
                    
                }
            }
            
            //Condicion para ver si la venta existe.
            if(ventaExiste){
                
                this.cedulaCliente = venta[indice].split("_")[1];
                this.butacas = venta[indice].split("_")[2];
                this.fecha = venta[indice].split("_")[3];
                this.cedulaVendedor = venta[indice].split("_")[4];
                this.entrada = TipoEntrada.valueOf(venta[indice].split("_")[5]);
                this.entradas = Double.parseDouble(venta[indice].split("_")[6]);
                this.precio = Double.parseDouble(venta[indice].split("_")[7]);
                this.ganancia = this.precio * this.entradas;
                
            }else{
                
                throw new VentaException("No existe el cliente!");
                
            }
        }
        
        catch(Exception e){
            
            throw new VentaException(e.getMessage());
            
        }
        
        finally{
            
            try{              
                
                if( null != fr ){   
                    
                    fr.close();     
                    
                }             
                
            }catch (Exception e2){ 
                
                e2.printStackTrace();
                
            }
        }
    }
    
    //Devuelve un objeto cliente que realizó la compra.
    public Cliente getCliente(){
        
        Cliente cliente = null;
        
        try{
            
            cliente = new Cliente(this.getCedulaCliente());
            
        }catch(ClienteException e){
            
            cliente = null;
            
        }
        
        return cliente;
        
    }
    
    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public TipoEntrada getEntrada() {
        return entrada;
    }

    public double getEntradas() {
        return entradas;
    }

    public double getGanancia() {
        return ganancia;
    }

    public String getButacas() {
        return butacas;
    }

    public String getCedulaVendedor() {
        return cedulaVendedor;
    }
}

class VentaException extends Exception{
    
    public VentaException(String s){
        
        super(s);
        
    }
}