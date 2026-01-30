/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradorvehiculo;

/**
 *
 * @author User
 */
public abstract class VehiculoDecorador implements Vehiculo {
    protected Vehiculo vehiculo;
    public VehiculoDecorador(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
