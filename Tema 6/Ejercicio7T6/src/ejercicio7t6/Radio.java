/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7t6;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 05/12/2025
 */
public class Radio {
    
    //Atributos de la clase.
    private boolean encendido;
    private float emisora;
    private int volumen;
    
    //Constructores de la clase.
    public Radio() {
        encendido = false;
        emisora = (float) 80.0;
        volumen = 15;
    }
    
    public Radio(boolean encendido, float emisora, int volumen) {
        this.encendido = encendido;
        this.emisora = emisora;
        this.volumen = volumen;
    }
    
    //Getters y setters de la clase.
    public void setEmisora(float emi) {
        emisora = emi;
    }
    
    public float getEmisora() {
        return emisora;
    }
    
    public void setVolumen(int vol) {
        volumen = vol;
    }
    
    public int getVolumen() {
        return volumen;
    }
    
    //Método propio
    public boolean estaEncendida() {
        return encendido;
    }
    
    //Implementación de la interfaz
    public void encender() {
        if (!encendido) {
            encendido = true;
        }
    }
    
    public void apagar() {
        if (encendido) {
            encendido = false;
        }
    }
    
    public void bajarVolumen() {
        if (encendido) {
            volumen--;
        }
    }
    
    public void subirVolumen() {
        if (encendido) {
            int name = volumen + 1;
        }
    }
    
    public void cambiarCanal(float canal) {
        if (encendido) {
            this.emisora = canal;
        }
    }
    
    //toString.
    @Override
    public String toString() {
        return "Radio" +
                "\nEncendido: " + encendido +
                "\nEmisora: " + emisora +
                "\nVolumen: " + volumen +
                "\n---------------------------";
    }
}
