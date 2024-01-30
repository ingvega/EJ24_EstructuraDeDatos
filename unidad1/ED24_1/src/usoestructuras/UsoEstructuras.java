/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usoestructuras;

import java.util.ArrayList;
import lista.Lista;

/**
 *
 * @author paveg
 */
public class UsoEstructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> al=new ArrayList<>();
        Persona persona1=new Persona("Juan Perez",19);
        al.add(persona1);
        al.add(new Persona("Alberto Juarez",18));
        al.add(new Persona("Alberto Juarez",25));
        al.add(new Persona("Alberto Juarez",22));
        //al.add("Hola");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).getNombre());
        }
        //Persona almacenada como Object
        Object o=new Persona("Luis",18);
        //o.getNombre();
        Persona p=new Persona("Luis",18);
        //Obtener la persona guardada como object y guardarla como persona
        Persona po=(Persona)o;
        Lista lista=new Lista();
       
        lista.agregar(new Persona("Juan Perez",19));
        lista.agregar(new Persona("Alberto Juarez",18));
        System.out.println("-------------------------");
        for (int i = 0; i < lista.tamanio(); i++) {
            //No se puede obtener directamente el nombre del tipo Object
            //System.out.println(lista.obtener(i).getNombre());
        }
        
    }
    
}
