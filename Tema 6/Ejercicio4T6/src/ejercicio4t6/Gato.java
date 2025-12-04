/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4t6;

/**
 *
 * @author alumno
 */
public class Gato extends Felino {

    public Gato() {
        super();
    }

    public Gato(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String getSonido() {
        return "Maullido";
    }

    @Override
    public String getAlimentacion() {
        return "Ratones";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }
}