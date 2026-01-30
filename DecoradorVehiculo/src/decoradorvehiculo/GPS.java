/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradorvehiculo;

/**
 *
 * @author User
 */
public class GPS extends VehiculoDecorador{
    
     public GPS(Vehiculo vehiculo) {
        super(vehiculo);
    }
    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion() + " + GPS";
    }
    @Override
    public double getPrecio() {
        return vehiculo.getPrecio() + 800;
    }
    @Override
    public int getPotencia() {
        return vehiculo.getPotencia();
    }
}
