/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paveg
 */
public class ManejoArchivos {

    //static File archivo = new File("ED.txt");
    static File archivo = new File("c://Ejemplo.tzt");

    static String leerLinea() throws FileNotFoundException {
        Scanner lector = new Scanner(archivo);
        String linea = lector.nextLine();
        lector.close();
//        try{ 
        //return lector.nextLine();
        return linea;
//        }catch(){
//        }finally{
//        }
    }

    static String leerLinea2() throws FileNotFoundException {
        Scanner lector = null;
        try {
            lector = new Scanner(archivo);

            return lector.nextLine();
        } finally {
            if(lector!=null)
                lector.close();
//En caso de existir excepción la atrapa y no hace nada con ella
//            try{
//                lector.close();
//            }catch(NullPointerException e){
//            }
        }
    }
    
    static boolean agregarLinea(String texto){
        try {
            BufferedWriter  escritor = new BufferedWriter(new FileWriter(archivo,true));
            escritor.append(texto);
            escritor.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}
