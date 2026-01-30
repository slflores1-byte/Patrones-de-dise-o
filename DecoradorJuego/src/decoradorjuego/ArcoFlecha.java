/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradorjuego;

/**
 *
 * @author User
 */
public class ArcoFlecha extends PersonajeDecorador {

    public ArcoFlecha (Personaje personaje) {
        super(personaje);
    }

    @Override
    public String getDescripcion() {
        return personaje.getDescripcion()+" + Arco y Flecha";
    }

    @Override
    public int getDefensa() {
        return personaje.getDefensa()+22;
    }

    @Override
    public int getAtaque() {
        return personaje.getAtaque()+5;
    }
    
}

