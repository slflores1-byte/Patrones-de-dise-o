/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentearchivo;

/**
 *
 * @author jepeh
 */
public class Comida implements ComponenteProducto{
    private String producto;
    private double  precio;

    public Comida(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }
   
    @Override
    public void mostrar() {
        System.out.println("Producto: "+ producto + "\nPrecio: "+ precio+"$");
    }

    @Override
    public double getPrecio() {
    return precio;
    }   
}
