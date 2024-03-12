/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaEnlaces;

/**
 *
 * @author paveg
 */
public class main {
    public static void main(String[] args) {
        Pila<String> pila=new Pila<>();
        pila.apilar("(");
        pila.apilar("(");
        pila.apilar("[");
        while(!pila.estaVacia()){
            System.out.println(pila.desapilar());
        }
    }
}
