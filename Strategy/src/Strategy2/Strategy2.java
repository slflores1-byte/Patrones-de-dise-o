/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Strategy2;

import java.util.Scanner;

public class Strategy2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Venta venta = new Venta();
        double monto;
        int op;
        
        System.out.println("-------- SISTEMA DESCUENTOS ---------");
        System.out.println("Tipos de descuentos:");
        System.out.println("1. Normal");
        System.out.println("2. VIP");
        System.out.println("3. Estudiantil");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opcion: ");
        op = sc.nextInt();
        switch(op){
            case 1:
                System.out.println("Ingrese el precio: ");
                monto = sc.nextDouble();
                venta.setDescuento(new DescuentoNormal());
                venta.calcularTotal(monto);break;
            case 2:
                System.out.println("Ingrese el precio: ");
                monto = sc.nextDouble();
                venta.setDescuento(new DescuentoVIP());
                venta.calcularTotal(monto);break;
            case 3:
                System.out.println("Ingrese el precio: ");
                monto = sc.nextDouble();
                venta.setDescuento(new DescuentoEstudiantil());
                venta.calcularTotal(monto);break;
            case 4:
                System.out.println("Saliendo .....");
                break;
            default:
                System.out.println("OPCION NO VALIDA!!");
        }
        sc.close();
    }
    
}
