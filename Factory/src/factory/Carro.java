/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author User
 */
public class Carro implements Juguete{
    @Override
    public void crear() {
        System.out.println("SE HA ELABORADO UN CARRITO");
        System.out.println("Carrito elaborado exitosamente :)");
    }
}
