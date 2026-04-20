/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16t10;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 13/03/2026
 */
public class Ejercicio16T10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int opcion2;
        int opcion3;
        
        do {
            
            System.out.println("1. Menu de administracion.");
            System.out.println("2. Menu de compra.");
            System.out.println("3. Salir del programa.");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    do {
                        
                        System.out.println("1. Introducir productos en las listas.");
                        System.out.println("2. Visualizar la lista de productos.");
                        System.out.println("3. Eliminar productos de la lista.");
                        System.out.println("4. Volver al menu principal.");
                        
                        opcion2 = entrada.nextInt();
                        
                        switch (opcion2) {
                            case 1:
                                introducirProductos();
                                break;
                                
                            case 2:
                                visualizarProductos();
                                break;
                                
                            case 3:
                                eliminarLista();
                                break;
                                
                            case 4:
                                System.out.println("Volviendo al menu principal...");
                                break;
                                
                            default:
                                System.out.println("Error: elige una opcion valida.");
                                break;
                                
                        }
                        
                    }
                    while (opcion2 !=4);
                    break;
                
                case 2:
                    do {
                        
                        System.out.println("1. Comprar productos.");
                        System.out.println("2. Volver al menu principal");
                        
                        opcion3 = entrada.nextInt();
                        
                        switch (opcion3) {
                            case 1:
                                comprarProductos();
                                break;
                            
                            case 2:
                                System.out.println("Volviendo al menu principal...");
                                break;
                                
                            default:
                                System.out.println("Error: elige una opcion valida.");
                                
                        }
                        
                    }
                    while (opcion3 != 2);
                
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                
                default:
                    System.out.println("Error: elige una opcion valida.");
                    break;
            }
            
        }
        while (opcion != 3);
        
    }
    
    public static void introducirProductos() {
        
        ArrayList<String> lista;
        Producto p = new Producto(nombre, 0, 0);
        
    }
    
    public static void visualizarProductos() {
        
        
        
    }
    
    public static void eliminarLista() {
        
        
        
    }
    
    public static void comprarProductos() {
        
        
        
    }
    
}
