/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14t4;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 30/10/2025
 */
public class Ejercicio14T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        while (!esMayorQueCero(numero)) {
            System.out.println("Error: Debes introducir un numero mayor que 0.");
            numero = pedirNumero();
        }
        mostrarMultiplosDeTres(numero);
    }

    // Método para pedir el dato al usuario
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero mayor que 0: ");
        return entrada.nextInt();
    }

    // Método para comprobar que es mayor que 0
    public static boolean esMayorQueCero(int num) {
        return num > 0;
    }

    // Método para hacer cálculos y mostrar resultados
    public static void mostrarMultiplosDeTres(int num) {
        int contador = 0;
        System.out.println("Multiplos de 3 entre 1 y " + num + ":");

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                contador++;
            }
        }
        
        System.out.println("Total de multiplos mostrados: " + contador);
    
    }
}
