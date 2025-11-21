/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11t5;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 14/11/2025
 */
public class Numero {
    
    private int valor; //Escribimos la variable.

    //Inicializamos los constructores
    public Numero(int valor) {
        this.valor = valor;
    }
    
    public Numero() {
        valor = 0;
    }
    
    //Establecemos un setter.
    public void setNumero(int val) {
        valor = val;
    }
    
    //Y un getter
    public int getNumero() {
        return valor;
    }
    
}