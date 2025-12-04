/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4t6;

/**
 *
 * @author alumno
 */
public class León extends Felino {

    public León() {
        super();
    }

    public León(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String getSonido() {
        return "Rugido";
    }

    @Override
    public String getAlimentacion() {
        return "Carnivora";
    }

    @Override
    public String getHabitat() {
        return "Sabana";
    }

    @Override
    public String getNombreCientifico() {
        return "Panthera leo";
    }
}