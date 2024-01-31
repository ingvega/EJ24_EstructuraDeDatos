/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        //Persona p=new Persona();
        Persona p=new Alumno();
        p.setNombre("Juan Perez");
        p.setDireccion("Calle desconocida 5");
        
        Alumno a=new Alumno();
        a=(Alumno)p;
        
        
        Docente d=new Docente();
        Administrativo ad=new Administrativo();
        Trabajador t=new Trabajador();
//        
//        p=a;
//        p=d;
//        p=t;
//        t=d;
//        p=a;
//        d=(Docente)p;
//        //d=(Docente)a;
//        int x=5,y=0;
//        x=x/y;
        
        
    }
}
