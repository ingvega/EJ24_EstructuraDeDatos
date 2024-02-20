/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed24_2;

/**
 *
 * @author paveg
 */
public class InvertirNumero {
    
     //"123"
//    public static String invertir(String n){
//        if(n.length()>0){
//            //caso recursivo
//            return invertir(n.substring(1))+ n.charAt(0);
//        }else{
//            return "";
//        }
//    }
    public static void main(String[] args) {
        System.out.println(invertir(2350));
    }
    
    public static int nAlrevezRecursivo(int n, int invertido){
        int resto;
        //Caso recursivo
        if(n>0){
            resto=n%10;
            invertido=invertido*10+resto;
            n/=10;
            return nAlrevezRecursivo(n,invertido);
        }else{
            return invertido;
        }
    }
    public static int nAlrevez(int n){
        int invertido=0, resto;
        while(n>0){
            resto=n%10;
            invertido=invertido*10+resto;
            n/=10;
        }
        return invertido;
    }
       
    public static int invertir(int n){
        String numero=""+n;
        String numeroInvertido=invertir(numero,numero.length()-1);
        return Integer.parseInt(numero);
    }
    private static String invertir(String n,int pos){
        if(pos>0){
            //caso recursivo
            return n.charAt(pos) + invertir(n,pos-1);
        }else{
            return ""+n.charAt(pos);
        }
    }
}





