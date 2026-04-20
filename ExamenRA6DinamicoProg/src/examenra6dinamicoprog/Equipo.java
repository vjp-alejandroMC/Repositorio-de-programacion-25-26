/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra6dinamicoprog;
import java.util.*;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 20/04/2026
 */
public class Equipo implements Comparable<Equipo> {
    
    //Atributos de la clase.
    private int codigo;
    private String nombre;
    private int trofeos;

    //Constructor de la clase.
    public Equipo(int codigo, String nombre, int trofeos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.trofeos = trofeos;
    }

    //Getters y setters de la clase.
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(int trofeos) {
        this.trofeos = trofeos;
    }

    //Metodo toString de la clase.
    @Override
    public String toString() {
        return "Deporte " + " codigo = " + codigo + ", nombre = " + nombre + ", trofeos = " + trofeos;
    }
    
    //Metodo para comprar el número de trofeos de mayor a menor.
    @Override
    public int compareTo(Equipo o) {
        return Integer.compare(o.trofeos, this.trofeos);
    }

    //
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    //
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Equipo other = (Equipo) obj;
        return codigo == other.codigo;
    }
    
}
