/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16t3;

/**
 *
 * @author alumno
 */
public class Ejercicio16T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;

        System.out.println("Numeros impares entre 20 y 160:\n");
        //Aquí lo que hago es empezar el bucle en 21 ya que es el primer número impar entre 20 y 160, después indico que se sume 2 hasta que el número sobrepase 160.
        for (int i = 21; i < 160; i += 2) {
            System.out.println(i);
            contador++;
        }

        System.out.println("\nTotal de numeros impares impresos: " + contador);
    }
    
}
