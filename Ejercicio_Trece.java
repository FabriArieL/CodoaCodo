package CodoaCodo;
import java.util.Scanner;
/*
Desarrollar un algoritmo que pida al usuario un número entre 1 y 12. La
computadora muestra por pantalla el mes al que pertenece tal número. Si
se ingresa un número fuera de rango, mostrar un error. Ejemplo: se
ingresa un 4, la computadora muestra: “ABRIL” (utilice switch-case).
 */
public class Ejercicio_Trece {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int mes = 0;
        
        System.out.println("El programa le devolvera ,ingresando un número, su respectivo mes");
        System.out.print("Ingrese el número del mes");
        mes = in.nextInt();
        
        switch (mes) {
            case 1:
                System.out.println("Enero");
            case 2:
                System.out.println("Febrero");
            case 3:
                System.out.println("Marzo");
            case 4:
                System.out.println("Abril");
            case 5:
                System.out.println("Mayo");
            case 6:
                System.out.println("Junio");
            case 7:
                System.out.println("Julio");
            case 8:
                System.out.println("Agosto");
            case 9:
                System.out.println("Septiembre");
            case 10:
                System.out.println("Octubre");
            case 11:
                System.out.println("Noviembre");
            case 12:
                System.out.println("Diciembre");
            default:
                System.out.println("Error, ese mes no existe");
        }
    }
}
