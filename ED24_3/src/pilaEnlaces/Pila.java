/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaEnlaces;

import java.util.EmptyStackException;

/**
 *
 * @author paveg
 */
public class Pila<R> extends TDAPila<R> {
    private Elemento ultimo;
    
    @Override
    public void apilar(R dato) {
            Elemento nuevo=new Elemento();
            nuevo.valor=dato;
            nuevo.enlace=ultimo;
            ultimo=nuevo;
    }

    @Override
    public R desapilar() throws EmptyStackException {
        if(!estaVacia()){
            R respaldo=ultimo.valor;
            ultimo=ultimo.enlace;
            return respaldo;
        }else{
            throw new EmptyStackException();
        }
    }

    @Override
    public boolean estaVacia() {
        if(ultimo==null)
            return true;
        else
            return false;
    }

    @Override
    public R cima() throws EmptyStackException {
        if(!estaVacia()){
            return ultimo.valor;
        }else{
            throw new EmptyStackException();
        }
        
    }

    private class Elemento{
        private R valor;
        private Elemento enlace;

        public R getValor() {
            return valor;
        }

        public void setValor(R valor) {
            this.valor = valor;
        }

        public Elemento getEnlace() {
            return enlace;
        }

        public void setEnlace(Elemento enlace) {
            this.enlace = enlace;
        }
        
    }
    
}
