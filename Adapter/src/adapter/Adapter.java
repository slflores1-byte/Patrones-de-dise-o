/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Adapter {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO AL SISTEMAS DE PAGOS DOLARES A ......");
        Pago pago= new PagoAdapter(new PagoEuro(), new PagoPesoColombiano(), new PagoReal());
        System.out.println("");
        System.out.print("Cuanto desea Transferir: ");
        double dinero = sc.nextDouble();
        pago.pagar(dinero);
    }
    
}
