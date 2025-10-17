/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25t3;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 17/10/2025
 */
public class Ejercicio25T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 18; i <= 139; i++) { //Definición del bucle con las condiciones.
            if (i % 2 == 0)
            suma += i;
            //Suma de los números pares.
        }
        System.out.println("La suma de los numeros pares entre 17 y 139 es: " + suma);
    }
    
}
