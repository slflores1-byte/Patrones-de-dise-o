/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonbanco;

/**
 *
 * @author User
 */
public class Banco {
    private double monto;
    private double saldo;
    private static Banco instancia;

    private Banco() {
        System.out.println("Iniciando sistema....");
    }
    public static Banco getInstancia(){
         if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }
    
    public void registrarDeposito(double monto){
        saldo=saldo+monto;
        System.out.println("Deposito exitoso, su deposito fue: "+ monto);
    }
    
    public void registrarRetiro(double monto){
        saldo=saldo-monto;
        System.out.println("Retiro exitoso, su retiro fue: "+ monto);
    }

    public double getSaldo() {
        return saldo;
    }
    
}
