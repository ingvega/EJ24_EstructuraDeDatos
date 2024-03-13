/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class CicloForMejorado {
    public static void main(String[] args) {
        int arreglo[]=new int[20];
        for (int i = 1; i <= 20; i++) {
            arreglo[i-1]=i;
        }
        
//        for (int i = 0; i <arreglo.length; i++) {
//        }
        for(int numero:arreglo){
            System.out.println(numero);
        }
    }
}
