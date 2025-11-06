/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20t4;
import java.util.Scanner;
/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 31/10/2025
 */
public class Ejercicio20T4 {
    
    //Variables globales.
    final static String RESPUESTA_1 = "Madrid";
    final static String RESPUESTA_2 = "Colon";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("EXAMEN DE CULTURA GENERAL");
        
        //Forma en la que el programa muestra y calcula la nota al final del examen.
        int nota1 = primeraPregunta(RESPUESTA_1);
        int nota2 = segundaPregunta(RESPUESTA_2);
        
        int notafinal = nota1 + nota2;
        
        System.out.println("NOTA DEL EXAMEN: " + notafinal);
 }
    
    //Los métodos son int ya que lo que interesa es que se recoga la nota de cada pregunta para que se calcule al final la nota final.
    public static int primeraPregunta(String RESPUESTA_1) {
        int nota1 = 0;
        String respuesta1;
        Scanner entrada = new Scanner(System.in);
        
        //El programa pide una respuesta al usuario.
        System.out.println("Primera pregunta: Cual es la capital de Espanya?");
        respuesta1 = entrada.nextLine();
        
        //Aquí se comprueba la respuesta y si es correcta se suma 5 a la nota.
        if ("Madrid".equals(RESPUESTA_1)) {
            System.out.println("Muy bien, respuesta correcta");
            nota1 = 0 + 5;
        }
        else
            //Si la respuesta es incorrecta:
            System.out.println("Respuesta incorrecta");
        //El return devuelve la nota al main para que se pueda calcular la nota final.
        return nota1;
    }

    public static int segundaPregunta(String RESPUESTA_2) {
        int nota2 = 0;
        String respuesta2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Segunda pregunta: Quien descubrio America?");
        respuesta2 = entrada.nextLine();
        
        //Aquí se comprueba la respuesta y si es correcta se suma 5 a la nota.
        if ("Colon".equals(RESPUESTA_2)) {
            System.out.println("Muy bien, respuesta correcta");
            nota2 = 0 + 5;
        }
        else
            //Si la respuesta es incorrecta:
            System.out.println("Respuesta incorrecta");
        //El return devuelve la nota al main para que se pueda calcular la nota final.
        return nota2;
    }
    
}
    
