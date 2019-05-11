package CodoaCodo;
import java.util.Scanner;
/*
Ingresar por teclado el diámetro (tipo de dato entero) de un círculo y
calcular su perímetro pero sólo deberá mostrar la parte entera del
resultado. Defina el valor de PI como una constante con valor 3,14.
Ejemplo: Ingresa 10, debe devolver perímetro = 31. Realice Casting
para obtener la parte entera del resultado.
 */
public class Ejercicio_Cuatro {
 public static void main(String[] args){
     
     Scanner in = new Scanner(System.in);
     int diametro, perimetro;
     float PI = (float) 3.14;
     
     System.out.println("El programa calcula la parte entera del perímetro");
     System.out.println("Ingrese el diámetro del círculo");
     diametro = in.nextInt();
     
     perimetro = (int) (diametro * PI);
     
     System.out.println("El perímetro es " + perimetro);
 }   
}
