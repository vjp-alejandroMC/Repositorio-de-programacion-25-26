/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3t7;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 09/01/2026
 */
public class Ejercicio3T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[] vector = new int[longitudVector()];
        rellenarVector(vector);
        mostrarVector(vector);
    }
    
    public static void rellenarVector(int[] vector) {
        
        int i;
        
        for (i = 0; i < vector.length; i++) {
            
            vector[i] = (int) (Math.random() * 6 + 1);
        }
    }
    
    public static void mostrarVector(int[] vector) {
        int i;
        
        for (i = 0; i < vector.length; i++) {
            System.out.println("El valor de la posicion " + i + " es " + vector[i] + ".");
        }
        
    }
    
    public static int longitudVector() {
        int longitud = 0;
        Scanner entrada = new Scanner(System.in);
        boolean valido;
        
        do {
            valido = true;
            try {
                System.out.print("Introduce la longitud del array (entre 1 y 10): ");
                longitud = entrada.nextInt();

                if (longitud < 1 || longitud > 10) {
                    System.out.println("Error: el numero debe estar entre 1 y 10.");
                    valido = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debes introducir un numero entero.");
                entrada.next(); // Limpia el buffer
                valido = false;
            }
        } while (!valido);

        return longitud;
    }
    
}
