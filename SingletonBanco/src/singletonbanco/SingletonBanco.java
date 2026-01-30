/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonbanco;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SingletonBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        ModuloDepositar deposito = new ModuloDepositar();
        ModuloRetirar retirar = new ModuloRetirar();
        int op;
        double montoD,montoR, saldo;
        do {
            System.out.println("SISTEMA CAJERO");
            System.out.println("1. Registrar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Ver Total");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Ingrese el saldo actual: ");
                    saldo=sc.nextDouble();
                    deposito.depositar(saldo);
                    break;
                case 2:
                    System.out.print("Ingrese su monto a depositar: ");
                    montoD=sc.nextDouble();
                    deposito.depositar(montoD);
                    break;
                case 3:
                    System.out.print("Ingrese su monto a retirar: ");
                    montoR=sc.nextDouble();
                    retirar.retirar(montoR);
                    break;
                case 4: 
                    Banco banco = Banco.getInstancia();
                    System.out.println("Saldo Actual: " + banco.getSaldo());
                    break;
                default:
                    System.out.println("Opcion no valida");                   
            } 
            }while (op!=4);
                    sc.close();
        
    }
    
}
