/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 * Excepciones (Checked, Unchecked) 
 * Lanzar excepciones (Checked, Unchecked) ->throw 
 * Manejo de excepciones 
 * ->Atrapar las excepciones try-catch-finally
 * ->Deshacerse de ellas throws en la firma del método
 *
 * @author paveg
 */
public class UsoExcepciones {

    public static void main(String[] args) throws FileNotFoundException /*throws NullPointerException*/ {
//        NullPointerException ex=new NullPointerException();
//        throw ex;
        System.out.println(
                ManejoArchivos.agregarLinea("Hola a todos"));

/*        try {
            System.out.println(ManejoArchivos.leerLinea2());
        } catch (FileNotFoundException e) {
            //JOptionPane.showMessageDialog(null, "Archivo no encontrado");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
*/
    }
}
