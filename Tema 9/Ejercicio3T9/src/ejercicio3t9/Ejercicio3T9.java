/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3t9;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 12/02/2026
 */
public class Ejercicio3T9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mostrarCaracteres();
        
    }
    
    public static void mostrarCaracteres() {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Intruce una cadena de caracteres: ");
        String texto = entrada.nextLine();
        
        char[] caracteres = texto.toCharArray();
        
        System.out.println("Caracteres de lo que introduciste:");
        for (char c : caracteres) {
            

            System.out.println(c);
            
        }
        
    }
    
}
