/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simbolos;

/**
 *
 * @author paveg
 */
public class Prueba {

    /*
    int-> Integer
    
    
    Almacenar un conjunto de chars
    Valores->Arreglo de char
                  capacidad (predeterminado 20)
                  posicionActual
    Operaciones
        void agregar(char valor) (cuando no haya espacio marca excepcion)
        void sobreponer(char valor, int pos) (excepción cuando no sea válida la posición)
        int encontrar(char valor) (-1 cuando no exista y valor de 0 en adelante cuando lo encuentre)
        int eliminar(char valor) asigna null en la posición que se encuentre el valor y devuelve la posición encontrada, de lo contrario devuelve -1
        int tamanio()
        String toString() Devolver la representación en cadena de la sección ocupada del arreglo
    */
    
    public static void main(String[] args) {
        Simbolos col=new Simbolos(-1);
        
    }
    
    
}
