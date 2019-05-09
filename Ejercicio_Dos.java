package CodoaCodo;
import java.util.Scanner;
/*
Desarrollar un algoritmo que permita ingresar dos números enteros por
teclado utilizando un objeto Scanner. La computadora deberá mostrar su
cociente entero. El resto se deberá mostrar en otra línea. Ejemplo:
Ingresa 23 y 5, debe devolver 4 y, en otra línea, 3.
*/
public class Ejercicio_Dos {
 public static void main(String[] args){
     
     Scanner entrada = new Scanner(System.in);
     int num_uno, num_dos;
     
     System.out.println("El programa calcula el cociente entero y el resto");
     System.out.print("Ingrese el dividendo: ");
     num_uno = entrada.nextInt();
     System.out.print("Ingrese el divisor: ");
     num_dos = entrada.nextInt();
     
     System.out.println("El cociente es " + num_uno / num_dos);
     System.out.println("El cociente es " + num_uno % num_dos);
 }  
}
