package CodoaCodo;
import java.util.Scanner;
/*
Desarrollar un algoritmo que, dada la cantidad de alumnos de 
un curso y la cantidad de sillas disponibles, la computadora 
indique si alcanzan las sillas, en caso contrario, indique
cuántas faltan para que todo el alumnado tenga asiento.
 */
public class Ejercicio_Nueve {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int alumnos = 0, sillas = 0, cantidad;
        
        System.out.println("El programa calcula si faltan, cuantas faltan, o si hay suficientes sillas");
        System.out.print("Ingrese la cantidad de alumnos en el curso: ");
        alumnos = in.nextInt();
        System.out.print("Ingrese la cantidad de sillas en el curso: ");
        sillas = in.nextInt();
        
        cantidad = sillas - alumnos;
        
        if (cantidad<0) {
            cantidad = cantidad * (-1);
            System.out.println("Faltan " + cantidad + " sillas.");
        } else {
            System.out.println("Hay suficientes sillas.");
        }
    }
}
