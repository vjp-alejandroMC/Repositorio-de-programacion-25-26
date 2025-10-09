/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1t3;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 06/10/2025
 */
public class Ejercicio1T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
                
        System.out.println("Introduzca un numero:");
        int num = entrada.nextInt();
        if (num < 0) {
            System.out.println("El numero introducido es negativo");
        }
        else {  
        System.out.println("El numero introducido es positivo");
        }
    }
    
}
