/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Stack;
/**
 *
 * @author paveg
 */
public class AgrupadoresManuelAlejandro {
    public static void main(String[] args) {

        //parentesis
        String expresion1 = "(8+5*(6-7))";
        String expresion2 = "5+4*(3-2))";
        String expresion35 = "([5+4]*{3-2})";
        String expresion36 = "((([5+4]*{3-2})";
        String expresion37 = "[5+4(]*{3-2}))}";

       //llaves
        String expresion3 = "{8+5*{6-7}}";
        String expresion4 = "5+4*{3-2}}";

        //corchetes
        String expresion5 = "[8+5*[6-7]]";
        String expresion6 = "5+4*[3-2]]";

//        System.out.println("Expresión 1  " + operacion(expresion1));
//        System.out.println("Expresión 2  " + operacion(expresion2));
//        System.out.println("Expresión 3  " + operacion(expresion3));
//        System.out.println("Expresión 4  " + operacion(expresion4));
//        System.out.println("Expresión 5  " + operacion(expresion5));
     System.out.println("Expresión 6  " + operacion(expresion35));
     System.out.println("Expresión 6  " + operacion(expresion36));
     System.out.println("Expresión 6  " + operacion(expresion37));
    }

    public static boolean operacion(String expresionMatematica) {
        Stack<Character> pila = new Stack<>();
        
        for (int i = 0; i < expresionMatematica.length(); i++) {
            char caracter = expresionMatematica.charAt(i);
            if (caracter != 0) {
                if (caracter == '(' || caracter == ')') {
                    if (caracter == '(') {
                        pila.push(caracter);
                    } else if (caracter == ')') {
                        
                        if (pila.isEmpty()) {
                            return false;
                        }
                        else if(pila.peek()== '('){
                        pila.pop();
                        }
                        

                    }
                } else if (caracter == '{' || caracter == '}') {
                    if (caracter == '{') {
                        pila.push(caracter);
                    } else if (caracter == '}') {
                        if (pila.isEmpty()) {
                            return false;
                        } else if(pila.peek()== '{'){
                        pila.pop();
                        }
                    }
                } else if (caracter == '[' || caracter == ']') {
                    if (caracter == '[') {
                        pila.push(caracter);
                    } else if (caracter == ']') {
                        if (pila.isEmpty()) {
                            return false;
                        } else if(pila.peek()== '['){
                        pila.pop();
                        }
                    }
                }
                   
            }
        }

        return pila.isEmpty();
    }
}
