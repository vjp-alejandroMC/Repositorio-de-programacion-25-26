/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27t3;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 16/10/2025
 */
public class Ejercicio27T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        boolean salir = false;
        int opcion;

        try {
            // Pedir los dos números al usuario
            System.out.print("Introduce el primer numero: ");
            num1 = entrada.nextDouble();

            System.out.print("Introduce el segundo numero: ");
            num2 = entrada.nextDouble();

            // Bucle del menú
            while (!salir) {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Sumar los numeros");
                System.out.println("2. Restar los numeros");
                System.out.println("3. Multiplicar los numeros");
                System.out.println("4. Dividir los numeros");
                System.out.println("5. Salir del programa");
                System.out.print("Elige una opcion: ");

                try {
                    opcion = entrada.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Resultado: " + (num1 + num2));
                            break;
                        case 2:
                            System.out.println("Resultado: " + (num1 - num2));
                            break;
                        case 3:
                            System.out.println("Resultado: " + (num1 * num2));
                            break;
                        case 4:
                            try {
                                if (num2 == 0) {
                                    throw new ArithmeticException("Error: Division entre 0 no permitida.");
                                }
                                System.out.println("Resultado: " + (num1 / num2));
                            } catch (ArithmeticException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 5:
                            salir = true;
                            System.out.println("Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Opcion no valida. Intenta de nuevo.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar un numero entero para la opcion del menu.");
                    entrada.next(); // limpiar el buffer
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Debes introducir numeros.");
        } finally {
            entrada.close();
        }
    }
}
