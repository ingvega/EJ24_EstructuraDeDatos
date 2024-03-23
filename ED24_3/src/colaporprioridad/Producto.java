/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaporprioridad;


/**
 *
 * @author paveg
 */
public class Producto implements Comparable<Producto>{
    private int clave;
    private String nombre;
    private String categoria;
    private float precio;
    
    public Producto(int clave, String nombre, String categoria, float precio) {
        this.clave = clave;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria=categoria;
    }
        
    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Producto o) {
        if (o == null) {
            return 1;
        }
        if(this.categoria.compareToIgnoreCase(o.categoria)>0){
            return 1;
        }else if(this.categoria.compareToIgnoreCase(o.categoria)<0){
            return -1;
        }else{
            //Solo en caso de que la categoría sea igual comparamos la clave
            if (this.clave == o.clave) {
                return 0;
            } else if (this.clave > o.clave) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    @Override
    public String toString() {
        return "{clave=" + clave + ", nombre=" + nombre +
                ", categoria=" + categoria + ", precio=" + precio + "}";
    }
    
    
}
