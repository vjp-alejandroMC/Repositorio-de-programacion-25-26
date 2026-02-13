/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6t8;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 */
public class Empleado {
    
    private String nombre;
    private int numhoras;

    public Empleado(String nombre, int numhoras) {
        this.nombre = nombre;
        this.numhoras = numhoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumhoras() {
        return numhoras;
    }

    public void setNumhoras(int numhoras) {
        this.numhoras = numhoras;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numhoras=" + numhoras + '}';
    }
    
    public static void tarifaEmpleado() {
        
        Scanner entrada = new Scanner(System.in);
        
        
        
    }
        
}
