/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15t3;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 10/10/2025
 */
public class Ejercicio15T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero para calcular su tabla de multiplicar:");
        int numero= entrada.nextInt();
        
        System.out.println("\nTabla de multiplicar del" + numero + ":\n");
        //Este es el print para introducir el número del que vamos a calcular su tabla de multiplicar.
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            //Aquí defino el bucle para que empiece en 0 y acabe en 10, aparte en el print hago que el resultado se multiplique usando un asterisco.
        }
        
    }
    
}
