package CodoaCodo;
import java.util.Scanner;
/*
Desarrollar un algoritmo que, dada la edad de una persona (entre 1 y 120
años) y su género ('F' para mujeres, 'M' para hombres), la computadora
indique si está en edad de jubilarse. Ayuda: Las mujeres se jubilan con 60
años o más. Los hombres se jubilan con 65 años o más. Ejemplo:
Ingresa 62 y 'M', debe devolver “No se jubila”.
 */
public class Ejercicio_Ocho {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        String genero = "", hombre = "M", mujer = "F"; 
        int edad = 0;
        
        System.out.println("*El programa calculará la edad de jubilación según el género de la persona");
        System.out.println("*Debera de ingresar 'F' o 'M' según el género de la persona");
        System.out.println("*La edad a ingresar deberá ser de entre 1 a 120 años");
        System.out.print("Ingrese el género: ");
        genero = in.nextLine();
        System.out.print("Ingrese la edad de la persona: ");
        edad = in.nextInt();
        
        if (genero.equals(mujer)) {
            if(edad > 1 && edad < 120){
                if(edad>=60){
                    System.out.println("La mujer tiene derecho a jubilarse.");
                } else {
                    System.out.println("La mujer todavia no tiene derecho a jubilarse.");
                }
            } else {
                System.out.println("La edad que ingreso no es valida.");
            }
        } else if (genero.equals(hombre)){
            if(edad > 1 && edad < 120){
                if(edad>=65){
                    System.out.println("El hombre tiene derecho a jubilarse.");
                } else {
                    System.out.println("El hombre todavia no tiene derecho a jubilarse.");
                }
            } else {
                System.out.println("La edad que ingreso no es valida.");
            }
        } else {
            System.out.println("Ha ingresado mal el género.");
        }
    }
}
