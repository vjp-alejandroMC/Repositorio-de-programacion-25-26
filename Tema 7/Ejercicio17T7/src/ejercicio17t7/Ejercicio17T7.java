/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17t7;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 23/01/23
 */
public class Ejercicio17T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int[10];
        rellenarVector(vector);
        mostrarVector(vector);
        ordenarVector(vector);
        mostrarVector(vector);
        
    }
    
    public static void rellenarVector(int[] vector) {
        
        int i;
        
        for (i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 9);
        }
    }
    
    public static void mostrarVector(int[] vector) {
        
        int i;
        
        for (i = 0; i < vector.length; i++) {
            System.out.println("El valor de la posicion " + i + " es: " + vector[i]);
        }
    }
    
    public static void ordenarVector(int[] vector) {
        
        int i;
        int j;
        int aux;
        
        for (i = 0; i < vector.length - 1; i++) {
            for (j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j + 1] > vector[j]) {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }
    
}