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
public class ProductoFresco extends Producto {
    
    //Atributos de la clase.
    private String envasado;
    private String pais;
    
    //Constructor de la clase.
    public ProductoFresco(String caducidad, String lot, String env, String pai) {
        super(caducidad, lot);
        this.envasado = env;
        this.pais = pai;
    }
    
    //Getters y setters.
    @Override
    public String getCaducidad() {
        return envasado;
    }
    
    public void setCaducidad(String cad) {
        this.caducidad = cad;
    }
    
    public String getPais() {
        return pais;
    }
    
    public void setPais(String pai) {
        this.pais = pai;
    }
    
    //Método para mostrar los datos del producto
    @Override
    public void mostrarInformacion() {
        System.out.println("PRODUCTO FRESCO");
        super.mostrarInformacion();
        System.out.println("Fecha de envasado: " + envasado);
        System.out.println("Pais de origen: " + pais);
    }
}
