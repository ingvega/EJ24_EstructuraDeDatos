/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usoestructuras;

/**
 *
 * @author paveg
 */
public class PruebaArreglo {
    public static void main(String[] args) {
        //ArrayList<Persona> al=new ArrayList<>();
        Persona[] al=new Persona[5];
        Persona persona1=new Persona("Juan Perez",19);
        //al.add(persona1);
        al[0]=persona1;
        //al.add(new Persona("Alberto Juarez",18));
        al[1]=new Persona("Alberto Juarez",18);
        
        //for (int i = 0; i < al.size(); i++) {
        for (int i = 0; i < al.length; i++) {
            //System.out.println(al.get(i));
            System.out.println(al[i]);
        }
    }
}
