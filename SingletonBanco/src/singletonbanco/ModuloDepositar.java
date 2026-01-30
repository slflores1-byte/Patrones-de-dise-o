/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonbanco;

/**
 *
 * @author User
 */
public class ModuloDepositar {
     public void depositar(double monto) {
        Banco banco = Banco.getInstancia();
        banco.registrarDeposito(monto);
    }
}
