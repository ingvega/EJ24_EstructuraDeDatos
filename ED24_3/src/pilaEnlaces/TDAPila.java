/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaEnlaces;

/**
 *
 * @author paveg
 */
public abstract class TDAPila<T> {
    public abstract void apilar(T dato);
    public abstract T desapilar();
    public abstract boolean estaVacia();
    public abstract T cima();
}
