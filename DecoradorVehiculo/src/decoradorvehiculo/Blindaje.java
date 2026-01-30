/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradorvehiculo;

/**
 *
 * @author User
 */
public class Blindaje extends VehiculoDecorador {
    public Blindaje(Vehiculo vehiculo) {
        super(vehiculo);
    }
    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion() + " + Blindaje";
    }
    @Override
    public double getPrecio() {
        return vehiculo.getPrecio() + 4000;
    }
    @Override
    public int getPotencia() {
        return vehiculo.getPotencia() - 10;
    }
}
