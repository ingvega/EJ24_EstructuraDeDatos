/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

import java.util.EmptyStackException;
import java.util.Arrays;

/**
 *
 * @author paveg
 */
public class Pila<R> extends TDAPila<R> {

    @Override
    public void apilar(R dato) {
        if(ultimo!=datos.length-1){
            //Si hay espacio
            datos[ultimo+1]=dato;
            ultimo++;
        }else{
            datos=Arrays.copyOf(datos,datos.length*2);
            //Duplicar el espacio
            /*Object[] nuevo=new Object[datos.length*2];
            for (int i = 0; i < datos.length; i++) {
                nuevo[i]=datos[i];
            }
            datos=nuevo;
            */
            datos[ultimo+1]=dato;
            ultimo++;
        }
    }

    @Override
    public R desapilar() throws EmptyStackException {
        if(!estaVacia()){
            R respaldo=(R)datos[ultimo];
            datos[ultimo]=null;
            ultimo--;
            return respaldo;
        }else{
            throw new EmptyStackException();
        }
    }

    @Override
    public boolean estaVacia() {
        if(ultimo==-1)
            return true;
        else
            return false;
    }

    @Override
    public R cima() throws EmptyStackException {
        if(!estaVacia()){
            return (R)datos[ultimo];
        }else{
            throw new EmptyStackException();
        }
        
    }
    
}
