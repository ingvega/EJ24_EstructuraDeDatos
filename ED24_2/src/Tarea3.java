/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Tarea3 {
    public static void main(String[] args) {
        String cadena="aloha";
        System.out.println(reemplazar(cadena,'a','A'));
    }
    
    public static String reemplazar(String cadenaOriginal, 
            char anterior, char nuevo){
        return reemplazar(cadenaOriginal,"",anterior,nuevo,0);
    }
    
    private static String reemplazar(String cadenaOriginal, 
            String cadenaResultante, char anterior, 
            char nuevo,int indice){
        //Cuando terminé?
        if(indice==cadenaOriginal.length())
            return cadenaResultante;
        else
            if(cadenaOriginal.charAt(indice)==anterior)
                cadenaResultante+=nuevo;
            else    
                cadenaResultante+=
                        cadenaOriginal.charAt(indice);
            return reemplazar(cadenaOriginal,cadenaResultante,anterior,nuevo,indice+1);
    }
    
}
