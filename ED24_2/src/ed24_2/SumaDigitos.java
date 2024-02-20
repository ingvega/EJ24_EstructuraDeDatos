/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed24_2;

/**
 *
 * @author paveg
 */
public class SumaDigitos {

    public static void main(String[] args) {
        SumaDigitos a = new SumaDigitos();
        System.out.println(a.sumaDigitosIterativo(88));
        System.out.println(a.sumaDigitosIterativo(55));
        System.out.println(a.sumaDigitosIterativo(12345));
    }

    public int sumaDigitosIterativo(int n) {
        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n = n / 10;
        }
        return suma;
    }
    
    public int sumaDigitosRecursivo(int n, int suma) {
        //Caso base
        if(n==0){
            return suma;
        }else{ //Caso recursivo
            suma += n % 10;
            n = n / 10;
            return sumaDigitosRecursivo(n,suma);
        }
        
    }
    
    

}
