/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28t3;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 17/10/2025
 */
public class Ejercicio28T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Generador de números aleatorios entre 1 y 100.
        double aleatorio = (Math.random())*100+1;
        int aleatorioEntero = (int) aleatorio;
        
            //Comprobación de que el número aleatorio sea par.
            if (aleatorioEntero%2==0){
                System.out.println("El numero " + aleatorioEntero + " es par");
            }
            //Si no es par, dice que es impar.
            else
            System.out.println("El numero " + aleatorioEntero + " es  impar");   
    }
    
}
