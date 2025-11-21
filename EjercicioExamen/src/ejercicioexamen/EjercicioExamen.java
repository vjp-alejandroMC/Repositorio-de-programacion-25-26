/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexamen;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 17/11/2025
 */
public class EjercicioExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1. Analizar la senyal recibida del espacio.");
        System.out.println("2. Ajustar las potencias de los motores antes del lanzamiento");
        System.out.println("3. Calcular el volumen de un planeta");
        
        //Elige la opción del menú
        eleccionMenu();

        }
    public static void eleccionMenu() {
         
        //Pide la opción con un método.
        int opcion = pedirOpcion();
        
        
        //Muestra el menú de opciones.
        switch (opcion) {
            case 1:
                //Llamada al método que calcula la frecuencia (se pide el número de la señal dentro del método).
                calcularFrecuencia();
                break;
                
            case 2:
                //Llamada al método que ordena las potencias (las potencias se ordenan dentro del método).
                pedirPotencias(0, 0, 0);
                break;
                
            case 3: 
                //Llamada al método que calcula el radio del planeta (se pide el radio dentro del método).
                calcularRadio();
                break;
                
            default:
                System.out.println("Elije una opcion valida");
        }
    }
    
    public static int pedirOpcion() {
        
        Scanner entrada = new Scanner(System.in);
        //Elije la opción con el scanner.
        System.out.println("Elije la opcion en numeros: ");
        int opcion = entrada.nextInt();
        //Devuelve la opción al main para elegir la opción del menú.
        return opcion;
    }
    
    public static int pedirFrecuencia() {
        
        //Pide la frecuencia con el Scanner
        System.out.println("Introduce la frecuencia de la senyal: ");
        Scanner entrada = new Scanner(System.in);
        
        int frecuencia = entrada.nextInt();
        
        //Devuelve la frecuencia al main para que se pueda usar en otros métodos
        return frecuencia;
    }
    
    public static void calcularFrecuencia() {
        
        int senyal = pedirFrecuencia();
        int i;
        
        //Calcula el primer número mayor que 1 que divide la frecuencia exactamente.
        for (i = 1; i <= senyal; i++) {
            if (i % senyal == 0) {
                System.out.println("La frecuencia es: " + i);
            }
        }


    }
    
    public static void pedirPotencias(int pot1, int pot2, int pot3) {
        
        Scanner entrada = new Scanner(System.in);
        //Pide las potencias con el Scanner.
        
        System.out.println("Elije la primera potencia: ");
        pot1 = entrada.nextInt();
        
        System.out.println("Elije la segunda potencia: ");
        pot2 = entrada.nextInt();
        
        System.out.println("Elije la tercera y ultima potencia: ");
        pot3 = entrada.nextInt();
        
        //Variable temporal para ordenar las potencias.
        int temp;
        
        //Forma de ordenar las potencias.
        if (pot1 < pot2) { temp = pot1; pot1 = pot2; pot2 = temp; }
        if (pot2 < pot3) { temp = pot2; pot2 = pot3; pot3 = temp; }
        if (pot2 > pot1) { temp = pot2; pot2 = pot1; pot1 = temp; }
        if (pot3 < pot1) { temp = pot3; pot3 = pot1; pot1 = temp; }
        
        System.out.println("El orden de las potencias es: " + pot1 + " , " + pot2 + " , " + pot3);
    }
    
    public static int pedirRadio() {
        
        Scanner entrada = new Scanner(System.in);
        //Pide el radio con el Scanner.
        
        System.out.println("Elije el radio del planeta (metros): ");
        int radio = entrada.nextInt();
        
        //Devuelve el radio al main para que se pueda usar en otros métodos.
        return radio;
    }
    
    public static void calcularRadio() {
        
        int radio = pedirRadio();
        double pi = Math.PI;
        //Uso Math.PI para indicar el número PI.
        
        //Calcula el volumen con la fórmula (multipliqué el radio 3 veces en un paréntesis para que estuviera al cubo).
        double resultado = 4/3 * pi * (radio * radio * radio);
        
        System.out.println("El volumen del planeta es: " + resultado + " metros cubicos");
    }
    
}