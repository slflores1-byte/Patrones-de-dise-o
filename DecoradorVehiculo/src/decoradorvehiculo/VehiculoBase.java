/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradorvehiculo;

/**
 *
 * @author User
 */
public class VehiculoBase implements Vehiculo{
    @Override
    public String getDescripcion() {
        return "Auto Básico";
    }

    @Override
    public double getPrecio() {
        return 12000;
    }

    @Override
    public int getPotencia() {
        return 100;
    }
}
