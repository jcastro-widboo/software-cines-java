/*
 * Autor: Jorge Castro ; Fausto Males
 * Software: SUPERCINES
 * Fecha: 
 * Hora: 
 * Version: 1.0.0
 */

package Principales;

import java.io.UnsupportedEncodingException;
import java.security.*;

public class Validador {

    //Validar la cedula ecuatoriana.
    public static void ValidarCedula(String cedula) throws CedulaException{
        
        //Campo cedula obligatorio.
        if(cedula.equals("")){
            
            throw new CedulaException("* Campo Obligatorio");
            
        }
        
        //Solo números en la cedula.
        try{
            double num = Double.parseDouble(cedula);
           
        } catch(NumberFormatException e){
            
            throw new CedulaException("* Ingrese sólo números");
            
        }
        
        //Tamaño correcto de la cedula.(10)
        if(cedula.length() != 10){
            
            throw new CedulaException("* Debe contener 10 números");
            
        }
        
        //Número correcto.
        //Primer dígito corresponde a las provincias (1 - 24).
        int primerDigito = Integer.parseInt(cedula.substring(0, 2));
        if(primerDigito < 1 || primerDigito > 24){
            
            throw new CedulaException("* Cedula incorrecta");
            
        }
        
        //tercer digito de menor a 6
        int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
        if (tercerDigito < 6) {
            // Coeficientes de validación cédula.
            // El decimo digito se lo considera dígito verificador.
            int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
            int verificador = Integer.parseInt(cedula.substring(9,10));
            int suma = 0;
            int digito = 0;
            for (int i = 0; i < (cedula.length() - 1); i++) {
                
                digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
                suma += ((digito % 10) + (digito / 10));
                
            }
 
            if ((suma % 10 != 0) && (suma % 10 != verificador) && (10 - (suma % 10)) != verificador) {
                
                throw new CedulaException("* La cédula es incorrecta");
                
            } 
        } else {
            
            throw new CedulaException("* La cédula es incorrecta");
            
        }
    } 
    
//Validar que el campo nombre no este vacio.    
    public static void ValidarNombre(String nombre) throws NombreException{
        
        String nom = nombre.replace(" ", "");
        if(nom.equals("")){
            
            throw new NombreException("El campo no debe estar vacío");
            
        }
    }
    
//Validar que el campo entradas no este vacio.    
    public static void ValidarEntradas(String entradas) throws EntradasException{
        
        if(entradas.equals("")){
            
            throw new EntradasException("* Campo Obligatorio");
            
        }
        
        try{
            
            double ent = Double.parseDouble(entradas);
            if(ent <= 0){
                
                throw new EntradasException("* Error escoja al menos una entrada");
                
            }
        }catch(NumberFormatException e){
            
            throw new EntradasException("* Error en la cantidad de entradas");
            
        }
    }
    
//Validar que el campo contraseña no este vacio.    
    public static void ValidarContraseña(String contraseña) throws ContraseñaException{
        
        String pass = contraseña.replace(" ", "");
        if(pass.equals("")){
            
            throw new ContraseñaException("El campo no debe estar vacío!");
            
        }
    }
    
//Metodo para encriptar la contraseña a partir de MD5.    
    public static String md5Java(String message){ 
        
        String digest = null;
        try { 
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(message.getBytes("UTF-8")); 
            //converting byte array to Hexadecimal String 
            StringBuilder sb = new StringBuilder(2*hash.length); 
            for(byte b : hash){ 
                
                sb.append(String.format("%02x", b&0xff)); 
                
            } 
            digest = sb.toString(); 
        } catch (UnsupportedEncodingException ex) { 
            
        } catch (NoSuchAlgorithmException ex) { 
            
        } 
        return digest; 
    }

}

class CedulaException extends Exception{
    
    public CedulaException(String s){
        
        super(s);
        
    }
}

class NombreException extends Exception{
    
    public NombreException(String s){
        
        super(s);
        
    }
}

class ButacasException extends Exception{
    
    public ButacasException(String s){
        
        super(s);
        
    }
}

class EntradasException extends Exception{
    
    public EntradasException(String s){
        
        super(s);
        
    }
}

class ContraseñaException extends Exception{
    
    public ContraseñaException(String s){
        
        super(s);
        
    }
}