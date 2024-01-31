
import java.util.*;

/**
 * 
 */
public class Docente extends Trabajador {

    /**
     * Default constructor
     */
    public Docente() {
    }

    /**
     * 
     */
    private String carrera;

    /**
     * 
     */
    private int horasSemanales;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }


}