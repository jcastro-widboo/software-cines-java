/*
 * Autor: Jorge Castro ; Fausto Males
 * Software: SUPERCINES
 * Fecha: 
 * Hora: 
 * Version: 1.0.0
 */

package Principales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Cliente {
    
//Variables atributos correspondiente a datos del cliente.    
    private String cedula;
    private String nombre;
    private String telefono;
    private String direccion;
    
//Constructor de la clase Cliente con un parametro y que captura una excepcion especifica cliente.    
    public Cliente(String cedula) throws ClienteException{

        File archivoClientes = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            
            archivoClientes = new File(Main.direccionArchivoClientes);
            fr = new FileReader(archivoClientes);
            br = new BufferedReader(fr);
            String clientes = "";
            String linea;
            
            while((linea = br.readLine())!=null){
                
                clientes += linea+"\n";
                
            }
            
            //Se realiza una busqueda del usuario apartir de la ceudla registrada, si no hay coincidencias hay una excepcion.
            String [] cliente = clientes.split("\n");
            boolean clienteExiste = false;
            int indice = 0;
            
            for(int i = 0; i < cliente.length; i++){
                
                if(cliente[i].split("_")[0].equals(cedula)){
                    
                    clienteExiste = true;
                    indice = i;
                    break;
                    
                }
            }
            
            if(clienteExiste){
                
                this.cedula = cedula;
                this.nombre = cliente[indice].split("_")[1];
                this.telefono = cliente[indice].split("_")[2];
                this.direccion = cliente[indice].split("_")[3];
                
            }else{
                
                throw new ClienteException("No existe el cliente!");
                
            }
        }
        
        catch(Exception e){
            
            throw new ClienteException(e.getMessage());
            
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
    
//Metodo que devuelve void y tiene tres parametros. Guarda en el archivo txt(BASE_DE_DATOS_CLIENTES).    
    public void grabarDatos(String nombre, String telefono, String direccion){
        
        if(nombre.equals("")){
            
            nombre = this.nombre;
            
        }
        
        File archivoClientes = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            
            archivoClientes = new File(Main.direccionArchivoClientes);
            fr = new FileReader(archivoClientes);
            br = new BufferedReader(fr);
            String clientes = "";
            String linea;
            
            while((linea = br.readLine())!=null){
                clientes += linea+"\n";
            }
            
            String [] cliente = clientes.split("\n");
            String antes = "";
            String despues = "";
            int indice = 0;
            
            for(int i = 0; i < cliente.length; i++){
                
                if(cliente[i].split("_")[0].equals(cedula)){
                    
                    indice = i;
                    break;
                    
                }else{
                    
                    antes += cliente[i]+"\n";
                    
                }
            }
            
            for(int i = indice+1; i < cliente.length; i++){
                
                despues += cliente[i]+"\n";
                
            }
            
            //Se guarda en el archivo txt(BASE_DE_DATOS _CLIENTES) los datos cedula, nombre, telefono y direccion.
            String actual = this.cedula+"_"+nombre+"_" + telefono + "_" + direccion + "\n";
            FileWriter fw = new FileWriter(archivoClientes, false);
            fw.write(antes + actual + despues);
            fw.close();
            
            this.nombre = nombre;
            this.telefono = telefono;
            this.direccion = direccion;
            
        }
        
        catch(Exception e){
            
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
      
//Metodo para recupera la cedula.    
    public String getCedula() {
        
        return cedula;
        
    }

//Metodo que recupera el nombre.    
    public String getNombre() {
        
        return nombre;
        
    }
    
//Metodo que registra el nombre.
    public void setNombre(String nombre) {
        
        grabarDatos(nombre, this.telefono, this.direccion);
        this.nombre = nombre;
        
    }

//Metodo que recupera el telefono.
    public String getTelefono() {
        
        return telefono;
        
    }

//Metodo que registra el telefono.
    public void setTelefono(String telefono) {
        
        grabarDatos(this.nombre, telefono, this.direccion);
        this.telefono = telefono;
        
    }

//Metodo que recupera la direccion.
    public String getDireccion() {
        return direccion;
    }

//Metodo que registra la direccion.
    public void setDireccion(String direccion) {
        
        grabarDatos(this.nombre, this.telefono, direccion);
        this.direccion = direccion;
        
    }
    
}    

//Excepcion especifica de Cliente
class ClienteException extends Exception{
    
    public ClienteException(){
        
        super();
        
    }
    
    public ClienteException(String s){
        
        super(s);
        
    }
}