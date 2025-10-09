/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9t3;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 09/10/2025
 */
public class Ejercicio9T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, c, d, temp;

        System.out.print("Por favor, introduzca el primer numero: ");
        a = entrada.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        b = entrada.nextInt();

        System.out.print("Introduzca el tercer numero: ");
        c = entrada.nextInt();

        System.out.print("Por ultimo, introduzca un cuarto numero: ");
        d = entrada.nextInt();

        // Ordenamiento con if
        if (a > b) { temp = a; a = b; b = temp; }
        if (a > c) { temp = a; a = c; c = temp; }
        if (a > d) { temp = a; a = d; d = temp; }
        if (b > c) { temp = b; b = c; c = temp; }
        if (b > d) { temp = b; b = d; d = temp; }
        if (c > d) { temp = c; c = d; d = temp; }

        System.out.println("El orden de los numeros introducidos es el " +
                a + " - " + b + " - " + c + " - " + d);

        entrada.close();
    }
}