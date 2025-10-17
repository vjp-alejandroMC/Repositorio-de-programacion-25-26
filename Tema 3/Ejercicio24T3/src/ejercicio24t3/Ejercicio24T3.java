/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24t3;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 17/10/2025
 */
public class Ejercicio24T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner entrada = new Scanner(System.in);
        int numero = 0;
        boolean numeroValido = false;

        //Se pide un número mayor que 0
        while (!numeroValido) {
            try {
                System.out.print("Introduce un numero mayor que 0: ");
                numero = entrada.nextInt();

                if (numero > 0) {
                    numeroValido = true;
                } else {
                    System.out.println("Error: El numero debe ser mayor que 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un numero entero.");
                entrada.next(); // limpiar el buffer
            }
        }

        //Aquí se muestran los múltiplos de 3
        int contador = 0;
        System.out.println("\nMultiplos de 3 entre 1 y " + numero + ":");

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }

        //Y aquí se muestran el total de múltiplos encontrados
        System.out.println("\n\nTotal de numeros multiplos de 3 mostrados: " + contador);

        entrada.close();
    }
}