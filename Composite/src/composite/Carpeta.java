/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Carpeta implements ComponenteArchivo{
    private String nombre;
    private List<ComponenteArchivo> elementos = new ArrayList();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregar(ComponenteArchivo archivo){
        elementos.add(archivo);
    }
    
    @Override
    public void mostrar() {
        System.out.println("Carpeta "+nombre);
                for(ComponenteArchivo e: elementos){
                    e.mostrar();
                }
    }

    @Override
    public int getTamanio() {
        int total=0;
        for(ComponenteArchivo e : elementos){
            total = total + e.getTamanio();
        }
        return total;
    }
}
