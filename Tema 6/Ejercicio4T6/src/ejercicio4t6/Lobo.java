/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4t6;

/**
 *
 * @author alumno
 */
public class Lobo extends Canino {

    public Lobo() {
        super();
    }

    public Lobo(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String getSonido() {
        return "Aullido";
    }

    @Override
    public String getAlimentacion() {
        return "Carnivora";
    }

    @Override
    public String getHabitat() {
        return "Bosque";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus";
    }
}