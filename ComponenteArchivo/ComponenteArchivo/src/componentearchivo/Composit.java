/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentearchivo;
import java.util.*;
/**
 *
 * @author jepeh
 */
public class Composit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComponenteProducto papas = new Comida("Papas", 1);
        ComponenteProducto cola = new Comida("Cola", 0.75);
        ComponenteProducto hamburguesa = new Comida("Hamburguesa", 2);
        System.out.println("----------- MENU ---------------");
        System.out.println("1. Papas");
        System.out.println("2. Cola");
        System.out.println("3. Hamburguesa");
        System.out.println("4. Combo Simple");
        System.out.println("5. Combo Completo");
        System.out.print("Ingrese una opcion: ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                papas.mostrar();
                break;
            case 2: 
                cola.mostrar();
                break;
            case 3:
                hamburguesa.mostrar();
                break;
            case 4:
                ComboSimple comboSimple = new ComboSimple("COMBO SIMPLE");
                comboSimple.agregar(papas);
                comboSimple.agregar(cola);
                comboSimple.mostrar();
                break;
            case 5:
                ComboCompleto comboCompleto = new ComboCompleto("COMBO COMPLETO");
                comboCompleto.agregar(papas);
                comboCompleto.agregar(cola);
                comboCompleto.agregar(hamburguesa);
                comboCompleto.mostrar();
                break;
        }
    } 
}
    

