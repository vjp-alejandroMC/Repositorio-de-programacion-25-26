/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19t5;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 21/11/2025
 */
public class Ejercicio19T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creación de los empleados con métodos.
        Empleado e1 = crearEmpleado();
        Empleado e2 = crearEmpleado();
        Empleado e3 = crearEmpleado();
        
        //Métodos para mostrar los datos introducidos por el usuario.
        mostrarSueldo(e1);
        mostrarSueldo(e2);
        mostrarSueldo(e3);
        
    }
    
    public static Empleado crearEmpleado() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nombre del empleado: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Horas trabajadas: ");
        int horas = entrada.nextInt();
        
        System.out.println("Tarifa por hora: ");
        double tarifa = entrada.nextDouble();
        entrada.nextLine();
        
        return new Empleado(nombre, horas, tarifa);
    }
    
    public static void mostrarSueldo(Empleado e) {
        e.mostrarDatos();
        System.out.println("------------------------------------------------");
    }
}
