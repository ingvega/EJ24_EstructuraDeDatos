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
    
    /**
     * Añade un valor a la lista
     * @param valor Elemento a añadir
     * @return <b>true</b> en caso de que la capacidad de la 
     * colección haya permitido añadir la colección, <b>false</b> 
     * en caso que la colección haya llegado a su capacidad
     */
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
        String cadena="Lista[\n";
        for (int i = 0; i < posicion; i++) {
            cadena+=valores[i] + "\n";
        }
        return cadena+"]";
    }

    @Override
    public Object obtener(int posicion) {
        if(posicion<this.posicion ){
            return valores[posicion];
        }else{
            throw new IndexOutOfBoundsException(posicion);
        }
    }
    
    

}
