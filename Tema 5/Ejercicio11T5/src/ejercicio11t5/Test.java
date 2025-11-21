/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11t5;

import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 14/11/2025
 */
public class Test {

    public static void main(String[] args) {
        
        Numero numero1 = new Numero(pedirNumeros());
        
    }
    public static void sumarNumeros(int resultadosuma, int num1, int num2) {
        //Método para realizar la suma usando if.
        if (num1 <= 10) {
            resultadosuma = num1 + num2;
        }
    }
    
    public static void multiplicarNumeros(int resultadomul, int num1, int num2) {
        //Método para realizar la multiplicación usando if.
        if (num1 > 10) {
            resultadomul = num1 * num2;
        }
    }
    
    public static int pedirNumeros () {
        //Método para pedir los datos al usuario.
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        System.out.println("Introduce el primer numero: ");
        num1 = entrada.nextInt();
            
        return num1;
    }
}