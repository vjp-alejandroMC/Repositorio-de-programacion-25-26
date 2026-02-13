/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9t9;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 13/02/2026
 */
public class Ejercicio9T9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        introducirDatos();
        
    }
    
    public static void introducirDatos() {
        
        Scanner entrada = new Scanner(System.in);
        
        String usuario;
        String contrasena;
        
        
        System.out.println("Introduce tu nombre de usuario: ");
        usuario = entrada.nextLine();
        
        System.out.println("Ahora introduzca una contrasenya: ");
        contrasena = entrada.nextLine();
        
        if (comprobarDatos(usuario, contrasena)) {
            
            System.out.println("La contrasenya es valida");
        } else {
            System.out.println("La contrasenya no es valida");
        }
        
    }
    
    public static boolean comprobarDatos(String usuario, String contrasena) {
        
        if (contrasena.length() < 6) {
            
            System.out.println("Error: la contrasenya no puede tener menos de 6 caracteres.");
            return false;
            
        }
        
        int contador = 0;
        
        for (int i = 0; i < contrasena.length(); i++) {
            
            if (Character.isDigit(contrasena.charAt(i))) {
                contador++;
            }
            
        }
        
        if (contador < 2) {
            
            System.out.println("Error: la contrasenya debe tener al menos 2 digitos.");
            return false;
        }
        
        if (contrasena.toLowerCase().contains(usuario.toLowerCase())) {
            
            System.out.println("Error: la contrasenya no puede ser igual que el nombre de usuario.");
            return false;
            
        }
        
        return true;
        
    }
    
}
