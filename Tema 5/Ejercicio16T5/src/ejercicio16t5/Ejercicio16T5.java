/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16t5;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 21/11/2025
 */
public class Ejercicio16T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno a1 = crearAlumno();
        Alumno a2 = crearAlumno();
        Alumno a3 = crearAlumno();
        
        
        mostrarAlumno(a1);
        mostrarAlumno(a2);
        mostrarAlumno(a3);
    }
    
    //Método para crear el alumno.
    public static Alumno crearAlumno() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del alumno: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Introduce la nota (0-10)");
        int nota = entrada.nextInt();
        entrada.nextLine();
        
        return new Alumno(nombre, nota);
    }
    
    //Método para mostrar los datos del alumno.
    public static void mostrarAlumno(Alumno a) {
        a.mostrarNotas();
    }
}