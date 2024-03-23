/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaporprioridad;

import java.util.PriorityQueue;

public class ProductosPorClave {
    public static void main(String[] args) {
        PriorityQueue<Producto> productos=new PriorityQueue<>();
        productos.offer(new Producto(20,"Agua 1L","Bebidas",12));
        productos.offer(new Producto(5,"Galletas de chocolate","BOTANAS",18));
        productos.offer(new Producto(7,"Refresco de Naranja 600ml","bebidas",15));
        productos.offer(new Producto(2,"Jamon 250grs","Carnes frias",40));
        productos.offer(new Producto(3,"Bosal de Papitas","Botanas",15));
        
//        for (Producto producto : productos) {
//            System.out.println(producto);
//        }
        while(!productos.isEmpty()){
            System.out.println(productos.poll());
        }
    }
}


