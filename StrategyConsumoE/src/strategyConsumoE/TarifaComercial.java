/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyConsumoE;

/**
 *
 * @author User
 */
public class TarifaComercial implements Tarifa{

    @Override
    public double aplicar(double tarifa) {
        return tarifa*0.20;
    }
    
}
