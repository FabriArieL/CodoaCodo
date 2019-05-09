package CodoaCodo;
import java.util.Scanner;
/*
Ingresar el área de un cuadrado por teclado utilizando un objeto Scanner.
Calcular e imprimir el valor del perímetro. Ejemplo: Ingresa 25, debe
devolver 20.
*/
public class Ejercicio_Uno {
 public static void main(String[] args){
     
     Scanner entrada = new Scanner(System.in);
     int area;
     double perimetro;
     
     System.out.println("Menu del programa");
     System.out.println("********************************");
     System.out.println("El programa calcula el perímetro");
     System.out.println("********************************");
     System.out.print("Ingrese el area del cuadrado: ");
     area = entrada.nextInt();
     
     perimetro = Math.sqrt(area);
     perimetro = perimetro * 4;
     
     System.out.println("El perímetro es " + perimetro);
 }   
}
