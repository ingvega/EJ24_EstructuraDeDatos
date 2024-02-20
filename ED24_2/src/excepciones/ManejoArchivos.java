/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class ManejoArchivos {

    static File archivo = new File("Ejemplo2.txt");

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
}
