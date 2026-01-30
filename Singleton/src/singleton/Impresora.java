/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author labesp
 */
public class Impresora {
    private int totalImpresiones;
    
    /*
    definir valriable estatica
    crear un constructor privado
    agregar un metodo publico estatico
    */
    //1. Definir valriable estatica.
    private static Impresora instancia;
    //2. Crear un constructor privado
    private Impresora() {
        System.out.println("Inmpresora lista para imprimir");
    }
    //3. Agregar un metodo publico estatico, garantizando que no existan mas instancias
    public static Impresora getInstancia(){
        if (instancia == null) {
            instancia = new Impresora();
        }
        return instancia;
    }
    public void imprimir(String documento){
        totalImpresiones++;
        System.out.println("Documento impreso: "+documento);
    }
    public int getTotalImpresiones(){
        return totalImpresiones;
    }
}
