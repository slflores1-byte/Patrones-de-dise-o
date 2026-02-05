/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observernotas;
import java.util.*;
/**
 *
 * @author User
 */
public class ObserverNotas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notas notas = new Notas(" ");
        int opcion;
        do{
            System.out.println(" ---- NOTIFICACIONES  ACTUALIZACION DE NOTAS");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Agregar Nota General del Curso");
            System.out.println("3. Ver Estudiantes Noficados");
            System.out.println("4. salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion){
                case 1: System.out.print("Ingrese el nombre del Estudiante: ");
                        String nEstudiante = sc.nextLine();
                        notas.agregarEstudiante(new Usuario(nEstudiante)); break;
                case 2: 
                        System.out.print("Ingrese nota: ");
                        double nota = sc.nextDouble();
                        notas.norificar(nota);break;
                case 3: notas.mostrarEstudiantesNotificados(); break;
                case 4: break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion!=4);
        sc.close();
    }
    
}
