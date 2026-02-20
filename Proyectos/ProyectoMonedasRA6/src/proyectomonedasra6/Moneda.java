/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomonedasra6;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 20/02/2026
 */
public class Moneda {
    
    //Atributos de la clase.
    private int valor;
    private String pais;
    private String material;

    //Constructor de la clase.
    public Moneda(int valor, String pais, String material) {
        this.valor = valor;
        this.pais = pais;
        this.material = material;
    }
    
    //Getters y Setters de la clase.
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //Método toString de la clase.
    @Override
    public String toString() {
        return "Moneda: " + "valor = " + valor + ", pais = " + pais + ", material = " + material;
    }
    
}
