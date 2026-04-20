/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra6dinamicoprog;
import java.util.*;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 20/04/2026
 */
public class ExamenRA6DinamicoProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración de listas.
        ArrayList<Deporte> deportes = new ArrayList<>();
        
        //Metodos del main.
        mostrarMenu(deportes);
        
    }
    
    public static void mostrarMenu(ArrayList<Deporte> deportes) {
        
        Scanner entrada = new Scanner(System.in);
        
        int opcion;
        
        //Menu que se repite hasta que el usuario decida salir.
        do {
            
            System.out.println("1. Añadir deporte");
            System.out.println("2. Mostrar deportes y equipos.");
            System.out.println("3. Buscar equipo en deporte.");
            System.out.println("4. Mostrar mapa de equipos.");
            System.out.println("5. Mostrar todos los equipos de todos los deportes ordenados de mayor a menor numero de trofeos ganados.");
            System.out.println("6. Salir del programa");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                
                case 1:
                    ponerDeporte(deportes);
                    break;
                
                case 2:
                    mostrarDeportesYEquipos(deportes);
                    break;
                    
                case 3:
                    buscarEquipoEnDeporte(deportes);
                    break;
                    
                case 4:
                    mostrarMapaEquipos(deportes);
                    break;
                    
                case 5:
                    mostrarEquiposDeportesOrdenados(deportes);
                    break;
                    
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opcion no valida.");
                    break;
                
            }
            
        } while (opcion != 6);
        
    }
    
    public static void ponerDeporte(ArrayList<Deporte> deportes) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el nombre del deporte: ");
        String nombre = entrada.nextLine();
        
        int opcion;
        
        //Creación del deporte.
        Deporte d = new Deporte(nombre);
        
        //Bucle do-while que pide los datos de los equipos al usuario hasta que este quiera parar de meter datos.
        do {

            System.out.println("Codigo equipo:");
            int codigo = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Nombre equipo:");
            String nombreEquipo = entrada.nextLine();

            System.out.println("Trofeos:");
            int trofeos = entrada.nextInt();

            //Aqui se añade el objeto al HashSet.
            d.addEquipo(new Equipo(codigo, nombreEquipo, trofeos));

            System.out.println("Añadir otro equipo? 1. si 0. no");
            opcion = entrada.nextInt();

        } while (opcion == 1);

        //Aqui se añade el deporte con todos los datos de los equipos que se le han pedido al usuario.    
        deportes.add(d);
        
    }
    
    public static void mostrarDeportesYEquipos(ArrayList<Deporte> deportes) {
        
        for(Deporte d : deportes){

            System.out.println(d);

            for(Equipo e : d.getEquipos()){
            
                System.out.println(" " + e);
            
        }

      }
        
    }
    
    public static void buscarEquipoEnDeporte(ArrayList<Deporte> deportes) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nombre equipo:");
        String nombre = entrada.nextLine();

        boolean encontrado = false;

        //Bucle for-each que recorre toda la lista de deportes junto con sus equipos y valida con un boolean si ha encontrado un equipo o no.
        for(Deporte d : deportes){

            for(Equipo e : d.getEquipos()){

                if(e.getNombre().equalsIgnoreCase(nombre)){
                    
                    System.out.println("Pertenece al deporte: " + d.getNombre());
                    
                    encontrado = true;
                    
            }

        }

    }
        //Si no se encuentra el equipo se dice al usuario.
        if(!encontrado){
           
            System.out.println("Equipo no encontrado");
            
        }
        
    }
    
    public static void mostrarMapaEquipos(ArrayList<Deporte> deportes) {
        
        Map<Integer, Equipo> nomEquipo = new HashMap<>();
        
        //Bucles for-each que recorren toda la lista y muestra los equipos que hayan ganado 3 o más trofeos.
        for(Deporte d : deportes) {

        for(Equipo e : d.getEquipos()) {

                if(e.getTrofeos() > 3){
                    nomEquipo.put(e.getCodigo(), e);
                }

            }

        }

        Iterator<Map.Entry<Integer,Equipo>> it = nomEquipo.entrySet().iterator();

        //Bucle while que usa el iterador para mostrar los datos de los equipos.
        while(it.hasNext()) {

            Map.Entry<Integer,Equipo> entry = it.next();
        
            System.out.println(entry.getValue());

            }
        
    }
    
    public static void mostrarEquiposDeportesOrdenados(ArrayList<Deporte> deportes) {
        
        ArrayList<Equipo> lista = new ArrayList<>();
        
        //Bucle for-each que recoge los datos de los equipos.
        for(Deporte d : deportes){
            lista.addAll(d.getEquipos());
        }

        //Metodo sort de la clase collections para ordenar la lista.
        Collections.sort(lista);

        //Bucle for each que recorre toda la lista y muestra los equipos ordenados.
        for(Equipo e : lista){
            
            System.out.println(e);
            
        }
        
    }
    
}
