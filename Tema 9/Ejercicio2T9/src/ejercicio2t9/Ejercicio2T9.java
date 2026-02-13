/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2t9;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 12/02/2026
 */
public class Ejercicio2T9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mostrarCaracteres();
        
    }
    
    public static void mostrarCaracteres() {
        
        Scanner entrada = new Scanner(System.in);
        
        String caracteres;
        System.out.println("Introduce una secuencia de caracteres: ");
        caracteres = entrada.nextLine();
        
        for (int i = 0; i < caracteres.length(); i++) {
            
        System.out.println("Caracter " + i + ": " + caracteres.charAt(i));
        }
    }
    
}
