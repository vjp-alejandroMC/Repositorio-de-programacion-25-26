/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5t10;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 10/03/2026
 */
public class Ejercicio5T10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    ArrayList<Integer> lnumeros = leerNumeros();

    mostrarLista(lnumeros);

    int posMayorPar = posicionMayorPar(lnumeros);
    int posMenorImpar = posicionMenorImpar(lnumeros);

    if (posMayorPar == -1 || posMenorImpar == -1) {
        System.out.println("No se puede realizar el intercambio.");
    } else {

        System.out.println("Mayor numero par: " + lnumeros.get(posMayorPar));
        System.out.println("Menor numero impar: " + lnumeros.get(posMenorImpar));

        intercambiar(lnumeros, posMayorPar, posMenorImpar);

        System.out.println("Lista despues del intercambio:");
        mostrarLista(lnumeros);
    }
}
    
    public static ArrayList<Integer> leerNumeros() {

    Scanner entrada = new Scanner(System.in);
    ArrayList<Integer> lnumeros = new ArrayList<>();
    String respuesta;

    
    do {
        
        
        System.out.print("Introduce un numero: ");
        int num = entrada.nextInt();
        lnumeros.add(num);

        System.out.print("Quieres introducir otro numero? (s/n): ");
        respuesta = entrada.next();

        
    } while (respuesta.equalsIgnoreCase("s"));

    return lnumeros;
}
    
    public static void mostrarLista(ArrayList<Integer> lnumeros) {
        
        System.out.println("Lista de numeros: ");
        System.out.println(lnumeros);
        
    }
    
    public static int posicionMayorPar(ArrayList<Integer> lnumeros) {

    int mayorPar = Integer.MIN_VALUE;
    int posicion = -1;

    for (int i = 0; i < lnumeros.size(); i++) {

        int num = lnumeros.get(i);

        if (num % 2 == 0 && num > mayorPar) {
            mayorPar = num;
            posicion = i;
        }
    }

    return posicion;
}
    
    public static int posicionMenorImpar(ArrayList<Integer> lnumeros) {

    int menorImpar = Integer.MAX_VALUE;
    int posicion = -1;

    for (int i = 0; i < lnumeros.size(); i++) {

        int num = lnumeros.get(i);

        if (num % 2 != 0 && num < menorImpar) {
            menorImpar = num;
            posicion = i;
        }
    }

    return posicion;
}
    
    public static void intercambiar(ArrayList<Integer> lnumeros, int pos1, int pos2) {

    int temp = lnumeros.get(pos1);
    lnumeros.set(pos1, lnumeros.get(pos2));
    lnumeros.set(pos2, temp);
}
 
}
