


import java.util.EmptyStackException;
import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Main {

    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String expresion=lector.nextLine();
        if(operacion(expresion)){
        //if (operacion(new Scanner(System.in).nextLine())) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }

    public static boolean operacion(String expresionMatematica) {
        Pila<Character> pila = new Pila<>();

        for (int i = 0; i < expresionMatematica.length(); i++) {
            char caracter = expresionMatematica.charAt(i);
            if (caracter != 0) {
                if (caracter == '(' || caracter == ')') {
                    if (caracter == '(') {
                        pila.apilar(caracter);
                    } else if (caracter == ')') {

                        if (pila.estaVacia()) {
                            return false;
                        } else if (pila.cima() == '(') {
                            pila.desapilar();
                        }

                    }
                } else if (caracter == '{' || caracter == '}') {
                    if (caracter == '{') {
                        pila.apilar(caracter);
                    } else if (caracter == '}') {
                        if (pila.estaVacia()) {
                            return false;
                        } else if (pila.cima() == '{') {
                            pila.desapilar();
                        }
                    }
                } else if (caracter == '[' || caracter == ']') {
                    if (caracter == '[') {
                        pila.apilar(caracter);
                    } else if (caracter == ']') {
                        if (pila.estaVacia()) {
                            return false;
                        } else if (pila.cima() == '[') {
                            pila.desapilar();
                        }
                    }
                }

            }
        }

        return pila.estaVacia();
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
