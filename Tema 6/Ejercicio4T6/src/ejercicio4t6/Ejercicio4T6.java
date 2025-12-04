/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4t6;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 04/12/2025
 */
public class Ejercicio4T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("=== INSTANCIACION NORMAL ===");

        Perro perro = new Perro("Firulais", 3, 20.82);
        Lobo lobo = new Lobo("Midna", 5, 41.5);
        León leon = new León("Simba", 6, 259.92);
        Gato gato = new Gato("Michi", 2, 5.67);

        System.out.println(perro);
        System.out.println(lobo);
        System.out.println(leon);
        System.out.println(gato);

        System.out.println("=== POLIMORFISMO ===");

        Animal a1 = new Perro("Rocky", 4, 34);
        Animal a2 = new Lobo("Link", 7, 67);
        Animal a3 = new León("Scar", 8, 303);
        Animal a4 = new Gato("Luna", 1, 4.51);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
    
}
