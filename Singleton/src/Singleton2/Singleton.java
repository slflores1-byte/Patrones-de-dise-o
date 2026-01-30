/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton2;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Singleton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ModuloVentas ventas = new ModuloVentas();
        ModuloFacturacion facturacion = new ModuloFacturacion();
        int op;
        double monto,montof;
        do {
            System.out.println("SISTEMA CAJA REGISTRADORA");
            System.out.println("1. Registrar Venta");
            System.out.println("2. Registrar Factura");
            System.out.println("3. Ver Total");
            System.out.println("4. Ver total facturas");
            System.out.println("5. Ver total caja registradora");
            System.out.println("6. Salir");
            System.out.println("Ingrese una opcion: ");
            op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.print("Ingrese el  monto de la venta:");
                    monto = sc.nextDouble();
                    ventas.vender(monto);
            //facturacion.facturar(monto);
                    break;
                case 2:
                    System.out.println("Total de venta con facturacion: ");
                    montof=sc.nextDouble();
                    facturacion.facturar(montof);
                    break;
                case 3:
                    CajaRegistradora caja = CajaRegistradora.getInstancia();
                    System.out.println("Total de venta sin facturas: "+caja.getTotalVentas());
                    break;
                case 4: 
                    CajaRegistradora cajaf = CajaRegistradora.getInstancia();
                    System.out.println("Total facturado: "+cajaf.getTotalFacturas());
                    break;
                case 5:
                    CajaRegistradora cajat = CajaRegistradora.getInstancia();
                    System.out.println("Total de la caja registradora: "+cajat.getTotal());
                    break;
                case 6: 
                    System.out.println("SALIENDO DEL SISTEMA");
                    break;
                default:
                    System.out.println("Opcion no valida");                   
            } 
            }while (op!=5);
                    sc.close();
        }
    }
