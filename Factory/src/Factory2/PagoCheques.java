/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author User
 */
public class PagoCheques implements Pagos{
    double totalCheques=0;
    @Override
    public void procesarPago(double monto) {
        totalCheques=totalCheques+monto;
        System.out.println("Se paga con transferencia la cantidad de $ "+monto);
    }
    @Override
    public double getTotal(){
        return totalCheques;
    }
}
