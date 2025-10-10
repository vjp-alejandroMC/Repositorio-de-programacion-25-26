/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13t3;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 10/10/2025
 */
public class Ejercicio13T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 12; // Primer número par después de 11

        System.out.println("Números pares entre 11 y 133:\n");

        while (numero < 133) {
            System.out.println(numero);
            numero += 2; // Incrementa de 2 en 2 para obtener solo pares
        }
    }
}