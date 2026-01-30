/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite;

public class Composite {

    public static void main(String[] args) {
        Archivo a1 = new Archivo ("Tu Tu.MP3", 4000);
        Archivo a2 = new Archivo ("Amor prohibido.MP3", 5000);
        Archivo a3 = new Archivo("Mi Foto.jpg", 1000);
        // Carpeta Principal
        Carpeta raiz = new Carpeta("My PlayList");
        // Sub Carpeta
        Carpeta imagenes = new Carpeta("Imagenes");
        //Construccion de Arbol de Archivos
        raiz.agregar(a1);
        raiz.agregar(imagenes);
        raiz.agregar(a2);
        raiz.agregar(a3);
        
        raiz.mostrar();
        System.out.println(" ");
        System.out.println("Tamanio Total "+raiz.getTamanio()+" Kb");
    }  
}
