
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Invertir {
    public static void main(String[] args) {
        Queue<Integer> colaSimple=new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            colaSimple.add(i);
        }
        
        Queue<Integer> colaAuxiliar=new ArrayDeque<>();
        Stack<Integer> pila=new Stack<>();
        while(!colaSimple.isEmpty()){
            //NO FUNCIONA
            /*colaAuxiliar.add(colaSimple.poll());
            pila.push(colaAuxiliar.peek());*/
            
            pila.push(colaSimple.peek());
            colaAuxiliar.add(colaSimple.poll());
        }
//        for (Integer integer : colaAuxiliar) {
//            System.out.println(integer);
//        }
        colaSimple=colaAuxiliar;
//        while(!pila.isEmpty()){
//            System.out.println(pila.pop());
//        }
//          El foreach para una pila no funciona respetando el orden LIFO
//          funciona con FIFO aunque sea una Pila
//        for (Integer integer : pila) {
//            System.out.println(integer);
//        }

          Iterator iterador=colaSimple.iterator();
          while(iterador.hasNext()){
              System.out.println(iterador.next());
          }
          
    }
}
