package simbolos;

/**
 *Representa una colección con almacenamiento continuo de caracteres,
 * puede definirse el número de caracteres máximo a almacenar (usando la 
 * sobrecarga del constructor), de lo contrario se creará con un máximo de 
 * 20 caracteres a almacenar
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
     * Añade un valor a la colección siempre y cuando haya espacio disponible de acuerdo a la capacidad
     * de la colección
     * @param valor Caracter a almacenar
     * @throws RuntimeException Se genera una excepción cuando no es posible añadir el elemento debido a
     * que ya se agotó la capacidad
     */
    @Override
    public void agregar(char valor) throws RuntimeException{
        if(posicionActual<capacidad){
            valores[posicionActual]=valor;
            posicionActual++;
        }else{
            throw new RuntimeException("La colección está llena");
        }
    }

    /**
     * Permite reemplazar un caracter en la posición indicada por otro nuevo
     * @param valor Caracter nuevo a colocar en la colección
     * @param pos Índice en el que será reemplazado el caracter original por el nuevo
     * @throws IndexOutOfBoundsException Se genera cuando la posición indicada es negativa o
     * rebasa la capadicad establecida para la colección
     */
    @Override
    public void sobreponer(char valor, int pos) throws IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Explora la colección en busca del caracter indicado en la colección
     * @param valor Caracter a buscar
     * @return Devuelve la posición de la primera aparición del caracter  buscado o -1 en caso de que el caracter no se 
     * encuentre en la colección
     */
    @Override
    public int encontrar(char valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Elimina la primera aparición del caracter indicado y realiza un corrimiento de los caracteres posteriores
     * @param valor Caracter a eliminar
     * @return Devuelve la posición de la primera aparición del caracter  eliminado o -1 en caso de que el caracter no se 
     * encuentre en la colección
     */
    @Override
    public int eliminar(char valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Permite conocer la cantidad de caracteres almacenado actualmente en la colección
     * @return Entero que representa la cantidad de elementos almacenados
     */
    @Override
    public int tamanio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Genera la representación en cadena de los elementos contenidos en la colección representados de
     * manera continua, por ejemplo, si la colección tiene los caracteres 'a', 'b','c', se devolverá la cadena
     * abc
     * @return Representación en texto de los caracteres almacenados
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
