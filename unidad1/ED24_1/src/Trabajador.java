
import java.util.*;

/**
 * 
 */
public class Trabajador extends Persona {

    /**
     * Default constructor
     */
    public Trabajador() {
    }

    /**
     * 
     */
    private float sueldo;

    /**
     * 
     */
    private Date fechaContratacion;

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    
}