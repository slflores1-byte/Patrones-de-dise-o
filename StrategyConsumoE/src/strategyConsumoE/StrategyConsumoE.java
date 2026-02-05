/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategyConsumoE;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class StrategyConsumoE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FacturaE factura = new FacturaE();
        double monto;
        int op;
        
        System.out.println("-------- SISTEMA TARIFAS ---------");
        System.out.println("Tipos de tarifas:");
        System.out.println("1. Residencial");
        System.out.println("2. Comercial");
        System.out.println("3. Industrial");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opcion: ");
        op = sc.nextInt();
        switch(op){
            case 1:
                System.out.println("Ingrese el pago: ");
                monto = sc.nextDouble();
                factura.setDescuento(new TarifaResidencial());
                factura.calcularTotal(monto);break;
            case 2:
                System.out.println("Ingrese el precio: ");
                monto = sc.nextDouble();
                factura.setDescuento(new TarifaComercial());
                factura.calcularTotal(monto);break;
            case 3:
                System.out.println("Ingrese el precio: ");
                monto = sc.nextDouble();
                factura.setDescuento(new TarifaIndustrial());
                factura.calcularTotal(monto);break;
            case 4:
                System.out.println("Saliendo .....");
                break;
            default:
                System.out.println("OPCION NO VALIDA!!");
        }
        sc.close();
    }
    
}
