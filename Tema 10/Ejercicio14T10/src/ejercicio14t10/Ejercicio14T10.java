/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14t10;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 10/03/2026
 */
public class Ejercicio14T10 {

    /**
     * @param args the command line arguments
     */

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Alumno> alumnos = new ArrayList<>();

    public static void main(String[] args) {

        int opcion;

        do {

            mostrarMenu();
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    introducirAlumno();
                    break;

                case 2:
                    mostrarAlumnos();
                    break;

                case 3:
                    mejorAlumno();
                    break;

                case 4:
                    asignaturaMasDificil();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 5);
    }
    
    public static void mostrarMenu() {

    System.out.println("\n1. Introducir alumno");
    System.out.println("2. Mostrar alumnos");
    System.out.println("3. Mejor alumno de la clase");
    System.out.println("4. Asignatura más difícil");
    System.out.println("5. Salir");
    System.out.print("Elige opción: ");
    
    }
    
    public static void introducirAlumno() {

    entrada.nextLine();

    System.out.print("Nombre del alumno: ");
    String nombre = entrada.nextLine();

    Asignatura[] asignaturas = new Asignatura[3];

    System.out.print("Nota Lengua: ");
    float lengua = entrada.nextFloat();

    System.out.print("Nota Mates: ");
    float mates = entrada.nextFloat();

    System.out.print("Nota Física: ");
    float fisica = entrada.nextFloat();

    asignaturas[0] = new Asignatura("Lengua", lengua);
    asignaturas[1] = new Asignatura("Mates", mates);
    asignaturas[2] = new Asignatura("Física", fisica);

    Alumno alumno = new Alumno(nombre, asignaturas);

    alumnos.add(alumno);
    
    }
    
    public static void mostrarAlumnos() {

    for (Alumno a : alumnos) {

        System.out.println("Alumno: " + a.getNombre());

        for (Asignatura as : a.getAsignaturas()) {
            System.out.println(as.getNombre() + ": " + as.getNota());
        }

        System.out.println("Media: " + a.calcularMedia());
        System.out.println("-------------------");
    }
}
    
    public static void mejorAlumno() {

    Alumno mejor = null;
    float mejorMedia = 0;

    for (Alumno a : alumnos) {

        if (a.calcularMedia() > mejorMedia) {
            mejorMedia = a.calcularMedia();
            mejor = a;
        }
    }

    if (mejor != null) {
        System.out.println("El mejor alumno es: " + mejor.getNombre());
        System.out.println("Media: " + mejorMedia);
    }
    
    }
    
public static void asignaturaMasDificil() {

    int suspensosLengua = 0;
    int suspensosMates = 0;
    int suspensosFisica = 0;

    for (Alumno a : alumnos) {

        Asignatura[] as = a.getAsignaturas();

        if (as[0].getNota() < 5) suspensosLengua++;
        if (as[1].getNota() < 5) suspensosMates++;
        if (as[2].getNota() < 5) suspensosFisica++;
    }

    if (suspensosLengua >= suspensosMates && suspensosLengua >= suspensosFisica) {
        System.out.println("La asignatura más difícil es Lengua");
    } else if (suspensosMates >= suspensosLengua && suspensosMates >= suspensosFisica) {
        System.out.println("La asignatura más difícil es Mates");
    } else {
        System.out.println("La asignatura más difícil es Física");
    }
    
    }
    
}

