/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author User
 */
public class PagoTarjeta implements Pagos{
    double totalTarjeta=0;
    @Override
    public void procesarPago(double monto) {
        totalTarjeta=totalTarjeta+monto;
        System.out.println("Se paga con Tarjeta la cantidad de $ "+monto);
    }
    @Override
    public double getTotal(){
        return totalTarjeta;
    }
}
