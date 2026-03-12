/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14t10;

/**
 *
 * @author alumno
 */
public class Asignatura {

    private String nombre;
    private float nota;

    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
