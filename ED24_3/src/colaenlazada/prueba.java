/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaenlazada;

/**
 *
 * @author paveg
 */
public class prueba {
    public static void main(String[] args) {
        Cola<String> fila=new Cola<>();
        fila.agregar("Aguilera Guzman Aaron"); 
        fila.agregar("Baeza Aguilera Leonardo");
        fila.agregar("Cabrera Dominguez Ximena Nicole");
        fila.agregar("Cano Zavala Manuel");
        
        while(!fila.estaVacia()){
            System.out.println(fila.quitar());
        }
    }
}
