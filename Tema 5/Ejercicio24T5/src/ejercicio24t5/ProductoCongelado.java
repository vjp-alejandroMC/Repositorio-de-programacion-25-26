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
public class ProductoCongelado extends Producto {
    //Atributos de la clase.
    private double temperatura;
    
    //Constructor de la clase.
    public ProductoCongelado(String caducidad, String lote, double temp) {
        super(caducidad, lote);
        this.temperatura = temp;
    }
    
    //Getters y setters.
    public double getTemperatura() {
        return temperatura;
    }
    
    public void setTemperatura(double temp) {
        this.temperatura = temp;
    }
    
    //Método para mostrar los datos del producto.
    @Override
    public void mostrarInformacion() {
        System.out.println("PRODUCTO CONGELADO");
        super.mostrarInformacion();
        System.out.println("Temperatura recomendada: " + temperatura + " grados celsius");
    }
}
