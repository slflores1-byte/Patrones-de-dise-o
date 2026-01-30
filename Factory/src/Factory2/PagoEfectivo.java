/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author User
 */
public class PagoEfectivo implements Pagos {
    double totalEfectivo=0;
    @Override
    public void procesarPago(double monto) {
        totalEfectivo=totalEfectivo+monto;
        System.out.println("Se paga en efectivo la cantidad de $ "+monto);
    }

    @Override
    public double getTotal(){
        return totalEfectivo;
    }
    
}
