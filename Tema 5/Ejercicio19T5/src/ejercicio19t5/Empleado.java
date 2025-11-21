/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19t5;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 21/11/2025
 */
public class Empleado {
    
    //Atributos del empleado.
    private final String nombre;
    private final int numhoras;
    private final double tarifa;
    
    //Constructor del empleado (no he usado un constructor por defecto porque en elo ejercicio pide que el usuario introduzca los datos).
    public Empleado(String nom, int hor, double tar) {
        this.nombre = nom;
        this.numhoras = hor;
        this.tarifa = tar;
    }
    
    //Método para calcular el sueldo bruto.
    public double calcularSueldoBruto() {
        if (numhoras <= 40) {
            return numhoras * tarifa;
        }
        else {
            int horasNormales = 40;
            int horasExtra = numhoras - 40;
            return (horasNormales * tarifa) + (horasExtra * tarifa * 1.5);
        }
    }
    
    //Método para mostrar los datos.
    public void mostrarDatos() {
        
        System.out.println(nombre + " trabajo " + numhoras + " horas, cobra " + + tarifa + " euros/hora, por lo que le corresponde un sueldo de " + calcularSueldoBruto() + " euros.");
    }
}
