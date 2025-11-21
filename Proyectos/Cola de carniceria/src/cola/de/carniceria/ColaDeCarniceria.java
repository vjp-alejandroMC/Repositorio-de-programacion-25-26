/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cola.de.carniceria;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 07/11/2025
 */
public class ColaDeCarniceria {
    
    public final static char LETRA_INICIAL = 'A';
    public final static char LETRA_FINAL = 'C';
    public static int NUMERO_COMPRA = 1;
    public static int NUMERO_PEDIDO = 1;
    
    private static final Scanner entrada = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        mostrarMenu();
        
        int opcion = pedirOpcion();
        
        
        String esperaCompra = generarNumeroEsperaCompra();
        String esperaPedido = generarNumeroEsperaPedido();
        
        //Son las distintas opciones que sucederan en base a la opción que elija el usuario.
        switch (opcion) {
            
            case 1: {
                //En el primer caso el programa genera un número y una letra aleatoria para mostrar el número del pedido y el mostrador que atenderá al usuario.
                generarNumeroEsperaCompra();
                generarLetraAleatoria(LETRA_INICIAL, LETRA_FINAL);
                
                System.out.println(esperaCompra);
                
                break;
            }
            
            case 2: {
                //Parecido al caso 1 solo que aquí se hace con el número del pedido.
                generarNumeroEsperaPedido();
                generarLetraAleatoria(LETRA_INICIAL, LETRA_FINAL);
                
                System.out.println(esperaPedido);
                
                break;
            }
            
            case 3: {
                //Al darle a la opción 3 el código deja de ejecutarse.
                break;
            }
        }
        
    }
    
    public static void mostrarMenu() {
        
        //Muestra el menú.
        System.out.println("Menu:");
        System.out.println("1. Comprar");
        System.out.println("2. Recoger pedido");
        System.out.println("3. Salir");
        
    }
    
    public static int pedirOpcion() {
        
    while (!entrada.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingresa un número.");
            entrada.next();
            System.out.print("Elige una opción: ");
        }
        int opcion = entrada.nextInt();
        
        return opcion;
    }
    
    public static char generarLetraAleatoria(char LETRA_INICIAL, char LETRA_FINAL) {
        
        int codigoletra = (int) ((Math.random()) * (65 - 67 + 1)) + 65;
        LETRA_INICIAL = (char) codigoletra;
        
        System.out.println(LETRA_INICIAL);
        
        return LETRA_INICIAL;
    }
    
    public static void incrementarNumeroCompra() {
        
        //Incrementa en 1 el número de la compra.
       NUMERO_COMPRA++;
    }
    
    public static void incrementarNumeroPedido() {
        
        //Incrementa en 1 el número del pedido.
       NUMERO_PEDIDO++;
    }
    
    public static String generarNumeroEsperaCompra() {
        
        String resultadocompra = "C-" + NUMERO_COMPRA;
        incrementarNumeroCompra();
        return resultadocompra;
    }
    
    public static String generarNumeroEsperaPedido() {
        
        String resultadopedido = "P-" + NUMERO_PEDIDO;
        incrementarNumeroPedido();
        return resultadopedido;
    }
}
