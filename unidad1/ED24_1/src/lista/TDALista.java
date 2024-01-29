/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author paveg
 */
public abstract class TDALista {
    protected Object[] valores;
    protected final int capacidad=100;
    protected int posicion;
    
    public abstract boolean agregar(Object valor);
    public abstract int tamanio();
    /*
    agregar
    tamanio
    toString
    */
}
