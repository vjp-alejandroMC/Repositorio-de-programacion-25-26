/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14t10;

/**
 *
 * @author alumno
 */
public class Alumno {

    private String nombre;
    private Asignatura[] asignaturas;

    public Alumno(String nombre, Asignatura[] asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public float calcularMedia() {

        float suma = 0;

        for (Asignatura a : asignaturas) {
            suma += a.getNota();
        }

        return suma / asignaturas.length;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", asignaturas=" + asignaturas + '}';
    }
    
}
