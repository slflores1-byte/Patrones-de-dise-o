/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyConsumoE;

/**
 *
 * @author User
 */
public class FacturaE {
    private Tarifa tarifa;

    public FacturaE() {
    }
    
    public void setDescuento(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
    public double calcularTotal(double consumo){
        System.out.println("Precio Final(con descuento): $"+(consumo + tarifa.aplicar(consumo)));
        return tarifa.aplicar(consumo);
    }
}
