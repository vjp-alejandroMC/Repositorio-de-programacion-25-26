/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10t7;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 12/01/2026
 */
public class Ejercicio10T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int[10];
        rellenarVector(vector);
        mostrarVector(vector);
        sustituirRepetidos(vector);
        mostrarVector(vector);
        
    }
    
    public static void rellenarVector(int[] vector) {
        
        int i;
        
        for (i = 0; i < vector.length; i++) {
            
            vector[i] = (int) (Math.random() * 8 + 1);
        }
    }
    
    public static void mostrarVector(int[] vector) {
        
        int i;
        
        for (i = 0; i < vector.length; i++) {
            System.out.println("El valor de la posicion " + i + " es: " + vector[i]);
        }
    }
    
    public static void sustituirRepetidos(int[] vector) {
        
        int i = 0;
        int aux;
        
        for (i = 0; i < vector.length; i++) {
            for (aux = i + 1; aux < vector.length; aux++) {
                
                if (vector[i] == vector[aux]) {
                vector[aux] = 0;
                }
            }
        }
        
    }
    
}
