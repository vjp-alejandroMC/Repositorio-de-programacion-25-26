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
public class Televisor {
    
    //Atributos de la clase.
    private boolean encendido;
    private int canal;
    private int volumen;

    //Constructores de la clase.
    public Televisor() {
        encendido = false;
        canal = 1;
        volumen = 10;
    }

    public Televisor(boolean encendido, int canal, int volumen) {
        this.encendido = false;
        this.canal = canal;
        this.volumen = volumen;
    }
    
    //Getters y setters de la clase.
    public void setCanal(int can) {
        canal = can;
    }
    
    public int getCanal() {
        return canal;
    }
    
    public void setVolumen(int vol) {
        volumen = vol;
    }
    
    public int getVolumen() {
        return volumen;
    }
    
    //Método propio.
    public boolean estaEncendido() {
        return encendido;
    }
    
    //Implementación de la interfaz.
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Canal: " + canal);
        }
    }
    
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("La television se apagara en 10s");
        }
    }
    
    public void bajarVolumen() {
        if (encendido) {
            volumen--;
            System.out.println("Volumen: " + volumen);
        }
    }
    
    public void subirVolumen() {
        if (encendido) {
            volumen++;
            System.out.println("Volumen: " + volumen);
        }
    }
    
    public void cambiarCanal(float canal) {
        if (encendido) {
            this.canal = (int) canal;
            System.out.println("Canal actual: " + this.canal);
        }
    }
    
    @Override
    public String toString() {
        return  "Television" +
                "\nEncendido: " + encendido +
                "\nCanal: " + canal +
                "\nVolumen: " + volumen +
                "\n------------------------------";
    }
}