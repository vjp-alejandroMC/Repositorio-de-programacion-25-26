/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16t5;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 21/11/2025
 */
public class Alumno {
    
    //Atributos del alumno.
    private String nombre;
    private int nota;
    
    //Constructores del alumno.
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public Alumno() {
        nombre = "";
        nota = 0;
    }
    
    public void setNombre(String nom) {
        nombre = nom;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public boolean notaValida() {
        return nota >= 0 && nota <= 10;
    }
    
    public void setNota(String nota) {
        nota = nota;
    }
    
    public int getNota() {
        return nota;
    }
    
    public String conseguirNota() {
        if (!notaValida()) {
            System.out.println("Nota fuera de rango");
        }
        if (nota < 4) return "Suspenso";
        if (nota < 6) return "Bien";
        if (nota < 8) return "Notable";
        return "Sobresaliente";
    }
    
    public void mostrarNotas() {
        if (!notaValida()) {
            System.out.println("Alumno: " + nombre + " Nota no valida");
        }
        else {
            System.out.println("Alumno: " + nombre);
            System.out.println("Nota: " + nota + " (" + getNota() + ")");
        }
        System.out.println("--------------------------------------");
    }
    
}