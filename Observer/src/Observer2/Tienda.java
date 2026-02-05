/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer2;

/**
 *
 * @author User
 */
public class Tienda implements Cliente{
    
    private String nombre;

    public Tienda(String nombre) {
        this.nombre = nombre;
    }  

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Cliente: "+nombre+" recibio: "+mensaje);
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
}
