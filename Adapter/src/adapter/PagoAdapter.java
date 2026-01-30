/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PagoAdapter implements Pago{
    private PagoEuro pagoEuro;
    private PagoPesoColombiano pagoPesoColombiano;
    private PagoReal pagoReal;


    public PagoAdapter(PagoEuro pagoEuro, PagoPesoColombiano pagoPesoColombiano, PagoReal pagoReal) {
        this.pagoEuro = pagoEuro;
        this.pagoPesoColombiano = pagoPesoColombiano;
        this.pagoReal = pagoReal;
    }
    
    @Override
    public void pagar(double monto){
        System.out.println("------- TIPO DE PAGOS --------");
        System.out.println("1. Euros");
        System.out.println("2. Pesos Colombianos");
        System.out.println("3. Reales Brasileños");
        System.out.println("Ingrese en que moneda desea pagar: ");
        Scanner sc = new Scanner(System.in);
        int op=sc.nextInt();
        switch(op){
            case 1:
                double euros = monto* 0.84;
                pagoEuro.pagarEuros(euros);
                break;
            case 2:
                double pesosC = monto* 3664.27;
                pagoPesoColombiano.pagarPesoColombiano(pesosC);break;
            case 3:
                double pesosR = monto* 5.20;
                pagoReal.pagarReal(pesosR);break;
        }
        
    }
}
