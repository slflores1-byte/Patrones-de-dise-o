/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy2;

/**
 *
 * @author User
 */
public class Venta {
    private Descuento descuento;

    public Venta() {
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }
    public double calcularTotal(double precio){
        System.out.println("Precio Final(con descuento): $"+(precio - descuento.aplicar(precio)));
        return descuento.aplicar(precio);
    }
    
}
