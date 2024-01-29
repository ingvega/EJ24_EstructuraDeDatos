/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author paveg
 */
public class Lista extends TDALista {

    public Lista() {
        valores=new Object[capacidad];
    }
    
    @Override
    public boolean agregar(Object valor) {
        if(posicion<capacidad){
            valores[posicion]=valor;
            posicion++;
            return true;
        }
        return false;
    }

    @Override
    public int tamanio() {
        return posicion;
    }

    @Override
    public String toString() {
        String cadena="Lista[";
        for (int i = 0; i < posicion; i++) {
            cadena+=valores[i] + "\n";
        }
        return cadena+"]";
    }
    
    

}
