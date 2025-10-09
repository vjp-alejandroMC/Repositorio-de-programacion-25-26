/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 03/10/2025
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero de 4 cifras: ");
        int numero = entrada.nextInt();

        // Extraemos cada cifra con división y módulo
        int primera = numero / 1000;
        int segunda = (numero / 100) % 10;
        int tercera = (numero / 10) % 10;
        int cuarta = numero % 10;

        System.out.println("La primera cifra es: " + primera);
        System.out.println("La segunda cifra es: " + segunda);
        System.out.println("La tercera cifra es: " + tercera);
        System.out.println("La cuarta cifra es: " + cuarta);

        entrada.close();
    }
    
}
