
import java.util.EmptyStackException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author paveg
 */
public class BalancearExpresion {

    public static void main(String[] args) {
        String expresion = new Scanner(System.in).nextLine();
        String expresionFinal = "";
        boolean balanceada = true;
        Pila<Character> aperturas = new Pila<>();
        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);
            if(caracter == '[' || caracter == '{' || caracter == '(') {
                aperturas.apilar(caracter);
                expresionFinal += caracter;
            } else if (caracter == ']' || caracter == '}' || caracter == ')') {
                //Encontre un cierre que no tiene apertura (omitirlo)
                //(a+b)
                if (aperturas.estaVacia()) {
                    //No se colocará este elemento de cierre, pero se deja la marca
                    //de que la expresión no está correcta
                    balanceada = false;
                } else {
                    if ((caracter == ']' && aperturas.cima() == '[')
                            || (caracter == '}' && aperturas.cima() == '{')
                            || (caracter == ')' && aperturas.cima() == '(')) {
                        //El símbolo de cierre coincide con el de apertura
                        expresionFinal += caracter;
                        aperturas.desapilar();
                    } else {
                        balanceada = false;
                        //Cerrar todos los símbolos que estan en la pila
                        while (!aperturas.estaVacia()) {
                            char apertura = aperturas.desapilar();
                            if (apertura == '[') {
                                expresionFinal += ']';
                            } else if (apertura == '{') {
                                expresionFinal += '}';
                            } else {
                                expresionFinal += ')';
                            }
                        }
                    }

                }
            } else {
                expresionFinal += caracter;
            }
        }
        
        if(balanceada){
            System.out.println("BALANCEADA");
        }else{
            System.out.println("CORREGIDA: " + expresionFinal);
        }

    }

}

abstract class TDAPila<T> {

    public abstract void apilar(T dato);

    public abstract T desapilar();

    public abstract boolean estaVacia();

    public abstract T cima();
}

/**
 *
 * @author paveg
 */
class Pila<R> extends TDAPila<R> {

    private Elemento ultimo;

    @Override
    public void apilar(R dato) {
        Elemento nuevo = new Elemento();
        nuevo.valor = dato;
        nuevo.enlace = ultimo;
        ultimo = nuevo;
    }

    @Override
    public R desapilar() throws EmptyStackException {
        if (!estaVacia()) {
            R respaldo = ultimo.valor;
            ultimo = ultimo.enlace;
            return respaldo;
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public boolean estaVacia() {
        if (ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public R cima() throws EmptyStackException {
        if (!estaVacia()) {
            return ultimo.valor;
        } else {
            throw new EmptyStackException();
        }

    }

    private class Elemento {

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
