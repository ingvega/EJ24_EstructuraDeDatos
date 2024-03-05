/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author paveg
 */
public abstract class TDAPila<T> {
    protected Object[] datos=new Object[10];
    protected int ultimo=-1;
        
    public abstract void apilar(T dato);
    public abstract T desapilar();
    public abstract boolean estaVacia();
    public abstract T cima();
}
