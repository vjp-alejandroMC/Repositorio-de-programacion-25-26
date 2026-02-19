/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10t9;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 13/02/2026
 */
public class Carta {
    
    private String valor;
    private String palo;
    private int puntos;

    public Carta(String valor, String palo, int puntos) {
        this.valor = valor;
        this.palo = palo;
        this.puntos = puntos;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Carta{" + "valor = " + valor + ", palo = " + palo + ", puntos = " + puntos + '}';
    }
    
    
    
}
