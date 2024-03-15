/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaenlazada;

/**
 *
 * @author paveg
 */
public abstract class TDACola<T> {
    public abstract void agregar(T dato);
    public abstract T quitar();
    public abstract boolean estaVacia();
    public abstract T inicio();
}
