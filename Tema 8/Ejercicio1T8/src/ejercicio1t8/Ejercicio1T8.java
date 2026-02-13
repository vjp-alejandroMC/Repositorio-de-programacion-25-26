/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1t8;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 26/01/2026
 */
public class Ejercicio1T8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        

        Scanner entrada = new Scanner(System.in);

        Asignaturas[] asignaturas = new Asignaturas[6];

        asignaturas[0] = new Asignaturas("Programación");
        asignaturas[1] = new Asignaturas("Lenguajes de Marcas");
        asignaturas[2] = new Asignaturas("Bases de Datos");
        asignaturas[3] = new Asignaturas("Entornos de Desarrollo");
        asignaturas[4] = new Asignaturas("Sistemas Informáticos");
        asignaturas[5] = new Asignaturas("Formación y Orientación Laboral");

        for (Asignaturas a : asignaturas) {
            a.introducirNota(entrada.nextInt());
        }

        double media = calcularMedia(asignaturas);

        System.out.println("Su nota media del curso es de: " + media);

        entrada.close();
    }

    public static double calcularMedia(Asignaturas[] asignaturas) {
        double suma = 0;

        for (Asignaturas a : asignaturas) {
            suma += a.getNota();
        }

        return suma / asignaturas.length;
    }

}