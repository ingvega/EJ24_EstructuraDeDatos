
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class RecorrerPila {

    public static void main(String[] args) {
        ArrayList<Character> abecedario = new ArrayList<>();
        for (int i = 65; i <= 90; i++) {
            abecedario.add((char) i);
        }
        for (int i = 0; i < abecedario.size(); i++) {
            //System.out.println(arreglo[i]);
            System.out.println(abecedario.get(i));
        }
        for (int i = abecedario.size()-1;i>=0; i--) {
            //System.out.println(arreglo[i]);
            System.out.println(abecedario.get(i));
        }
        for(Character letra:abecedario){
            System.out.println(letra);
        }
        
        
        
        
//        while(abecedario.estaVacia()==false){
//            System.out.println(abecedario.desapilar());
//        }
    }
//    public static void main(String[] args) {
//        Pila<Character> abecedario = new Pila<>();
//        for (int i = 65; i <= 90; i++) {
//            abecedario.apilar((char) i);
//        }
//        //while(!abecedario.estaVacia()){
//        for (; !abecedario.estaVacia();) {
//            System.out.println(abecedario.desapilar());
//        }
//        for (;;) {
//            if (!abecedario.estaVacia()) {
//                System.out.println(abecedario.desapilar());
//            } else {
//                break;
//            }
//        }
////        while(abecedario.estaVacia()==false){
////            System.out.println(abecedario.desapilar());
////        }
//    }
}
