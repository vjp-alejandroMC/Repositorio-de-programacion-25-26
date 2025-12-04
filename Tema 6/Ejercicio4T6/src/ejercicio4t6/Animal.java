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
public abstract class Animal {

    private String nombre;
    private int edad;
    private double peso;

    //Constructor por defecto.
    public Animal() {
        nombre = "";
        edad = 0;
        peso = 0;
    }

    //Constructor con parámetros.
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    //Getters y Setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Métodos abstractos.
    public abstract String getSonido();
    public abstract String getAlimentacion();
    public abstract String getHabitat();
    public abstract String getNombreCientifico();

    //toString sobrescrito.
    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nEdad: " + edad +
               "\nPeso: " + peso +
               "\nSonido: " + getSonido() +
               "\nAlimentacion: " + getAlimentacion() +
               "\nHabitat: " + getHabitat() +
               "\nNombre Cientifico: " + getNombreCientifico() +
               "\n-----------------------------";
    }
}