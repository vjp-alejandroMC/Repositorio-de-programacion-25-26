/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4t4;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 24/10/2025
 */
public class Ejercicio4T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            //El programa pide al usuario 3 números.
        System.out.println("Introduzca el primer numero:");
        int num1 = entrada.nextInt();
        
        System.out.println("Introduzca el segundo numero:");
        int num2 = entrada.nextInt();
        
        System.out.println("Introduzca el ultimo numero:");
        int num3 = entrada.nextInt();
        
        metodos.NumeroMenor.NumeroMenor(num1, num2, num3);
    }
    
}
