/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1t4;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 24/10/2025
 */
public class Ejercicio1T4 {
 
        // Método que determina si el número es positivo o negativo
    public static void comprobarNumero(int n) {
        if (n > 0) {
            System.out.println("El numero introducido es positivo.");
        } else if (n < 0) {
            System.out.println("El numero introducido es negativo.");
        } else {
            System.out.println("El numero introducido es cero.");
        }
    }
        //Método que devuelve true si el número es positivo
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero: ");
        int numero = entrada.nextInt();

        // Llamamos al método que mostrará si el número es positivo o negativo
        comprobarNumero(numero);

    }

}