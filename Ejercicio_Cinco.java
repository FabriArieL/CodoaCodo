package CodoaCodo;
import java.util.Scanner;
/*
Ingresar por teclado el radio (tipo de dato entero) de un círculo y calcular
su perímetro y superficie (definidos como double). Utilice la Clase Math
para obtener el valor de PI. Ejemplo: Ingresa 5, debe devolver
perímetro = 31,41592654 y superficie = 78,53981634.
 */
public class Ejercicio_Cinco {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int radio;
        double perimetro, superficie, PI;
        PI = Math.PI;
        
        System.out.println("El programa calcula el perímetro y la superfice del cìrculo");
        System.out.println("Ingrese el radio del círculo");
        radio = tec.nextInt();
        
        perimetro = radio * ( 2 * PI);
        superficie = PI * (Math.pow(radio,2));
        
        System.out.println("El valor del perímetro es " + perimetro);
        System.out.println("El valor de la superficie es " + superficie);
    }
}
