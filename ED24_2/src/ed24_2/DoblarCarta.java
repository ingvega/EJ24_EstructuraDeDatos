/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed24_2;

/**
 *
 * @author paveg
 */
public class DoblarCarta {
    public static void main(String[] args) {
        
    }
    
    public static int doblar(double dim1Carta,double dim2Carta,
            double dim1Caja,double dim2Caja){
        String mensaje="";
        if(dim1Carta<=0)
            mensaje+="-> Dimensión 1 de la carta ("+dim1Carta+")\n";
        if(dim2Carta<=0)
            mensaje+="-> Dimensión 2 de la carta ("+dim2Carta+")\n";
        if(dim1Caja<=0)
            mensaje+="-> Dimensión 1 de la caja ("+dim1Caja+")\n";
        if(dim2Caja<=0)
            mensaje+="-> Dimensión 2 de la caja ("+dim2Caja+")\n";
        if(!mensaje.equals("")){
            mensaje="No se aceptan valores negativos ni cero:"+
                    mensaje;
            throw new IllegalArgumentException(mensaje);
        }
        return doblar(dim1Carta,dim2Carta,dim1Caja,dim2Caja,0);
    }
    
    private static int doblar(double dim1Carta,double dim2Carta,
            double dim1Caja,double dim2Caja, int dobleces){
        //Obtener los 2 valores mayores (caja y carta)
        dim1Carta=Math.max(dim1Carta, dim2Carta);
        dim1Caja=Math.max(dim1Caja, dim2Caja);
        //Obtener los 2 valores menores (caja y carta)
        dim2Carta=Math.min(dim1Carta, dim2Carta);
        dim2Caja=Math.min(dim1Caja, dim2Caja);
         //Cuando ya acabé (cuando ya cabe)
         if(dim1Carta<=dim1Caja && dim2Carta<=dim2Caja){
             return dobleces;
         }else if(dobleces==8){
         //Cuando ya acabé (cuando ya se ha doblado 8 veces)
            return -1;
         }else{
            //Cuando tengo que seguir trabajando(falta doblar al menos
            //una vez más
            dim1Carta/=2;
            dim2Carta/=2;
            dobleces++;
            return doblar(dim1Carta,dim2Carta,dim1Caja,dim2Caja,dobleces);
         
         }
    }
    
}
