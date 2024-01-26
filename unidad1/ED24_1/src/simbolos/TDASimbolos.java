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
    public void agregar(char valor); 
    public void sobreponer(char valor, int pos) 
            throws IndexOutOfBoundsException;
    public int encontrar(char valor);
    public int eliminar(char valor); 
    public int tamanio();
    public String toString(); 

}
