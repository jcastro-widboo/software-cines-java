/*
 * Autor: Jorge Castro ; Fausto Males
 * Software: SUPERCINES
 * Fecha: 
 * Hora: 
 * Version: 1.0.0
 */

package Principales;

import java.io.*;

public class Usuario {
    
    //Variables atributo para el manejo del cliente.
    private String cedula;
    private String nombre;
    private String perfil;
    private String contraseña;
    
    //Constructor sin parametros.
    public Usuario(){

    }    
    
    //Constructor con un parametro, tiene la funcion de comprobar si el usuario existe o no.
    public Usuario(String cedula) throws UsuarioException{
        
        File archivoClientes = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            
            archivoClientes = new File(Main.direccionArchivoUsuarios);
            fr = new FileReader(archivoClientes);
            br = new BufferedReader(fr);
            String clientes = "";
            String linea;
            
            while((linea = br.readLine())!=null){
                
                clientes += linea+"\n";
                
            }
            
            String [] cliente = clientes.split("\n");
            boolean usuarioExiste = false;
            int indice = 0;
            
            for(int i = 0; i < cliente.length; i++){
                
                if(cliente[i].split("_")[0].equals(cedula)){
                    
                    usuarioExiste = true;
                    indice = i;
                    break;
                    
                }
            }
            
            if(usuarioExiste){
                
                this.cedula = cedula;
                this.contraseña = cliente[indice].split("_")[1];
                this.nombre = cliente[indice].split("_")[2];
                this.perfil = cliente[indice].split("_")[3];
                
            }else{
                
                throw new UsuarioException("El usuario no existe!");
                
            }
        }
        catch(Exception e){
            
            throw new UsuarioException(e.getMessage());
            
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
    
    //Constructor con dos parametros, su funcion es comprobar si la cedula o contraseña estan correctos o incorrectos.
    public static Usuario UsuarioInicioSesion(String cedula, String password) throws UsuarioException{
        
        Usuario usuario = null;
        File archivoClientes = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            
            archivoClientes = new File(Main.direccionArchivoUsuarios);
            fr = new FileReader(archivoClientes);
            br = new BufferedReader(fr);
            String clientes = "";
            String linea;
            
            while((linea = br.readLine())!=null){
                
                clientes += linea+"\n";
                
            }
            
            String [] cliente = clientes.split("\n");
            boolean usuarioExiste = false;
            int indice = 0;
            
            for(int i = 0; i < cliente.length; i++){
                
                if(cliente[i].split("_")[0].equals(cedula) && cliente[i].split("_")[1].equals(Validador.md5Java(password))){
                    usuarioExiste = true;
                    indice = i;
                    break;
                    
                }
            }
            if(usuarioExiste){
                
                usuario = new Usuario(cedula);
                
            }else{
                
                throw new UsuarioException("Cédula o contraseña incorrecta!");
                
            }
        }
        catch(Exception e){
            
            throw new UsuarioException(e.getMessage());
            
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
        
        return usuario;
        
    }
    
    //Metodo que tiene como funcion el grabar los datos de registro de usuarios.   
    public void nuevoUsuario(String cedula, String password, String nombre, String perfil) throws UsuarioException{
        
        try{
            
            File archivoClientes = new File(Main.direccionArchivoUsuarios);
            FileWriter fr = new FileWriter(archivoClientes, true);
            fr.write(cedula+"_"+Validador.md5Java(password)+"_"+nombre+"_"+perfil+"\n");
            fr.close();
            
        }
        catch(Exception e){
            
            throw new UsuarioException("Error en el registro!");
            
        }
    }
    
    //Metodo cuya funcion es la de cambiar la contraseña.   
    public void registrarDatos(String password, String nombre, String perfil){
        
        if(password.equals("")){
            
            password = this.contraseña;
            
        }else{
            
            password = Validador.md5Java(password);
            
        }
        
        if(nombre.equals("")){
            
            nombre = this.nombre;
            
        }
        
        if(perfil.equals("")){
            
            perfil = this.perfil;
            
        }
        
        File archivoClientes = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            
            archivoClientes = new File(Main.direccionArchivoUsuarios);
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
            
            String actual = this.cedula+"_"+password+"_" + nombre + "_" + perfil + "\n";
            FileWriter fw = new FileWriter(archivoClientes, false);
            fw.write(antes + actual + despues);
            fw.close();
            
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
    
//Metodo que graba la Venta en el archivo txt.   
    public void nuevaVenta(String cedulaCliente, String butacas, String fecha, String cedulaVendedor, Main.TipoEntrada entrada, double entradas, double precio) throws VentaException{
        
        //Primero necesitamos el id de la venta
        File archivoVentas = null;
        FileReader fr = null;
        BufferedReader br = null;
        int id = 0;
        
        try{
            
            archivoVentas = new File(Main.direccionArchivoVentas);
            fr = new FileReader(archivoVentas);
            br = new BufferedReader(fr);
            String clientes = "";
            String linea;
            
            while((linea = br.readLine())!=null){
                
                if(!linea.equals("")){
                    clientes += linea+"\n";
                }
                
            }
            if(!clientes.equals("")){
                
                String [] cliente = clientes.split("\n");
                boolean clienteExiste = false;
                id = cliente.length;
                
            }else{
                
                id = 0;
                
            }
        }
        
        catch(Exception e){
            
            id = 0;
            
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
        
        //Registramos la venta.
        try{
            
            FileWriter fw = new FileWriter(archivoVentas, true);
            String texto = id + "_" + cedulaCliente + "_" + butacas + "_" + fecha + "_" + cedulaVendedor + "_" + entrada + "_" + entradas + "_" + precio + "\n";
            fw.write(texto);
            fw.close();
            
        }
        catch(Exception e){
            
            throw new VentaException("Error al guardar!");
            
        }
    }
    
    //Metodo que elimina las ventas.
    public void eliminarVentas(){
        
        File archivoVentas = null;
        FileReader fr = null;
        
        try{
            
            archivoVentas = new File(Main.direccionArchivoVentas);
            
            FileWriter fw = new FileWriter(archivoVentas, false);
            fw.write("");
            fw.close();
            
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

    //Metodo cuya funcion es la de grabar la informacion editada en la venta.
    public void nuevoCliente(String cedula, String nombre, String telefono, String direccion) throws ClienteException{
        
        if(telefono.equals("")){
            
            telefono = " ";
            
        }
        
        if(direccion.equals("")){
            
            direccion = " ";
            
        }
        
        try{
            
            File archivoClientes = new File(Main.direccionArchivoClientes);
            FileWriter fr = new FileWriter(archivoClientes, true);
            fr.write(cedula+"_"+nombre+"_"+telefono+"_"+direccion+"\n");
            fr.close();
            
        }
        catch(Exception e){
            
            throw new ClienteException("Error al guardar!");
            
        }
    }
    
    public String getPerfil() {
        return perfil;
    }
    
    public void setPerfil(String perfil) {
        this.perfil = perfil;
        registrarDatos("", "", perfil);
    }
    
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        registrarDatos("", nombre, "");
    }
    
    public void setPassword(String password){
        registrarDatos(password, "", "");
    }

}

class UsuarioException extends Exception{
    
    public UsuarioException(){
        
        super();
        
    }
    
    public UsuarioException(String s){
        
        super(s);
        
    }
}
