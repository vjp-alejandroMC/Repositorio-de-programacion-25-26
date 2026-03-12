/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15t10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 10/03/2026
 */
public class Ejercicio15T10 {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Empresa> empresas = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;

        do {

            mostrarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    introducirEmpresas();
                    break;

                case 2:
                    mostrarEmpresas();
                    break;

                case 3:
                    empleadosConA();
                    break;

                case 4:
                    empleadosOrdenadosPorSueldo();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 5);
    }

    public static void mostrarMenu() {

        System.out.println("\nPulse 1 para introducir empresas y sus empleados.");
        System.out.println("Pulse 2 para mostrar empresas y sus empleados.");
        System.out.println("Pulse 3 para mostrar a todos los empleados cuyo nombre contenga la letra 'A'");
        System.out.println("Pulse 4 para mostrar a todos los empleados ordenados por su sueldo");
        System.out.println("Pulse 5 para salir.");
    }

    public static void introducirEmpresas() {

        String continuarEmpresas;

        do {

            System.out.print("Nombre de la empresa: ");
            String nombreEmpresa = entrada.nextLine();

            Empresa empresa = new Empresa(nombreEmpresa);

            String continuarEmpleados;
            int contador = 1;

            do {

                System.out.print("Nombre del empleado " + contador + ": ");
                String nombreEmpleado = entrada.nextLine();

                System.out.print("Sueldo del empleado " + contador + ": ");
                int sueldo = entrada.nextInt();
                entrada.nextLine();

                Empleado empleado = new Empleado(nombreEmpleado, sueldo);
                empresa.añadirEmpleado(empleado);

                contador++;

                System.out.print("¿Desea añadir más empleados? (Si/No): ");
                continuarEmpleados = entrada.nextLine();

            } while (continuarEmpleados.equalsIgnoreCase("Si"));

            empresas.add(empresa);

            System.out.print("¿Desea añadir más empresas? (Si/No): ");
            continuarEmpresas = entrada.nextLine();

        } while (continuarEmpresas.equalsIgnoreCase("Si"));
    }

    public static void mostrarEmpresas() {

        for (Empresa e : empresas) {

            System.out.println("** Empresa: " + e.getNombreEmpresa() + " **");

            int i = 1;

            for (Empleado emp : e.getEmpleados()) {

                System.out.println("Empleado " + i + ": " + emp.getNombreEmpleado());
                System.out.println("Sueldo: " + emp.getSueldo());
                i++;
            }
        }
    }

    public static void empleadosConA() {

        for (Empresa e : empresas) {

            for (Empleado emp : e.getEmpleados()) {

                if (emp.getNombreEmpleado().toUpperCase().contains("A")) {
                    System.out.print(emp.getNombreEmpleado() + " - ");
                }
            }
        }

        System.out.println();
    }

    public static void empleadosOrdenadosPorSueldo() {

        ArrayList<Empleado> lista = new ArrayList<>();

        for (Empresa e : empresas) {
            lista.addAll(e.getEmpleados());
        }

        Collections.sort(lista, new Comparator<Empleado>() {
            @Override
            public int compare(Empleado e1, Empleado e2) {
                return e2.getSueldo() - e1.getSueldo();
            }
        });

        for (Empleado e : lista) {
            System.out.println(e.getNombreEmpleado() + " - " + e.getSueldo());
        }
    }
}
    
    

