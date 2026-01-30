/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author User
 */
public class PagoDeUna implements Pagos{
    double totalDeUna=0;
    @Override
    public void procesarPago(double monto) {
        totalDeUna = totalDeUna+monto;
        System.out.println("Se paga con transferencia la cantidad de $ "+monto);
    }
    @Override
    public double getTotal(){
        return totalDeUna;
    }
}
