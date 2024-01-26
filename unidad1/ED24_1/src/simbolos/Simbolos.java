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
public class Simbolos implements TDASimbolos {

    private Character[] valores;
    private int capacidad = 20;
    private int posicionActual;

    public Simbolos() {
        valores=new Character[capacidad];
    }

    public Simbolos(int capacidad) {
        this.capacidad = capacidad;
        valores=new Character[capacidad];
    }

    /**
     * Añadir un valor a la colección en la siguiente posición libre
     * @param valor 
     */
    @Override
    public void agregar(char valor) {
        if(posicionActual<capacidad){
            valores[posicionActual]=valor;
            posicionActual++;
        }else{
            throw new RuntimeException("La colección está llena");
        }
    }

    @Override
    public void sobreponer(char valor, int pos) throws IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int encontrar(char valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(char valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int tamanio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
