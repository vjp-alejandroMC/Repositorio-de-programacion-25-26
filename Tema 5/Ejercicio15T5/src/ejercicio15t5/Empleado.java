/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15t5;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 20/11/2025
 */
public class Empleado {
    
    //Creación de los atributos del empleado.
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    //Creación de los constructores.
    public Empleado(String nom, int sal, Direccion dir) {
        this.nombre = nom;
        this.salario = sal;
        this.direccion = dir;
    }
    
    public Empleado(String nombre, int salario, String calle, int numero, int piso, String ciudad) {
        nombre = "";
        salario = 0;
        direccion = new Direccion(calle, numero, piso, ciudad);
    }
    
    //Creación de los setters y los getters.
    public void setNombre(String nom) {
        nombre = nom;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setSalario(int sal) {
        salario = sal;
    }
    
    public int getSalario() {
        return salario;
    }
    
    public void setDireccion(Direccion dir) {
        direccion = dir;
    }
    
    public Direccion getDireccion() {
        return direccion;
    }
    
    //Método para mostrar los datos.
    public void mostrarDatos() {
        
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario:" + salario + " euros");
        System.out.println("Direccion" + direccion.mostrarDatosDireccion()); 
        System.out.println("--------------------------------------------");
        
    }
}
