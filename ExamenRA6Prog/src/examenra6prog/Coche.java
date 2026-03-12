/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra6prog;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 09/03/2026
 */
public class Coche {
    
    //Atributos de la clase.
    private String titular;
    private String matricula;

    //Constructor de la clase.
    public Coche(String titular, String matricula) {
        this.titular = titular;
        this.matricula = matricula;
    }

    //Getters y setters de la clase.
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Método toString de la clase.
    @Override
    public String toString() {
        return "Coche {" + "titular = " + titular + ", matricula = " + matricula + '}';
    }
    
}
