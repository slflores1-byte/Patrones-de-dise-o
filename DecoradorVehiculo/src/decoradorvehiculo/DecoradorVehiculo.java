/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoradorvehiculo;

import java.util.Scanner;

public class DecoradorVehiculo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Vehiculo vehiculo = new VehiculoBase();
        do {
            System.out.println(" ----------- VEHICULOS -----------");
            System.out.println("1. Ver vehiculo base");
            System.out.println("2. Agregar GPS");
            System.out.println("3. Agregar Turbo");
            System.out.println("4. Agregar Blindaje");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println(vehiculo.getDescripcion());
                    System.out.println("Precio: $" + vehiculo.getPrecio());
                    System.out.println("Potencia: " + vehiculo.getPotencia() + " HP");
                    break;
                case 2:
                    vehiculo = new GPS(vehiculo);
                    System.out.println("GPS agregado");
                    break;
                case 3:
                    vehiculo = new Turbo(vehiculo);
                    System.out.println("Turbo agregado");
                    break;
                case 4:
                    vehiculo = new Blindaje(vehiculo);
                    System.out.println("Blindaje agregado");
                    break;
                case 5:
                    System.out.println("Saliendo del sistema..");
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        } while (op != 5);
        sc.close();
    }
}
