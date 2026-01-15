/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2t7;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 08/01/2026
 */
public class Ejercicio2T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Métodos que usará el main.
        int[] vector = new int[7];
        rellenarVector(vector);
        mostrarVector(vector);
        cambiarVector(vector);
        mostrarVector(vector);
        
    }
    
    public static void rellenarVector(int[] vector) {
        
        //Implementación del scanner.
        Scanner entrada = new Scanner(System.in);
        int i;
        
        System.out.println("Escribe 10 numeros para rellenar el vector con " + vector.length + " posiciones.");
        
        //Bucle que se repite hasta 7 veces para rellenar el vector.
        for (i = 0; i < 7; i++) {
            System.out.println("Introduce un numero para la posicion " + i + ":");
            vector[i] = entrada.nextInt();
        }
        
    }
    
    public static void mostrarVector(int[] vector) {
        int i;
        
        //Bucle que imprime todos los valores de las posiciones del vector.
        for (i = 0; i < 7; i++) {
            System.out.println("El valor de la posicion " + i + "del vector es: " + vector[i] );
        }
    }
    
    public static void cambiarVector(int[] vector) {
        
        //Método en burbuja para cambiar los valores de las segunda y cuarta posición.
        int aux = vector[1];
        vector[1] = vector[3];
        vector[3] = aux;
        System.out.println("Se intercambiaron los valores de la segunda y cuarta posicion.");
            
    }
    
}
