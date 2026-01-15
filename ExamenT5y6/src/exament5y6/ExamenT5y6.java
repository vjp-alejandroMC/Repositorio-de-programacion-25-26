/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exament5y6;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 09/12/2025
 */
public class ExamenT5y6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int ciclistas = 4;
        
        CiclistaEscalador C1 = new CiclistaEscalador(10, 20, "Alejandro", 50, false, 10, 2, 40, 50, 1);
        CiclistaSprinter C2 = new CiclistaSprinter(70, "Jorge", 60, true, 5, 1, 50, 30, 2);
        
        System.out.println(C1);
        System.out.println(C2);
        
        
        CiclistaEscalador C3 = new CiclistaEscalador(20, 10, "Gabriel", 70, true, 1, 2, 60, 50, 3);
        CiclistaSprinter C4 = new CiclistaSprinter(70, "Ibai", 80, false, 20, 4, 60, 90, 4);
        
        System.out.println(C3);
        System.out.println(C4);
        
        System.out.println("Numero de ciclistas = " + ciclistas);
    }
    
}
