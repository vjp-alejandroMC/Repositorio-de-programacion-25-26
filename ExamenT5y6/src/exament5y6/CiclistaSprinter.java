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
public class CiclistaSprinter extends Ciclista {
    
    //Atributos de la clase.
    public CiclistaSprinter(float aceleracion, String nom, int ene, boolean esc, float kme, int bid, double vel, int hid, int cic) {
        super(nom, ene, esc, kme, bid, vel, hid, cic);
        this.aceleracion = aceleracion;
    }
    
    private float aceleracion;
    
    public CiclistaSprinter(float ace) {
        
        this.aceleracion = ace;
    }
    
    public CiclistaSprinter() {
        aceleracion = 0;
    }
    
    //Getters y setters de la clase.
    public void setAceleracion() {
        aceleracion = 0;
    }
    
    public float getAceleracion() {
        return aceleracion;
    }
    
    //Metodos abstractos de la clase.
    @Override
    public void Comer() {
        if (kmeta == 10 && kmeta > 10) {
            int energiaaumentada2 = energia + 25;
            System.out.println("El sprinter " + nombre + " acaba de tomar un gel. Su energia ahora es de " + energiaaumentada2);
        }
    }
    
    @Override
    public void Beber() {
        if (bidones == 0) {
            bidones = getBidones();
            int hidratacionaumentada2 = hidratacion + 5;
            bidones--;
            System.out.println("El sprinter " + nombre + " se ha hidratado. Su nivel de hidratacion ahora es de " + hidratacionaumentada2);
        }
    }
    
    //Metodos propios de la clase.
    public void sprintar() {
        if (kmeta < 1 && energia >= 50) {
            velocidad = aceleracion;
            int energiadisminuida = energia - 50;
            System.out.println("El sprinter " + nombre + " esta sprintando a " + velocidad + " km/h");
        }
        else {
            System.out.println("Aun no puede sprintar");
        }
    }
    
    public void atacar() {
        if (escapado) {
            escapado = true;
            int hidrataciondisminuida = 10% hidratacion - hidratacion;
            System.out.println("El sprinter " + nombre + " esta atacando");
        }
    }
    
    public int recuperar() {
        
        int energiaaumentada = 0;
        
        if (kmeta > 5) {
            energiaaumentada = (int) (energia + (5 * kmeta));
            System.out.println(nombre + " esta recuperando");
        }
        return energiaaumentada;
    }
}
