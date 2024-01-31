
import java.util.*;

/**
 * 
 */
public class Alumno extends Persona {

    /**
     * Default constructor
     */
    public Alumno() {
    }

    /**
     * 
     */
    private String carrera;

    /**
     * 
     */
    private byte semestre;

    /**
     * 
     */
    private float promedio;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String value) {
        this.carrera = value;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }


}