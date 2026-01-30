/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author labesp
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Impresora usuario1= Impresora.getInstancia();
        Impresora usuario2= Impresora.getInstancia();
        Impresora usuario3= Impresora.getInstancia();
        usuario1.imprimir("Deber de POO");
        usuario2.imprimir("Ejercicios de Fisica");
        usuario3.imprimir("Reporte Ceros");
        usuario1.imprimir("Actividad Grupal");
        System.out.println("Total Impresiones: "+usuario1.getTotalImpresiones()); 
        //COMPROBACION DE INSTANCIAS
        System.out.println(usuario1==usuario2);
    }
    
}
