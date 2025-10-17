/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26t3;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 17/10/2025
 */
public class Ejercicio26T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 111; i <= 222; i++) { //Definición de la condición del bucle.
            if (i%2==1)
            suma += i;
            //Suma de los números impares.
        }
        System.out.println("La suma de los numeros impares entre 111 y 222 es: " + suma);
    }
    
}
