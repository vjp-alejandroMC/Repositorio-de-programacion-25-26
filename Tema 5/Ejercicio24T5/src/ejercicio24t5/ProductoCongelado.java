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
public class ProductoCongelado extends Producto {
    //Atributos de la clase.
    private double temperatura;
    
    public ProductoCongelado(String caducidad, String lote, double temp) {
        super(caducidad, lote);
        this.temperatura = temp;
    }
    
    public double getTemperatura() {
        return temperatura;
    }
    
    public void setTemperatura(double temp) {
        this.temperatura = temp;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("PRODUCTO CONGELADO");
        super.mostrarInformacion();
        System.out.println("Temperatura recomendada: " + temperatura + " grados celsius");
    }
}
