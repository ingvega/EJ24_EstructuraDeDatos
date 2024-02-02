/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diccionario;

/**
 *
 * @author paveg
 */
public abstract class TDADiccionario {
    protected int claves[];
    protected String valores[];
    public final int CAPACIDAD=100;
    protected int posicion;
    
    public abstract boolean agregar(int clave,String valor);
    public abstract String encontrar(int clave);
    public abstract boolean eliminar(int clave);
    
    
}
