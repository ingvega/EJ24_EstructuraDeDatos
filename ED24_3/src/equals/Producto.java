/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equals;

/**
 *
 * @author paveg
 */
public class Producto {
    private int clave;
    private String nombre;
    private float precio;

    public Producto(int clave, String nombre, float precio) {
        this.clave = clave;
        this.nombre = nombre;
        this.precio = precio;
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
    
    
   /* public boolean equals(Object obj){
        //Revisar que no sea null
        if(obj==null)
            return false;
        Producto otro;
        //Revisar que sean del mismo tipo (Producto)
//        try{
//            otro=(Producto) obj;
//        }catch(Exception ex){
//            return false;
//        }
        //if(obj instanceof Producto)
        if(this.getClass()==obj.getClass()){
            otro=(Producto)obj;
            //Revisar si las características importantes son iguales
            if(this.getClave()==otro.getClave()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
        
    }*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.clave == other.clave;
    }
    
    
}
