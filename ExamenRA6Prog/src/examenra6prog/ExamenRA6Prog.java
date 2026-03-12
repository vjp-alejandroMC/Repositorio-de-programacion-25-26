/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra6prog;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 09/03/2026
 */
public class ExamenRA6Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración del escaner.
        Scanner entrada = new Scanner(System.in);
        
        //Estructuras de datos.
        Coche[] coches = new Coche[9];
        
        String[][] estado = new String[3][3];
        
        //Métodos de la clase main.
        mostrarMenu(entrada, coches, estado);
        
    }
    
    public static void mostrarMenu(Scanner entrada, Coche[] coches, String[][] estado) {
        
        int opcion;
        
        //Menú usando do while.
        do {
            
            System.out.println("1. Aparcar coche.");
            System.out.println("2. Mostrar plazas libres.");
            System.out.println("3. Mostrar datos de todos los coches aparcados.");
            System.out.println("4. Buscar titulares.");
            System.out.println("5. Buscar coche por matricula.");
            System.out.println("6. Mostrar el estado de las plazas");
            System.out.println("7. Salir del programa.");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    aparcarCoche(entrada, coches);
                    System.out.println("Coche aparcado");
                    break;
                    
                case 2:
                    System.out.println("Mostrando plazas libres...");
                    mostrarPlazasLibres(coches, entrada, true);
                    break;
                    
                case 3:
                    System.out.println("Mostrando datos de coches aparcados...");
                    mostrarAparcados();
                    break;
                    
                case 4:
                    buscarTitulares(entrada, coches);
                    break;
                    
                case 5:
                    buscarMatricula(entrada);
                    break;
                    
                case 6:
                    mostrarEstadoPlazas(coches, estado);
                    break;
                    
                default:
                    System.out.println("Error: elige una opcion valida.");
                    break;
                    
            }
            
        }
        while (opcion != 7);
        
    }
    
    //Métodos del programa
    public static boolean aparcarCoche(Scanner entrada, Coche[] coches) {
        
        boolean aparcado = false;
        
        String titular;
        String matricula;
        int posicion = 0;
        Coche coche = coches[posicion];
        
        System.out.println("En que posicion quiere aparcar el coche (entre 0 y 8).");
        posicion = entrada.nextInt();
        
        System.out.println("Nombre del titular: ");
        titular = entrada.nextLine();
            
        System.out.println("Matricula del coche: ");
        matricula = entrada.nextLine();
            
        aparcado = true;
        
        
        return aparcado;
        
    }
    
    public static void mostrarPlazasLibres(Coche[] coches, Scanner entrada, boolean aparcado) {
        
        boolean libre = aparcado;
        
            for (int i = 0; i < coches.length; i++) {
                
                if (libre = true) {
                    
                    System.out.println("La plaza " + i + " esta libre.");
                
                }
            }
    }
    
    public static void mostrarAparcados() {
        
        
        
    }
    
    public static void buscarTitulares(Scanner entrada, Coche[] coches) {
        
        String titular = entrada.nextLine();
        
        titular.charAt(0);
        
        String resultado;
        
        
    }
    
    public static void buscarMatricula(Scanner entrada) {
        
        String matricula = entrada.nextLine();
        
        
        
    }
    
    public static void mostrarEstadoPlazas(Coche[] coches, String[][] estado) {
        
        
        
        for (int i = 0; i < estado.length; i++) {
            for (int j = 0; j < estado[i].length; j++) {
                
                System.out.println();
                
            }
        }
        
    }
    
}
