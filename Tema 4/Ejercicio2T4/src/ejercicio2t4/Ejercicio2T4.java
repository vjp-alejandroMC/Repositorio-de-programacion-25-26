/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2t4;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 24/10/2025
 */
public class Ejercicio2T4 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //El programa pide los datos.
        System.out.println("Por favor, introduzca un numero:");
        int num1 = entrada.nextInt();
        
        System.out.println("Ahora, intrduzca el segundo numero:");
        int num2 = entrada.nextInt();
        
        //Llamamiento a los métodos para que se ejecuten.
        MultiplicacionNumeros.multiplicarNumeros(num1, num2);
        SumaNumeros.sumaNumeros(num1, num2);
        
    }
    
}
