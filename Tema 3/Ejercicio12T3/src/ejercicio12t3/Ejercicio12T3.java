/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12t3;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 10/10/2025
 */
public class Ejercicio12T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 12; //Defino el primer número par después de 11.

        System.out.println("Numeros pares entre 11 y 133:\n");

        do {
            System.out.println(numero);
            numero += 2; //Aquí incremento de 2 en 2 para obtener solo pares.
        } while (numero < 133); //Aquí se detiene antes de llegar a 133 si no es par.
    }
}
