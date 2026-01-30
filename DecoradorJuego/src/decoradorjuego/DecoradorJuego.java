/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoradorjuego;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DecoradorJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Personaje personaje = new PersonajeBase();
        do{
            System.out.println("     --- CRASH  ---");
            System.out.println("1. Personaje Base");
            System.out.println("2. Agregar Espada");
            System.out.println("3. Agregar Escudo");
            System.out.println("4. Agregar Arco y Flecha");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
           switch(op){
               case 1: //personaje = new PersonajeBase();
                   System.out.println(personaje.getDescripcion());
                   System.out.println("Ataque: "+ personaje.getAtaque());
                   System.out.println("Dfensa: "+personaje.getAtaque()); break;
               case 2: personaje = new Espada(personaje);
                   System.out.println(personaje.getDescripcion());
                   System.out.println("ESPADA AGREGADA!!!!!");
                   System.out.println("Ataque: "+ personaje.getAtaque());
                   System.out.println("Dfensa: "+personaje.getAtaque()); break;
               case 3: personaje = new Escudo(personaje);
                   System.out.println(personaje.getDescripcion());
                   System.out.println("ESCUDO AGREGADO!!!!!");
                   System.out.println("Ataque: "+ personaje.getAtaque());
                   System.out.println("Dfensa: "+personaje.getAtaque()); break;
               case 4: personaje = new ArcoFlecha(personaje);
                   System.out.println(personaje.getDescripcion());
                   System.out.println("ARCO Y FLECHA AGREGADO!!!!");
                   System.out.println("Ataque: "+ personaje.getAtaque());
                   System.out.println("Dfensa: "+personaje.getAtaque()); break;
               case 5: break;
               default: System.out.println("OPCION NO VALIDA");   
           } 
        }while(op!=5);
        sc.close();
    }
    
}
