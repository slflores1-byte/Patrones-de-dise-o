/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradorvehiculo;

/**
 *
 * @author User
 */
public class Turbo extends VehiculoDecorador {
    public Turbo(Vehiculo vehiculo) {
        super(vehiculo);
    }
    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion() + " + Turbo";
    }
    @Override
    public double getPrecio() {
        return vehiculo.getPrecio() + 2500;
    }
    @Override
    public int getPotencia() {
        return vehiculo.getPotencia() + 50;
    }
}
