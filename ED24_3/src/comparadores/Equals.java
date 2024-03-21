package comparadores;

import equals.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Equals {
    public static void main(String[] args) {
        Producto pa=new Producto(1,"Galletas",15);
        Producto pb=new Producto(2,"Galletas X",20);
        Producto pc=new Producto(3,"Galletas X",20);
        Producto pd=new Producto(4,"Galletas X",20);
        Producto pe=new Producto(5,"Galletas X",20);
        ArrayList<Producto> lista=new ArrayList<>();
        
        System.out.println(pa.compareTo(pb));
        
        lista.add(pa);
        lista.add(pb);
        lista.add(pc);
        lista.add(pd);
        lista.add(pe);
        System.out.println(lista.contains(new Producto(5,"",0)));
        
        
        //pa=pb;
        System.out.println(pa.equals(pb));
        System.out.println(pa==pb);
    }
}
