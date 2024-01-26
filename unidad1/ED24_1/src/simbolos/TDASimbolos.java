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
public interface TDASimbolos {
    /** 
     * cuando no haya espacio marca excepcion
     * @param valor 
     */
    public void agregar(char valor); 
    public void sobreponer(char valor, int pos) 
            throws IndexOutOfBoundsException;
    public int encontrar(char valor); //(-1 cuando no exista y valor de 0 en adelante cuando lo encuentre)
    public int eliminar(char valor); //asigna null en la posición que se encuentre el valor y devuelve la posición encontrada, de lo contrario devuelve -1
    public int tamanio();
    public String toString(); // Devolver la representación en cadena de la sección ocupada del arreglo

}
