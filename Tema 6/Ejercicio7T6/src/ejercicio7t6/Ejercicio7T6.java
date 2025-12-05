/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7t6;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 04/12/2025
 */
public class Ejercicio7T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("===== TELEVISOR =====");

        Televisor tv = new Televisor();
        tv.encender();
        System.out.println(tv);

        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();

        System.out.println("Volumen actual: " + tv.getVolumen());

        tv.cambiarCanal(5);
        tv.bajarVolumen();
        tv.apagar();

        System.out.println(tv);

        System.out.println("===== RADIO =====");

        Radio radio = new Radio();
        radio.encender();
        System.out.println(radio);

        radio.subirVolumen();
        radio.subirVolumen();
        radio.subirVolumen();

        System.out.println("Volumen actual: " + radio.getVolumen());

        radio.cambiarCanal(95.5f);
        radio.bajarVolumen();
        radio.apagar();

        System.out.println(radio);
    }
    
}
