
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
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
public class ColaSimple {
    public static void main(String[] args) {
        Queue<Integer> colaSimple= new LinkedList<>();
        Deque<Integer> colaDoble= new ArrayDeque<>();
        //ArrayDeque<String> cola=new ArrayDeque<>();
        
        for (int i = 0; i < 10; i++) {
            int n=(int)(Math.random()*100);
            colaSimple.offer(n);
            colaDoble.offer(n);
        }
        
        //Recorrer la colección sin eliminar elementos
        for (Integer numero : colaSimple) {
            System.out.println(numero);
        }
        System.out.println("--------------------------------");
        //Recorre la colección y tiene que ir quitando los elementos para
        //poder recorrerlos (en sentido contrario)
        while(colaDoble.isEmpty()==false){
            System.out.println(colaDoble.pollLast());
        }
        
        
        
        
        
        
        
    }
}
