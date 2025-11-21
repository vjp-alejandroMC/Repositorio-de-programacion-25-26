/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24t5;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 21/11/2025
 */
public class Ejercicio24T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creación de los objetos.
        ProductoFresco fresco = new ProductoFresco("12/12/2025", "F123", "01/12/2025", "Espanya");
        
        ProductoRefrigerado refrigerado = new ProductoRefrigerado("10/08/2026", "F231", "ORG-2025-55");
                
        ProductoCongelado congelado = new ProductoCongelado("20/01/2027", "G534", -18);  
        
        //Manera de mostrar los datos.
        fresco.mostrarInformacion();
        System.out.println();
        refrigerado.mostrarInformacion();
        System.out.println("");
        congelado.mostrarInformacion();
        System.out.println();
        
    }
    
}
