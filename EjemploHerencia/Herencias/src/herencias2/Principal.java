/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        /*
        // TODO code application logic here
        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);
        // Un docente hereda de una Persona y adicionalmente tiene 
        // la característia sueldo
        Docente d = new Docente("Luis", "Alvarez", 40, 900); // falta implementar
        System.out.println(d);
        
        // Un policia hereda de una Persona y adicionalmente tiene 
        // la característia rango
        Policia p = new Policia("ALEX", "MENDOZA", 35, "Cabo"); // falta implementar
        System.out.println(p);
        */
        int opcion = 0;
        
        System.out.println("Menú:\n"
                + "Opción 1: Ingrese estudinate\n"
                + "Opción 2: Ingrese docente\n"
                + "Opción 3: Ingrese policia\n");
        
        opcion = leer.nextInt();
        leer.nextLine();
        
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el apellido de la persona: ");
        String apellido = leer.nextLine();
        System.out.println("Ingrese la edad de la persona: ");
        int edad = leer.nextInt();
        
        Persona per = new Persona(nombre,apellido,edad);
        
        if (opcion == 1){
            System.out.println("Ingrese el valor de la matricula: ");
            double matricula = leer.nextDouble();
            Estudiante estu = new Estudiante(nombre,apellido,edad,matricula);
            System.out.println(estu);
        }
        else{
            if(opcion == 2){
                System.out.println("Ingrese el sueldo de docente:");
                double sueldo = leer.nextDouble();
                Docente doc = new Docente(nombre,apellido,edad,sueldo);
                System.out.println(doc);
            }
            else{
                if(opcion==3){
                    System.out.println("Ingrese el rango: ");
                    String rango = leer.nextLine();
                    Policia poli = new Policia (nombre,apellido,edad,rango);
                    System.out.println(poli);
                }
                else{
                    System.out.println("**Opción inválida**");
                }
            }
                    
        }
        
    }
    
}
