/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15t5;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 20/11/2025
 */
public class Direccion {
    
    //Creación de los atributos.
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;
    
    //Creación de constructores.
    public Direccion(String cal, int num, int pis, String ciu) {
        this.calle = cal;
        this.numero = num;
        this.piso = pis;
        this.ciudad = ciu;
    }
    
    public Direccion() {
        calle = "";
        numero = 0;
        piso = 0;
        ciudad = "";
    }
    
    //Creación de los setters y getters.
    public void setCalle(String cal) {
        calle = cal;
    }
    
    public String getCalle() {
        return calle;
    }
    
    public void setNumero(int num) {
        numero = num;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setPiso(int pis) {
        piso = pis;
    }
    
    public int getPiso() {
        return piso;
    }
    
    public void setCiudad(String ciu) {
        ciudad = ciu;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    
    //Método para mostrar los datos de la dirección.
    public String mostrarDatosDireccion() {
        return calle + "Numero " + numero +  ", Piso " + piso + ", " + ciudad;
    }
}
