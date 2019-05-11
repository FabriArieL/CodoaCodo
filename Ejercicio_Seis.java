package CodoaCodo;
import java.util.Scanner;
/*
Ingresar por teclado los lados de un triángulo rectángulo (valores enteros)
y calcular el perímetro y su superficie. Para la raíz cuadrada de la
hipotenusa deberá utilizar la clase Math. Ayuda: la superficie es
base*altura/2 y el perímetro del triangulo es base+altura+hipotenusa,
donde hipotenusa = √(𝑏𝑎𝑠𝑒2 + 𝑎𝑙𝑡𝑢𝑟𝑎2)
 */
public class Ejercicio_Seis {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int base, altura;
        double perimetro, superficie, hipotenusa;
        
        System.out.println("El programa calcula la superficie y  el perímetro de un triángulo rectángulo");
        System.out.print("Ingrese el valor de la base: ");
        base = in.nextInt();
        System.out.print("Ingrese el valor de la altura: ");
        altura = in.nextInt();
        
        superficie = base * (altura/2);
        hipotenusa = Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
        perimetro = base + altura + hipotenusa;
        
        System.out.println("La superficie es " + superficie);
        System.out.println("El perímetro es " + perimetro);
    }
}
