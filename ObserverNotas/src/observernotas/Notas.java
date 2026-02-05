/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observernotas;
import java.util.*;
/**
 *
 * @author User
 */
public class Notas {
    private String nombre;
    private List<Estudiante>estudiantes = new ArrayList<>();

    public Notas(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    
    public void norificar(double nota){
        for(Estudiante estudiante: estudiantes){
            estudiante.actualizar(nota);
        }
    }
    
    public void mostrarEstudiantesNotificados(){
        System.out.println("Estudiantes Notificado "+nombre+" :");
        for(Estudiante estudiante: estudiantes){
            System.out.println("- "+estudiante.getNombre());
        }
    }
    
}
