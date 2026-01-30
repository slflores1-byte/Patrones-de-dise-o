/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author User
 */
public class PagosFactory {
    private static final PagoEfectivo efectivo = new PagoEfectivo();
    private static final PagoTarjeta tarjeta = new PagoTarjeta();
    private static final PagoTransferencia transferencia = new PagoTransferencia();
    private static final PagoDeUna deUna = new PagoDeUna();
    private static final PagoCheques cheques = new PagoCheques();
    
    public static Pagos procesarPago(int tipo){
        switch(tipo){
            case 1: return efectivo;
            case 2: return tarjeta;
            case 3: return transferencia;
            case 4: return deUna;
            case 5: return cheques;
            case 6: 
                System.out.println("Saliendo ...");
                return null;
            default:
                System.out.println("Pago NO disponible :(");
                return null;
        }
    }
    public static PagoEfectivo getEfectivo() { return efectivo; }
    public static PagoTarjeta getTarjeta() { return tarjeta; }
    public static PagoTransferencia getTransferencia() { return transferencia; }
    public static PagoDeUna getDeUna() { return deUna; }
    public static PagoCheques getCheques() { return cheques; }
}
