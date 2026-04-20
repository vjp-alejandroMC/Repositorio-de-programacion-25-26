/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6t11;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 19/03/2026
 */
public class Ejercicio6T11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
        int opcion;
        
        do {
            
            System.out.println("1. Donar.");
            System.out.println("2. Mostrar donaciones.");
            System.out.println("3. Mostrar donaciones por nombre de donante.");
            System.out.println("4. Mostrar número de donaciones.");
            System.out.println("5. Mostrar dinero recaudado.");
            System.out.println("6. Ordenar donaciones.");
            System.out.println("7. Salir del programa.");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    ponerDonacion();
                    break;
                
                case 2:
                    mostrarDonaciones();
                    break;
                    
                case 3:
                    mostrarDonacionesPorNombre();
                    break;
                    
                case 4:
                    mostrarNumDonaciones();
                    break;
                    
                case 5:
                    mostrarRecaudado();
                    break;
                    
                case 6:
                    ordenarDonaciones();
                    System.out.println("Las donaciones se ordenaron de mayor a menor.");
                    break;
                    
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Error: elige una opcion valida.");
                    break;
            }
            
        } while (opcion != 7);
        
    }
    
    public static void ponerDonacion() {
        
        
        
    }
    
    public static void mostrarDonaciones() {
        
        
        
    }
    
    public static void mostrarDonacionesPorNombre() {
        
        
        
    }
    
    public static void mostrarNumDonaciones() {
        
        
        
    }
    
    public static void mostrarRecaudado() {
        
        
        
    }
    
    public static void ordenarDonaciones() {
        
        
    }
    
}
