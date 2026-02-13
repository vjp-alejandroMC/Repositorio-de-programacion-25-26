/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1t8;

/**
 *
 * @author alumno
 */
public class Asignaturas {    

    private String asignatura;
    private float nota;

    // Constructor: nombre fijo, nota inicial
    public Asignaturas(String asignatura) {
        this.asignatura = asignatura;
        this.nota = 0;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public float getNota() {
        return nota;
    }

    // Método para introducir la nota
    public void introducirNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Asignaturas{" + "asignatura=" + asignatura + ", nota=" + nota + '}';
    }
    
    
    
}