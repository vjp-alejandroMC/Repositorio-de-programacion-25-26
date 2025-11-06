/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17t4;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 31/10/2025
 */
public class Ejercicio17T4 {

    // Variables globales
    static char letraSecreta;
    static char letraUsuario;
    static int intentos = 0;

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        generarLetraAleatoria();
        jugar();
    }

    // Generar letra aleatoria sin return
    public static void generarLetraAleatoria() {
        int codigoLetra = (int)(Math.random() * (122 - 97 + 1)) + 97;
        letraSecreta = (char) codigoLetra;
    }

    // Pedir letra al usuario sin return
    public static void pedirLetra() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una letra minuscula: ");
        letraUsuario = entrada.nextLine().charAt(0);
    }

    // Lógica del juego
    public static void jugar() {
        System.out.println("Adivina la letra secreta entre 'a' y 'z'!");

        do {
            pedirLetra();
            intentos++;

            if (letraUsuario < letraSecreta) {
                System.out.println("La letra es posterior en el alfabeto.");
            } else if (letraUsuario > letraSecreta) {
                System.out.println("La letra es anterior en el alfabeto.");
            } else {
                System.out.println("Has adivinado la letra.");
                System.out.println("Numero de intentos: " + intentos);
            }

        } while (letraUsuario != letraSecreta);
    }
}