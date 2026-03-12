/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15t10;

/**
 *
 * @author alumno
 */
public class Empleado {

    private String nombreEmpleado;
    private int sueldo;

    public Empleado(String nombreEmpleado, int sueldo) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + ", sueldo=" + sueldo + '}';
    }
    
}