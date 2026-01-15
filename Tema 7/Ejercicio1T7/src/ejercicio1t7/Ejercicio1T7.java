/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1t7;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 08/01/2026
 */
public class Ejercicio1T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Métodos que usará el main.
        int[] vector = new int[10];
        rellenarVector(vector);
        mostrarPares(vector);
    }
    
    public static void rellenarVector(int[] vector) {
        //Implementación del scanner.
        Scanner entrada = new Scanner(System.in);
        int i;
        System.out.println("Escribe 10 numeros para rellenar el vector con " + vector.length + " posiciones.");
        
        //Bucle que pide al usuario 10 veces que introduzca un número, se pone menor que 10 porque el 0 también cuenta.
        for (i = 0; i < 10; i++) {
                System.out.println("Introduce un numero entero positivo para la posicion " + i + ": ");
                vector[i] = entrada.nextInt();
        }
    }
    
    public static void mostrarPares(int[] vector) {
        int i;
        
        //Bucle que imprime todos los números pares de los valores que el dio el usuario al vector.
        for (i = 0; i < 10; i++) {
            if (vector[i] % 2 == 0) {
                System.out.println("El valor guardado en la posicion " + i + " es de " + vector[i] + ".");
            }
        }
    }
    
}
