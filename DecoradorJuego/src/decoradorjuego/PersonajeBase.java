/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradorjuego;

/**
 *
 * @author User
 */
public class PersonajeBase implements Personaje{
    
    @Override
    public String getDescripcion() {
        return " Eve";
    }

    @Override
    public int getDefensa() {
        return 10;
    }

    @Override
    public int getAtaque() {
        return 15;
    }
    
}
