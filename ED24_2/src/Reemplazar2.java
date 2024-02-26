/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Reemplazar2 {
    
    public static String reemplazar(String cadena,char anterior,char nuevo){
        
        if(cadena.length()==0)
            return "";
        else{
            if(cadena.charAt(0)==anterior)
                return nuevo + reemplazar(cadena.substring(1),anterior,nuevo);
            else
                return cadena.charAt(0) + reemplazar(cadena.substring(1),anterior,nuevo);
        }
    }
}
