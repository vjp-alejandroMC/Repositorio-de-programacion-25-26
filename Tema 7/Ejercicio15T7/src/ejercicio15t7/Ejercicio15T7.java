/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15t7;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 12/01/2026
 */
public class Ejercicio15T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int[] ventas = new int[12];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
        "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"    
        };
        
        int opcion;
        boolean ventasRellenas = false;
        
        do {
            System.out.println("\nMENU");
            System.out.println("1. Rellenar ventas mensuales");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Mostrar ventas al reves");
            System.out.println("4. Mostrar suma total de ventas");
            System.out.println("5. Mostrar ventas de meses pares");
            System.out.println("6. Mostrar mes con mas ventas");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {

                case 1:
                    rellenarVentas(ventas);
                    ventasRellenas = true;
                    System.out.println("Ventas generadas correctamente.");
                    break;

                case 2:
                    if (ventasRellenas)
                        mostrarVentas(ventas, meses);
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 3:
                    if (ventasRellenas)
                        mostrarVentasReves(ventas, meses);
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 4:
                    if (ventasRellenas)
                        System.out.println("Total de ventas del año: " + sumarVentas(ventas));
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 5:
                    if (ventasRellenas)
                        mostrarVentasMesesPares(ventas, meses);
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 6:
                    if (ventasRellenas)
                        mostrarMesMayorVenta(ventas, meses);
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while (opcion != 7);
    }
    
    public static void rellenarVentas(int[] ventas) {
        
        int i;
        
        for (i = 0; i < ventas.length; i++) {
            ventas[i] = (int) (Math.random() * 91) + 10;
        }
    }
    
    public static void mostrarVentas(int[] ventas, String[] meses) {
        
        int i;
        
        for (i = 0; i < ventas.length; i++) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }
    
    public static void mostrarVentasReves(int[] ventas, String[] meses) {
        for (int i = ventas.length - 1; i >= 0; i--) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }
    
    public static int sumarVentas(int[] ventas) {
        
        int suma = 0;
        
        for (int v : ventas) {
            suma += v;
        }
        return suma;
    }
    
    public static void mostrarVentasMesesPares(int[] ventas, String[] meses) {
        
        int i;
        
        for (i = 1; i < ventas.length; i += 2) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }
    
    public static void mostrarMesMayorVenta(int[] ventas, String[] meses) {
        
        int max = ventas[0];
        int pos = 0;
        int i;
        
        for (i = 1; i < ventas.length; i++) {
            if (ventas[i] > max) {
                max = ventas[i];
                pos = i;
            }
        }
        System.out.println("El mes con mas ventas es " + meses[pos] + " con " + max + " coches.");
    }
}
