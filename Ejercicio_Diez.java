package CodoaCodo;
import java.util.Scanner;
/*
Desarrollar un algoritmo que, dados dos números enteros entre 0 y 100,
la computadora indique si el mayor es divisible por el menor. Ejemplo:
Ingresa 4 y 28, debe imprimir “28 es divisible por 4”. Se deberá validar
que los números ingresados se encuentren entre 0 y 100.
 */
public class Ejercicio_Diez {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num_uno = 0, num_dos = 0;
        
        System.out.println("El programa indica si el número mayor ingresado es divisible por el número menor");
        System.out.print("Ingrese un número: ");
        num_uno = in.nextInt();
        System.out.print("Ingrese un número: ");
        num_dos = in.nextInt();
        System.out.println("");
        
        if (num_uno >= 0 && num_uno <= 100 && num_dos >= 0 && num_dos <= 100){
            if (num_uno > num_dos && num_dos != 0) {
                System.out.println(num_uno + " es divisible por " + num_dos + ".");
            } else if (num_dos == 0) {
                System.out.println(num_uno + " no es divisible por " + num_dos + ".");
            }
            if (num_dos > num_uno && num_uno != 0) {
                System.out.println(num_dos + " es divisible por " + num_uno + ".");
            } else if (num_uno == 0) {
                System.out.println(num_dos + " no es divisible por " + num_uno + ".");
            }
        } else {
            System.out.println("El número o los números que ingreso no son validos");
        }
    }
}
