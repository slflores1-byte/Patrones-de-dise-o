/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author User
 */
public class Compra {
    private MetodoPago metodo;

    public Compra(MetodoPago metodo) {
        this.metodo = metodo;
    }

    public void setMetodoPago(MetodoPago metodo){
        this.metodo=metodo;
    }
    
    public void realizarPago(double monto){
        metodo.pagar(monto);
    }

    public Compra() {
    }
    
}
