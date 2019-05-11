package CodoaCodo;
import java.util.Scanner;
/*
Desarrollar un algoritmo que permita ingresar un caracter. La
computadora indica si es o no una letra vocal (utilice switch-case).
 */
public class Ejercicio_Doce {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        String letra = "";
        
        System.out.print("Ingrese una letra: ");
        letra = in.nextLine();
        
        switch (letra) {
            case "a": 
                System.out.println("Es una vocal");
                break;
            case "e": 
                System.out.println("Es una vocal");
                break;
            case "i": 
                System.out.println("Es una vocal");
                break;
            case "o": 
                System.out.println("Es una vocal");
            case "u": 
                 System.out.println("Es una vocal");
                 break;
                 
            default:
                System.out.println("No es una vocal");
                
                      
        }
    }
}
