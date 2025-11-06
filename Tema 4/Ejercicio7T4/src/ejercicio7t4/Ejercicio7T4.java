/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7t4;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 27/10/2025
 */
public class Ejercicio7T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);
        
        //El programa le pide los números al usuario.
        System.out.println("Introduzca el primer numero: ");
        
        int num1 = entrada.nextInt();
        
        System.out.println("Introduzca el segundo numero: ");
        
        int num2 = entrada.nextInt();
        
        System.out.println("Introduzca el tercer numero: ");
        
        int num3 = entrada.nextInt();
        
        System.out.println("Introduzca el cuarto numero: ");
        
        int num4 = entrada.nextInt();
        
        ordenar(num1,num2,num3,num4);
    }
    public static void ordenar(int num1, int num2, int num3, int num4) {
        int temp;

        // Usamos un bucle tipo "burbuja" para ordenar los 4 números sin arrays
        for (int i = 0; i < 4; i++) {
            if (num1 > num2) { temp = num1; num1 = num2; num2 = temp; }
            if (num2 > num3) { temp = num2; num2 = num3; num3 = temp; }
            if (num3 > num4) { temp = num3; num3 = num4; num4 = temp; }
        }

        System.out.println("El orden de los numeros introducidos es el " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
}