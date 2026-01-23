/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11t7;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 15/01/2026
 */
public class Ejercicio11T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creacion del array y llamada a los métodos.
        int[] vector = new int[10];
        rellenarVector(vector);
        System.out.println("Se ha generado el siguiente array");
        mostrarVector(vector);
        
    }
    
    public static void rellenarVector(int[] vector) {
        
        //Array auxialiar de tipo booleano para que compruebe que los números generados no sean repetidos.
        boolean[] usados = new boolean[10];
        
        int i;
        
        //Bucle que genera los números.
        for (i = 0; i < vector.length; i++) {
            int num = (int) (Math.random() * 10);
            
            //Comprobación de los números que ya han sido generados.
            if (!usados[num]) {
                vector[i] = num;
                usados[num] = true;
            } else {
                i--;
            }
        }
        
    }
    
    public static void mostrarVector(int[] vector) {
        
        //Bucle que muestra los valores del array.
        for (int num : vector) {
            System.out.println(num + "");
        }
    }
    
}
