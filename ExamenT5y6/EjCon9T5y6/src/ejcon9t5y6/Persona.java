/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejcon9t5y6;

/**
 *
 * @author alumno
 */
public class Persona implements Gravable {
    
    //Atributos de la clase.
    private String dni;
    private float ingresosanuales;
    
    //Constructores de la clase.
    public Persona() {
        dni = "";
        ingresosanuales = 0;
    }

    public Persona(String dni, float ingresosanuales) {
        this.dni = dni;
        this.ingresosanuales = ingresosanuales;
    }

    @Override
    public String toString() {
        return """
               PERSONA
               DNI: + dni + "\nIngresos anuales: " + ingresosanuales""";
    }
    
    @Override
    public void calcularImpuesto() {
        
    }
    
    
}
