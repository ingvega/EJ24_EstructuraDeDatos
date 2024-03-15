/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaenlazada;

import java.util.NoSuchElementException;

/**
 *
 * @author paveg
 */
public class Cola<T> extends TDACola<T> {
    private Nodo primero;
    private Nodo ultimo;
            
            
    @Override
    public void agregar(T dato) {
        //Crear un nodo
        Nodo nuevo=new Nodo();
        nuevo.setValor(dato);
        if(estaVacia()){
            primero=nuevo;
            //primero=ultimo=nuevo;
        }else{
            nuevo.siguiente=ultimo;
            ultimo.anterior=nuevo;
        }
        ultimo=nuevo;
    }

    @Override
    public T quitar() {
        if(!estaVacia()){
            T respaldo=primero.getValor();
            //Cuando primero y ultimo son el mismo significa que el que quitaremos es el unico
            //elemento que existía
            if(primero!=ultimo){
                //el elemento que quitaremos no es el unico de la colección
                primero.anterior.siguiente=null;
                primero=primero.anterior;
            }else{
                //el elemento a quitar es el unico en la colección
                primero=ultimo=null;
            }
            return respaldo;
        }
        throw new NoSuchElementException("La colección está vacía");
    }

    @Override
    public boolean estaVacia() {
        return primero==null;
    }

    @Override
    public T inicio() {
        if(!estaVacia()){
            return primero.getValor();
        }
        throw new NoSuchElementException("La colección está vacía");
    }
    
    private class Nodo{
        private T valor;
        private Nodo siguiente;
        private Nodo anterior;

        public T getValor() {
            return valor;
        }

        public void setValor(T valor) {
            this.valor = valor;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public Nodo getAnterior() {
            return anterior;
        }

        public void setAnterior(Nodo anterior) {
            this.anterior = anterior;
        }
        
        
    }
    
}
