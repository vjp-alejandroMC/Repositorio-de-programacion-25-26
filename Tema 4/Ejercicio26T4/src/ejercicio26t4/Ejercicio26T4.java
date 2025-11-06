/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26t4;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 06/11/2025
 */
public class Ejercicio26T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Introduce un numero para saber si es primo o no: ");
            int num = entrada.nextInt();
            esPrimo(num);
    }
    
        public static boolean esPrimo(int num) {
            
        boolean esPrimo = true;

        int i = 2;
        
        while (i <= num && esPrimo) {
            
            if (num % i == 0) {
                esPrimo = false;
                System.out.println("El numero no es primo.");
            }
            else
                System.out.println("El numero es primo.");
        }
        return esPrimo;
   }
  
}
