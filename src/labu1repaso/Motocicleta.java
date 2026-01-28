/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1repaso;

/**
 *
 * @author Emiro
 */
public class Motocicleta extends Vehiculo{

    public Motocicleta(String marca, int velocidad) {
        super(marca, velocidad);
    }
    
    @Override
    public void acelerar(){
        
    velocidad += 20;
    }
    
}