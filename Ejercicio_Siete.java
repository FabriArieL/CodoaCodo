package CodoaCodo;
import java.util.Scanner;
/*
Codifique un programa en Java que permita saber si un número ingresado
por teclado es par o impar.
 */
public class Ejercicio_Siete {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int num = 0;
        
        System.out.println("El programa le indicara si el número que ingresa es par o impar");
        System.out.print("Ingrese un número: ");
        num = in.nextInt();
        num = num % 2;
        
        if (num == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
