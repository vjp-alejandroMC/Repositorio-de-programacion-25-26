/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4t7;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 16/01/2026
 */
public class Ejercicio4T7 {

    public final static int FIL = 4;
    public final static int COL = 3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = new int[FIL][COL];
        rellenarMatriz(matriz);
        mostrarParesMatriz(matriz);
        
    }
    
    public static void rellenarMatriz(int[][] matriz) {
        
        int i;
        int j;
        
        for (i = 0; i < FIL; i++) {
            for (j = 0; j < COL; j++) {
                
                matriz[i][j] = (int) (Math.random() * 101) + 100;
            }
        }
        
    }
    
    public static void mostrarParesMatriz(int[][] matriz) {
        
        int i;
        int j;
        
        for (i = 0; i < FIL; i++) {
            for (j = 0; j < COL; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.println("Los valores pares de la matriz son: " + matriz[i][j]);
                }
            }
        }
        
    }
    
}
