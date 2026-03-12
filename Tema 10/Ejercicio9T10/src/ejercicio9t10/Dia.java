/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9t10;

/**
 *
 * @author alumno
 */
public class Dia {
    
    //Atributos de la clase.
    private String nombreDia;
    private int temperatura;

    //Constructor de la clase.
    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }

    //Getters y setters de la clase.
    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    //Metodo toString de la clase.
    @Override
    public String toString() {
        return "Dia{" + "nombreDia=" + nombreDia + ", temperatura=" + temperatura + '}';
    }
    
}
