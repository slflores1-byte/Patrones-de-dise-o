/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy;

import java.util.Scanner;

public class Strategy {
    //  SE ASEMEJA A FACTORY
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Compra compra = new Compra();
        System.out.println("             SISTEMA DE PAGOS  ");
        System.out.println("Tipos de pagos:");
        System.out.println("1. Tarjeta");
        System.out.println("2. PayPal");
        System.out.println("3. GooglePay");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opcion: ");
        int op = sc.nextInt();
        double monto;
        switch(op){
            case 1:
                System.out.println("Ingrese el monto: ");
                monto = sc.nextDouble();
                compra.setMetodoPago(new PagoTarjeta());
                compra.realizarPago(monto);break;
            case 2:
                System.out.println("Ingrese el monto: ");
                monto = sc.nextDouble();
                compra.setMetodoPago(new PagoPayPal());
                compra.realizarPago(monto);break;
            case 3:
                System.out.println("Ingrese el monto: ");
                monto = sc.nextDouble();
                compra.setMetodoPago(new PagoGooglePay());
                compra.realizarPago(monto);break;
            case 4:
                System.out.println("Saliendo .....");
                break;
            default:
                System.out.println("OPCION NO VALIDA!!");
        }
        sc.close();       
    }
    
}
