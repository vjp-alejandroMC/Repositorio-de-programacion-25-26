/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24t5;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 21/11/2025
 */

//Uso de "extends" para las herencias.
public class ProductoRefrigerado extends Producto {
    //Atributos de la clase.
    private String organismo;
    
    //Constructor de la clase.
    public ProductoRefrigerado(String caducidad, String lote, String organismo) {
        super(caducidad, lote);
        this.organismo = organismo;
    }
    
    //Getters y setters.
    public String getOrganismo() {
        return organismo;
    }
    
    public void setOrganismo(String org) {
        this.organismo = org;
    }
    
    //Método para mostrar la información del producto.
    @Override
    public void mostrarInformacion() {
        System.out.println("PRODUCTO REFRIGERADO");
        super.mostrarInformacion();
        System.out.println("Codigo organismo supervision: " + organismo);
    }
}
