/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15t10;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Empresa {

    private String nombreEmpresa;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = new ArrayList<>();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void añadirEmpleado(Empleado e) {
        empleados.add(e);
    }
}