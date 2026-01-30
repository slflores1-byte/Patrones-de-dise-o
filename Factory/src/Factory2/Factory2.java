/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Factory2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        double monto;
        do{
            System.out.println("SISTEMA TIPO DE PAGOS");
            System.out.println("1. Pago Efectivo");
            System.out.println("2. Pago Tarjeta");
            System.out.println("3. Pago Transferencia");
            System.out.println("4. Pago DeUna");
            System.out.println("5. Pago Cheques");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion de pago: ");
            op=sc.nextInt();
            sc.nextLine();
            
            Pagos pagos = PagosFactory.procesarPago(op);
            if (pagos != null) {
                System.out.print("Ingrese el pago a cancelar: ");
                monto = sc.nextDouble();
                pagos.procesarPago(monto);
            }else{
            }
        }while(op!=6);
        System.out.println("PAGOS FINALES");
        System.out.println("Efectivo $: "+PagosFactory.procesarPago(1).getTotal());
        System.out.println("Tarjeta $: "+PagosFactory.procesarPago(2).getTotal());
        System.out.println("Transferencia $: "+PagosFactory.procesarPago(3).getTotal());
        System.out.println("De Una $: "+PagosFactory.procesarPago(4).getTotal());
        System.out.println("Cheques $: "+PagosFactory.procesarPago(5).getTotal());
        sc.close();
    }
    
}
