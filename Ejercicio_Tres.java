package CodoaCodo;
import java.util.Scanner;
/*
Desarrollar un algoritmo que permita ingresar dos números enteros por
teclado. La computadora deberá mostrar su cociente con decimales.
Recuerde utilizar Casting para obtener el resultado con los decimales
correspondientes.
 */
public class Ejercicio_Tres {
 public static void main(String[] args){     
     
     Scanner in = new Scanner(System.in);
     float num_uno, num_dos;
     
     System.out.println("El programa calcula el cociente con decimales");
     System.out.print("Ingrese el número entero:");
     num_uno = in.nextInt();
     System.out.print("Ingrese el otro número entero:");
     num_dos = in.nextInt();
     float cociente = (float) (num_uno / num_dos);
     System.out.println("El resultado de la división es: " + cociente);
 }   
}
