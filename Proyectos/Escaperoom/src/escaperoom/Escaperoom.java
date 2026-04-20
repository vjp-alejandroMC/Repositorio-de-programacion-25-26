/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escaperoom;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 17/04/2026
 */
public class Escaperoom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ejercicioEmpleados();
        codigosFicheroEncriptado();
            
    }
        
        public static void ejercicioEmpleados() {
            
            String entrada = "C:\\Users\\alumno\\Documents\\GitHub\\Repositorio-de-programacion-25-26\\Proyectos\\Escaperoom\\src\\Archivos de texto\\datos_empleados.txt";
            String salida = "C:\\Users\\alumno\\Documents\\GitHub\\Repositorio-de-programacion-25-26\\Proyectos\\Escaperoom\\src\\Archivos de texto\\zona_cero.txt";
        
        int contador = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(entrada));
            BufferedWriter bw = new BufferedWriter(new FileWriter(salida));
            
            String linea;
            
            // Leer cabecera
            linea = br.readLine();
            bw.write(linea);
            bw.newLine();
            
            while ((linea = br.readLine()) != null) {
                
                String[] datos = linea.split(";");
                
                if (datos[2].equalsIgnoreCase("Zona Cero")) {
                    bw.write(linea);
                    bw.newLine();
                    contador++;
                }
            }
            
            br.close();
            bw.close();
            
            System.out.println("Número de empleados en Zona Cero: " + contador);
            
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero");
        }
            
        }
        
        public static void codigosFicheroEncriptado() {
            
            String entrada = "04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt";
        String salida = "claves.txt";
        
        int contador = 0;

        try {
            
            BufferedReader br = new BufferedReader(new FileReader(entrada));
            BufferedWriter bw = new BufferedWriter(new FileWriter(salida));
            
            String linea;
            Pattern patron = Pattern.compile("\\d{8}");
            
            while ((linea = br.readLine()) != null && contador < 3) {
                
                Matcher matcher = patron.matcher(linea);
                
                while (matcher.find() && contador < 3) {
                    
                    String clave = matcher.group();
                    
                    bw.write(clave);
                    bw.newLine();
                    
                    contador++;
                }
            }
            
            br.close();
            bw.close();
            
            System.out.println("Claves encontradas: " + contador);
            
        } catch (IOException e) {
            System.out.println("Error leyendo fichero");
        }
            
        }
        
}

