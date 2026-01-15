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
public class CiclistaEscalador extends Ciclista {
    
    //Atributos de la clase.
    public CiclistaEscalador(double potencia, double fuerza, String nom, int ene, boolean esc, float kme, int bid, double vel, int hid, int cic) {
        super(nom, ene, esc, kme, bid, vel, hid, cic);
        this.potencia = potencia;
        this.fuerza = fuerza;
    }
    
    private double potencia;
    private double fuerza;
    
    //Constructores de la clase.
    public CiclistaEscalador() {
        
        this.potencia = 0;
        this.fuerza = 0;
    }
    
    public CiclistaEscalador(double pot, double fue) {
        potencia = pot;
        fuerza = fue;
    }
    
    //Getters y setters de la clase.
    public void setPotencia() {
        potencia = 0;
    }
     
    public double getPotencia() {
        return potencia;
    }
    
    public void setFuerza() {
        fuerza = 0;
    }
    
    public double getFuerza() {
        return fuerza;
    }
    
    //Métodos abstractos de la clase.
    @Override
    public void Comer() {
        if (kmeta > 20) {
            double energiaaumentada = energia + 30;
            System.out.println("El escalador " + nombre + " acaba de tomar un gel. Su energia ahora es de " + energiaaumentada);
        }
    }
    
    @Override
    public void Beber() {
        if (bidones == 0) {
            bidones = getBidones();
            int hidratacionaumentada = hidratacion + 10;
            
            System.out.println("El escalador " + nombre + " se ha hidratado. Su nivel de hidratacion ahora es de " + hidratacionaumentada);
        }
    }
    
    //Metodos propios de la clase.
    public void sprintar() {
        if (kmeta < 0.3 && energia >= 20) {
            velocidad = potencia / fuerza;
            int energiadisminuida = energia - 20;
            System.out.println("El escalador " + nombre + " esta sprintando a " + velocidad + " km/h");
        }
        else {
            System.out.println("Aun no puede sprintar");
        }
    }
    
    public void atacar() {
        if (escapado) {
            escapado = true;
            int hidrataciondisminuida2 = 20% hidratacion;
            System.out.println("El escalador " + nombre + " esta atacando");
        }
    }
    
    public int recuperar() {
        
        int energiaaumentada = 0;
        
        if (kmeta > 15) {
            energiaaumentada = (int) (energia + (5 * kmeta));
            System.out.println("El escalador " + nombre + " esta recuperando");
        }
        return energiaaumentada;
    }
}