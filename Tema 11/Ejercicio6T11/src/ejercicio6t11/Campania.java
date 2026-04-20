/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6t11;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 19/03/2026
 */
public class Campania {
    
    private String donaciones;
    private String nombre;

    public Campania(String donaciones, String nombre) {
        this.donaciones = donaciones;
        this.nombre = nombre;
    }

    public String getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(String donaciones) {
        this.donaciones = donaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Campania{" + "donaciones=" + donaciones + ", nombre=" + nombre + '}';
    }
    
}
