/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6t3;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 06/10/2025
 */
public class Ejercicio6T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la nota de 0 a 10 ");
        int nota = entrada.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe estar entre 0 y 10.");
        } else if (nota >= 0 && nota <= 4) {
            System.out.println("Suspenso.");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Bien.");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Notable.");
        } else { // nota 9 o 10
            System.out.println("Sobresaliente.");
        }

        entrada.close();
    }
}
