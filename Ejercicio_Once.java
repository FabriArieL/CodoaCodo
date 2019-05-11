package CodoaCodo;
import java.util.Scanner;
/*
Desarrollar un algoritmo que permita ingresar los lados A, B y C de un
triángulo. La computadora informa si el triángulo es o no válido. En caso
afirmativo, además informa si es equilátero, isósceles o escaleno. Ayuda:
según el teorema de desigualdad triangular, un triángulo es válido si se
cumple que cada uno de los lados no puede ser más largo que la suma
de los otros dos. Un triángulo equilátero es aquel que tiene sus tres lados
iguales. Un triángulo isósceles es aquel que tiene dos de sus lados
iguales. Un triángulo escaleno es aquel que tiene sus tres lados
desiguales. Ejemplo: Se ingresa un 3, 4 y 5, la computadora muestra:
“Es un triángulo escaleno”.
 */
public class Ejercicio_Once {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0, c = 0, validez_uno, validez_dos, validez_tres;
        
        System.out.println("El programa indica si no es válido, y si es válido, indica si el triángulo es escaleno, isósceles o equilátero");
        System.out.println("Ingrese el valor de los lado: ");
        System.out.print("Lado a: ");
        a = in.nextInt();
        System.out.print("Lado b: ");
        b = in.nextInt();
        System.out.print("Lado c: ");
        c = in.nextInt();
        validez_uno = b + c;
        validez_dos = a + c;
        validez_tres = a + b;
        
        if (a < validez_uno) {
            if (b < validez_dos) {
                if (c < validez_tres) {
                    if (a != b && b != c && a != c) {
                        System.out.println("Es válido, es un triángulo escaleno");
                    } else if (a == b && b == c && a == c) {
                        System.out.println("Es válido, es un triángulo equilátero");
                    } else
                        System.out.println("Es válido, es un triángulo isósceles");
                } else
                    System.out.println("El triángulo no es válido");
            } else
                System.out.println("El triángulo no es válido");
        } else
            System.out.println("El triángulo no es válido");
    }
}
