/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21t4;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 03/11/2025
 */
public class Ejercicio21T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pedirSegundoNum();
    }
    public static int pedirPrimerNum() {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el primer numero: ");
        int num1 = entrada.nextInt();
        
        return num1;
    }
    
    public static void pedirSegundoNum() {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el segundo numero: ");
        
        int num2 = entrada.nextInt();
        int num1 = pedirPrimerNum();
        
        if (num2 < num1) {
            System.out.println("Introduce un numero mayor que el primero: ");
            num2 = entrada.nextInt();
        }
    }
}