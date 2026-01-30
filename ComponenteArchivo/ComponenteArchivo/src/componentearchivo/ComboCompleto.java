/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentearchivo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jepeh
 */
public class ComboCompleto implements ComponenteProducto {
    private String producto;
    private List <ComponenteProducto> elementos = new ArrayList<>();

    public ComboCompleto(String producto) {
        this.producto = producto;
    }
    public void agregar(ComponenteProducto e){
        elementos.add(e);
    }
    @Override
    public void mostrar() {
        System.out.println("Combo: "+ producto);
        for (ComponenteProducto e : elementos){
            e.mostrar();
        }          
        System.out.println("Total del combo: $" + calcularTotal());
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (ComponenteProducto e : elementos){
            total = total + e.getPrecio();
        }
        return total;
    }   
    
    public double calcularTotal() {
        return getPrecio();
    }
    
}    

