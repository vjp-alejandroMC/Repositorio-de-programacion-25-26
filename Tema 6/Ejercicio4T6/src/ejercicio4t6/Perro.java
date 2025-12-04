/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4t6;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 04/12/2025
 */
public class Perro extends Canino {

    public Perro() {
        super();
    }

    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String getSonido() {
        return "Ladrido";
    }

    @Override
    public String getAlimentacion() {
        return "Carnivora";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }
}