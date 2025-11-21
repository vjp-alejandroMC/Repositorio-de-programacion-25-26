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
public class Producto {
    
    //Atributos de la super clase
    protected String caducidad;
    protected String lote;
    
    //Constructor de la super clase 
    public Producto(String cad, String lot) {
        this.caducidad = cad;
        this.lote = lot;
    }
    
    public String getCaducidad() {
        return caducidad;
    }
    
    public void setCaducida(String caducidad) {
    this.caducidad = caducidad;
    }
    
    public String getLote() {
        return lote;
    }
    
    public void setLote(String lote) {
        this.lote = lote;
    }
    
    //Método para mostrar la información.
    public void mostrarInformacion() {
        System.out.println("Fecha de caducidad: " + caducidad);
        System.out.println("Numero de lote: " + lote);
    }
}
