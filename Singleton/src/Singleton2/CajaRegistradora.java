/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton2;

/**
 *
 * @author labesp
 */
public class CajaRegistradora {
    private double totalVentas;
    private double totalFacturas;
    //1. Definir valriable estatica.
    private static CajaRegistradora instancia;    
    //2. Crear un constructor privado
    private CajaRegistradora() {
        totalVentas=0.0;
        System.out.println("Caja registradora lista");
    }
    //3. Agregar un metodo publico estatico, garantizando que no existan mas instancias
    public static CajaRegistradora getInstancia(){
        if (instancia == null) {
            instancia = new CajaRegistradora();
        }
        return instancia;
    }
    public void registrarVenta(double monto){
        totalVentas=totalVentas + monto;
        System.out.println("Venta registrada: " + monto);
    }
    public void registrarFactura(double monto){
        totalFacturas=totalFacturas+monto;
        //totalVentas=totalFacturas+monto;
        System.out.println("Factura registrada: "+monto);
    }

    public double getTotalVentas() {
        return totalVentas;
    }
    public double getTotalFacturas() {
        return totalFacturas;
    }
    public double getTotal() {
        return totalFacturas+totalVentas;
    }
}
