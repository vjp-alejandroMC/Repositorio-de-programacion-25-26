/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra6dinamicoprog;
import java.util.*;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 20/04/2026
 */
public class Deporte {
    
    //Atributos de la clase.
    private String nombre;
    private Set<Equipo> equipos;

    //Constructor de la clase.
    public Deporte(String nombre) {
        this.nombre = nombre;
        this.equipos = new HashSet<>();
    }

    //Getters y setters de la clase.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEquipo(Equipo e) {
        equipos.add(e);
    }

    public HashSet<Equipo> getEquipos() {
        return (HashSet<Equipo>) equipos;
    }

    //Metodo toString de la clase.
    @Override
    public String toString() {
        return "Deporte " + " nombre = " + nombre + ", equipos = " + equipos;
    }
    
}
