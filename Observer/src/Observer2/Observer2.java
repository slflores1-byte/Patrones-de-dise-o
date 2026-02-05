/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Observer2;

import java.util.*;

public class Observer2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto producto = null;
        int opcion;
        do{
            System.out.println(" ---- NOTIFICACIONES  ACTUALIZACION DE STOCK");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Agregar Cliente");
            System.out.println("3. Ver Clientes Noficados");
            System.out.println("4. salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion){
                case 1: System.out.print("Ingrese nombre del producto: ");
                        String nproducto = sc.nextLine();
                        producto = new Producto(nproducto);break;
                case 2: System.out.print("Ingrese el nombre del Cliente: ");
                        String ncliente = sc.nextLine();
                        producto.agregarCliente(new Tienda(ncliente)); break;
                case 3: producto.mostrarClientesNotificados(); break;
                case 4: break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion!=4);
        sc.close();
    }    
}
