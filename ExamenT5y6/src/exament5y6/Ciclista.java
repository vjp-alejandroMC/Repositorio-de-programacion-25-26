/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament5y6;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 09/12/2025
 */
public class Ciclista {
    
    //Atributos de la clase.
    String nombre;
    int energia;
    boolean escapado;
    float kmeta;
    int bidones;
    double velocidad;
    int hidratacion;
    private int ciclistas;
    
    
    //Constructores de la clase.
    public Ciclista() {
        nombre = "";
        energia = 50;
        escapado = false;
        kmeta = 120;
        bidones = 2;
        velocidad = 0;
        hidratacion = 50;
        ciclistas = 0;
    }
    
    public Ciclista(String nom, int ene, boolean esc, float kme, int bid, double vel, int hid, int cic) {
        this.nombre = nom;
        this.energia = ene;
        this.escapado = esc;
        this.kmeta = kme;
        this.bidones = bid;
        this.velocidad = vel;
        this.hidratacion = hid;
        this.ciclistas = cic;
    }
    
    //Getters y setters de la clase.
    public void setNombre() {
        nombre = "";
}
    public String getNombre() {
        return nombre;
    }
    
    public void setEnergia() {
        energia = 50;
    }
    
    public int getEnergia() {
        return energia;
    }
    
    public void setEscapado() {
        escapado = false;
    }
    
    public boolean getEscapado() {
        return escapado;
    }
    
    public void setKmeta() {
        kmeta = 120;
    }
    
    public float getKmeta() {
        return kmeta;
    }
    
    public void setBidones() {
        bidones = 2;
    }
    
    public int getBidones() {
        return bidones;
    }
    
    public void setVelocidad() {
        velocidad = 0;
    }
    
    public double getVelocidad() {
        return velocidad;
    }
    
    public void setHidratacion() {
        hidratacion = 50;
    }
    
    public int getHidratacion() {
        return hidratacion;
    }
    
    public void setCiclistas() {
        ciclistas = 0;
    }
    
    public int getCiclistas() {
        return ciclistas;
    }
    
    //Métodos propios de la clase.
    public void cogerBidon() {
        if (kmeta == 10 && kmeta > 10) {
            bidones++;
        }
        else {
            System.out.println("No puedes coger bidones a menos de 10 km de la meta");
        }
    }
    
    public void tirarBidon() {
        bidones--;
    }
    
    public void Comer() {
        
    }
    
    public void Beber() {
        
    }
    
    public void aumentarCiclistas() {
        ciclistas++;
    }
    
    public void verCiclistas() {
        System.out.println("Hay " + ciclistas + " ciclistas");
    }
    
    @Override
    public String toString() {
        return """
               CICLISTAS
                 Nombre: """ + nombre +
                "\nEnergia: " + energia +
                "\nEscapado: " + escapado +
                "\nKm de la meta: " + kmeta +
                "\nNumero de bidones: " + bidones +
                "\nVelocidad: " + velocidad +
                "\nNivel de hidratacion: " + hidratacion;
    }
}