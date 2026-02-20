/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectomonedasra6;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 20/02/2026
 */
public class ProyectoMonedasRA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Array donde se guardan las 9 monedas.
        Moneda[] vmonedas = new Moneda[9];
        
        int opcion;
        
        //Bucle do while para Que se repita el menú hasta que el usuario elija la opción 4.
        do {
            
            //Muestra el menú.
            System.out.println("\n--- MENU ---");
            System.out.println("1. Rellenar los datos de las monedas");
            System.out.println("2. Mostrar las monedas fabricadas con el mismo material.");
            System.out.println("3. Mostrar la moneda mas valiosa.");
            System.out.println("4. Salir del programa.");
            
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            //Switch con las opciones del menú.
            switch (opcion) {
                case 1:
                    datosMoneda(vmonedas, entrada);
                    break;
                    
                case 2:
                    System.out.println("¿Que material quieres buscar?");
                    String material = entrada.nextLine();
                    mostrarMaterial(vmonedas, material);
                    break;
                    
                case 3:
                    mostrarValiosa(vmonedas);
                    break;
                    
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opcion incorrecta.");
                    
            }
        } while (opcion != 4);
        
    }
    
    //Métodos del programa.
    //Método que rellena los valores de las monedas.
    public static void datosMoneda(Moneda[] vmonedas, Scanner entrada) {
        
        int valor;
        String pais;
        String material;
        
        //Bucle que recorre todas las posiciones del array para introducir los datos.
        for (int i = 0; i < vmonedas.length; i++) {
            
            System.out.println("Moneda " + (i + 1));
            
            System.out.println("Valor: ");
            valor = entrada.nextInt();
            entrada.nextLine();
            
            System.out.println("Pais: ");
            pais = entrada.nextLine();
            
            System.out.println("Material: ");
            material = entrada.nextLine();
            
            vmonedas[i] = new Moneda(valor, pais, material);
        }
        
    }
    
    //Método que muestra el material con el que estan hechas las monedas que busque el usuario.
    public static void mostrarMaterial(Moneda[] vmonedas, String materialBuscado) {
        
        boolean encontrado = false;
        
        //Bucle que busca el valor del atributo material, lo comprueba con un boolean e imprime todas las monedas con el mismo material.
        for (Moneda m : vmonedas) {
            
            if (m != null && m.getMaterial().equalsIgnoreCase(materialBuscado)) {
                
                System.out.println(m);
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            
            System.out.println("No hay monedas de ese material.");
        }
        
    }
    
    //Método que muestra la moneda más valiosa
    public static void mostrarValiosa(Moneda[] vmonedas) {
        
        Moneda mayor = null;
        
        //Bucle que compara los valores de cada moneda hasta encontrar el más alto y así imprimirlo.
        for (Moneda v : vmonedas) {
            
            if (v != null) {
                
                if (mayor == null || v.getValor() > mayor.getValor()) {
                    
                    mayor = v;
                }
            }
        }
        
        if (mayor != null) {
            
            System.out.println("La moneda mas valiosa es: ");
            System.out.println(mayor);
            
        } else {
            
            System.out.println("Aun no hay monedas guardadas.");
            
        }

    }
    
}
