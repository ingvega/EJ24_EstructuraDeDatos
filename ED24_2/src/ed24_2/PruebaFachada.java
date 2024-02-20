/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed24_2;

/**
 *
 * @author paveg
 */
public class PruebaFachada {

    public static void main(String[] args) {
        InvertirNumero obj = new InvertirNumero();
        System.out.println(obj.invertir(2350));

        System.out.println(InvertirNumero.invertir(2350));
        //INACCESIBLE 
        //System.out.println(InvertirNumero.invertir("2350",3));
    }
}
