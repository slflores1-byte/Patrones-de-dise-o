/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observernotas;

/**
 *
 * @author User
 */
public class Usuario implements Estudiante {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    } 

    @Override
    public void actualizar(double nota) {
        System.out.println("Estudiante: "+nombre+" se actualizo nota general del curso: "+nota);
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
