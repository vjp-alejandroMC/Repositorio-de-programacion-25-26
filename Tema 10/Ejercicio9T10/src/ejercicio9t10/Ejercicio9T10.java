/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9t10;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9T10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int opcion;
        
        do {
            
            System.out.println("1. Rellerar las temperaturas de los días.");
            System.out.println("2. Mostrar las temperaturas.");
            System.out.println("3. Mostrar la temperatura media del mes.");
            System.out.println("4. Mostrar el dia mas caluroso.");
            System.out.println("5. Salir del programa.");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Rellenando temperaturas...");
                    rellenarTemp();
                    break;
                    
                case 2:
                    mostrarTemp();
                    break;
                    
                case 3:
                    tempMedia();
                    break;
                    
                case 4:
                    diaMasCaluroso();
                    break;
                    
                case 5:
                    System.out.println("Saliendo del programa...");
                    
                default:
                    System.out.println("Error, elige una opcion valida.");
                    break;
            }
            
        }
        while (opcion != 5);
    }
    
    public static void rellenarTemp() {
        
    }
    
    public static void mostrarTemp() {
        
    }
    
    public static void tempMedia() {
        
    }
    
    public static void diaMasCaluroso() {
        
    }
    
}
