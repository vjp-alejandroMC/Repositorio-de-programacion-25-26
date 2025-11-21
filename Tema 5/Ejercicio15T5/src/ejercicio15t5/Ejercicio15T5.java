/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15t5;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 20/11/2025
 */
public class Ejercicio15T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creación de direcciones.
        Direccion d1 = new Direccion("Calle caganchilla", 6, 1, "Cabezabellosa");
        Direccion d2 = new Direccion("Calle San Jose", 6, 1, "SanGil");
        Direccion d3 = new Direccion("Calle avenida de la bondad", 11, 3, "Caceres");
        
        //Creación de empleados.
        Empleado e1 = new Empleado("Alejandro", 2143, d2);
        Empleado e2 = new Empleado("Jesus", 1103, d3);
        Empleado e3 = new Empleado("Carmen", 3025, d1);
        
        e1.mostrarDatos();
        e2.mostrarDatos();
        e3.mostrarDatos();
    }
    
}
