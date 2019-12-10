package Proyecto01;
import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner obtenerNumero = new Scanner(System.in);
        int numero,i,j;
 
        System.out.print("Indica el número: ");
        numero = obtenerNumero.nextInt();
        System.out.println("El doble es: " + numero*2);
        System.out.println("El triple es: " + numero*3);

    }
}