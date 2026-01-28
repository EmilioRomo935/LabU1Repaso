/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labu1repaso;

/**
 *
 * @author alopezorozco
 */
public class LabU1Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 11:  Crea un objeto de tipo Auto inicializando
        // el objeto con los siguientes valores "Toyota" y 0.
        Auto carro1 = new Auto("Toyota", 0);
        
        // TODO 12: Llama al método acelerar
        carro1.acelerar();
        
        // TODO 13: Imprime los datos del objeto auto llamando
        // al método mostrarEstado()
        carro1.mostrarEstado();
        
        // TODO 14: Realiza lo mismo pero ahora para un objeto
        // de tipo camion la marca será "Nissan" y 0 en velocidad
        Camion camion1 = new Camion("Nissan",0);
        
        camion1.acelerar();
        camion1.mostrarEstado();
    }
    
}
